package com.revature;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    /*
    Java:

    The Atbash cipher is an encryption method in which each letter of a word is replaced with its "mirror" letter in the
    alphabet: A <=> Z; B <=> Y; C <=> X; etc.

    Create a function that takes a string and applies the Atbash cipher to it.

    Examples
        atbash("apple") --> "zkkov"
        atbash("Hello world!") --> "Svool dliow!"
        atbash("Christmas is the 25th of December") --> "Xsirhgnzh rh gsv 25gs lu Wvxvnyvi"

    Notes:
        Capitalisation should be retained.
        Non-alphabetic characters should not be altered.
     */
    public static void main(String[] args) {
        //Enter user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text tob ciphered: ");
        String txt = sc.nextLine();
        sc.close();
        System.out.println();

        //Create cipher
        HashMap<Character, Character> keyMapping;
        keyMapping = populateKeyMapping();

        //encode message
        StringBuilder encodedMsg = new StringBuilder();
        for (char ch : txt.toCharArray()) {
            if (keyMapping.containsKey(ch)) {
                encodedMsg.append(keyMapping.get(ch));
            } else {
                encodedMsg.append(ch);
            }
        }
        System.out.println(encodedMsg);
    }

    public static HashMap<Character, Character> populateKeyMapping() {
        HashMap<Character, Character> map = new HashMap<>();

        //Upper case
        int startUpper = 65, endUpper = 90;
        int tempStart = startUpper;
        int tempEnd = endUpper;
        while (tempEnd >= startUpper & tempStart <= endUpper) {
            map.put((char) (tempStart), (char) (tempEnd));
            tempEnd--;
            tempStart++;
        }

        //Lower case
        int startLower = 97, endLower = 122;
        tempStart = startLower;
        tempEnd = endLower;
        while (tempEnd >= startLower & tempStart <= endLower) {
            map.put((char) (tempStart), (char) (tempEnd));
            tempEnd--;
            tempStart++;
        }

        return map;
    }
}
