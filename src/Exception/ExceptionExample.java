package Exception;

import java.util.Scanner;

public class ExceptionExample { // int A와 B를 나누고 출력, 0으로 나누면 예외처리하는 코드 작성
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int result;

        try{ //검사할 로직 작성
            result = A / B ;
            System.out.println(result);
        } catch (Exception e){ //발생한 예외처리
            System.out.println("0으로는 나눌 수 없습니다");
        } finally { //예외 발생과 상관없이 무조건 실행
            System.out.println("정말 재미있는 Java 스터디");
        }
    }
}
