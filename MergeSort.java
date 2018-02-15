import java.util.*;
import java.util.stream.*;
import java.io.*;

public class MergeSort {
	public static void mergesort(int[] array){
		mergesort(array, new int[array.length], 0, array.length - 1);
	}
	  public static void mergesort(int[] array, int[] temp, int leftStart, int rightEnd){
		  if (leftStart>=rightEnd){
			  return;
		  }
		  int middle = (leftStart + rightEnd)/2;
		  mergesort(array, temp, leftStart, middle);
		  mergesort(array, temp, middle + 1, rightEnd);
		  mergeHalves(array, temp, leftStart, rightEnd);
	  }
	  public static void mergeHalves(int[] array, int[] temp, int leftStart, int rightEnd){
		  int leftEnd = (rightEnd + leftStart)/2;
		  int rightStart = leftEnd + 1;
		  int size = rightEnd - leftStart + 1;
		  
		  int left = leftStart;
		  int right = rightStart;
		  int index = leftStart;
		  
		  while(left <= leftEnd && right <= rightEnd){
			  if(array[left]<=array[right]){
				  temp[index] = array[left];
				  left++;
			  } else {
				  temp[index] = array[right];
				  right++;
			  }
			  index++;
		  }
		  System.arraycopy(array, left, temp, index, leftEnd - left + 1); //copies left array to temp
		  System.arraycopy(array, right, temp, index, rightEnd - right + 1); //copies right array to temp
		  System.arraycopy(temp, leftStart, array, leftStart, size); //stores copied arrays from temp into array
	  }
	public static void main(String[] args){
		//int[] array = {10, 5, 12, 1, 7, 20, 16, 35, 42, 21, 22, 45, 11};
		
	int[] A = {2,2,3,9,10,11,12,5,6,6};
		
	
		
		mergesort(A);
		
		for(int i =0; i<A.length;i++) {
			System.out.println(A[i]);
		}
		
				
			
	
		}
		
		
		
		
		
	}

