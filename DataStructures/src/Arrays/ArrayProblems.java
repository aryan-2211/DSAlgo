package Arrays;

import java.util.Collections;
import java.util.PriorityQueue;

public class ArrayProblems {

	//Find the index of peak element in an array
	
	public static int peakElement(int[] arr,int n)
    {
        int l=0;
        int r=n-1;
        
        if(n == 1)return 0;
        
        if(arr[0] >= arr[1])return 0;
        
        if(arr[n-1] >= arr[n-2])return n-1;
        
        while(l<=r){
            
            int mid = l + (r-l)/2;
            
            if(arr[mid] >= arr[mid-1] && arr[mid] >= arr[mid+1])return mid;
            
            else if(arr[mid+1] >= arr[mid])l = mid + 1;
            
            else{
               r = mid - 1;
            }
            
        }
        return -1;
       
    }
   
	//Find Kth smallest element in an array
	
	 public static int kthSmallest(int[] arr, int k) 
	    { 
	      PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
	      
	      for(int i = 0;i < arr.length;i ++){
	          
	          maxHeap.add(arr[i]);
	          
	          if(maxHeap.size() > k){
	              maxHeap.poll();
	          }
	      }
	      return maxHeap.peek();
	      
	    } 
	 
	//Find the maximum element in an array which first increases and then decreases
	 
	static int findMaximum(int[] arr, int n) {
	        
	        int l = 0;
	        int r = n-1;
	        
	        while(l < r){
	            int mid = (l + r)/2;
	            
	            if(arr[mid] > arr[mid + 1]){
	                r = mid;
	            }
	            else{
	                l = mid + 1;
	            }
	        }
	        return arr[r];
	        
	   }
	
	 //Find the transition point in an array of 0s and 1s
	 
	 static int transitionPoint(int arr[], int n) {
	        
	        int idx = -1;
	        
	        for(int i=0;i<arr.length;i++){
	            
	            if(arr[i] != 0){
	                idx = i;
	                break;
	            }
	        }
	        return idx ;
	    }
	 
	
	 
	 
}







