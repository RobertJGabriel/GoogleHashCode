package model;
import java.util.ArrayList;
import model.Product;

public class Warehouse {
    
    int row;
    int col;
    ArrayList<Product> productList;
    
    public Warehouse(int row, int col){
        this.row = row;
        this.col = col;
        productList = new ArrayList<>();
    }
    
    public int getQuickestRouteToHere(int[] dest){
        int tempa = row - dest[0] ;
        int tempb = col - dest[1];
        int tempc = tempa * tempa;
        int tempd = tempb * tempb;
        int tempe = tempc + tempd;
        double result = Math.sqrt(tempe);
        
        return (int) Math.abs(Math.round(result));
    }
    
    public boolean checkProductIsStocked(Product product){
       return productList.contains(product);
    }
    
    public boolean areAllProductsInThisWarehouse(ArrayList<OrderItem> list){
    	int plistsize = productList.size();
    	for(OrderItem item: list){
    		for(int i = 0; i < plistsize; i++){
    			if(item.productType == productList.get(i).getType()){
    				break;
    			}
    			if(i == (plistsize -1)){
    				return false;
    			}
    		}
    	}
    	return true;
    }
}
