import java.util.ArrayList;
import java.util.Random;

public class Piles
{
   public boolean isDone()
   {
      
      //We are done when we have some combination of the numbers
      //1 through 9 in the piles. Therefore, we can first check to
      //make sure we have exactly 9 piles so we don't waste our time.
      //We also need to take care that we have the exact numbers and
      //avoid a situation like  1 1 3 4 5 6 7 8 10  which means we
      //still aren't done.
      
      
     
      int [] pile2 = new int[10];
     
      if(piles.size() == 9)
      {
          for (int i = 0; i<9; i++)
          {
              for(int x = 1; x<=9; x++)
              {
                  if (piles.get(i)== x)
                    pile2[x-1]++;
                }
            }
        }
      
       else
        { 
          return false;
        }
      
      
      for(int y = 0; y<9; y++)
      {
          if(pile2[y] == 1)
            return true;
        }
      return false;
   }

   private ArrayList<Integer> piles;

   /**
      Sets up the game randomly with some number of piles of random
      size. The pile sizes add up to 45.
   */
   public Piles(Random generator)
   {
      piles = new ArrayList<Integer>();
      /* randomly divide up the deck into piles */
      int TOTAL_SIZE = 45;  // number of cards in a deck
      int numCards = TOTAL_SIZE;
      while (numCards > 0)
      {
         int pile = generator.nextInt(numCards) + 1;
         piles.add(pile);
         numCards -= pile;
      }
   }

   /**
      Set up a pile with a known (non-random) configuration for testing.
      @param pileSizes an array of numbers whose sum is 45
   */
   public Piles(int[] pileSizes)
   {
      piles = new ArrayList<>();
      for (int s : pileSizes)
         piles.add(s);
   }

   /**
    * Return the string representation of the piles.
    * @return the string representation of the piles.
    */
   public String toString()
   {
      return piles.toString();
   }

   //Play one round of the game.
   
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


