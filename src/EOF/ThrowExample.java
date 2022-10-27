package EOF;
import java.util.Scanner;
public class ThrowExample { // throw, throws 활용 예제
    public void checkChoice(int choice) throws NotFunnyException { //예외 처리를 throws 받은 method에서 처리
        if(choice == 1){ //int 입력 받아서 choice 검사
            throw new NotFunnyException(); //직접 예외 만들고 발생 시킴
        } else {
            System.out.println("저도 집에 가고 싶습니다.");
        }
    }
    public static void main(String[] args) {
        ThrowExample throwExample = new ThrowExample();
        Scanner scan = new Scanner(System.in);
        System.out.println("Java 스터디는 재미있습니까? (1 yes / 2 no) : ");
        int choice = scan.nextInt();

        try {
            throwExample.checkChoice(choice); //
        } catch (NotFunnyException e){ //try문에서 예외 발생했으니 catch해서 여기서 예외처리
            System.out.println("진심을 담아 선택해주세요.");
        }

    }
}

class NotFunnyException extends RuntimeException{ //class로 exception 만들어주어야 한다.
    NotFunnyException(){
        super("공부는 항상 재미없습니다.");
    }
}
