


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
      System.out.println(loans[loanCount]);
      loanCount += 1;
      
   }
   
   public String getAllLoans()
   {
      //loop through the loan array and show all the loans for the person
      System.out.println("Loans for Borrower " + lastName + ", " + firstName + " include:\n");
      for (int i = 0; i < loans.length; i++)
         System.out.println("Loan " + i);// + " Dated: " + loanDate + " Amount: " + 
      return "getAllLoans";
   }
   
   public String toString()
   {
      return "Borrower: " + lastName + ", " + firstName + " DOB: " + dateOfBirth;
   }
}