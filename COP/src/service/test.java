package service;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		
		chuanhoa chuan=new chuanhoa();
		
		System.out.println("nhap sau muon chuan hoa: \n");
        String s = new Scanner(System.in).nextLine();
        System.out.println("Xau truoc khi chuan hoa: \n"+s);
        System.out.println("Xau sau khi chuan hoa: \n"+ chuan.getRes(s.toLowerCase()).toString());
        System.out.println("");
    }
	
}
