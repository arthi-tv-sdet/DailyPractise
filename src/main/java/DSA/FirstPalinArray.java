package DSA;

import org.junit.Test;

public class FirstPalinArray {

	//https://leetcode.com/problems/find-first-palindromic-string-in-the-array/
	
	@Test
	public void  test1()
	{
		String words []= {"abc","car","ada","racecar","cool"};
		System.out.println(firstPalindrome(words));
	}
	
	@Test
	public void  test2()
	{
		String words []= {"def","ghi"};
		System.out.println(firstPalindrome(words));
	}
	public String firstPalindrome(String[] words) {
        
	       for(int i=0;i<words.length;i++)
	       {
	           String w=words[i];
	           char ch[]=w.toCharArray();
	           int left=0,right=ch.length-1;
	           while(left<right)
	           {
	               char temp=ch[left];
	               ch[left++]=ch[right];
	               ch[right--]=temp;

	           }
	          String rev= String.valueOf(ch);
	          if(rev.equals(w))
	          return w;
	       }

	        return "";
	    }
	
	
}
