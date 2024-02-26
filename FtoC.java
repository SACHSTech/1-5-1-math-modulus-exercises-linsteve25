class FtoC extends ConsoleProgram {

  /**
  * A program that converts a given a degree in Fahrenheit by the user to Celsius 
  * @author: Steve Lin 
  */
  
  public void run() {
    
    // declare variables
    double dblFahrenheit;
    double dblCelsius;

    // get degrees in Fahrenheit
    dblFahrenheit = readDouble("Enter the degrees in Fahrenheit: ");

    // use formula to convert Fahrenheit to Celsius
    dblCelsius = ((dblFahrenheit - 32) * 5) / 9;

    // outpur results
    System.out.println (dblFahrenheit+ " degrees Fahrenheit converted into Celsius is " + dblCelsius);
    
  }
}