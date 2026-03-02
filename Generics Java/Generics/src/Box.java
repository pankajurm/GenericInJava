public class Box<T> {
//public class Box<T extends Number> { // T me condition lgane ko bounded type parameter kehte hai.. here Box class me condition
    //hai ki ki number ko extend krengi
    //

    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    //Generics Constructor.

//    public Box(T value) {
//        this.value = value;
//    }
}
