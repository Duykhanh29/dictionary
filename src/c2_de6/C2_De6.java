/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c2_de6;

/**
 *
 * @author Admin
 */
public class C2_De6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dictionary d=new Dictionary();
        d.insertWords();
        d.displayList();
        System.out.println("\n\tAfter sorting");
     //   d.sortByEnglishWord();
     d.sortByEnglish();
        d.displayList();
        String x="Entrovert";
        System.out.println("Search: "+d.searchWord(x));
    }
    
}
