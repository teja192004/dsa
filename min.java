import java.util.*;
class min{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the no of elements of array :");
int n=sc.nextInt();
int []arr=new int[n];
System.out.println("enter array elements:");
for(int i =0;i<n;i++){
arr[i]=sc.nextInt();
		}
System.out.println("array elements");
for(int i=0;i<n;i++){
System.out.print(arr[i]+" ");}
int min=arr[0];
for(int i=0;i<arr.length;i++){
if (min >arr[i]){
min=arr[i];}
}
System.out.println("minimum element is :"+min);
	}
}