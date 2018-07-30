//preamble
//name: Jared Long
//date: 29 JUL 2018
//project: Final Project
import java.lang.StringBuilder;

public class Borrower extends Person
{
   private Loan[] loans = new Loan[10];
   private int loanCount = 0;
   
   public Borrower(String aFName, String aLName, String aDate, Loan aLoan)
   {
      //call to person to set names/date
      super(aFName, aLName, aDate);     
   }
   
   public Borrower(String aFName, String aLName, String aDate)
   {
      //call to person to set names/date
      super(aFName, aLName, aDate);   
   }
   
   public void addLoan(Loan aLoan)
   {
      //add loan into a loan array
      loans[loanCount] = aLoan;
      
      //increment loanCount
      loanCount += 1;
   }
   
   public String getAllLoans()
   {
      //initial message for borrower
      String s;
      StringBuilder sBldr = new StringBuilder("\nLoans for Borrower " + lastName + ", " + firstName + " include:");
      
      //loop through the loan array and show all the loans for the person
      for (int i = 0; i < loanCount; i++)
         sBldr.append("\nLoan " + (i+1) + " Dated: " + loans[i].getLoanDate() + " Amount: " + String.format("$%9.2f",loans[i].getLoanAmount()));
      s = sBldr.toString();
      return s;
   }
   
   public String toString()
   {
      return "Borrower: " + lastName + ", " + firstName + " DOB: " + dateOfBirth;
   }
}