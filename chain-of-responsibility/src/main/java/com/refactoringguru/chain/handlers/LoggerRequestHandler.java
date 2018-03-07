package com.refactoringguru.chain.handlers;


import com.refactoringguru.chain.HttpRequest;
import java.text.MessageFormat;
import java.util.logging.Logger;

public class LoggerRequestHandler extends RequestHandler<HttpRequest> {

  private final static Logger logger = Logger
      .getLogger(LoggerRequestHandler.class.getName());

  @Override
  public void handle(HttpRequest request) {
    logger.info(MessageFormat.format("Request {0} added  to handle.", request));
    super.handle(request);
  }

  @Override
  public String toString() {
    return "LoggerRequestHandler{}";
  }
}
