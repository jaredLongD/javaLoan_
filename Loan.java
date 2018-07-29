

public class Loan
{
   private Date loanDate;
   private double interestRate;
   private int loanLength;
   private double loanAmount;
   private Borrower person;
   
   public Loan(String aDate, String rate, String months, String amt, Borrower aPerson)
   {
      try
      {  
         //validate inputs in setters
         loanDate = new Date(aDate);
         interestRate = setLoanRate(rate);
         loanLength = setLoanLength(months);
         loanAmount = setLoanAmount(amt);
         aPerson.addLoan(this);
      }
      catch (Exception e)
      {
         System.out.println("Error: Exception Thrown " + e.getMessage());
      }
   }
   
   public Date getLoanDate()
   {
      return loanDate;
   }
   
   public double setLoanRate(String strRate)
   {
      double dblCheck = 0;

      try
      {
         //converted to a double
         strRate = strRate.replaceAll("%","");
         dblCheck = Double.parseDouble(strRate);
         
         //if < 0, then set to 0
         if (dblCheck < 0)
         {
            dblCheck = 0;
         }
      }
      catch (NumberFormatException nfe)
      {
         System.out.println("Error: Exception Thrown " + nfe.getMessage());
      }
      //divide by 100 to get accurate % calculation
      return dblCheck/100;
   }
   
   public int setLoanLength(String m)
   {
      int intCheck;
      
      //converted to int
      intCheck = Integer.parseInt(m);
      
      //if < 0, then set to 0
      if (intCheck < 0)
      {
         intCheck = 0;
      }
      return intCheck;
   }
   
   public double getLoanRate()
   {
      return interestRate;
   }
   
   public double setLoanAmount(String amt)
   {

      double dblCheck;
      //converted to double
      dblCheck = Double.parseDouble(amt);
      
      //if < 0, then set to 0
      if (dblCheck < 0)
      {
         dblCheck = 0;
      }
      return dblCheck;
   }
   
   public double getLoanAmount()
   {
      return loanAmount;
   }
}