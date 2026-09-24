class Consecutive{
public static void main(String [] args){
int []arr={1,1,1,2,3,3,1,1,1,1};
int current=0;
int maxcount=0;
for(int i=0;i<arr.length;i++){
if(arr[i]==1){
current+=1;
  if(current>maxcount){
    maxcount=current;}
}else{current=0;}
	}
System.out.println(maxcount);
}
}