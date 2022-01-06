public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double massIndex = service.calculate(60,1.70);
        System.out.println(massIndex);
    }
}