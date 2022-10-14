/*
 Created by 21343010-Natasya febriani
 */
package uts;

import javax.swing.JOptionPane;

public class UTS3 {
    public static void main(String[] args) {
        
        String bilangan = "", message = "";
        int angka;
        
        System.out.println(" Natasya febriani ");
        System.out.println("     21343010     ");
        System.out.println("==================");

        bilangan = JOptionPane.showInputDialog("Masukkan Nilai : ");
        angka = Integer.parseInt(bilangan);

        if(angka >= 0) {
            message = angka + " merupakan bilangan POSITIF";
        }
        else if(angka < 0) {
            message = angka + " merupakan bilangan NEGATIF";
        }
        else{
            message = " Merupakan bilangan 0";
        }
        JOptionPane.showMessageDialog(null, message);
        System.out.println(message);
    }
   }