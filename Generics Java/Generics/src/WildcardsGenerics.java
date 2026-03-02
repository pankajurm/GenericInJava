//In Java Generics, wildcards(?) are a special kind of type argument that can be used in method arguments
//or class definitions to represent an unknown type. They allow for more flexible and dynamic code by
//letting the type be specified later or be more loosely defined.

import java.util.ArrayList;

public class WildcardsGenerics {

   // public void getFirst(ArrayList<?> list) {
//        for (Object o : list) {
//            System.out.println(o);
//        }

    public Object getFirst(ArrayList<?> list) { //1st element return karta hai
        //jab hum read only kam kar rhe hai tab hum wild card(?)pattern use kar sakte hai
        //add karne ke liye iska use nhi hota hai
       return list.get(0);
    }

    public <T> void copy(ArrayList<T> source, ArrayList<T> destination) {
        //source ke data ke attrate krenge or destination me rakhte jayenge
        for (T item : source) {
            destination.add(item);
        }
    }

}
