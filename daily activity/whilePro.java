import java.util.Scanner;
class whilePro
{
public static void main(String args[]){
int sum=0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number : ");
int i = sc.nextInt();
while(i>=0)
{
sum=sum+i;
System.out.println("Enter the number :");
i = sc.nextInt();
}
System.out.println("Total Sum " +sum);
}
}