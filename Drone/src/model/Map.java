package model;
import java.util.ArrayList;
//Alan Smith
public class Map {
	
	private Map(){
		warehouseList = new ArrayList<>();
	};
	
	private static Map instance = null;
	

	int[] minCordinates;
    int[] maxCordinates;
    
    ArrayList<Warehouse> warehouseList;
    
    public Map(int[] minCord, int[] maxCord){
        this.minCordinates = minCord;
        this.maxCordinates = maxCord;
    }

	public int[] getMinCordinates() {
		return minCordinates;
	}

	public void setMinCordinates(int[] minCordinates) {
		this.minCordinates = minCordinates;
	}

	public int[] getMaxCordinates() {
		return maxCordinates;
	}

	public void setMaxCordinates(int[] maxCordinates) {
		this.maxCordinates = maxCordinates;
	}
	
	public void addWarehouse(Warehouse w){
		warehouseList.add(w);
	}
	public static Map getInstance(){
		if(instance == null){
			instance = new Map();
		}
		return instance;
	}
    
    public ArrayList<Warehouse> getWarehouseList() {
		return warehouseList;
	}

	public void setWarehouseList(ArrayList<Warehouse> warehouseList) {
		this.warehouseList = warehouseList;
	}
}
