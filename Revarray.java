class Revarray{
public static void main (String [] args){
int [] arr={10,20,30,60};
int left=0;
int temp;
int right=arr.length-1;
while(left<right){
temp=arr[left];
arr[left]=arr[right];
arr[right]=temp;
left++;
right --;
}
for(int i =0;i<arr.length;i++){
System.out.print(arr[i]+", ");}	}
		}