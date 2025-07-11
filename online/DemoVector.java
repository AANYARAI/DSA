
// 1. vector v = new vector ();
 // intialy a space for 10 objects are created
 // new capacity = old capacity *2

// 2. vector v = new vector (int initaila capacity );
// 3. vector v = new vector (int initialCapacity,int increasingCpacity);
// 4. vector v = new vector (collection C);



// import java.util.Vector;

// public class DemoVector {
//     public static void main (String[] args){
//     Vector v = new Vector();
//     System.out.println("Initial Capacity:"+v. capacity());
//     for(int i=1;i<=11;i++){
//         v.addElement(1);
//     }
//     System.out.println("New Capacity:"+v.capacity());
//     for(int i=1;i<=21;i++){
//         v.addElement(1);
//     }
//     System.out.println(" Once Again New Capacity:"+v.capacity());
// }
// }

// import java.util.Vector;

// public class DemoVector {
//     public static void main (String[] args){
//     Vector v = new Vector(8);
//     System.out.println("Initial Capacity:"+v. capacity());
//     for(int i=1;i<=11;i++){
//         v.addElement(1);
//     }
//     System.out.println("New Capacity:"+v.capacity());
//     for(int i=1;i<=21;i++){
//         v.addElement(1);
//     }
//     System.out.println(" Once Again New Capacity:"+v.capacity());
// }
// }


// import java.util.Vector;

// public class DemoVector {
//     public static void main (String[] args){
//     Vector v = new Vector(12,5);
//     System.out.println("Initial Capacity:"+v. capacity());
//     for(int i=1;i<=13;i++){
//         v.addElement(1);
//     }
//     System.out.println("New Capacity:"+v.capacity());
//     for(int i=1;i<=21;i++){
//         v.addElement(1);
//     }
//     System.out.println("Once Again New Capacity:"+v.capacity());
// }
// }

// import java.util.Vector;

// public class DemoVector {
//     public static void main (String[] args){
//     Vector v = new Vector(12,5);
//     System.out.println("Initial Capacity:"+v. capacity());
//     for(int i=1;i<=13;i++){
//         v.addElement(1);
//     }
//     System.out.println("New Capacity:"+v.capacity());
//     for(int i=1;i<=21;i++){
//         v.addElement(1);
//     }
//     System.out.println("Once Again New Capacity:"+v.capacity());
// }
// }
import java.util.Vector;

public class DemoVector {
    public static void main (String[] args){
    Vector v = new Vector();

    for(int i=1;i<=13;i++){
        v.addElement(i);
    }
  
    for(int i=1;i<=21;i++){
        v.addElement(i);
    }
    System.out.println(v);
    v.removeElement(10);
    System.out.println(v);
    v.removeElement(3);
    System.out.println(v);


    System.out.println(v.firstElement());
    System.out.println(v.lastElement());
    System.out.println(v.elementAt(19));
    v.removeAllElements();
    System.out.println(v);


}
}



// ArryaList al = new ArrayList();
// List l = collection.SynchronizedList(al);

// convert non- synchronized list int synchronized list 


// STACK
// 1.it is child class of vector
// 2. it works on LIFO principle


