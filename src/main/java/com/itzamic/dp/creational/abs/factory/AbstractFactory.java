package com.itzamic.dp.creational.abs.factory;

import com.itzamic.dp.creational.factory.Shape;
import com.itzamic.dp.creational.factory.ShapeType;

public abstract class AbstractFactory {
  public abstract Shape getShape(ShapeType shapeType);
}
