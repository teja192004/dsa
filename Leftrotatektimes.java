import java.util.*;
class Leftrotatektimes{
static void reversal(int []arr,int left,int right){
while(left<right){
int temp=arr[left];
arr[left]=arr[right];
arr[right]=temp;
left++;
right--;
		}
	}
public static void main (String []args){
Scanner sc=new Scanner(System.in);
System.out.print("enter no of elemmenst in array :");
int n =sc.nextInt();
int []arr=new int[n];
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();}
System.out.println("printing your array");
for(int i=0;i<arr.length;i++){
System.out.print(arr[i]+" ");}
System.out.println();
System.out.println("enter no of rotations :");
int k=sc.nextInt();
k=k%n;
reversal(arr,0,k-1);
reversal(arr,k,arr.length-1);
reversal(arr,0,arr.length-1);
for(int i=0;i<arr.length;i++){
System.out.print(arr[i]+" ");
}
	}
}