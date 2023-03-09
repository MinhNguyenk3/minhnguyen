
package com.mycompany.bai1;

import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {
        int number1, number2;
        
        System.out.print("nhap hai so nguyen: ");
        Scanner banPhim = new Scanner(System.in);
        number1 = banPhim.nextInt();
        number2 = banPhim.nextInt();
        
        System.out.println("Tong: "+ (number1 + number2));
        System.out.printf("Hieu:%d\n", number1 - number2);     
        System.out.println("Tich: "+ (number1 * number2));
        System.out.printf("Thuong: %.2f\n ", 1.0 * number1 / number2);
        System.out.println("Chia lay du: "+ (number1 % number2));
        
        System.out.println("So sanh 2 so : "+ (number1>number2?number1:number2));
       
             
    }
}

