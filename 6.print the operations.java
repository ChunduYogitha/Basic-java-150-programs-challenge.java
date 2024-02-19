import java.io.*;
public class Main{
  public static void main(String[] args){
    int num1 = 125;
    int num2 = 24;
    System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
    System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
    System.out.println(num1 + "mod" + num2 + " = " + (num1%num2)); 
  }
}
output
  125 + 24 = 149
  125 - 24 = 101
  125 * 24 = 3000
  125 / 24 = 5
  125mod24 = 5
