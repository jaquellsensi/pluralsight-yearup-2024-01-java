package com.pluralsight.models;

import java.util.ArrayList;

public abstract class Order
{
    public static int currentOrderId = 1001;

    private int orderId;
    private String name;
    private String progress;
    private ArrayList<Pizza> pizzas;

    public Order(String name)
    {
        orderId = currentOrderId++;
        this.name = name;
        progress = "ordered";
        pizzas = new ArrayList<>();
    }

    public Order(int orderId, String name, String progress)
    {
        this.orderId = orderId;
        this.name = name;
        this.progress = progress;
    }

    public int getOrderId()
    {
        return orderId;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getProgress()
    {
        return progress;
    }

    public void setProgress(String progress)
    {
        this.progress = progress;
    }

    public ArrayList<Pizza> getPizzas()
    {
        return pizzas;
    }

    public double getTotal()
    {
        double price = 0;

        for(Pizza pizza : pizzas)
        {
            price += pizza.getTotalPrice();
        }

        return price;
    }

    public void addPizza(Pizza pizza)
    {
        pizzas.add(pizza);
    }

    @Override
    public String toString()
    {
        return String.format("%s,%s,%s", orderId, name, progress);
    }
}
