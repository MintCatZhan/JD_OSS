/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8implementse.entites.productChild;

import week8implementse.entites.Product;

/**
 *
 * @author YuanZhan
 */
public class Game extends Product{
    private int year;
    private String platform;
    private float price;
    private String publisher;
    private int quantity;

    public Game(String name, int year, String platform, float price, String publisher, int quantity) {
        super(name);
        this.year = year;
        this.platform = platform;
        this.price = price;
        this.publisher = publisher;
        this.quantity = quantity;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    
    
}
