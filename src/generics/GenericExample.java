package generics;

public class GenericExample {
    public static void main(String[] args) {
        MyGenericClass<Integer> exampleInteger = new MyGenericClass<>(); //Int형 인스턴스 생성
        MyGenericClass<String> exampleString = new MyGenericClass<>(); //String형 인스턴스 생성

        exampleInteger.setValue(1);
        exampleString.setValue("Hello, generics!");
        System.out.println(exampleInteger.getValue());
        System.out.println(exampleString.getValue());
    }
}
