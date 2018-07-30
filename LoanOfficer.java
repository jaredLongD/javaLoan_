//preamble
//name: Jared Long
//date: 29 JUL 2018
//project: Final Project

public class LoanOfficer extends Person
{
   private Date dateEmployed;
   private String employeeNumber;
   
   public LoanOfficer(String aFName, String aLName, String DOB, String aDateEmployed, String aEmployeeNumber)
   {
      //go to person class to assign names/DOB
      super(aFName, aLName, DOB);
      
      //catch exceptions for date
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
      
      //catch exceptions for date
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
      //set the employee number
      employeeNumber = num;
   }
   
   public String getEmployeeNumber()
   {
      return employeeNumber;
   }
   
   public String toString()
   {
      //output Loan Office information
      return "Loan Officer: " + lastName + ", " + firstName + " Born: " + dateOfBirth + " \nEmployee Number: " + employeeNumber + " Hire Date: " + dateEmployed;
   }
}