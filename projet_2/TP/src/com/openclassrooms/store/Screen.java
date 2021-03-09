package com.openclassrooms.store;

/**
 Screen class allow to create an object Screen, it extends to Item abstract class
 */
public class Screen extends Item {
  /*private Brand brandName;
  private double price;
  private String information;*/

  private String resolution;

  /**
   Constructs a screen object extends to Item abstract class.

   @param brandName  name's brand of the item
   @param price      price of the item
   @param resolution information of the item
   */
  public Screen(Brand brandName, double price, String resolution) {
    //super(brandName,price, information);
    super(brandName, price);
    this.resolution = resolution;
  }

  /**
   gets the brand's screen

   @return name of brand
   */
  public Brand getBrandName() {
    return brandName;
  }

  /**
   gets the price's screen

   @return price of screen
   */
  public double getPrice() {
    return price;
  }

  /**
   sets the price's screen

   @param price new price of screen
   */
  public void setPrice(double price) {
    this.price = price;
  }

  /**
   gets the resolution of the screen
   @return resolution of the screen
   */
  public String getResolution() {
    return resolution;
  }

  /**
   sets the resolution of the screen
   @param resolution new resolution of the screen
   */
  public void setResolution(String resolution) {
    this.resolution = resolution;
  }

  /**
   prints the properties of this screen
   @return properties' screen
   */
  @Override
  public String toString() {
    return "Screen -- " + super.toString()+" Resolution : " + resolution;
  }
}
