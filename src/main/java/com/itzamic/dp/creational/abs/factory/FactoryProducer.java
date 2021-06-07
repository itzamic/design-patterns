package com.itzamic.dp.creational.abs.factory;

import com.itzamic.dp.creational.factory.ShapeFactory;

public class FactoryProducer {

  public static AbstractFactory getFactory(boolean rounded) {
    return rounded ? new RoundedShapeFactory() : new ShapeFactory();
  }
}
