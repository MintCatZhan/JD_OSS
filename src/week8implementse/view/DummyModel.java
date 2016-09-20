package week8implementse.view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import week8implementse.entites.User;
import week8implementse.entites.Product;
import week8implementse.entites.productChild.Game;
import week8implementse.io.IO;

public class DummyModel implements Model {

    ArrayList<Product> productList = new ArrayList<>();
    HashMap<String, String> loginInfo = new HashMap<>();
    HashMap<String, User> users = new HashMap<>();

    public DummyModel() {
        IO readOrWrite = new IO();
        readOrWrite.readCustomerFile(loginInfo, users);
        readOrWrite.readGameFile(productList);
    }

    @Override
    public List<Product> getProducts() {
        return productList;
    }

    @Override
    public boolean login(String username, String password) {
        if (loginInfo.containsKey(username)) {
            return loginInfo.get(username).equals(password);
        }
        return false;
    }

    @Override
    public boolean signup(String username, String password) {
        if (loginInfo.containsKey(username)) {
            return false;
        }
        loginInfo.put(username, password);
        users.put(username, new User(0, "", username, "", "", "", ""));
        return true;
    }

    @Override
    public User getUserInfo(String username) {
        return users.get(username);
    }

    @Override
    public boolean setUserInfo(String username, User info) {
        users.put(username, info);
        return true;
    }

    @Override
    public float getPrice(Cart cart) {
        float total = 0;
        for (CartItem item : cart.getList()) {
            if (item.product.hasProperty("price")) {
                total += ((float) item.product.getPropertyValue("price")) * item.quantity;
            }
        }
        return total;
    }

    @Override
    public boolean processOrder(String currentUserID, Cart cart) {
        //检查quantity够不够
        for(CartItem ct: cart.getList()){
            if (ct.product instanceof Game){
                Game g = (Game)ct.product;
                int productQuantity = g.getQuantity();
                int purchasedQuantity = (int)ct.quantity;
                if(purchasedQuantity > productQuantity){
                    return false;
                }
                g.setQuantity(productQuantity-purchasedQuantity);
            }
        }
        return true;
    }

}
