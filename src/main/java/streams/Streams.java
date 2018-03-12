package main.java.streams;

public class Streams {
    public static void main(String args[]){
        System.out.println(binaryToDec("1001"));
        System.out.println(sumDigits(234));
    }

    public static int binaryToDec(String s){
        return s.chars().map(Character::getNumericValue).reduce((x,y) -> (2*x+y)).getAsInt();
    }


    public static int sumDigits(long n){
        return ("" + n).chars().map(Character::getNumericValue).reduce((x,y) -> (x+y)).getAsInt();
    }


}
