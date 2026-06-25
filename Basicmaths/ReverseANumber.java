package Basicmaths;

public class ReverseANumber {
    static int reverseNumber(int n){
        int reversed=0;
        while(n>0){
            int digit=n%10;
            reversed=reversed*10+digit;
            n=n/10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        int n=12345;
        int result=reverseNumber(n);
        System.out.println("Reversed number: " + result);
    }
    
}
