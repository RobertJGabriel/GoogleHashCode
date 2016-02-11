//Alan Smith
package model;

import java.util.ArrayList;

public class Order {
    
    int[] delCord;
    ArrayList<OrderItem> items;

    public int[] getDelCord() {
        return delCord;
    }

    public void setDelCord(int[] delCord) {
        this.delCord = delCord;
    }

    public ArrayList<OrderItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<OrderItem> items) {
        this.items = items;
    }
    
    
}
