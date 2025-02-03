import java.util.*;
class arm{
public static void main(String[] args){
int n = 153;
int sum =0;
while(n>0){
int  remainder =153%10;
sum = sum + remainder*remainder*remainder;
n = n/10;
}
if(153==sum)
System.out.println("armstrong");
else
System.out.println("not armstrong");
}
}



