// import java.util.ArrayList;
// public class DemoArrayList {
//     public static void main(String[] args) {
//         ArrayList al = new ArrayList();
//         al.add("A");
//         al.add("B");
//         al.add("C");
//         al.add(1);       

//         System.out.println(al);
//     }
// }

// import java.util.ArrayList;
// import java.util.LinkedList;

// public class DemoArrayList {
//     public static void main(String[] args) {

//         LinkedList ll = new LinkedList();

//         ll.add(1);
//         ll.add(2);
//         ll.add(3);
//         ll.add(4);

//         ArrayList al = new ArrayList();
//         al.add("A");
//         al.add("B");
//         al.add("C");
//         al.add(1,ll);       

//         System.out.println(al);
//     }
// }

// import java.util.ArrayList;
// public class DemoArrayList {
//     public static void main(String[] args) {

//         ArrayList al = new ArrayList();
//         al.add("A");
//         al.add("B");
//         al.add("C");   

//         System.out.println(al.get(0));
//         System.out.println("Before"+al);
//         al.remove("B");
//         System.out.println("After"+al);
//     }
// }


// import java.util.ArrayList;
// public class DemoArrayList {
//     public static void main(String[] args) {

//         ArrayList al = new ArrayList();
//         al.add("A");
//         al.add("B");
//         al.add("C");   


//         al.add("A");
//         al.add("B");
//         al.add("C");   

//         System.out.println(al.indexOf("C"));
//         System.out.println(al.lastIndexOf("C"));

//     }
// }


import java.io.Serializable;
import java.util.ArrayList;
import java.util.RandomAccess;
public class DemoArrayList {
    public static void main(String[] args) {

        ArrayList al = new ArrayList();
    
        System.out.println(al instanceof Cloneable);
        System.out.println(al instanceof Serializable);
        System.out.println(al instanceof RandomAccess);

    }
}