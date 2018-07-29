

public class Person
{
   String firstName;
   String lastName;
   Date dateOfBirth;
   
   public Person(String aFName, String aLName, String aDate)
   {
      firstName = aFName;
      lastName = aLName;     
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
      String fullName;
      fullName = lastName + ", " + firstName;
      return fullName;
   }
   
   public void setDateOfBirth(String aDate)
   {
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