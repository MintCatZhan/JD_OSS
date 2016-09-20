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
public class Movie extends Product{
    private int year;
    private String genre;
    private double price;
    private String director;
    private int quantity;
    private int numberOfFilms;

    public Movie(int year, String genre, double price, String director, int quantity, String name, int numberOfFilms) {
        super(name);
        this.year = year;
        this.genre = genre;
        this.price = price;
        this.director = director;
        this.quantity = quantity;
        this.numberOfFilms = numberOfFilms;
    }

    public int getNumberOfFilms() {
        return numberOfFilms;
    }

    public void setNumberOfFilms(int numberOfFilms) {
        this.numberOfFilms = numberOfFilms;
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
    
}
