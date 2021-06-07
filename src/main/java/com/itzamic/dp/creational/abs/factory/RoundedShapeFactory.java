package com.itzamic.dp.creational.abs.factory;

import com.itzamic.dp.creational.factory.Shape;
import com.itzamic.dp.creational.factory.ShapeType;

public class RoundedShapeFactory extends AbstractFactory {
  @Override
  public Shape getShape(ShapeType shapeType) {
    switch (shapeType) {
      case SQUARE:
        return new RoundedSquare();
      case RECTANGLE:
        return new RoundedRectangle();
      default:
        throw new IllegalArgumentException("The type requested is not valid");
    }
  }
}
