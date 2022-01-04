public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double growth = 1.70;
        double weight = 60;
        double massIndex = service.calculate(60,1.70);
        System.out.println(massIndex);
    }
}