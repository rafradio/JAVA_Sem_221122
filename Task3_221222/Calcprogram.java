public class Calcprogram {
    public static void main(String[] args) {
        Calcclasses obj = new Calcclasses();
        obj.enterPrimer();
        obj.findSymbol();
        obj.calcPrimer();
        System.out.println("Ответ равен: " + obj.result); 
    }
}