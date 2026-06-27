package Basicmaths;

public class Perfectnum {
    static boolean isPerfect(int num){
        int sum = 0;
        for(int i=1; i<num; i++){
            if(num % i == 0){
                sum += i;
            }
        }
        return sum == num;
    }

    public static void main(String[] args) {
        int number = 28; // Example number
        if(isPerfect(number)){
            System.out.println(number + " is a Perfect number.");
        } else {
            System.out.println(number + " is not a Perfect number.");
        }
    }
    
}
