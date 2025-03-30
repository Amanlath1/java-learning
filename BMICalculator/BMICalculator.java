public class BMICalculator {
  public double calculateBmiImperial(double weightInPound, double heightInInches){
    return weightInPound / (heightInInches * heightInInches) * 703;
  }
  public double calculateBmiMetric(double weightInKilos, double heightInMeters){
    return weightInKilos / (heightInMeters * heightInMeters);
  }

}
