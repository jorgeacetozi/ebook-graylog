package com.graylogbook.loggeneratorapp.api;

import javax.websocket.server.PathParam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GelfLogController {
	// Uses UDP, we don't care so much if a message doesn't reach Graylog
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	// Uses TCP, we want to make sure that messages logged with tcpLogger will reach Graylog
	private final Logger tcpLogger = LoggerFactory.getLogger("GraylogTcpLogger");

	@RequestMapping(path = "/log-info-udp")
	@ResponseBody
	public void generateInfoLogUdp(@PathParam(value = "n") Integer n) {
		for (int i = 0; i < n; i++) {
			logger.info("Generating INFO log using UDP");
		}
	}

	@RequestMapping(path = "/log-info-tcp")
	@ResponseBody
	public void generateInfoLogTcp(@PathParam(value = "n") Integer n) {
		for (int i = 0; i < n; i++) {
			tcpLogger.info("Generating INFO log using TCP");
		}
	}

	@RequestMapping(path = "/log-error-tcp")
	@ResponseBody
	public void generateErrorLog() {
		try {
			throw new RuntimeException();
		} catch (RuntimeException e) {
			tcpLogger.error("Using TCP to send an important error message that must always reach Graylog", e);
		}
	}
}
