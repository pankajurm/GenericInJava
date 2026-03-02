
//multiple boundation

public interface Printable {

    void print();
}

class MyNumber extends Number implements Printable {

    private final int value;

    MyNumber(int value) {
        this.value = value;
    }

    @Override
    public void print() {
        System.out.println("MyNumber: " +value);
    }

    @Override
    public int intValue() {
        return value;
    }

    @Override
    public long longValue() {
        return value;
    }

    @Override
    public float floatValue() {
        return value;
    }

    @Override
    public double doubleValue() {
        return value;
    }
}

class Box2<T extends Number & Printable> { // Printable & Number ye nhi hoga kyuki class ka implementation pehle hoga or
    // java multiple inheritance hota nhi hai java ke andar
    // Generics me extends hi bus aata h chahe class ho ya interface ho.
    private T item;

    public Box2(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public void display() {
        item.print();
    }
}

