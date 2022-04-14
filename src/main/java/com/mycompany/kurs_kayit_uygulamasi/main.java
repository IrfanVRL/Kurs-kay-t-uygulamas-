/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kurs_kayit_uygulamasi;

import java.util.Scanner;

/**
 *
 * @author irfan
 */
public class main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ,secim =-1;
        System.out.println("kursa kayit olacak kisi sayisi");
        n = sc.nextInt();
        KursStack stck = new KursStack(n);
        
        while(secim !=0){
            System.out.println("1 kursa yeni kayıt");
            System.out.println("2 en son kaydi sil ");
            System.out.println("3 yazdir");
            System.out.println("4 en son kayitli ksi");
            System.out.println("5 kalan kontenjan blgieri");
            System.out.println("0 cikis");
            secim = sc.nextInt();
            
            if (secim == 1) {
                stck.ekle();
            }else if(secim == 2){
                stck.sil();
            }else if(secim == 3){
                stck.print();
            }else if(secim == 4){
                stck.enSonKayit();
            }else if(secim == 5){
                stck.kalanKontenjan();
            }else if(secim== 0){
                System.out.println("gule gule");
                     
            }else{
                System.out.println("hatali secim");
            }

        }
         
    }
}
