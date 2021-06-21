package com.itzamic.dp.behavioral.visitor;

public class VisitorPatternDemo {
  public static void main(String[] args) {
    var computer = new Computer();
    computer.accept(new ComputerPartDisplayVisitor());
  }
}
