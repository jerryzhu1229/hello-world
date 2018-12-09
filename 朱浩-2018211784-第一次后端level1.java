package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String a = "acbdw,1269547,AASIDX,AIUydjs,12sjaA,3819247,ausSHSzio,IUFISsi\n";
        String[] aArray = a.split(",");
        for (int i = 0; i < aArray.length; i++) {
            System.out.print(aArray[i]);
            String c = aArray[i];
            boolean result =c.matches("[0-9]+");
            if (result == true) {
                System.out.println("该字符串是纯数字");
            }
            boolean q =c.matches("[a-z]+");
            if (q == true) {
                System.out.println("该字符串全是小写字母");
        }
            boolean F =c.matches("[A-Z]+");
            if (F == true) {
                System.out.println("该字符串全是大写字母");
            }
            if(result==false && q==false && F==false);{
                System.out.println();
            }
    }
    }
}

