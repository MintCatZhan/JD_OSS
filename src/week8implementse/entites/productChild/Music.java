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
public class Music extends Product{
    private String singer;
    private String type;
    private int year;
    private int quantity;
    private int numberOfSongs;

    public Music(String singer, String type, int year, int quantity, int numberOfSongs, String name) {
        super(name);
        this.singer = singer;
        this.type = type;
        this.year = year;
        this.quantity = quantity;
        this.numberOfSongs = numberOfSongs;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getNumberOfSongs() {
        return numberOfSongs;
    }

    public void setNumberOfSongs(int numberOfSongs) {
        this.numberOfSongs = numberOfSongs;
    }
    
}
