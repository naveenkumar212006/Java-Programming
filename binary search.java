
public class Main
{
	public static void main(String[] args) {
	 int arr[]={10,20,30,40,50,60,70,80};
	 int target = 50;
	 int start=0, end=arr.length,mid;
 while(start<=end){
     mid = (start+end)/2;
     if(arr[mid]==target){
         System.out.println(mid);
         return;
     }
     else if(arr[mid]<target){
         start = mid+1;
         
     }
     else if(arr[mid]>target){
         end = mid-1;
     }
	}

}
}

