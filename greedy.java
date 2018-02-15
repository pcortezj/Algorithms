package algoAssignments;

import java.util.ArrayList;


public class greedy {
	public static void greed(ArrayList<Integer> tank, int[] amounts, int highest, int sum, int goal) {
		if (sum == goal)
		{
			display(tank,amounts);
			return;
		}
		
		if (sum > goal)
		{
			return;
		}
		
		for (int value:amounts) {
			if(value>=highest)
			{
				ArrayList<Integer> copy = new ArrayList<>();
				copy.addAll(tank);
				copy.add(value);
				
				//Recursive Element
				greed(copy,amounts,value,sum+value,goal);
			}
		}
	}
	
	public static void display(ArrayList<Integer> tank, int[] amounts) {
		for (int amount:amounts) {
			int count = 0;
			for(int key:tank) {
				if (key == amount) 
				{
					count++;
				}
			}
			System.out.print(amount);
			System.out.print(":");
			System.out.println(count);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> tank = new ArrayList<>();
		
		int[] amounts = {2,2,3,9,10,11,12,5,6,6};
		greed(tank,amounts,0,0,30);
	}
	
	
	
}