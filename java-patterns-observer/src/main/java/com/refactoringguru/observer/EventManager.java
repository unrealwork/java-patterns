package com.refactoringguru.observer;

import java.util.HashMap;
import java.util.Map;

public class EventManager<T> {

  private Map<EventType, EventListener<T>> listeners;

  public EventManager() {
    this.listeners = new HashMap<>();
  }

  public void subscribe(EventType type, EventListener<T> listener) {
    listeners.put(type, listener);
  }

  public void unsubscribe(EventType type, EventListener<T> listener) {
    listeners.remove(type, listener);
  }

  public void notify(EventType type, T data) {
    if (listeners.containsKey(type)) {
      listeners.get(type).update(data);
    }
  }
}
