package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class products {
   public String productCode ;
   public String productName ;
   public String productLine ;
   public int price;
   public products(){
   this.productCode = productCode;
        this.productName = productName;
        this.productLine = productLine;
        this.price = price;
   }
    public products(String productCode, String productName, String productLine, int price) {
        this.productCode = productCode;
        this.productName = productName;
        this.productLine = productLine;
        this.price = price;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductLine() {
        return productLine;
    }

    public void setProductLine(String productLine) {
        this.productLine = productLine;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}
