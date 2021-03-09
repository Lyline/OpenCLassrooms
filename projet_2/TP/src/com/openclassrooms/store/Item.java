package com.openclassrooms.store;

public abstract class Item {
  Brand brandName;
  double price;
  //String information;

  /**
   Constructs an abstract objet of item's type with 2 parameters : the name of the brand, the price
   of the item.
   @param brandName brand's name of the item
   @param price     price of the item
   */
  public Item(Brand brandName, double price) {
    this.brandName = brandName;
    this.price = price;
  }

  /**
   Constructs an abstract objet of the item's type with 3 parameters : the name of the brand, the
   price of the item, the informations of the item.@param brandName   brand's name of item

   @param price       price of item
   @param information informations of item

   @return
   */
  /*
  public Item(Brand brandName, double price, String information) {
    this.brandName = brandName;
    this.price = price;
    this.information = information;
  }*/
  //ajout après correction
  /**
   prints the properties of this item
   @return properties' item
   */
  @Override
  public String toString() {
    return "Brand : "+brandName+" - Price : "+price+"€";
  }
}
