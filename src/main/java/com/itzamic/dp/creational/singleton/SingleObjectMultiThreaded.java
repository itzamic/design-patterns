package com.itzamic.dp.creational.singleton;

public final class SingleObjectMultiThreaded {
  private static volatile SingleObjectMultiThreaded instance;
  public String value;

  private SingleObjectMultiThreaded(String value) {
    this.value = value;
  }

  public static SingleObjectMultiThreaded getInstance(String value) {
    SingleObjectMultiThreaded result = instance;
    if (result != null) {
      return result;
    }
    synchronized (SingleObjectMultiThreaded.class) {
      if (instance == null) {
        instance = new SingleObjectMultiThreaded(value);
      }
      return instance;
    }
  }
}
