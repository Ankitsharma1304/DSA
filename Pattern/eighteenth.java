package Pattern;

public class eighteenth {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                int a=j;
                int b=('A'-1);
                int c=a+b;
                char ch=(char)c;
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
