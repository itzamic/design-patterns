package com.itzamic.dp;

import com.itzamic.dp.creational.abs.factory.FactoryProducer;
import com.itzamic.dp.creational.builder.MealBuilder;
import com.itzamic.dp.creational.factory.ShapeType;
import com.itzamic.dp.creational.prototype.Shape;
import com.itzamic.dp.creational.prototype.ShapeCache;
import com.itzamic.dp.creational.singleton.SingleObjectMultiThreaded;
import com.itzamic.dp.structural.adapter.AudioPlayer;
import com.itzamic.dp.structural.adapter.AudioType;
import com.itzamic.dp.structural.bridge.Circle;
import com.itzamic.dp.structural.bridge.GreenCircle;
import com.itzamic.dp.structural.bridge.RedCircle;
import com.itzamic.dp.structural.composite.Employee;
import com.itzamic.dp.structural.decorator.Rectangle;
import com.itzamic.dp.structural.decorator.RedShapeDecorator;
import com.itzamic.dp.structural.facade.ShapeMaker;
import com.itzamic.dp.structural.flyweight.ShapeFactory;
import com.itzamic.dp.structural.proxy.ProxyImage;

public class Main {
  private static final String colors[] = {"Red", "Green", "Blue", "White", "Black"};

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

    var audioPlayer = new AudioPlayer();

    audioPlayer.play(AudioType.MP3, "beyond the horizon.mp3");
    audioPlayer.play(AudioType.MP4, "alone.mp4");
    audioPlayer.play(AudioType.VLC, "far far away.vlc");
    audioPlayer.play(AudioType.AVI, "mind me.avi");

    var redCircle = new Circle(100, 100, 10, new RedCircle());
    var greenCircle = new Circle(100, 100, 10, new GreenCircle());

    redCircle.draw();
    greenCircle.draw();

    var CEO = new Employee("John", "CEO", 30000);

    var headSales = new Employee("Robert", "Head Sales", 20000);

    var headMarketing = new Employee("Michel", "Head Marketing", 20000);

    var clerk1 = new Employee("Laura", "Marketing", 10000);
    var clerk2 = new Employee("Bob", "Marketing", 10000);

    var salesExecutive1 = new Employee("Richard", "Sales", 10000);
    var salesExecutive2 = new Employee("Rob", "Sales", 10000);

    CEO.add(headSales);
    CEO.add(headMarketing);

    headSales.add(salesExecutive1);
    headSales.add(salesExecutive2);

    headMarketing.add(clerk1);
    headMarketing.add(clerk2);

    // print all employees of the organization
    System.out.println(CEO);

    for (Employee headEmployee : CEO.getSubordinates()) {
      System.out.println(headEmployee);

      for (Employee employee : headEmployee.getSubordinates()) {
        System.out.println(employee);
      }
    }
    var circle1 = new com.itzamic.dp.structural.decorator.Circle();

    var redCircle1 = new RedShapeDecorator(new com.itzamic.dp.structural.decorator.Circle());

    var redRectangle = new RedShapeDecorator(new Rectangle());
    System.out.println("Circle with normal border");
    circle1.draw();

    System.out.println("\nCircle of red border");
    redCircle1.draw();

    System.out.println("\nRectangle of red border");
    redRectangle.draw();

    var shapeMaker = new ShapeMaker();

    shapeMaker.drawCircle();
    shapeMaker.drawRectangle();
    shapeMaker.drawSquare();

    for (int i = 0; i < 20; ++i) {
      var fwCircle =
          (com.itzamic.dp.structural.flyweight.Circle) ShapeFactory.getCircle(getRandomColor());
      fwCircle.setX(getRandomX());
      fwCircle.setY(getRandomY());
      fwCircle.setRadius(100);
      fwCircle.draw();
    }

    var image = new ProxyImage("test_10mb.jpg");

    // image will be loaded from disk
    image.display();
    System.out.println("");

    // image will not be loaded from disk
    image.display();
  }

  private static String getRandomColor() {
    return colors[(int) (Math.random() * colors.length)];
  }

  private static int getRandomX() {
    return (int) (Math.random() * 100);
  }

  private static int getRandomY() {
    return (int) (Math.random() * 100);
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
