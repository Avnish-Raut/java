import java.util.Scanner;
class without
{
public static void main(String args[]){
int x,y;
Scanner sc = new Scanner(System.in);
System.out.println("Enter First Number:");
x = sc.nextInt();
System.out.println("Enter First Number:");
y = sc.nextInt();
System.out.println("Before Swapping : First no = "+x+" Second no= "+y);
x=x+y;
y=x-y;
x=x-y;

System.out.println("After Swapping : First no = "+x+" Second no= "+y);
}
}