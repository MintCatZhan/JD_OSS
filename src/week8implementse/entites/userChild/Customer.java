/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8implementse.entites.userChild;

import week8implementse.entites.User;

/**
 *
 * @author YuanZhan
 */
public class Customer extends User{
    private int credit;
    private int totalCredit;
    private String cardNumber;
    private String address;
    private String level;

    public Customer(int credit, int totalCredit, String cardNumber, String address, String level, int userId, String name, String username, String password, String verificationQuestion, String answer, String dob) {
        super(userId, name, username, password, verificationQuestion, answer, dob);
        this.credit = credit;
        this.totalCredit = totalCredit;
        this.cardNumber = cardNumber;
        this.address = address;
        this.level = level;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getTotalCredit() {
        return totalCredit;
    }

    public void setTotalCredit(int totalCredit) {
        this.totalCredit = totalCredit;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
    
    
}
