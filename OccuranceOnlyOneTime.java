import java.util.*;
class OccuranceOnlyOneTime{
public static void main(String []args){
Scanner sc=new Scanner (System.in);
System.out.println("enter number of elements :");
int n=sc.nextInt();
int result=0;
int []arr=new int[n];
System.out.println("enter array elements");
for (int i=0;i<n;i++){
arr[i]=sc.nextInt();}
for(int i=0;i<n;i++){System.out.print(arr[i]+" ");}
System.out.println(" ");
for(int i=0;i<arr.length;i++){
result^=arr[i];}
System.out.println(result);}}