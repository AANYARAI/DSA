import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        for(int i=0; i<=10;i++){
            l.add(i);
        }
        System.out.println(l);
        Iterator itr = l.iterator();

        while (itr.hasNext()){
            Integer i = (Integer)itr.next();
            if(i%2==0){
                System.out.println(i);
            }else{
                itr.remove();
            }
        }
        System.out.println(l);
    }
}

// 2.Iterator : 
// .) it functions on all the classes
// .) it cannot move backwards

//Syntax : public Iterator iterator();

// Methods:
// public boolean hasNext();
// public Object next();
// public void remove();


// Example 
// ArrayList al = new ArrayList();
// iterator itr = al.iterator();





