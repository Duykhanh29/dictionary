/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c2_de6;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Word {
    private String id,vn,en;

    public Word() {
    }

    public Word(String id, String vn, String en) {
        this.id = id;
        this.vn = vn;
        this.en = en;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVn() {
        return vn;
    }

    public void setVn(String vn) {
        this.vn = vn;
    }

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    @Override
    public String toString() {
        return  id + "\t" + vn + "\t" + en ;
    }
    public void show(){
        System.out.println("\tID: "+this.id);
        System.out.println("\tEnglish: "+this.en);
        System.out.println("\tVietnam: "+this.vn);
    }
    Scanner inputText=new Scanner(System.in);
    public void inputWord(){
        System.out.println("\tInput id: ");
        this.id=inputText.nextLine();
        System.out.println("\tInout ENglish: ");
        this.en=inputText.nextLine();
        System.out.println("\tInout Vietnam: ");
        this.vn=inputText.nextLine();
    }
}
