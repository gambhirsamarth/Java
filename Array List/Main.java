import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<>(); // Syntax
        ArrayList<Integer> l2 = new ArrayList<>();

        // .add() adds element in ArrayList at particular index
        l1.add(6);  // 6
        l1.add(7);  // 6 7
        l1.add(5);  // 6 7 5
        //adds value 8 at index 1
        l1.add(1, 8);   // 6 8 7 5

        l2.add(11);
        l2.add(14);
        l2.add(23);

        l1.addAll(l2); // .addAll() Adds all the elements of an ArrayList to another ArrayList
        // .addAll( 0,l2 ) will add the l2 elements from index 0

        // new l1 becomes 6 8 7 5 11 14 23

        for( int i = 0; i < l1.size(); i++ ) {    // .size() returns the size/ length of ArrayList
            System.out.print( l1.get(i) + " " );  // .get() returns the value at passed index
        }
        System.out.println();

        l2.clear(); // .clear() clears all the element in an Arraylist
        System.out.println("Size of l2 after .clear(): " + l2.size()); // it will print 0 because all elements have been cleared from l2

        System.out.println("Index of 5 in l1: "+ l1.indexOf(5)); // .indexOf() returns index of passed element in ArrayList
        // indexOf() returns -1 if element is not present in ArrayList

        // .lastIndexOf() returns the last index of Passed Element

        // .remove() removes element at passed index
        
        System.out.println(l1.contains(10)); // .contains() returns true/false based on if passed value is present
    }
}
