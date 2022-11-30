package testJava;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {
    public static long sum(int[] a){
        long sum=0;
        for(int i : a){
            sum = sum+i;
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String inS = br.readLine();
        String[] inSa = inS.split(" ");
        int[] inA = new int[inSa.length];
        for(int i = 0; i<inSa.length; i++){
            inA[i] = Integer.parseInt(inSa[i]);
        }
        
        long res = sum(inA);
        bw.write(String.format("%d", res)+"\n");

        bw.flush();
        bw.close();
        br.close();
    }
}