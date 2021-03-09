package com.openclassrooms.store;

import java.util.*;

/**
  Inventory class manages business logic of application : add item, remove item, update quantities
 and prints data.
 */
public class Inventory {
  HashMap<Item,Integer> inventory = new HashMap<>();

  /**
    allows to add a new item and modify quantity if this item exist yet.

   @param item      item to add/update
   @param quantity  quantity to add
   */
  public void addItem(Item item, int quantity) {
    /*int nbInStore=inventory.getOrDefault(item,0);
    //renvoie la valeur de l'item s'il existe sinon renvoie la valeur par défaut

    if(!inventory.containsValue(item))inventory.put(item, quantity);
    else {
      int oldQuantity = inventory.get(item);
      int newQuantity = oldQuantity + quantity;
      inventory.put(item, newQuantity);
    }*/
    inventory.put(item, inventory.getOrDefault(item,0)+quantity);
  }

  /**
    allows to remove quantity of this item. If the removed quantity is bigger of
   the remaining quantity, the new quantity is equal at 0.

   @param item      item selected
   @param quantity  quantity to remove
   */
  public void removeItem(Item item, int quantity) {
   /*
    int oldQuantity =inventory.get(item);
    int newQuantity=oldQuantity-quantity;
    if (newQuantity<0) newQuantity=0;
    inventory.put(item, newQuantity);
   */

    /*
    First refactoring
    int newQuantity= inventory.getOrDefault(item,0)-quantity;
    if(newQuantity<0) newQuantity=0;
    inventory.put(item,newQuantity);
    */

   inventory.put(item,Math.max(inventory.getOrDefault(item,0)-quantity,0 ));

  }

  /**
    print the inventory on the console.
   */
  public void displayInventoryOnConsole() {
    // add header and footer for more readability
    System.out.println("---Inventory---");
    inventory.forEach((Item,Integer)-> System.out.println( Item.getClass().getSimpleName()
        + " " + Item.brandName + " : " +Integer));
    System.out.println("---End inventory---");
  }

  /**
    print the list of items on the console.
   */
  public void displayItemsOnConsole() {
    // add header and footer for more readability
    System.out.println("---List of items---");
    inventory.forEach((Item,Integer)-> System.out.println(Item.toString()));
    System.out.println("---End list---");
  }
}
