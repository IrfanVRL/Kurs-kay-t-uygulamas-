/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kurs_kayit_uygulamasi;

import java.util.Scanner;
import org.w3c.dom.Node;

/**
 *
 * @author irfan
 */
public class KursStack {

    Scanner sc = new Scanner(System.in);
    int kontenjan;
    int sayac;
    KursNode head;

    public KursStack(int kontenjan) {
        this.kontenjan = kontenjan;
        sayac = 0;
        head = null;
    }
    String tc;
    String ad;
    String Soyad;
    String Bolum;

    void ekle() {  // push metod
        System.out.println("Tc : ");
        tc = sc.nextLine();
        System.out.println("Ad : ");
        ad = sc.nextLine();
        System.out.println("SoyAd : ");
        Soyad = sc.nextLine();
        System.out.println("bolum : ");
        Bolum = sc.nextLine();

        KursNode newNode = new KursNode(head, tc, ad, Soyad, Bolum);

        if (isFull()) {
            System.out.println("Kontenjan dolu");
        } else {
            if (isEmpty()) {
                head = newNode;
                System.out.println(head.tc + " eklendi");

            } else {
                
                newNode.nextNode = head;
                head = newNode;
            }
            sayac++;
        }

    }

    void sil() { //pop
        if (isEmpty()) {
            System.out.println("bos liste");
        } else {
            System.out.println(head.tc + " kişi silindi");
            head = head.nextNode;
            sayac--;
        }
    }

    void print() {
        if (isEmpty()) {
            System.out.println("kayitli kimse yok");
        } else {
            KursNode temp = head;
            System.out.println("Kursta kayitli kisi listesi");
            while (temp != null) {
                System.out.println("Tc no\tad\tsoyad\tolum");
                System.out.println(temp.tc + "\t" + temp.ad + "\t" + temp.Soyad + "\t" + temp.Bolum);
                temp = temp.nextNode;
            }
        }
    }

    void enSonKayit() {
        if (isEmpty()) {
            System.out.println("liste bos");
        } else {

            System.out.println(head.tc + "\t" + head.ad + "\t" + head.Soyad + "\t" + head.Bolum);

        }

    }
    
    void kalanKontenjan(){
        System.out.println("toplam kayitli kisi : " + sayac);
        System.out.println("kalan kontenjan : " + (kontenjan-sayac));
    }

    boolean isFull() {
        return sayac == kontenjan;
    }

    boolean isEmpty() {
        return sayac == 0;
    }

}
