package GenericsException;

public class ExceptionTest {

    public static void main(String[] args) {

        // generics exception
        try {
            throw new MyException(1235);
        } catch (MyException e) {
            System.out.println("Caught exception: " +e.getMessage());
        }

        try {
            throw new MyException("String");
        } catch (MyException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
