import java.util.*;

public class Factclasses {
    public int x;
    public int n;
    public long result;

    public void enterN() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");  
        this.n = sc.nextInt(); 
        sc.close(); 
    }

    public long calcMult(int n) {
        if (n == 1) {return 1;};
        return n * this.calcMult(n - 1);
    }
}
