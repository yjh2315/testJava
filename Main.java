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
        int in = Integer.parseInt(st.nextToken());
        int i = 0,j = 0;

        while(in-i>0){
            j++;
            i=i+j;
        }
        
        int in2=in-i+j;

        int up = 0,down=0;

        if(j%2==0){
            up = in2;
            down = j-up+1;
        }else{
            down = in2;
            up = j-down+1;
        }
        

        bw.write(up+"/"+down+"\n");


        bw.flush();
        bw.close();
        br.close();
    }
}