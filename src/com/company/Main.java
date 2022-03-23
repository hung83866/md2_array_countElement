package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	// write your code here
        while (1>0){
            String str = "tun.beo.hu.hong.mat.net.nhat.nha.thi,thoang,cung,hoi,dang,yeu";
            Scanner scanner = new Scanner(System.in);
            System.out.println("mời bro nhập kí tự!");
            char s = scanner.next().charAt(0);
            System.out.println("số kí tự = "+checkString(str,s));
        }
    }
    static int checkString(String str,char x){
        int count = 0;
        char[] ch = str.toCharArray();
        for (int i = 0 ; i < str.length();i++){
            if (ch[i]==x){
                count++;
            }
        }
        return  count;
    }
}
