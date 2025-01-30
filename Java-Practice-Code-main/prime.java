import java.util.*;
class prime{
public static void main(String[] args){
int n;
Scanner sc = new Scanner(System.in);
System.out.println("enter the number");
int n = sc.nextInt();
int a = n*n;
a = a-1;
a = a%24;
if(a===0);
{
System.out.println("prime");
else{
System.out.println("not prime");
}
}
}



