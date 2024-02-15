class Cos3rd extends ConsoleProgram {

  /**
  * A program that calculates the missing third side through cosine law
  * @author: Steve Lin 
  */
  
  public void run() {
    
    // declare variables 
    double dblAngle;
    double dblSideA;
    double dblSideB;
    double dblSideC;

    // enter sides and angle
    dblAngle = readDouble("Enter the angle: ");
    dblSideA = readDouble("Enter the first side length: ");
    dblSideB = readDouble("Enter the second side lenght: ");

    // calculate missing side
    dblSideC = Math.sqrt(Math.pow (dblSideA, 2) + Math.pow (dblSideB, 2) - 2 * dblSideA * dblSideB * Math.cos(Math.toRadians(dblAngle)));

    // output result
    System.out.println ("The length of the missing side is: " + dblSideC);

    
  }
}