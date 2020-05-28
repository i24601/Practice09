package com.javaex.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FriendApp extends Friend{

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
    	List<Friend> fList = new ArrayList<Friend>();
    	Friend f;
    	for(int i =0;i<3;i++) {
    	System.out.println("친구를 입력해주세요");
    	String data[]=sc.nextLine().split(",");

    	f = new Friend(data[0],data[1],data[2]);
    	fList.add(f);
    	}
    	sc.close();
    	
    	for(Friend ff : fList) {
    		System.out.printf("이름:%s 전화번호:%s 학교:%s\n",ff.getName(),ff.getHp(),ff.getSchool());
    	}
    }
    
}
