package com.refactoringguru.observer;

@FunctionalInterface
public interface EventListener<T> {

  void update(T data);
}
