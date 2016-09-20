/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8implementse.io;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import week8implementse.entites.Product;
import week8implementse.entites.User;
import week8implementse.entites.productChild.Game;
import week8implementse.view.Cart;
import week8implementse.view.CartItem;

/**
 *
 * @author YuanZhan
 */
public class IO {

    private static final String CUSTOMER_FILE = "Customer.txt";
    private static final String GAME_FILE = "Game.txt";
    private static final String MOVIE_FILE = "Movie.txt";
    private static final String MUSIC_FILE = "Music.txt";
    private static final String TV_FILE = "TV Series.txt";
    private static final String REPORT_FILE = "Report.txt";

    private static final int USER_ID_INDEX = 0;
    private static final int USER_NAME_INDEX = 1;
    private static final int USER_USERNAME_INDEX = 2;
    private static final int USER_PASSWORD_INDEX = 3;
    private static final int USER_SECRQUES_INDEX = 4;
    private static final int USER_ANSWER_INDEX = 5;
    private static final int USER_DOB_INDEX = 6;

    private static final int GAME_NAME_INDEX = 0;
    private static final int GAME_YEAR_INDEX = 1;
    private static final int GAME_PLATFORM_INDEX = 2;
    private static final int GAME_PRICE_INDEX = 3;
    private static final int GAME_PUBLISHER_INDEX = 4;
    private static final int GAME_QUANTITY_INDEX = 5;

    public void readCustomerFile(HashMap<String, String> loginInfo, HashMap<String, User> users) {
        try {
            File customerFile = new File(CUSTOMER_FILE);
            Scanner inputFile = new Scanner(customerFile);
            while (inputFile.hasNextLine()) {
                String currentLine = inputFile.nextLine();
                String[] lineArray = currentLine.split(",");
                String userId = lineArray[USER_ID_INDEX];
                String name = lineArray[USER_NAME_INDEX];
                String username = lineArray[USER_USERNAME_INDEX];
                String password = lineArray[USER_PASSWORD_INDEX];
                String secrQues = lineArray[USER_SECRQUES_INDEX];
                String answer = lineArray[USER_ANSWER_INDEX];
                String dob = lineArray[USER_DOB_INDEX];
                int id = Integer.parseInt(userId);
                User tempUser = new User(id, name, username, password, secrQues, answer, dob);
                loginInfo.put(username, password);
                users.put(username, tempUser);
            }
            inputFile.close();
        } catch (Exception e) {
            System.out.println("error in importing customer" + e.getMessage());
        }
    }

    public void readGameFile(ArrayList<Product> productList) {
        try {
            File gameFile = new File(GAME_FILE);
            Scanner inputFile = new Scanner(gameFile);
            while (inputFile.hasNextLine()) {
                String currentLine = inputFile.nextLine();
                String[] lineArray = currentLine.split(",");
                String name = lineArray[GAME_NAME_INDEX];
                String publishYear = lineArray[GAME_YEAR_INDEX];
                String platform = lineArray[GAME_PLATFORM_INDEX];
                String priceInput = lineArray[GAME_PRICE_INDEX];
                String publisher = lineArray[GAME_PUBLISHER_INDEX];
                String quantityInput = lineArray[GAME_QUANTITY_INDEX];
                int year = Integer.parseInt(publishYear);
                float price = Float.parseFloat(priceInput);
                int quantity = Integer.parseInt(quantityInput);
                Game tempGame = new Game(name, year, platform, price, publisher, quantity);
                tempGame.setProperty("price", "Price ($)", price);
                productList.add(tempGame);
            }
        } catch (Exception e) {
            System.out.println("error in importing game" + e.getMessage());
        }
    }

    /*
    used to save the items in cart after click loging off
     */
    public void saveCartInfo(ArrayList<Product> cartList) {

    }

    /*
    save order information after checking out
     */
    public void savePurchaseRecord(Cart cart, String currentUserID) {
        File orderInfor = new File(REPORT_FILE);
        try {
            PrintStream outFile = new PrintStream(orderInfor);
            for (int index = 0; index < cart.getList().size(); index++) {
                CartItem tempItem = cart.getList().get(index);
                
                if (tempItem.product instanceof Game) {
                    Game g = (Game) tempItem.product;
                    outFile.println(g.getName()+ "," + (int)tempItem.quantity + "," + currentUserID);
                }
            }
        } catch (Exception e) {
            System.out.println("error in write");
        }
    }
}
