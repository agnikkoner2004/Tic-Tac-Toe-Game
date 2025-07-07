package Data_Structure.Arraylist;
import java.util.*;
public class storewater {
    //function to find the maximum water that can be stored between the walls
    public static int storeWater(ArrayList<Integer> height) {
        int lp = 0;
        int rp=height.size()-1;
        int maxWater=0;
        while (lp<rp){
            //calculate the stored water
            int ht=Math.min(height.get(rp), height.get(lp));
            int width=rp-lp;
            int currentWater=ht*width;
            //update the maximum area
            maxWater=Math.max(maxWater, currentWater);
            //moving the pointer for lp
            if (height.get(lp)<height.get(rp)){
                lp++;
            }else{
                rp--;//for right pointer
            }
        }
        return maxWater;
            
        }
    
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);  
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println("Maximum water that can be stored: " + storeWater(height));
    }
    
}
