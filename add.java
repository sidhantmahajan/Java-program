import java.util.*;

class BasicPrograms{
  public static int add(int a, int b){
    return(a+b); 
  }
  
  public static void main(String args[]){
    Scanner ask=new Scanner(System.in);
    int a = ask.nextInt();
    int b = ask.nextInt();
    int sum = add(a,b);
    System.out.println("Addition: "+sum);
  }
}
