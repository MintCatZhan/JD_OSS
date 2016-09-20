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
public class TVSeries extends Product{
    private int year;
    private String genre;
    private double price;
    private String director;
    private int quantity;
    private int episodes;
    private String star;

    public TVSeries(int year, String genre, double price, String director, int quantity, int episodes, String star, String name) {
        super(name);
        this.year = year;
        this.genre = genre;
        this.price = price;
        this.director = director;
        this.quantity = quantity;
        this.episodes = episodes;
        this.star = star;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public String getStar() {
        return star;
    }

    public void setStar(String star) {
        this.star = star;
    }
    
    
}
