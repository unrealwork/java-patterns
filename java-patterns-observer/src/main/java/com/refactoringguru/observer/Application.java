package com.refactoringguru.observer;

import java.util.logging.Logger;

public class Application {

  private static final Logger logger = Logger
      .getLogger(Application.class.getName());

  public static void main(String[] args) {
    FileEditor editor = new FileEditor();

    editor.addSaveListener(
        (s) -> logger.info(String.format("File %s was saved", s)));

    editor.save("index.html");

    editor.save("index2.html");
  }
}
