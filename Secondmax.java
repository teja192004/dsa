class Secondmax{
public static void main(String[]args){
int []arr={1,2,4,5,8};
int max=arr[0];
int secondmax=0;
for(int i=0;i<arr.length;i++){
if (arr[i]>max){
secondmax=max;
max=arr[i];}
if (arr[i] < max && arr[i]>secondmax){
secondmax=arr[i];}}
System.out.println("second maximum is "+secondmax);
	}
}