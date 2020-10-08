import java.util.Scanner;
/**
 *
 * @ Gavin
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create scanner for user input
    Scanner input = new Scanner(System.in);

    // ask user how many heights they would like to enter
    System.out.println("How many heights would you like to enter?");
    int heights = input.nextInt();

    // create array with 5 spots
    double[] total = new double[heights];
   
    // put heights into array using loop
    for(int i = 0; i < total.length; i++){
     System.out.println("Please enter a height using cm");
     total[i] = input.nextDouble();
    }
    // create a variable to store the sum
    double sum = 0;

    // use a for loop to go trhough the array and add sum
    for(int i = 0; i < total.length; i++){
      // add total to sum
      sum = sum + total[i];
    }

    // detirmine the average
    double average = sum / total.length;

    // let user know
    System.out.println("The avereage of the heights entered is " + average + "cm");
   
    // tell user the heights above the average
    System.out.println("The heights above average are: ");
    for(int i = 0; i < total.length; i++){
      if(total[i] > average)
      System.out.println(total[i]);
    } 
  }
}
