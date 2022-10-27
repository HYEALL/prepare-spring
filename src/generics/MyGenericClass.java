package generics;

public class MyGenericClass<T> { //제네릭 사용법 파악 예제 꺽새 안에 타입 파라미터 작성
    // 지정한 타입 파라미터로 작성, 사용자가 외부에서 선언 시 자료형 직접 지정
    private T value;
    public T getValue(){
        return value;
    }
    public void setValue(T value){
        this.value = value;
    }
}
