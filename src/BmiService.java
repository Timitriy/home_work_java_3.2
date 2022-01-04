public class BmiService {
    public double calculate(double weight,double growth) {
        double massIndex = weight / (growth * growth);
        return massIndex;
    }
}
