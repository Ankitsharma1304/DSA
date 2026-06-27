package Basicmaths;

public class lcmOfNumber {
    static int lcm(int a, int b){
        return (a*b)/gcd(a,b);
    }

    static int gcd(int a, int b){
        if(b==0){
            return a;
        }
        return gcd(b, a%b);
    }

    public static void main(String[] args) {
        int a=12;
        int b=18;
        int result=lcm(a,b);
        System.out.println("LCM of " + a + " and " + b + " is: " + result);
    }
    
}
