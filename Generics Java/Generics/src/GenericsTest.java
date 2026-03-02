

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


// generics is class, interface and method in which we give a type of the variable
public class GenericsTest {
    public static void main(String[] args) {
        int[] arr = new int[5];
        ArrayList<String> list = new ArrayList<>(); //<String> is a generics. and kis type ka data aayega list me
        list.add("hello");
        list.get(0);
        list.add("World");
        //list.add(123); //ye nhi add kar sakte
        //list.add(3.14); //ye bhi add nhi kar sakte hai

        //Object o = list.get(0);
        //String str = (String) list.get(0);//type casting

       // Object o1 = list.get(1);
        //Integer integer = (Integer) list.get(1); // manual casting
        //String str1 = (String) list.get(1); //getting compile time error cant cast Integer to String.
        //it means array list is not type safe, in array list type safety issue, manual casting karni pad rhi hai.
        String s = list.get(0);
        String s1 = list.get(1); // after using generics no need to type casting.
        //with out generics no type safety, manual casting karni pad rhi thi, and no compile time checking.

        //Box <Integer> box = new Box();
        Box <String> box2 = new Box();
        //box.setValue(12);
        //box2.setValue("Ram");
        //int i = box.getValue();
        //System.out.println(i);
        //String s3 = box2.getValue(); //error run time, after using generics getting error in compile time.
        //System.out.println(s3);
        //generics types allow you to define a class, interface, or method with placeholders (type parameters )
        // for the data types they will work with

        //Pair class
        Pair<String, Integer> pair = new Pair<>("Age", 30);
        System.out.println(pair.getKey());
        System.out.println(pair.getValue());

        /*
        T: Type
        E: Element (Used in collections)
        K: Key (Used in maps)
        V: Value (Used in maps)
        N: Number
         */

        //multiple boundation
        MyNumber myNumber = new MyNumber(15);
        Box2<MyNumber> box4 = new Box2<>(myNumber);
        box4.display();

        //Generics with enums
        DAY day = DAY.MONDAY;
        //DAY day1 = "Monday"; //error aayega kyuki require type enum hai or apan String de rhe hai it means pehle se type safety hai enum ki


        //Generics Constructor

        Box3 box5 = new Box3(17);
        //Box3 box6 = new Box3("String nhi aayega kyuki num ko extend kiya hai agr number ko extend nhi karte to string bhi aa jata")

        //Generics Method

        GenericsMethod genericsMethod = new GenericsMethod();
        Integer[] intArray = {1,2,3,4,5};
        String[] strArray = {"Pankaj", "Urmaliya"};
        //genericsMethod.printArray(intArray);
        //genericsMethod.printArray(strArray);

        //if method is static

        printArray(intArray);
        printArray(strArray);

        //Generics type method
        genericsMethod.display2(12); //specific mehtod chala
        genericsMethod.display2(12.50); //generics type chala

        //enum operation
        double res1 = Operation.ADD.apply(10,23);
        double res2 = Operation.MULTIPLY.apply(10,23);
        System.out.println(res1);
        System.out.println(res2);

        //wild card generics
        ArrayList<?> l1 = new ArrayList<>();
        //l1.add(125); // we cant add any value because wild card only for read only

        System.out.println(sum(Arrays.asList(1, 2.2, 23, 24)));

        //upper bound and lower bound
        List<? extends Number> numbers = Arrays.asList(1, 2, 3);
        //numbers.add(10); // kuch bhi add nhi kar sakte kyuki actual type nhi pta kya hona chahiye.
        //numbers.add(null); //par null add kar sakte hai.

        List<? super Integer> numbers1 = Arrays.asList(1, 2, 3); //lower bound lgaya means ise add kar sakte hai...
        numbers1.add(12);

        //type erasure

//        NumberBox<Integer> intBox3 = new NumberBox<>();
//        intBox3.setNumber(10);
//        Integer value = intBox3.getNumber();

        NumberBox intBox3 = new NumberBox();
        intBox3.setNumber(10);
        Integer value = (Integer) intBox3.getNumber();
    }

    public static <T> void printArray(T[] array) {
        //method body

        for (T element : array) {
            System.out.println(element + " ");
        }

        System.out.println();
    }

    //Upper bound means iske niche vali ya subclass dal sakte hai jaise Number ke niche ki class Integer, float, double
    public static double sum(List<? extends Number> numbers){
        double sum = 0;
        for (Number o : numbers){
            sum += o.doubleValue();
        }
        return sum;
    }

    //Lower bounded means class ke uper ki class use kar sakte hai jaise Integer ke uper ki class means Number ka use kar sakte hai
    // subclass ka use nhi kar sakte hai.
    public static void printNumbers2(List<? super Integer> list) {
        for (Object obj : list) {
            System.out.println();
        }
    }
}
