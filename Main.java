package testJava;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String tempIn = br.readLine();
        int re = Integer.parseInt(tempIn); //반복 횟수 입력단
        for(int j=0;j<re;j++){
            tempIn = br.readLine();
            String[] data = tempIn.split(" "); // 점수 입력단
    
            int[] nData = new int[data.length-1];
            float aver = 0;                         //평균
            int overA = 0;
            int sum = 0;                             //점수합
    
            for(int i=1;i<(data.length);i++){
                nData[i-1] = Integer.parseInt(data[i]);
                sum = sum+nData[i-1];
            }
            int totalN = nData.length;

            aver = (float)sum/totalN;

            for(int i=0;i<totalN;i++){
                if(nData[i]>aver){
                    overA++;
                }
            }
            bw.write(String.format("%.3f",(float)overA*100/totalN)+"%\n");
            


        }
        bw.flush();
        bw.close();
        br.close();

    }
}