class Hours extends ConsoleProgram {

  /**
  * A program that converts given hours into days and hours
  * @author: Steve Lin 
  */
  
  public void run() {
    
    // declare variables
    int intHours;
    int intDays;
    int intRemainder;

    // get hours;
    intHours = readInt ("Enter the number of hours: ");

    // calculate number of days and hours
    intDays = intHours / 24;
    intRemainder = intHours % 24;

    // output results
    System.out.println ("There are " + intDays + " days and " + intRemainder + " hours in " + intHours + " hours. ");
    

    
  }
}