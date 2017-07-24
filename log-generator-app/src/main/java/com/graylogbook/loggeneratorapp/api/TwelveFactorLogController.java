package com.graylogbook.loggeneratorapp.api;

import javax.websocket.server.PathParam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TwelveFactorLogController {
	// Just get a logger that will log to stdout
	// From the app perspective, it doesn't matter if it will be sent through tcp, udp, whatever
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@RequestMapping(path = "/log-info-stdout")
	@ResponseBody
	public void generateInfoLog(@PathParam(value = "n") Integer n) {
		for (int i = 0; i < n; i++) {
			logger.info("Generating INFO log");
		}
	}

	@RequestMapping(path = "/log-error-stdout")
	@ResponseBody
	public void generateErrorLog() {
		try {
			throw new RuntimeException();
		} catch (RuntimeException e) {
			logger.error("Generating ERROR log", e);
		}
	}
}
