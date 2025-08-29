package Strings;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sidhu
 */
public class StringSort {
    
    
    public static void sortStringArray(String s[]) {
    for (int i = 1; i < s.length; i++) {
        String key = s[i];
        int j = i - 1;
        
        while (j >= 0 && s[j].compareTo(key) > 0) {
            s[j + 1] = s[j];
            j--;
        }
        s[j + 1] = key;
    }
}

    
    public static void main(String[] args) {
        
        String strings[] = {"Hindi", "Malayalam", "English", "French" , "German"};
        
        for(String s:strings)
        {
            System.out.println(s);
        }
        
        sortStringArray(strings);
        
        
        for(String s:strings)
        {
            System.out.println(s);
        }
        
        
    }
    
}
