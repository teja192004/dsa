import java.util.*;
class PrimeRange{
public static void main (String [] args){
System.out.println("enter the range : ");
Scanner sc=new Scanner(System.in);
long range=sc.nextLong();
for (int i =2;i<=range;i++){
boolean isprime=true;
for(int j=2;j*j<=i;j++){
if (i%j==0){
isprime =false;
break;
}
}if(isprime==true){
System.out.println(i+" is prime");}}}}