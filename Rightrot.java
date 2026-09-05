class Rightrot{
public static void main (String []args){
int [] arr={1,2,3,4};
//output=4,1,2,3
//outpu=4,3,12
int temp=arr[arr.length-1];
int temp2=arr[arr.length-2];
for(int i=arr.length-1;i>0;i--){
arr[i]=arr[i-1];
}
for(int i=arr.length-1;i>0;i--){
arr[i]=arr[i-1];
}
arr[0]=temp;
arr[1]=temp2;
for(int i=0;i<arr.length;i++){
System.out.print(arr[i]+" ");}
	}
}