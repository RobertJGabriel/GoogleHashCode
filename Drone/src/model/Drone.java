package model;

public class Drone {
    
    int[] currentCord;
    int maxLoad;
    
    public int getQuickestRouteToCust(int[] dest){
        int tempa = currentCord[0] - dest[0] ;
        int tempb = currentCord[1] - dest[1];
        int tempc = tempa * tempa;
        int tempd = tempb * tempb;
        int tempe = tempc + tempd;
        double result = Math.sqrt(tempe);
        
        return (int) Math.abs(Math.round(result));
    }
    
}
