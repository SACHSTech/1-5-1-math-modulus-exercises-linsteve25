class Minutes extends ConsoleProgram {

  /**
  * A program that computes the number of days, hours, and minutes from minutes given by the user
  * @author: Steve Lin 
  */
  
  public void run() {
    
    // declare variables
    int intMinutes;
    int intRemainderMinutes;
    int intHours;
    int intRemainderHours;
    int intDays;

    // get minutes
    intMinutes = readInt ("Enter the number of minutes: ");

    // compute number of days, hours, and minutes
    intHours = intMinutes / 60;
    intRemainderMinutes = intMinutes % 60;

    intDays = intHours / 24;
    intRemainderHours = intHours % 24;

    // output results
    System.out.println ("In " + intMinutes + " minutes there are " + intDays + " days, " + intRemainderHours + " hours, and " + intRemainderMinutes + " minutes.");


    

    
  }
}