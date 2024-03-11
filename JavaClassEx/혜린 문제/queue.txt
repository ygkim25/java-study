package hyerin;

import java.util.*;

public class Queue {

	List<Integer> que = new ArrayList<>();
	public static void main(String[] args) {
	    Queue q = new Queue();
			System.out.println("큐에 원소 추가");
			System.out.println("--------------");
			q.push(0);
			q.push(1);
			q.push(2);
			
			System.out.println("큐에서 원소 제거");
			System.out.println("--------------");
			System.out.println(q.pop());
			System.out.println(q.pop());
			System.out.println(q.pop());
			System.out.println();
			
			System.out.println("큐에서 원소 제거");
			System.out.println("--------------");
	  }


	private void push(int i) {
		que.add(i);
		
		System.out.println(i);
		
	}
	private Integer pop() {
		if (que.size()==0) {
            return null;
        }else {        	
        	return que.remove(0);
        }
		
		
	}
}
