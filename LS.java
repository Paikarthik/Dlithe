import java.util.Scanner;
public class LS
{
 public static void main(String[] args)
 {
  ;
  String[] list = {"AB","BC","CD","DE"};
  String searchName = new java.util.Scanner(System.in).nextLine();
 
  for(int i =0; i<list.length;i++)
  {
  
   if((list[i].compareTo(searchName))==0);
   {
    System.out.println(i);
    break;
   }
  }
  
 }
}
