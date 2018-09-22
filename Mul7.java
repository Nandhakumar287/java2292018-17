import java.io.*;
import java.util.*;
  public class Mul10{
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter Any Number:");
     int a=sc.nextInt();
     if(a%7==0)
     {
     System.out.println("Yes! "+a+" it's Multiple of 7");
     }
     else
     {
     System.out.println("No! "+a+" it's Not Multiple of 7");
     }
   }
 }  
