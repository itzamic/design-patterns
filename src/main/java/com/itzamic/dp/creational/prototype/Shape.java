package com.itzamic.dp.creational.prototype;

import com.itzamic.dp.creational.factory.ShapeType;

public abstract class Shape implements Cloneable {
  private String id;
  protected ShapeType type;

  abstract void draw();

  public ShapeType getType() {
    return type;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Object clone() {
    Object clone = null;
    try {
      clone = super.clone();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    return clone;
  }
}
