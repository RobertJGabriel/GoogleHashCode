package model;
import java.util.ArrayList;
//Alan Smith
public class Map {
    
    int[] minCordinates;
    int[] maxCordinates;
    
    ArrayList<Warehouse> warehouseList;
    
    public Map(int[] minCord, int[] maxCord){
        this.minCordinates = minCord;
        this.maxCordinates = maxCord;
    }
}
