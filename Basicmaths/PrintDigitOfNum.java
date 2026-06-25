package Basicmaths;
    
public class PrintDigitOfNum {
    
    static void printDigits(int n){
       
        while(n>0){
           int digit=n%10;
            System.out.println(digit);
            n=n/10;
        }
    }

    public static void main(String[] args) {
        int n=12345;
        printDigits(n);
    }
}
