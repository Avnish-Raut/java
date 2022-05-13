import java.util.Scanner;
class vote{
public static void main(String args[]){
int age;
Scanner sc = new Scanner(System.in);
System.out.print("Enter Your Age : ");
age = sc.nextInt();
String Message = (age >= 18)? " You are eligible to Vote " : 
					      " You are Not eligible to Vote ";
System.out.println(Message);
}
}