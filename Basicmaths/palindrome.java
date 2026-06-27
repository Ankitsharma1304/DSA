package Basicmaths;

public class palindrome {
    static boolean isPalindrome(int n){
        int original=n;
        int reversed=0;
        while(n>0){
            int digit=n%10;
            reversed=reversed*10+digit;
            n=n/10;
        }
        return original==reversed;
    }

    public static void main(String[] args) {
        int n=12321;
        boolean result=isPalindrome(n);
        if(result){
            System.out.println(n + " is a palindrome number.");
        }else{
            System.out.println(n + " is not a palindrome number.");
        }
    }
    
}
