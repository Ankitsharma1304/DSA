package Basicmaths;

public class PrintDigitOfNumCount {
 static void printDigits(int n){
       
        int count=0;
        while(n>0){
           int digit=n%10;
            System.out.println(digit);

            n=n/10;
            count++;
            
        }
        System.out.println("Number of digits: " + count);
    }

    public static void main(String[] args) {
        int n=12345;
        printDigits(n);
    }

    
}
