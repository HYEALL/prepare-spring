package EOF;

import java.util.Scanner;

public class EOFExample { //scanner 클래스로 EOF 확인하기
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){ //받아올 토큰이 있을 때까지 계속 진행 = EOF가 오지 않으면 계속 받아옴
            System.out.println(scan.nextLine());
        }
        System.out.println("Scanner EOF"); //EOF 발생
    }
}
