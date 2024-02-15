package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Dealership
{
  private String name;
  private String address;
  private String phone;
  private ArrayList<Vehicle> inventory;

  public Dealership(String name)
  {
      this.name = name;
      this.address = address;
      this.phone = phone;
      this.inventory = new ArrayList<Vehicle>();
  }

    public Dealership() {

    }



    public String getName()
  {
      return name;
  }

  public String getAddress()
  {
      return address;
  }

  public String getPhone()
  {
      return phone;
  }

  public List<Vehicle> getVehiclesByPrice(double minPrice, double maxPrice) {
      List<Vehicle> vehiclesWithinPriceRange = new ArrayList<>();

      for (Vehicle vehicle : inventory) {
          double price = vehicle.getPrice();
          if (price >= minPrice && price <= maxPrice)
              vehiclesWithinPriceRange.add(vehicle);
      }
      return vehiclesWithinPriceRange;
    }
  }

