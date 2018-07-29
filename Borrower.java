


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
      System.out.println("addLoan");
   }
   
   public String getAllLoans()
   {
      //loop through the loan array and show all the loans for the person
      
      return "getAllLoans";
   }
   
   public String toString()
   {
      return "Borrower: " + lastName + ", " + firstName + " DOB: " + dateOfBirth;
   }
}