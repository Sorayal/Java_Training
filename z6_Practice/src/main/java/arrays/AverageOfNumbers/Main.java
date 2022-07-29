package arrays.AverageOfNumbers;

public class Main {
    public static void main(String[] args) {
        double[] numbers = new double[]{2.2, 4.4, 6.6};
        double avg = calculateAvg(numbers);
        System.out.println(avg);
    }

    public static double calculateAvg(double[] numbers) {
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum / numbers.length;
    }
}
