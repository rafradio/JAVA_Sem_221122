public class Factprogram {
    public static void main(String[] args) {
        Factclasses obj = new Factclasses();
        obj.enterN();
        System.out.println("Факториал равен: " + obj.calcMult(obj.n)); 
    }
}
