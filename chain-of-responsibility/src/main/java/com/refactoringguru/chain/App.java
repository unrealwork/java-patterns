package com.refactoringguru.chain;

import com.refactoringguru.chain.handlers.ExecuteRequestHandler;
import com.refactoringguru.chain.handlers.Handler;
import com.refactoringguru.chain.handlers.LoggerRequestHandler;

public class App {

  public static void main(String[] args) {
    Handler<HttpRequest> chain = new LoggerRequestHandler()
        .setNext(new ExecuteRequestHandler());
    chain.handle(HttpRequest.GET);
  }
}
