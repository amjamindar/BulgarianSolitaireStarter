
import java.util.ArrayList;


//  A class that plays Bulgarian Solitare. 
//  Version 1: Implement the playRound and toString methods.

public class Piles
{
   private ArrayList<Integer> piles;

 
     // Create a set of piles with a known (non-random) configuration for testing.
     // @param pileSizes an array of numbers whose sum is 45
   
   public Piles(int[] pileSizes)
   {
      piles = new ArrayList<>();
      for (int s : pileSizes)
         piles.add(s);
   }

  
    //Return the string representation of the piles.
    //@return the string representation of the piles.
   
   public String toString()
   {
      String nums = "";
      int counter = 0;
      for (int i = 0; i < piles.size(); i++)
      {
          counter += 1;
          if (counter == piles.size())
            nums += piles.get(i); 
          else 
            nums += piles.get(i) + ", ";
        }
      return nums;
   }

   
     // Play one round of the game.
    
   public void playRound()
   {   int length = 0;
       for (int i = 0; i < piles.size(); i++)
       {
           length++;
           if (piles.get(i) != 1)
           {
               piles.set(i,piles.get(i).intValue()-1);
           }
           else
           {
               piles.remove(i);
               i--;
            }
        }
        piles.add(length);
   }
}
