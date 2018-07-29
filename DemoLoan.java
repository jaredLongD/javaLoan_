//name: kenneth w riddle
//date: 11.23.16
//project: demo loan

//
// Demo class
//

public class DemoLoan
{
   public static void main(String[] args)
   {
      try
      {
         //create loan officiers
         LoanOfficer person1 = new LoanOfficer("Peter", "Washington", "01/03/2000", "02/28/2001", "L-001");
         LoanOfficer person2 = new LoanOfficer("Mary", "Adams", "04/05/1987", "04/06/1998", "L-002");
   
         //create borrowers
         Borrower person3 = new Borrower("Paul", "Jefferson", "02/28/2016");
         Borrower person4 = new Borrower("Mama", "Casselliot", "02/02/2016");
         
         //create loans
         new Loan("10/4/2015", "15%", "36", "1000.00", person3);
         new Loan("08/5/2015", "10%", "24", "3000.00", person3);
         new Loan("08/6/2015", "5%", "48", "10000.00", person4);
         new Loan("08/7/2015", "10%", "36", "8000.00", person3);
         new Loan("09/8/2015", "8%", "60", "12000.00", person4);

         
         //output people
         System.out.println(
         person1.toString() + "\n" + 
         person2.toString() + "\n" + 
         person3.toString() + "\n" + 
         person4.toString() + "\n");

         //output loans
         System.out.println(
            person3.getAllLoans() + "\n" +
            person4.getAllLoans() + "\n");
       
      }
      catch (Exception e)
      {
         System.out.println("Error: Exception Thrown " + e.getMessage());
      }
   }//end of main
}//end of class