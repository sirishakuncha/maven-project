package com.example;

/**
 * This is a class. Adding to trigger polling.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
  *@papam someone the name of a person
  *@return greeting string
  */
  
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
