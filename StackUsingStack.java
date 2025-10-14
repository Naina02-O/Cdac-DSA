

import java.util.Stack;

public class StackUsingStack {
	public static void main(String[] args) {
	
		Stack<Integer> st=new Stack<>();
		st.push(30);
		st.push(69);
		
		
		int popped=st.pop();
		
		int top=st.peek();
		
		boolean empty=st.isEmpty();
		
		
		System.out.println("top:"+top);
		System.out.println("removed:"+popped);
		System.out.println("empty:"+empty);

	}

}
