package com.refactoringguru.chain.handlers;

import com.refactoringguru.chain.HttpRequest;
import java.text.MessageFormat;
import java.util.logging.Logger;

public class ExecuteRequestHandler extends RequestHandler<HttpRequest> {

  private static final Logger logger = Logger
      .getLogger(ExecuteRequestHandler.class.getName());

  @Override
  public void handle(HttpRequest request) {
    logger.info(MessageFormat.format("I have executed {0} request", request));
  }

  @Override
  public String toString() {
    return "ExecuteRequestHandler{}";
  }
}
