package Strings;

import java.util.HashMap;
import java.util.Map;

public class StringManipulation {
     
	//Code to reverse a string
	public static String reverseString(String str) {
		
		char[] ch = str.toCharArray();
		int l = 0;
		int r = str.length() - 1;
		
		while(l < r) {
			char temp = ch[l];
			ch[l] = ch[r];
			ch[r] = temp;
			l++;
			r--;
		}
		return  new String(ch);
		
	}
	
	//Check for Palindrome string
	public static int isPalindrome(String S) {
	        
	        int i = 0;
	        int j = S.length() - 1;
	        
	        while(i <= j){
	            
	            if(S.charAt(i) != S.charAt(j)){
	                return 0;
	            }
	            else{
	                i++;
	                j--;
	            }
	        }
	        return 1;
	        
	    }
	
	//Non repeating Character in a String
	
	 static char nonrepeatingCharacter(String S)
	    {
	      int count[] = new int[256];
	      
	      for(int i = 0;i<S.length();i++){
	         
	          count[S.charAt(i)]++;
	      }
	      
	      for(int i=0;i<S.length();i++){
	          
	          if(count[S.charAt(i)] == 1){
	              return S.charAt(i);
	          }
	      }
	      return '!';
	        
	        
	    }
	 
	 //Removing Duplicates from a String
	 
	 static String removeDuplicates(String str) {
	       
	       String ans = ""; 
	       int arr[] = new int[256];
	       
	       for(int i=0;i<str.length();i++){
	           
	          if(arr[str.charAt(i)] == 0){
	              ans = ans + str.charAt(i);
	          }
	          
	           arr[str.charAt(i)]++;
	       }
	       return ans;
	    }
	 
	 //Code to count the words which occur twice in a list of string
	 
	 public static  int countWords(String list[], int n)
	    {
	        Map<String,Integer> hm = new HashMap<>();
	        
	        for(String str : list){
	            
	            if(hm.containsKey(str)){
	                int of = hm.get(str);
	                int nf = of + 1;
	                
	                hm.put(str,nf);
	            }
	            else{
	                hm.put(str,1);
	            }
	        }
	        int count = 0;
	        
	        for(Map.Entry<String,Integer> e : hm.entrySet()){
	            
	            if(e.getValue() == 2){
	                count++;
	            }
	        }
	        return count;
	    }
	 
	
	
	
	
}
