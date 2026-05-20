package com.pluralsight.generics;

public class Program {
    public static void main(String[] args) {
        SwapBox<String> words = new SwapBox<>("Coffee", "Tea");
        SwapBox<Integer> scores = new SwapBox<>(85, 92);
        SwapBox<Double> prices = new SwapBox<>(4.99, 9.49);

        System.out.println("-----------------Before Swapping---------");
        System.out.println(words.describe());
        System.out.println(scores.describe());
        System.out.println(prices.describe());
        System.out.println("-----------------After Swapping----------");
        words.swap();
        scores.swap();
        prices.swap();
        System.out.println(words.describe());
        System.out.println(scores.describe());
        System.out.println(prices.describe());

        displayBox("Words",words);
        displayBox("Scores",scores);
        displayBox("Prices",prices);

        SwapBox<String> compareString = new SwapBox<>("Coffee", "Coffee");
        SwapBox<Integer> compareInteger = new SwapBox<>(92, 92);
        SwapBox<Double> comparePrices = new SwapBox<>(1.10, 1.10);
        System.out.println(compareString.itemsMatch());
        System.out.println(compareInteger.itemsMatch());
        System.out.println(comparePrices.itemsMatch());




    }
    public static <T> void displayBox(String label, SwapBox<T> box){
        System.out.println( label +" before swap"+ box.describe());
        box.swap();
        System.out.println( label + " Words after swap"+ box.describe());
    }
}
