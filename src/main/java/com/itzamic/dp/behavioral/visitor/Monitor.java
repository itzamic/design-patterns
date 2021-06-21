package com.itzamic.dp.behavioral.visitor;

public class Monitor implements ComputerPart {
  @Override
  public void accept(ComputerPartVisitor computerPartVisitor) {
    computerPartVisitor.visit(this);
  }
}
