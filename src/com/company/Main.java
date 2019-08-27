package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            int n = e - s;
            int result = fly(n);
            sb.append(result);
            sb.append(System.lineSeparator());
        }
        System.out.println(sb.toString());
    }

    public static int fly(int n) {
        if(n <= 2) return n;
        int k = 3;
        int max = 2;
        int i = 3;
        while (true) {
            if(n < i) break;
            if(k % 2 == 1 && k != 3) max++;
            k++;
            i = i + max;
        }
        return k-1;
    }

}
