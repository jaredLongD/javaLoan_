//preamble
//name: Jared Long
//date: 29 JUL 2018
//project: Final Project

public class Date
{
   private int month;
   private int day;
   private int year;
   
   public Date()
   {
      month = 00;
      day = 00;
      year = 0000;
   }
   
   public Date(String aDate)
   {
      try
      {   
         //split the numbers in the string to and array for parsing
         String[] data = aDate.split("/");            
         
         //placeholder variables to check valid month/day/year numbers
         int mCheck = Integer.parseInt(data[0]);
         int dCheck = Integer.parseInt(data[1]);
         int yCheck = Integer.parseInt(data[2]);
         
         //is the month 1-12?
         if (mCheck >= 1 && mCheck <= 12)
         {
            month = mCheck;
            
            //checking for months with 30 days
            if (mCheck == 4 || mCheck == 6 || mCheck == 9 || mCheck ==11)
            {
               if (dCheck >= 1 && dCheck <= 30)
               {
                  day = dCheck;
               }
               else
               {
                  throw new Exception("Invalid Day");
               }
            }
            //checking for months with 31 days
            else if (mCheck == 1 || mCheck == 3 || mCheck == 5 || mCheck == 7 || mCheck == 8 || mCheck == 10 || mCheck == 12)
            {
               if (dCheck >= 1 && dCheck <= 31)
               {
                  day = dCheck;
               }
               else
               {
                  throw new Exception("Invalid Day");
               }
            }
            //checking for leapyear
            else
            {
               //up to 29 days
               if(isLeapYear(yCheck))
               {
                  if (dCheck >= 1 && dCheck <= 29)
                  {
                     day = dCheck;
                  }
                  else
                  {
                     throw new Exception("Invalid February Day");
                  } 
               }
               //up to 28 days
               else if (!isLeapYear(yCheck))
               {
                  if (dCheck >= 1 && dCheck <= 28)
                  {
                     day = dCheck;
                  }
                  else
                  {
                     throw new Exception("Invalid February Day");
                  }
               }
               else
               {
                  throw new Exception("Invalid February Day");
               }
            } 
         }
         else
         {
            throw new Exception("Invalid Month");
         }
                  
         //check the year
         if (yCheck >= 1000 && yCheck <= 9999)
         {
            year = yCheck;
         }
         else
         {
           throw new Exception("Invalid Year"); 
         }
      }
      catch (Exception e)
      {
         System.out.println("Invalid Date Format: " + e.getMessage());
      }
   }
   
   //calculate leap year to determine February as 28 or 29(leap) days
   public boolean isLeapYear(int y)
   {
      //year is divisible by 4
      if (y%4 == 0) 
      {
         //year is divisible by 100
         if (y%100 == 0)
         {
            //year is not divisible by 400
            if (y%400 == 0)
            {
               return true;
            }
            else
            {
               return false;
            }
         }
         else
         {
            return false;
         }
      }
      else
      {
         return false;
      }
   }
   
   public String toString()
   {
      //format a string with leading zeros
      return String.format("%02d" + "/" + "%02d" + "/" + "%04d", month, day, year);
   }
}