package com.itzamic.dp.creational.prototype;

import com.itzamic.dp.creational.factory.ShapeType;

public class Circle extends Shape {
  public Circle() {
    type = ShapeType.CIRCLE;
  }

  @Override
  void draw() {
    System.out.println("Inside Circle::draw() method.");
  }
}
