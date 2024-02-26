class AreaSin extends ConsoleProgram {

  /**
  * A program that calculates the area of a triangle given two sides and a contained angle by the user
  * @author: Steve Lin
  */
  
  public void run() {
    
    // declare variables
    double dblSideA;
    double dblSideB;
    double dblAngle;
    double dblArea;

    // enter side lengths and angle
    dblSideA = readDouble("Enter the first side length: ");
    dblSideB = readDouble("Enter the second side length: ");
    dblAngle = readDouble("Enter the angle: ");

    // calculate the area
    dblArea = (dblSideA * dblSideB * Math.sin(Math.toRadians(dblAngle))) / 2;

    // output result
    System.out.println ("The area of the triangle is " + dblArea);

    
    
  }
}