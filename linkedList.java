
public class linkListNode { //linked list experiment
	int data;
	linkListNode next;
	
	public static void main(String args[]){
		int[] A = {2,2,3,9,10,11,12,5,6,6};
		
		int i,j;
		
		int tank = 30; //subtract from tank
		while(tank>0){
			//find the largest in A ; remember to assign 0 after using it
			for(i=0;i<10;i++){
				if(tank >= A[i]){
					A[i]--;
				}
			}
			
		}
			
			
	/*	node1.data = 3;
		node2.data = 5;
		node3.data = 1;
		
		node1.next = node2;
		node2.next = node3;
		
		System.out.println(node1.data + " " + node1.next.data + " "+  node1.next.next.data);*/
	}
}
