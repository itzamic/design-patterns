package com.itzamic.dp.creational.factory;

import com.itzamic.dp.creational.abs.factory.AbstractFactory;

public class ShapeFactory extends AbstractFactory {
  @Override
  public Shape getShape(ShapeType shapeType) {
    switch (shapeType) {
      case CIRCLE:
        return new Circle();
      case SQUARE:
        return new Square();
      case RECTANGLE:
        return new Rectangle();
      default:
        throw new IllegalArgumentException("The type requested is not valid");
    }
  }
}
