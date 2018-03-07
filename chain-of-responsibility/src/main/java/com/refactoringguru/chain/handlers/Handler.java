package com.refactoringguru.chain.handlers;

public interface Handler<T> {

  Handler<T> setNext(Handler<T> handler);

  void handle(T request);
}
