
// Ayush Jamindar
public class PairShare
{
    public PairShare ()
    {
        
    }
    public int CountDown(int num)
    {
        if (num == 0)
        {
            System.out.println("0");
            return 0;
        }
        else
        {
            System.out.println(num);
            return CountDown(num - 1);
        }
    }
    
    public int sum(int start, int finish)
    {
         if (start == finish)
         {
            System.out.println(finish);              
            return finish;
          }
         else
         {
            System.out.println(start);
            return start + sum(start +1, finish);
           }
    }
     
    public String reverse(String phrase)
    {
        if (phrase.length() <= 1)
            return phrase;
        else
            return reverse(phrase.substring(1,phrase.length())) + phrase.charAt(0);
    }
    
    public boolean prime(int num)
    {
        
    }    
    
    
}
