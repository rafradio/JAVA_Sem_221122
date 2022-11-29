import java.util.*;

public class Calcclasses {
    public String primer, symbol;
    public int firstNum, secondNum;
    public float result;
    public void enterPrimer() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите пример:");  
        this.primer = sc.nextLine(); 
        sc.close(); 
        this.primer = this.primer.replaceAll("\\s", "");
    }

    public void findSymbol() {
        int index = 0;
        String[] operations = {"*", "/", "+", "-"};
        for (String i : operations) {
            if (this.primer.contains(i)) {
                index = this.primer.indexOf(i);
                this.symbol = i;
            }
        }
        this.firstNum = Integer.parseInt(this.primer.substring(0, index));
        this.secondNum = Integer.parseInt(this.primer.substring(index+1, this.primer.length()));
    }

    public void calcPrimer() {
        switch(this.symbol) {
            case "*":
                this.result = this.firstNum * this.secondNum;
                break;
            case "/":
                this.result = (float) this.firstNum / this.secondNum;
                break;
            case "+":
                this.result = this.firstNum + this.secondNum;
                break;
            case "-":
                this.result = this.firstNum - this.secondNum;
                break;
        }
    }
}
