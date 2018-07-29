
public class LoanOfficer extends Person
{
   private Date dateEmployed;
   private String employeeNumber;
   
   public LoanOfficer(String aFName, String aLName, String DOB, String aDateEmployed, String aEmployeeNumber)
   {
      super(aFName, aLName, DOB);
      
      try
      {
         dateEmployed = new Date(aDateEmployed);
      }
      catch(Exception e)
      {
         System.out.println("Error: Exception Thrown " + e.getMessage());
      }
      employeeNumber = aEmployeeNumber;
   }
   
   public void setDateEmployed(String aDate)
   {
      
      try
      {
         dateEmployed = new Date(aDate);
      }
      catch(Exception e)
      {
         System.out.println("Error: Exception Thrown " + e.getMessage());
      }
   }
   
   public String getDateEmployed()
   {  
      //convert to string for output
      return dateEmployed.toString();
   }
   
   public void setEmployeeNumber(String num)
   {
      employeeNumber = num;
   }
   
   public String getEmployeeNumber()
   {
      return employeeNumber;
   }
   
   public String toString()
   {
      return "Loan Officer: " + lastName + ", " + firstName + " Born: " + dateOfBirth + " \nEmployee Number: " + employeeNumber + " Hire Date: " + dateEmployed;
   }
}