package Thread;

import java.util.ArrayList;

public class RunnableExample implements Runnable { // 다른 클래스도 상속 받기 위해 Runnable interface 사용
    private int order;
    public RunnableExample(int order) {this.order = order;}
    @Override
    public void run() {
        System.out.println(this.order + "번째 스레드 시작합니다.");
        try{
            Thread.sleep(1000);
        }catch(Exception e){

        }
        System.out.println(this.order+"번째 스레드 종료합니다.");
    }
    public static void main(String[] args) {
        ArrayList<Thread> threadList = new ArrayList<>();
        for(int i = 1; i <= 10; i++){
            Thread thread = new Thread(new RunnableExample(i)); //이 부분이 바뀜
            thread.start();
            threadList.add(thread);
        }

        for(int i = 0; i < threadList.size(); i++){
            Thread thread = threadList.get(i);
            try{
                thread.join();
            }catch(Exception e){

            }
        }
        System.out.println("main 메소드 종료합니다.");
    }
}
