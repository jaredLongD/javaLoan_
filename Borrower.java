


public class Borrower extends Person
{
   private Loan[] loans = new Loan[10];
   private int loanCount = 0;
   
   public Borrower(String aFName, String aLName, String aDate, Loan aLoan)
   {
      super(aFName, aLName, aDate);
          
   }
   
   public Borrower(String aFName, String aLName, String aDate)
   {
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
      //loop through the loan array and show all the loans for the person
      System.out.println("\nLoans for Borrower " + lastName + ", " + firstName + " include:");
      for (int i = 0; i < loanCount; i++)
         System.out.println("Loan " + (i+1) + " Dated: " + loans[i].getLoanDate() + " Amount: " + String.format("$%9.2f",loans[i].getLoanAmount()));
      return " ";
   }
   
   public String toString()
   {
      return "Borrower: " + lastName + ", " + firstName + " DOB: " + dateOfBirth;
   }
}