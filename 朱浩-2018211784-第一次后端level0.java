package com.company;
class person {
    String name ;
    int age ;
    String gender;
    int height ;
    int weight ;
    public void tell(){
        System.out.println("姓名："+name+",年龄："+age+"，性别："+gender+"，身高："+height+"，体重："+weight);
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        person per =new person();
        per.name="朱浩";
        per.age=19;
        per.height=180;
        per.gender="男";
        per.weight=60;
        per.tell();

    }
}
