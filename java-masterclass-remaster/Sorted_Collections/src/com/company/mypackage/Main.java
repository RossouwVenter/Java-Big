package com.company.mypackage;

import org.w3c.dom.ls.LSOutput;

import java.security.Key;
import java.util.Map;

public class Main {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {
        StockItem temp = new StockItem("bread", 0.86, 100);
        stockList.addStock(temp);

        temp = new StockItem("Car", 12.50,2);
        stockList.addStock(temp);

        temp = new StockItem("cup", 62.0,10);
        stockList.addStock(temp);

        temp = new StockItem("cup",50.0,7);
        stockList.addStock(temp);

        temp = new StockItem("door", 72.95,4);
        stockList.addStock(temp);

        temp = new StockItem("phone", 96.99,35);
        stockList.addStock(temp);

        System.out.println(stockList);

//        for (String s : stockList.Items().get(s)){
//            System.out.println();
//        }

        Basket rossouwsBasket = new Basket("Rossouw");
        if(sellItem((rossouwsBasket),"car",1) != 1)) {
            System.out.println("There are no more cars in stock!");
        }
        sellItem(rossouwsBasket,"car",1);
        System.out.println(rossouwsBasket);

        stockList.Items().get("car").adjustStock(2000);
//        Same as the .Item();
        stockList.get("car").adjustStock(-1000);
        System.out.println(stockList);


        for (Map.Entry<String, Double> price : stockList.PriceList().entrySet()){
            System.out.println(price.getKey() + " costs " + price.getValue());
        }
    }



    public static int sellItem(Basket basket, String item, int quantity){
        StockItem stockItem = stockList.get(item);
        if(stockItem == null){
            System.out.println("We don't sell " + item);
            return 0;
        }
        if (stockList.sellStock(item, quantity) != 0){
            basket.addToBasket(stockItem,quantity);
            return quantity;
        }
        return 0;
    }
}
