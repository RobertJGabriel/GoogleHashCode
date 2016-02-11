package model;
import java.util.ArrayList;
import model.Product;

public class Warehouse {
    
    int row;
    int col;
    ArrayList<Integer> productList;
    
    public Warehouse(int row, int col, ArrayList<String> pl){
        this.row = row;
        this.col = col;
        productList = new ArrayList<>();
        for(String item: pl){
            productList.add(Integer.parseInt(item));
        }
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
