/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kurs_kayit_uygulamasi;

/**
 *
 * @author irfan
 */
public class KursNode {

    KursNode nextNode;
    String tc;
    String ad;
    String Soyad;
    String Bolum;

    public KursNode(KursNode nextNode, String tc, String ad, String Soyad, String Bolum) {
        this.tc = tc;
        this.ad = ad;
        this.Soyad = Soyad;
        this.Bolum = Bolum;
        nextNode = null; 
    }

    
}
