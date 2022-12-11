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
        int t = Integer.parseInt(st.nextToken());
        for(int i=0;i<t;i++){
            st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
    
            double douDis = (double)n/h;
            int intDis;
            if(douDis%1>0){
                intDis = (int)douDis+1;
            }else{
                intDis = (int)douDis;
            }
    
            int height = n%h;
            if(height == 0){
                height = h;
            }
    
            bw.write(height+String.format("%02d", intDis)+"\n");    
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}