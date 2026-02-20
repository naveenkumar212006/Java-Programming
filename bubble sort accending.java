
public class Main
{
	public static void main(String[] args) {
		int arr[]={21,30,14,15,60,70};
		int i,j,len=arr.length,temp;
		for(i=0;i<len;i++){
		    for(j=i+1;j<len;j++){
		        if(arr[i]<arr[j]){
		            temp = arr[i];
		            arr[i]=arr[j];
		            arr[j]=temp;
		        }
		        
		    }
		}
		for(int X:arr){
		    System.out.print(X+" ");
		}
	}
}
