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
        String in = br.readLine();
        if(in.length()==1&&in.equals(" ")){
            bw.write("0"+"\n");
        }else{
            String[] inA = in.split(" ");

            if(inA[0]==""&&inA.length!=0){
                bw.write(inA.length-1+"\n");
            }else{
                bw.write(inA.length+"\n");
            }
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}