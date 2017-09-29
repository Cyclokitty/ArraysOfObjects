package com.company;

public class Main {

    public static void main(String[] args) {
	    Card queenHearts = new Card(12, 2);
        System.out.println(queenHearts);

        Card jackDiamonds = new Card(11, 1);
        System.out.println(jackDiamonds);

        System.out.println(jackDiamonds.equals(queenHearts));

        System.out.println(jackDiamonds.compareTo(queenHearts));
    }


}
