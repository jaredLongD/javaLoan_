//preamble
//name: Jared Long
//date: 29 JUL 2018
//project: Final Project

public class Person
{
   String firstName;
   String lastName;
   Date dateOfBirth;
   
   public Person(String aFName, String aLName, String aDate)
   {
      firstName = aFName;
      lastName = aLName;     
      
      //catch date exceptions
      try
      {
         dateOfBirth = new Date(aDate);
      }
      catch (Exception e)
      {
         System.out.println("Error: Exception Thrown " + e.getMessage());
      }
   }
   
   public void setName(String aFName, String aLName)
   {
      firstName = aFName;
      lastName = aLName;
   }
   
   public String getFullName()
   {
      //return string of person's full name
      String fullName;
      fullName = lastName + ", " + firstName;
      return fullName;
   }
   
   public void setDateOfBirth(String aDate)
   {
      //catch date exceptions
      try
      {
         dateOfBirth = new Date(aDate);
      }
      catch (Exception e)
      {
          System.out.println("Error: Exception Thrown " + e.getMessage());
      }
         
   }
   
   public String getDateOfBirth()
   {
      //convert to String for output
      return dateOfBirth.toString();
   }
}