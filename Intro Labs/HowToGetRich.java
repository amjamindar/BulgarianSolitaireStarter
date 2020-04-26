
/**
 * Write a description of class HowToGetRich here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HowToGetRich
{
 public HowToGetRich()
 {
 }
 public int collect(int money)
 {       
        
   if (money > 1)
   {
     System.out.println("Call in 10 People "+"$"+(money / 10));
     System.out.println("$"+money+ " = " +" "+(money/10)+" "+(money/10)+" "+(money/10)+" "+(money/10)+" "+(money/10)+" "+
     (money/10)+" "+(money/10)+" "+(money/10)+" "+(money/10)+" "+(money/10));
  
     return(collect(money / 10)); 
   }
   
   
   else
   {
     return -1;
   }
          
 }
 
 
 /**
  * Main 
  */
 public static void main(String[] args)
 {
   HowToGetRich rich = new HowToGetRich();
   rich.collect(1000);
 }
}