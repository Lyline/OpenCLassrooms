package com.openclassrooms.store;
/**
 Mouse class allow to create an object Mouse, it extends to Item abstract class
 */
public class Mouse extends Item{
  /*private Brand brandName;
  private double price;*/

  /**
   Constructs an mouse's object, it extends to Item abstract object
   @param brandName brand's name of mouse
   @param price     price of mouse
   */
  public Mouse(Brand brandName, double price) {
    super(brandName, price);
  }

  /**
   gets the brand's name of the mouse
   @return  name of brand
   */
  public Brand getBrandName() {
    return brandName;
  }

  /**
   sets the brand's name of the mouse
   @param brandName new name of brand
   */
  public void setBrandName(Brand brandName) {
    this.brandName = brandName;
  }

  /**
   gets the price of the mouse
   @return price of the mouse
   */
  public double getPrice() {
    return price;
  }

  /**
   sets the price of the mouse
   @param price new price of the mouse
   */
  public void setPrice(double price) {
    this.price = price;
  }

  //ajout après correction
  /**
   prints the properties of this mouse
   @return properties' mouse
   */
  @Override
  public String toString() {
    return "Mouse -- "+super.toString();
  }
}
