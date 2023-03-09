
package com.mycompany.bai4;

import java.util.Scanner;

public class Bai4 {

    public static void main(String[] args) {
        int thang;
        Scanner banPhim;
        banPhim = new Scanner(System.in);
                
         do{
        System.out.print("Nhập Tháng Bạn Muốn Xem:");
        thang = banPhim.nextInt();
            System.out.println("Tháng ban muốn xem là:Tháng "+ thang);
        }while(thang <1 || thang >12);
    }
}