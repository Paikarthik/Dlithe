import java.util.Scanner;

public class Char_check
{
 public static void main( String args[])
 {
  Scanner s = new Scanner(System.in);
  char ch = s.next().charAt(0);
  if(Character.isAlphabetic(ch) && "aeiouAEIOU".contains(Character.toString(ch)))
  {
   System.out.println("Vowel");
   System.exit(0);
  }
  System.out.println(" Not Vowel");
 }
} 
