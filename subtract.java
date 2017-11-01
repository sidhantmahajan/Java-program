import java.util.Scanner; //Need to import this to use the Scanner object

class AddNumbers
{
  
  public static void main(String args[]){
    int x; //Decalre integer variable x
    int y; //Declare integer variable y
    int sum; //Declare integer variable sum

    //Use System.out.println to print to console
    System.out.println("Enter two integers to calculate their difference ");

    //Scanner System.in allows for user input
    Scanner in = new Scanner(System.in);
    x = in.nextInt(); //First input goes into variable x
    y = in.nextInt(); //Second input goes into variable y
    difference = x - y; //x and y get subtracted together and their value is stored into difference

    //Print out the answer || use '+' when you want to print more on the same line
    System.out.println("Sum of entered integers = " + difference);
  }
}
