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
        int num = 0;
        int rep = 0;

        in = in-2;

        if(in==-1){
            rep = 1;
        }else{
            num = in/6;
            for(int i=0,j=0; i<num; j++){
                i = i+j;
                rep = j;
                if(num<i+j+1) break;
            }
            rep = rep+2;
        }

        bw.write(rep+"\n");

        bw.flush();
        bw.close();
        br.close();
    }
}