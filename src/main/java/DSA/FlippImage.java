package DSA;

import java.util.Arrays;

import org.junit.Test;

public class FlippImage {
//https://leetcode.com/problems/flipping-an-image/
	
	
	@Test
	public void test1()
	{
		int[][] arr= {{1,1,0},{1,0,1},{0,0,0}};
		System.out.println(Arrays.deepToString(flipAndInvertImage(arr)));
	}
	
	@Test
	public void test2()
	{
		int[][] arr= {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
		System.out.println(Arrays.deepToString(flipAndInvertImage(arr)));
	}
	
	  public int[][] flipAndInvertImage(int[][] arr) {
	        
	        
		     for(int i = 0; i < arr.length; i++) {
					int[] intArr = arr[i];
					int[] revInt = new int[intArr.length];
					int k=0;
					for(int j = intArr.length - 1; j >= 0; j-- ) {
						revInt[k] =  intArr[j];
						if(revInt[k] == 0) {
							revInt[k] = 1;
						}else if(revInt[k] == 1) {
							revInt[k] = 0;
						}
						k++;
					}
					arr[i] = revInt;
					//Arrays.toString(arr[i]);
				//	System.out.println(Arrays.toString(arr[i]));
				}
				
				return arr;
		    }
	
}
