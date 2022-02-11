import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        final int C2 = 1517 % 2;//1 - "-"
        System.out.println("C2 = " + C2 + " //o1 - \"-\"");
        final int C3 = 1517 % 3;//2
        System.out.println("C3 = " + C3);
        final int C5 = 1517 % 5;//2 - "%"
        System.out.println("C5 = " + C5 + " //o2 - \"%\"");
        final int C7 = 1517 % 7;//5 - "float"
        System.out.println("C7 = " + C7 + " //type - \"float\"");

        final int C = C3;//2
        System.out.println("C = " + C);

        int a, b, n, m;

        System.out.println("Enter a");
        a = scan.nextInt();
        System.out.println("a = " + a);

        System.out.println("Enter n");
        n = scan.nextInt();
        System.out.println("n = " + n);

        System.out.println("Enter b");
        b = scan.nextInt();
        System.out.println("b = " + b);

        System.out.println("Enter m");
        m = scan.nextInt();
        System.out.println("m = " + m);

        if (a > n || b > m){
            System.out.println("Summation is not possible the lower limit is greater than upper limit\nS = 0");
            System.exit(0);
        }

        float S = 0;

        for(float i = a; i <= n; i++){
            if(i-C == 0){
                System.out.println("Cannot divide by zero");
                System.exit(0);
            }
            else {
                for(float j = b; j <= m; j++){
                    if(j == 0){
                        System.out.println("Cannot divide by zero");
                        System.exit(0);
                    }
                    else {
                        S += (i % j)/(i - C);
                    }
                }
            }
        }
        System.out.println("S = " + S);
    }
}
