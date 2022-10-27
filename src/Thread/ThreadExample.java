package Thread;

import java.util.ArrayList;

public class ThreadExample extends Thread { //Thread 클래스 상속
    private int order;

    public ThreadExample(int order) {this.order = order;}
    public void run(){ //run method에서 스레드 작업 작성
        System.out.println(this.order + "번째 스레드 시작합니다.");
        try{
            Thread.sleep(1000);
        }catch(Exception e){

        }
        System.out.println(this.order+"번째 스레드 종료합니다.");
    }

    public static void main(String[] args) {
        ArrayList<Thread> threadList = new ArrayList<>();
        for(int i = 1; i <= 10; i++){ //thread 10개 생성 작업
            Thread thread = new ThreadExample(i);
            thread.start();
            threadList.add(thread);
        }

        for(int i = 0; i < threadList.size(); i++){
            Thread thread = threadList.get(i);
            try{
                thread.join(); // join method 사용으로 main method가 먼저 종료되는 것을 방지
            }catch(Exception e){

            }
        }
        System.out.println("main 메소드 종료합니다.");
    }
}
