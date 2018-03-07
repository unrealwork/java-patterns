package com.refactoringguru.chain.handlers;

import com.refactoringguru.chain.Request;

public abstract class RequestHandler<T extends Request> implements Handler<T> {

  private Handler<T> next;

  @Override
  public RequestHandler<T> setNext(Handler<T> handler) {
    this.next = handler;
    return this;
  }

  public void handle(T request) {
    if (next != null) {
      next.handle(request);
    }
  }

  @Override
  public abstract String toString();
}
