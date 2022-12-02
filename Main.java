package testJava;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        long i = 0;
        char ind = 0;
        long prev = a;

        while(true){
            long nowL = a+i*b;
            long nowR = i*c;
            long now = nowL-nowR;
            if(nowL<nowR) break;
            if(prev<now){
                ind = 1;
                break;
            }
            prev = now;
            i++;
        }
        
        if(ind == 1){
            bw.write("-1 \n");
        }else{
            bw.write(i+"\n");
        }




        bw.flush();
        bw.close();
        br.close();
    }
}