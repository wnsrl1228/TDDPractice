package com.ll.exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Project {
    public static void main(String[] args) throws IOException {

        int 엄지손가락_길이 = new 사람().a왼팔.a손.a엄지손가락.길이;

        System.out.println(엄지손가락_길이 + "cm");
        // 출력 : 5cm

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        String A = str[0];
        String B = str[1];

        if(A.length() < B.length()) {

        }
    }

}


class 사람 {
    팔 a왼팔;

    사람() {
        a왼팔 = new 팔();
        a왼팔.a손 = new 손();
        a왼팔.a손.a엄지손가락 = new 손가락();
        a왼팔.a손.a엄지손가락.길이 = 5;
    }
}

class 팔 {
    손 a손;

}

class 손 {
    손가락 a엄지손가락;
}

class 손가락 {
    int 길이;
}