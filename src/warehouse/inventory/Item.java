package warehouse.inventory;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hanbo
 */
public class Item extends Inventory{
    int quantity;
    Boolean outofstock;
    String itemname;
    
    Item (String itemname,int q){
        this.itemname = itemname;
        this.quantity = q;
        this.outofstock = b;
        
    }
            
     
}
