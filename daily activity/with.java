import java.util.Scanner;
class with
{
public static void main(String args[]){
int x,y,z;
Scanner sc = new Scanner(System.in);
System.out.println("Enter First Number:");
x = sc.nextInt();
System.out.println("Enter First Number:");
y = sc.nextInt();
System.out.println("Before Swapping : First no = "+x+" Second no= "+y);
z=x;
x=y;
y=z;

System.out.println("After Swapping : First no = "+x+" Second no= "+y);

}
}