package algoAssignments;

import java.lang.reflect.Array;

public class reverse {
static void reverseit(int[] array){
	for (int i=0;i < array.length / 2;i++ ){
	int other = array.length -1 - i;
	int temp = array[i];
	array[i] = array[other];
	array[other] = temp;
	System.out.println("**" + other + "**"+ "i" + i);
	}
}
public static void main(String args[]){
	int[] ray = {2, 9, 3, 5, 11, 2, 15};
	reverseit(ray);
	for(int i = 0; i<ray.length;i++){System.out.println(ray[i]);}
	
}
}
