
/**
 * Write a description of class PairShare here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
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
    
    public int CountUp(int num)
    {
        int n = 0;
        if (n == num)
        {
             System.out.println(num);
             return num;   
        }
        else
        {
            System.out.println(n);
            return CountUp(n+1);
        }
    }
}
