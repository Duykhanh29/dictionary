/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c2_de6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Admin
 */
public class Dictionary {

    ArrayList<Word> list = new ArrayList<>();

    public void insertWords() {
        list.add(new Word("01", "yeu", "Love"));
        list.add(new Word("02", "toi", "I"));
        list.add(new Word("03", "Kien", "Ant"));
        list.add(new Word("04", "anh em trai", "Brother"));
        list.add(new Word("05", "nguoi huong ngoai", "Entrovert"));
        list.add(new Word("06", "nguoi huong noi", "Introvert"));
        list.add(new Word("07", "tham gia", "participate"));
        list.add(new Word("08", "nap dien", "Charge"));
        list.add(new Word("09", "nha tuyen dung", "Recruiter"));
        list.add(new Word("10", "lon", "Huge"));
        list.add(new Word("11", "chuot", "Mouse"));
    }
    public void addByHand(){
        Word word=new Word();
        insertWords();
        list.add(word);
    }
    public void insertByHand(Word w){
        list.add(w);
    }
    public void sortByEnglishWord(){
       for(int i=0;i<list.size();i++){
           for(int j=i;j<list.size();j++){
               if(list.get(i).getEn().compareTo(list.get(j).getEn())>0){
                   Word w=list.get(i);
                   list.set(i, list.get(j));
                   list.set(j, w);
               }
           }
       }
    }
    public void sortByEnglish(){
       Collections.sort(list,new Comparator<Word>(){
           @Override
           public int compare(Word o1, Word o2) {
               if(o1.getEn().compareTo(o2.getEn())>0){
                   return 1;
               }
               return -1;
           }
       });
    }
    public String searchWord(String en){
        sortByEnglishWord();
        int i=0;
        int right=list.size();
        while (i<right) {     
            int mid=(i+right)/2;
            if(en.compareToIgnoreCase(list.get(mid).getEn())==0){
                return en;
            }
            if(en.compareToIgnoreCase(list.get(mid).getEn())<0){
                right=mid;
            }else{
                i=mid+1;
            }
        }
        return null;
            
    }
    public String returnVNWord(String en){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getEn().equals(en)){
                return list.get(i).getVn();
            }
        }
        return null;
    }
    public void displayList(){
        for (int i = 0; i < list.size(); i++) {
            System.out.println("i: "+list.get(i).toString());
        }
    }
    public int nextIndex(){
        return list.size()+1;
    }
}
