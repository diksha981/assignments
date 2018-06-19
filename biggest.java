
public class biggest{

  public static void main(String[] args) {

      int a = 30, b = 22, c = 29;

      if( a >= b && a >= c)
          System.out.println(a +" is the largest Number");

      else if (b >= a && b >= c)
          System.out.println(b +" is the largest Number");

      else
          System.out.println(c +" is the largest Number");
  }
}