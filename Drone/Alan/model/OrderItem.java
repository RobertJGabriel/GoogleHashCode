//Alan Smith
package model;

public class OrderItem {
    
    int productType;
    int quantity;
    
    
    public OrderItem(int productType, int quantity){
        this.productType = productType;
        this.quantity = productType;
    }

    public int getProductType() {
        return productType;
    }

    public void setProductType(int productType) {
        this.productType = productType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
