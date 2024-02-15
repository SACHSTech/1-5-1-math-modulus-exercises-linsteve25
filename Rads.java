class Rads extends ConsoleProgram {

  /**
  * A program that converts degree measures to radian measures
  * @author: Steve Lin
  */
  
  public void run() {
    
    // declare variables
    double dblDegrees;
    double dblRadians;

    // get degrees
    dblDegrees = readDouble("Enter the degrees: ");

    // convert degrees to radians
    dblRadians = Math.toRadians(dblDegrees);

    // outpute result
    System.out.println (dblDegrees + " degrees converted to radians is " + dblRadians);
    
  }

}