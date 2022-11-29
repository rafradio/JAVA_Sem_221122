import java.util.*;

public class Addclass {
    public String primer;
    public String firstNum, secondNum;
    public float result;
    public int n;
    public String[] symbol;

    public void enterDigit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");  
        this.n = sc.nextInt();
        sc.close();  
    }

    public void findSimple() {
        System.out.println("Список простых чисел: ");
        for (int i = 1; i <= this.n; i++) {  
            if (this.isSimple(i)) {  
                System.out.print(i + " ");  
            }  
        }
    }

    public boolean isSimple(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {  
            if (n % i == 0) {  
                return false;  
            }  
        }  
        return true;

    }
}

