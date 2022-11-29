import java.util.*;

public class Addclasses {
    public String primer;
    public String firstNum, secondNum;
    public float result;
    public int thirdNum;
    public String[] symbol;

    public void enterPrimer() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите пример:");  
        this.primer = sc.nextLine(); 
        sc.close(); 
        this.primer = this.primer.replaceAll("\\s", "");
    }

    public void findSymbols() {
        // int length = this.primer.length();
        int index = this.primer.indexOf("+");
        int index1 = this.primer.indexOf("=");
        this.firstNum = this.primer.substring(0, index);
        this.secondNum = this.primer.substring(index+1, index1);
        this.thirdNum = Integer.parseInt(this.primer.substring(index1+1, this.primer.length()));
    }

    public void resheniePrimera() {
        boolean isResult = false;
        int secondNumCreate = 0;
        int firstNumCreate = 0;
        for (int i = 0; i < 10; i++) {
            firstNumCreate = this.creatNum(i, this.firstNum);
            for (int j = 0; j < 10; j++) {
                secondNumCreate = this.creatNum(j, this.secondNum);
                if ((firstNumCreate + secondNumCreate) == this.thirdNum) {
                    isResult = true;
                    break;
                }
            }
            if (isResult) {break;};
        }
        if (isResult) {
            System.out.println("Решение: " + firstNumCreate + " " + " + " + secondNumCreate + " " + " = " + this.thirdNum);
        } else {
            System.out.println("Решения нет");
        }
    }

    public int creatNum(int i, String number) {
        int flag = number.indexOf("?");
        int num = 0;
        switch(flag) {
            case 0:
                num = Integer.parseInt(number.substring(1, 2));
                num = 10 * i + num;
                break;
            case 1:
                num = Integer.parseInt(number.substring(0, 1));
                num = 10 * num + i;
                break;
        }
        return num;

    }
}
