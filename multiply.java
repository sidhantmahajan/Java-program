import java.util.*;

class BasicPrograms{
  public static int multiply(int a, int b){
    int total = a * b;
    return(total); 
  }
  
  public static void main(String args[]){
    Scanner ask=new Scanner(System.in);
    int a = ask.nextInt();
    int b = ask.nextInt();
    int product = multiply(a,b);
    System.out.println("Product: "+product);
  }
}
