public class GenericsMethod {
    public <T> void printArray(T[] array) {
        //method body

        for (T element : array) {
            System.out.println(element + " ");
        }

        System.out.println();
    }

    //Generic type / display2 call krayenge string double or kisi variable ke sath to ye chalega
    public <T> void display2(T element) {
        System.out.println("Generic display: " +element);
    }

    //specific method / display2 call krayenge integer ke sath to ye vala call hoga.
    public void display2(Integer element) {
        System.out.println("Integer display: " +element);
    }
}


