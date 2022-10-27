package EOF;

import java.io.*;
public class BufferedReaderEOF { //bufferedReader 클래스로 EOF 확인하기
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = "";
        while((str = br.readLine()) != null){ //readeLine method로 전부 읽어옴
            bw.write(str+"\n");
        }
        bw.write("BufferedReader EOF");
        bw.flush(); //EOF 해서 멈춰야 쌓아뒀던 것 한 번에 출력
        bw.close();
        br.close();
    }
}
