package production;

import production.Inventory;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hanbo
 */
public class Shelf extends Inventory{
    int shelfnum;
    String itemname;
    
    public void initialshelf(int x){
        x = 1;
        this.shelfnum = x;
    }


}
