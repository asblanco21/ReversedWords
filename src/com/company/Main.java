package com.company;

public class Main {

    public Main(int size) {

    }

    public static void main(String[] args) {

	char[] message = {'e','k','a', 'c', ' ','d','n','u','o','p',' ','l','a','e','t','s'};
         reverseWords(message,16);
    }

    public static void reverseWords(char[] message, int length){


    for (int i = length-1; i >= 0; i--)

    {
        System.out.print(message[i]);
    }

}}
