/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class order {
  public  String ordercode;
 public  String productcode;
  public String nameProducts;
  public  int number;
  public  int pricecode;

    public order(String ordercode, String productcode, String nameProducts, int number, int pricecode) {
        this.ordercode = ordercode;
        this.productcode = productcode;
        this.nameProducts = nameProducts;
        this.number = number;
        this.pricecode = pricecode;
    }

    public String getOrdercode() {
        return ordercode;
    }

    public void setOrdercode(String ordercode) {
        this.ordercode = ordercode;
    }

    public String getProductcode() {
        return productcode;
    }

    public void setProductcode(String productcode) {
        this.productcode = productcode;
    }

    public String getNameProducts() {
        return nameProducts;
    }

    public void setNameProducts(String nameProducts) {
        this.nameProducts = nameProducts;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPricecode() {
        return pricecode;
    }

    public void setPricecode(int pricecode) {
        this.pricecode = pricecode;
    }

   

   
}
