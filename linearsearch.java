import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int arr[]={21,45,78,1,4,9,10};
	 	int target = 9;
		int i;
		for(i=0;i<arr.length;i++)
		{
		    if(arr[i]==target){
		        System.out.println("element found at : "+ i );
		        return;
		    }
		   
		    
	}
		System.out.println("Element not found");
	}
}
