/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tienda.managebean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named("dtGroupView")
@ViewScoped
public class GroupView implements Serializable {
     
    private final static String[] manufacturers;
     private List sales;
    static {        
        manufacturers = new String[10];
        manufacturers[0] = "Apple";
        manufacturers[1] = "Samsung";
        manufacturers[2] = "Microsoft";
        manufacturers[3] = "Philips";
        manufacturers[4] = "Sony";
        manufacturers[5] = "LG";
        manufacturers[6] = "Sharp";
        manufacturers[7] = "Panasonic";
        manufacturers[8] = "HTC";
        manufacturers[9] = "Nokia";
    }
public void init() {
        sales = new ArrayList();
            sales.add("Gerente");
         
    }
         
public List getSales() {
        return sales;
    }
 
}