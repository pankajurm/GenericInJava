package GenericsException;//An exception is an event that occurs during the execution of a program that disrupts its normal flow.
//Exceptions are represented by classes, and they can be caught and handled by using try-catch blocks.
// Java allows us to define our own exceptions by extending the exception class or any of its subclasses.

//However, when it comes to making exceptions generic, things get a bit more complicated due to the nature of Java's type
// erasure and restrictions on generics.

//Java does not support generic exception due to type erasure.
// Type erasure means that generic type information is removed at runtime.
//Since exceptions are closely tied to runtime operations(like catching them in try-catch blocks), having
// generic exceptions wouldnt work as expected.
// for example, if you had an exception like MyGenericException<T>, you wouldn't be able to catch it with a specific type
// parameter because that type information would be erased at runtime.

//public class GenericException<T> extends Exception {// its throw error
/*class GenericException<T> extends Exception {

    private T value;

    public GenericException(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

}*/

class MyException extends Exception {
    public <T> MyException (T value) {
        super("Exception related to value: " +
                value.toString() +
                " of type: " +
                value.getClass().getName()
        );
    }
}
