import java.util.Scanner;
public class fact
{
 public static void main(String args[])
 {
  int n;
  Scanner s = new Scanner(System.in);
  n= s.nextInt();
  if(n==0)
  {
   System.out.println(1);
  }
   int fact =1;
  for(int i=n; i>0;i--)
  {
   fact = fact*i;
  }
  System.out.println(fact);
  
 }
}

