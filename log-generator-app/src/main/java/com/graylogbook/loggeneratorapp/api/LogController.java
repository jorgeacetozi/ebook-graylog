package com.graylogbook.loggeneratorapp.api;

import javax.websocket.server.PathParam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LogController {
	// uses UDP, we don't care so much if a message don't reach Graylog
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	// uses TCP, we wanna make sure that messages logged with tcpLogger will reach Graylog
	private final Logger tcpLogger = LoggerFactory.getLogger("GraylogTcpLogger");

	@RequestMapping(path = "/log-info-udp")
	@ResponseBody
	public void generateInfoLogUdp(@PathParam(value = "n") Integer n) throws InterruptedException {
		for (int i = 0; i < n; i++) {
			// Thread.sleep(1l);
			logger.info("Generating and sending INFO log using UDP {}", i);
		}
	}

	@RequestMapping(path = "/log-info-tcp")
	@ResponseBody
	public void generateInfoLogTcp(@PathParam(value = "n") Integer n) throws InterruptedException {
		for (int i = 0; i < n; i++) {
			// Thread.sleep(1l);
			tcpLogger.info("Generating and sending INFO log using TCP {}", i);
		}
	}

	@RequestMapping(path = "/log-error")
	@ResponseBody
	public void generateErrorLog() {
		try {
			throw new RuntimeException();
		} catch (Exception e) {
			tcpLogger.error("Using TCP to send an important error message that must always reach Graylog", e);
		}
	}
}
