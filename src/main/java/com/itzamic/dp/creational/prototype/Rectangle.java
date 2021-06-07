package com.itzamic.dp.creational.prototype;

import com.itzamic.dp.creational.factory.ShapeType;

public class Rectangle extends Shape {
  public Rectangle() {
    type = ShapeType.RECTANGLE;
  }

  @Override
  void draw() {
    System.out.println("Inside Rectangle::draw() method.");
  }
}
