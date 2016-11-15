package production;


import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hanbo
 */
public class Inventory {
    HashMap inventory = new HashMap<Integer,String>();
    int x;
    String itemname;
    Boolean b;
    int s;
    
    
    public void Inventory(int x, String itemname){
        inventory.put(x, itemname);
        
    }
    public void finditem(String itemname){
        
        System.out.println("item:"+itemname+"is in shelf:"+ 1);
        
    }
    public void status(String itemname){
        System.out.println("Name:"+itemname);
        System.out.println("Quantity:"+x);
        System.out.println("Stock Status:"+b);
    }
    int currentstock(){
        return s;
    }
    boolean outofstock(){
        if (s==0) return b=true;
        return b=false;
    }
    public void add(String itemname, int n){
        s= s+n;
    }
    public void takeout(String itemname, int n){
        s= s-n;
    }
}
