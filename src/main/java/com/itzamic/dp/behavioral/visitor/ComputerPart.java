package com.itzamic.dp.behavioral.visitor;

public interface ComputerPart {
  void accept(ComputerPartVisitor computerPartVisitor);
}
