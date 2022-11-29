import java.util.*;

public class Addclass {
    public int x;
    public int n;
    public int result;
    public Addclass() {
        // this.enterN();
        // this.result = this.calcSum(this.n);
    }
    public void enterN() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");  
        this.n = sc.nextInt(); 
        sc.close(); 
    }
    public int calcSum(int n) {
        if (n == 1) {return 1;};
        return n + this.calcSum(n - 1);
    }
}
