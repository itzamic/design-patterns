package com.itzamic.dp.behavioral.state;

public class StatePatternDemo {
  public static void main(String[] args) {
    var context = new Context();
    var startState = new StartState();
    startState.doAction(context);

    System.out.println(context.getState().toString());

    var stopState = new StopState();
    stopState.doAction(context);
    System.out.println(context.getState().toString());
  }
}
