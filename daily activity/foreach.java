class foreach{

public static void main(String args[]){
int a[] = {1,63,125,72,12,56,12,74,12,53,6,4,74,23};
int sum = 0;
for(int i:a){
 sum+=i;
}
System.out.println("Sum of the array :"+sum);
}
}