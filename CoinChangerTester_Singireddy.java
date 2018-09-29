//Rajiv Singireddy
//Type A2

import java.util.Scanner;

//Tester class that initializes class CoinChangerTester_Singireddy and prints out results

public class CoinChangerTester_Singireddy
{
   public static void main(String[] args)
   {
      CoinChanger bellarmineMarketCoinChanger = new CoinChanger(100,100,100,100);
      bellarmineMarketCoinChanger.purchase();
      bellarmineMarketCoinChanger.printCoinsPaid();
      System.out.println(bellarmineMarketCoinChanger.toString() );
   }
} 

//Class CoinChanger initializing instance variables

class CoinChanger
{
   private int quartersPaid;
   private int dimesPaid;
   private int nickelsPaid;
   private int penniesPaid;
   
   private int quartersTotal;
   private int dimesTotal;
   private int nickelsTotal;
   private int penniesTotal;
    
   public CoinChanger(int quartersTotal, int dimesTotal, int nickelsTotal, int penniesTotal)
   {
      this.quartersTotal = quartersTotal;
      this.dimesTotal = dimesTotal;
      this.nickelsTotal = nickelsTotal;
      this.penniesTotal = penniesTotal;
   }
   
   
   public void purchase()
   {
      double totalCost = 0.0;
      double amountGiven = 0.0;
      double change = 0.0;
      
      Scanner scan = new Scanner(System.in);
      System.out.print("What is the total cost of the item you are buying?:  $");
      totalCost = scan.nextDouble();
      
      System.out.print("How much did you pay?:  $");
      amountGiven = scan.nextDouble();
      
      change = amountGiven - totalCost;
      
      quartersPaid = (int) (change / 0.25);
      dimesPaid = (int) ((change % 0.25) / 0.10);
      nickelsPaid = (int) ( ((change % 0.25) % 0.10) / 0.05);
      penniesPaid = (int) ( (( (change % 0.25) % 0.10) % 0.05) / 0.01 );
      
      printCoinsPaid();
   }
   
   public void printCoinsPaid()
   {
      String coinsPaid = "";
      
      coinsPaid = "\nQuarters: " + quartersPaid;
      coinsPaid += "\nDimes: " + dimesPaid;
      coinsPaid += "\nNickels: " + nickelsPaid;
      coinsPaid += "\nPennies: " + penniesPaid;
      
      System.out.println(coinsPaid);
   }
   
   public String toString()
   {
      String coinsRemaining = "";
      coinsRemaining = "\nQuarters Remaining: " + (quartersTotal - quartersPaid);
      coinsRemaining += "\nDimes Remaining: " + (dimesTotal - dimesPaid);
      coinsRemaining += "\nNickels Remaining: " + (nickelsTotal - nickelsPaid);
      coinsRemaining += "\nPennies Remaining: " + (penniesTotal - penniesPaid);
      
      return coinsRemaining;
   }
}
//End of code