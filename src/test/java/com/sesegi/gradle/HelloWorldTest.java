package com.sesegi.gradle;

import org.junit.jupiter.api.Test;

public class HelloWorldTest {

  @Test
  public void verifyNoException(){
    System.out.println("in test");
    HelloWorld.main(new String[]{});
  }

}
