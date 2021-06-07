package com.itzamic.dp;

import com.itzamic.dp.creational.abs.factory.FactoryProducer;
import com.itzamic.dp.creational.builder.MealBuilder;
import com.itzamic.dp.creational.factory.ShapeType;
import com.itzamic.dp.creational.prototype.Shape;
import com.itzamic.dp.creational.prototype.ShapeCache;
import com.itzamic.dp.creational.singleton.SingleObjectMultiThreaded;

public class Main {
  public static void main(String[] args) throws NoSuchMethodException {
    var shapeFactory = FactoryProducer.getFactory(false);
    var circle = shapeFactory.getShape(ShapeType.CIRCLE);
    circle.draw();
    var square = shapeFactory.getShape(ShapeType.SQUARE);
    square.draw();
    var rectangle = shapeFactory.getShape(ShapeType.RECTANGLE);
    rectangle.draw();

    var roundedFactory = FactoryProducer.getFactory(true);

    var roundedSquare = roundedFactory.getShape(ShapeType.SQUARE);
    roundedSquare.draw();
    var roundedRectangle = roundedFactory.getShape(ShapeType.RECTANGLE);
    roundedRectangle.draw();

    var mealBuilder = new MealBuilder();
    var nonVegMeal = mealBuilder.prepareNonVegMeal();
    System.out.println("Non Veg Meal");
    nonVegMeal.showItems();
    System.out.println("Total Cost: " + nonVegMeal.getCost());
    var vegMeal = mealBuilder.prepareVegMeal();
    System.out.println("Veg Meal");
    vegMeal.showItems();
    System.out.println("Total Cost: " + vegMeal.getCost());

    ShapeCache.loadCache();
    Shape clonedShape = (Shape) ShapeCache.getShape("1");
    System.out.println("Shape : " + clonedShape.getType());

    Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
    System.out.println("Shape : " + clonedShape2.getType());

    Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
    System.out.println("Shape : " + clonedShape3.getType());

    System.out.println(
        "If you see the same value, then singleton was reused (yay!)"
            + "\n"
            + "If you see different values, then 2 singletons were created (booo!!)"
            + "\n\n"
            + "RESULT:"
            + "\n");
    Thread threadFoo = new Thread(new ThreadFoo());
    Thread threadBar = new Thread(new ThreadBar());
    threadFoo.start();
    threadBar.start();
  }

  static class ThreadFoo implements Runnable {
    @Override
    public void run() {
      var singleton = SingleObjectMultiThreaded.getInstance("FOO");
      System.out.println(singleton.value);
    }
  }

  static class ThreadBar implements Runnable {
    @Override
    public void run() {
      var singleton = SingleObjectMultiThreaded.getInstance("BAR");
      System.out.println(singleton.value);
    }
  }
}
