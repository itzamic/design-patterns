package com.itzamic.dp.behavioral.command;

public class CommandPatternDemo {
  public static void main(String[] args) {
    var abcStock = new Stock();
    var buyStockOrder = new BuyStock(abcStock);
    var sellStockOrder = new SellStock(abcStock);
    var broker = new Broker();
    broker.takeOrder(buyStockOrder);
    broker.takeOrder(sellStockOrder);
    broker.placeOrders();
  }
}
