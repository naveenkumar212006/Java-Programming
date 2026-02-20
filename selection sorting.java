
public class Main
{
	public static void main(String[] args) {
	    int arr[]={12,31,45,22,8,9};
	    int i,j,temp,min,len=arr.length;
	    for(i=0;i<len;i++)
	    {
	        min = i ;
	    for(j=i+1;j<len;j++){
	        if(arr[i]<arr[min]){
	            min =j;
	        }
	    }
	    temp = arr[i];
	    arr[i]=arr[min];
	    arr[min]=temp;
	    
	    }
	    for(int X : arr){
	        System.out.print(X+" ");
	    }
	}
	    
}
