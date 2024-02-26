class Power extends ConsoleProgram {

  /**
  * A program that that lets the user enter two numbers a,b, and that prints out a^b
  * @author: Steve Lin 
  */
  
  public void run() {
    
    // declare variables
    double dblBase;
    double dblExponent;
    double dblPower;

    // get base and power
    dblBase = readDouble("Enter the base: ");
    dblExponent = readDouble("Enter the exponent: ");

    // calculate the final power
    dblPower = Math.pow(dblBase, dblExponent);

    // output result
    System.out.println ("A base of " + dblBase + " with an exponent of " + dblExponent + " equals " + dblPower);

    
  }
}