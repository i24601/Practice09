package com.javaex.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	List<Goods> gdList = new ArrayList<Goods>();
    	Goods gd;
    	while(true) {
    	System.out.println("상품을 입력해주세요");
    	String data[]=sc.nextLine().split(",");
    	if(data[0].equals("q")) {
    		break;
    	}
    	gd = new Goods(data[0],Integer.valueOf(data[1]),Integer.valueOf(data[2]));
    	gdList.add(gd);
    	}
    	sc.close();
    	
    	for(Goods x : gdList) {
    		System.out.printf("%s 가격(%d) %d개 입고되었습니다\n",x.getName(),x.getPrice(),x.getCount());
    	}
		System.out.printf("모든상품의 갯수는 %d 입니다",gdList.size());

}
}