package Bai1;

//1.
public class Test<T> {
    //2.
    private T object;
    //3.
    public void set(T t) {
        this.object = t;
    }
    //4.
    public T get() {
        return this.object;
    }
    //5.
    public static void main(String[] args) {
        System.out.println("Test With Integer");
        Test<Integer> testInt = new Test<>();
        testInt.set(121026); //gan gia tri
        System.out.println("Integer value: " + testInt.get());
        System.out.println("----------------");

        System.out.println("Test With String");
        Test<String> testStr = new Test<>();
        testStr.set("Bonjour! Je m'appelle ELDENNHAT");
        System.out.println("String value: " + testStr.get());
    }
}
