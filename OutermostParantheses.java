import java.io.*;
import java.util.Iterator;
import java.util.Stack;

public class OutermostParantheses {

	public static void main(String[] args) throws IOException{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a string");
		String s = input.readLine();
		String res = "";
		Stack<Character> stack = new Stack<Character>();
		Stack<Character> result = new Stack<Character>();
		char[] c = s.toCharArray();
        for (int i=0; i<c.length; i++){
        	if(stack.isEmpty() && c[i]=='('){
                stack.push(c[i]);
            }
        	else if(stack.peek()==c[i]) {
        		stack.push(c[i]);
        	}
        	else{
        		stack.pop();
        		if(!stack.isEmpty()) {
        			result.push(stack.peek());
        			result.push(c[i]);
        		}
        	}
	    }
        System.out.println(result);
        
        Iterator<Character> itr = result.iterator();
        while(itr.hasNext()){
            res = res + itr.next().toString();
        }
        System.out.println(res);
	}
}
