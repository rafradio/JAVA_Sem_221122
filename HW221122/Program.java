class Program {
    public static void main(String[] args) { 
        Addclass obj = new Addclass();
        obj.enterN();
        System.out.println("Сумма равна: " + obj.calcSum(obj.n));       
    }
}