package com.itzamic.dp.behavioral.visitor;

public class Keyboard implements ComputerPart {
  @Override
  public void accept(ComputerPartVisitor computerPartVisitor) {
    computerPartVisitor.visit(this);
  }
}
