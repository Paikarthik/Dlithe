class breakDemo
{
 public static void main(String args[])
 {
  loop1 :
  for(int i =1; i<=5;i++)
  {
   for(int j =1; j<=5;j++)
   {
    
    if(j%3==0)
     break loop1;
     System.out.println(j);
     
   }
  }
  
 }
}
