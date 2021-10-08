package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public Main(int size) {

    }

    public static void main(String[] args) {

        // Given input array
        String[] message = {"cake","pound","steal",};

        // Call method to swap elements
        reverseArray(message);
    }
    public static void reverseArray(String[] arr) {
        // Convert Array to List
        List<String> list = Arrays.asList(arr);
        // Method
        Collections.reverse(list);
        // Convert list back to Array
        String[] reversedArray = list.toArray(arr);
        // Print the reverse Array
        System.out.print("Reverse Array : " + Arrays.toString(reversedArray));
    }
}

   /* //array of chars
	char[] message = {'e','k','a', 'c', ' ','d','n','u','o','p',' ','l','a','e','t','s'};
         reverseWords(message,16);
    }
    //method
    public static void reverseWords(char[] message, int length){

        //logic
        for(int i=length-1;i>=0;i--)

        {
        //print results
        System.out.print(message[i]);
        }
        }*/

