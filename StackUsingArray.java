import java.util.Scanner;

public class StackUsingArray {
	
	int[] stack;
	int top;
	int size;

	
	public StackUsingArray(int n) {
		stack=new int[n];
		top=-1;
		size=n;
	}
	boolean isEmpty() {
		return top==-1;
	}
	boolean isFull() {
		return top==size-1;
	}
	
public int push(int n){
	if(isFull()) {
		System.out.println("stack overflow");
	}
	
		return stack[++top]=n;

}
public int pop(){
	if(isEmpty()) {
		System.out.println("stack underflow");
		return -1;
	}
	
		return stack[top--];

}

public int peek() {
	return stack[top];
}
public void display() {
	if(isEmpty()) {
		System.out.println("stack is full!");
	}
       System.out.println("stack elements:");
		for(int i=top;i>=0;i--) {
			System.out.println(stack[i]+" ");
			
		}
	
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a size of Array:");
		int n=sc.nextInt();
		StackUsingArray st=new StackUsingArray(n);
        int ch = 0;
       do{
        	System.out.println("Stack operation\n");
        	System.out.println("1.push");
        	System.out.println("2.pop");
        	System.out.println("3.peek");
        	System.out.println("4.display");
        	System.out.println("5.exit");
        	ch=sc.nextInt();
        	switch(ch) {
        	case 1:System.out.println("enter a element to push");
        	n=sc.nextInt();
        	st.push(n);
        	System.out.println(n +" element pushed");
        	break;
        	case 2:
        	int popped=st.pop();
        	if(popped!=-1) {
        		System.out.println("popped"+popped);
        		break;
        	}
        	case 3:
        		int m=st.peek();
        		System.out.println("top element:"+m);
        		break;
        	case 4:	
        	      st.display();
        	      break;
        	case 5:
        		System.out.println("exiting");
        		default:
        			System.out.println("invalid ");
        	}
        }
       while(ch!=5);
       sc.close();
	}

}
