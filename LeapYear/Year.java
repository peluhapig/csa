public class Year
{
  int year;
  /**
   * Construct year object
   * @param y - year 
   */
  public Year(int y)
  {
    year = y;
  }

  

  /**
   * isLeapYear method
   * @return true if leap year, false otherwise
   * evenly divisible by 4 and either is not divisible by 100, or is divisible by 400
   */
  // public  boolean isLeapYear()
  // {
  //   if((year % 4==0)&&((year % 100 != 0)||(year % 400 ==0))){
  //     return true;
  //   }else{
  //     return false;
  //   }
    
  // }
  boolean isLeapYear = (year % 4==0)&&((year % 100 != 0)||(year % 400 ==0));

  public String toString()
  {
    return "" + year;
  }
}