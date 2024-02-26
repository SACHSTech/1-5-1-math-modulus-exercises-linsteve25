class Program1 extends ConsoleProgram {

  /**
  * A program that converts kilometres given by the user into miles
  * @author: Steve Lin
  */
  
  public void run() {

    // declare variables 
    double dblKilometres;
    double dblMiles;

    // get kilometres
    dblKilometres = readDouble("Enter the number of kilometres: ");

    // convert kilometres entered into miles using formula
    dblMiles = dblKilometres * 0.62137;

    // output result
    System.out.println (dblKilometres + " kilometres is equal to " + dblMiles + " miles.");

    
    
  }
}
