import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {
    public static void main(String[] args) {
        Vector v = new Vector();
        for (int i=1;i<=10;i++){
            v.addElement(i);
        }
        System.out.println(v);
        Enumeration e = v.elements();

        while (e.hasMoreElements()){
            Integer i =(Integer)e.nextElement();
            if(i%2==0){
                System.out.println(i);

            }
            System.out.println(v);

        }
        }
}



//DATE-11/07/25
// //CURSOR 
// //It helps in iterating over objects or for traversing
// 1.enemuration: it can be used for legacy classes only 
// a). Vector (1.0v)
// b). Stack (1.0v)
// Syntax : public Enumeration();

// Methods: 
// public boolean hasMoreElements();
// public Object nextElement();

// EXAMPLE 
// Vector v =  new Vector();
// v.addElement(10);
// v.addElement(20);
// v.addElement(30);

// Enemuration e = v.element();
// while (e.hasMoreElement()){
//     System.out.println(e.nextElement)
// }
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



// 3

