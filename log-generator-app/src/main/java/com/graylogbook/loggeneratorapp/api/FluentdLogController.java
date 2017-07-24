package com.graylogbook.loggeneratorapp.api;

import javax.websocket.server.PathParam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FluentdLogController {
	// Uses Fluentd appender, which opens a TCP socket under the hood
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@RequestMapping(path = "/log-info-fluentd")
	@ResponseBody
	public void generateInfo(@PathParam(value = "n") Integer n) {
		for (int i = 0; i < n; i++) {
			logger.info("Generating INFO log");
		}
	}

	@RequestMapping(path = "/log-error-fluentd")
	@ResponseBody
	public void generateErrorLog() {
		try {
			throw new RuntimeException();
		} catch (RuntimeException e) {
			logger.error("Generating ERROR log", e);
		}
	}
}
