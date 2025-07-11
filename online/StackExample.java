import java.util.Stack;
public class StackExample {
    public static void main(String[] args){
        Stack s = new Stack();
        System.out.println(s.empty());
        s.push("A");
        s.push("B");
        s.push("C");
        System.out.println(s.empty());
        System.out.println(s);
        s.pop();

        System.out.println(s);
        System.out.println(s.peek());

    } 
}

// // Object push (object o)
// // object pop() : return top most element pop();
// // object peek(): return the top most element peek();
// // Boolean empty() : checks if my stack is empty or not
// // int search(object o): returns the offset value of the search element or else return -1


