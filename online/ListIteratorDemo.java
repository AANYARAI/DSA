import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {
public static void main(String[] args) {
    LinkedList l = new LinkedList();
    l.add("A");
    l.add("B");
    l.add("C");
    l.add("D");

    System.out.println(l);
    ListIterator itr = l.listIterator();

    while (itr.hasNext()){
        String s = (String)itr.next();
        if(s.equals("B")){
            itr.remove();
        }
        else if(s.equals("D")){
            itr.add("C");

        }
    }
        System.out.println(l);
}
}

// 3. ListIterator : it can move forward as well as backward

// Syntax : public ListIterator lisTtIterator();

//methods:
// for forward operation :
// public boolean hasNext();
// public Object next();
// public int nextIndex();

//for backward operation :
// public boolean hasPrevious();
// public Object previous();
// public int previousIndex();

// for extra operation :
// public void remove();
// public void add(Object o);
// public void set(Object o);
