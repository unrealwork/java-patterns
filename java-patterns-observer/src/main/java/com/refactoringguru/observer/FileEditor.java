package com.refactoringguru.observer;

public class FileEditor {

  private EventManager<String> eventManager;

  public FileEditor() {
    this.eventManager = new EventManager<>();
  }

  public void open(String fileName) {
    eventManager.notify(EditorEventType.OPEN, fileName);
  }

  public void save(String fileName) {
    eventManager.notify(EditorEventType.SAVE, fileName);
  }

  public void addSaveListener(EventListener<String> eventListener) {
    this.eventManager.subscribe(EditorEventType.SAVE, eventListener);
  }
}
