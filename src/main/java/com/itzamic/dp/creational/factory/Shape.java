package com.itzamic.dp.creational.factory;

import java.text.MessageFormat;

public interface Shape {
  default void draw() throws NoSuchMethodException {
    String className = this.getClass().getName();
    className = className.substring(className.lastIndexOf(".") + 1);
    String methodName = this.getClass().getMethod("draw").getName();
    methodName = methodName.substring(methodName.lastIndexOf(".") + 1);
    System.out.println(MessageFormat.format("Inside {0}::{1} method", className, methodName));
  }
}
