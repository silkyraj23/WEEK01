public class RandomNumber {
    public int[] generateFourDigitRandomArray(int size) {
        int[] randomNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = 1000 + (int)(Math.random() * 9000);
        }
        return randomNumbers;
    }
    public double[] findAverageMinMax(int[] numbers) {
        int sum = 0;
        int min = numbers[0];
        int max = numbers[0];
        for (int i=0;i<numbers.length;i++){
           sum+=numbers[i];
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        double average = sum/numbers.length;    
        return new double[] {average,min,max};
    }
    public static void main(String[] args) {
        RandomNumber analysis = new RandomNumber();
        int[] randomNumbers = analysis.generateFourDigitRandomArray(5);
        double[] results = analysis.findAverageMinMax(randomNumbers);
        System.out.println("Generated 4-digit Random Numbers: ");
        for (int i=0;i<randomNumbers.length;i++) {
             System.out.println(randomNumbers[i]);
        }
        System.out.println("Average Value: " + results[0]);
        System.out.println("Minimum Value: " + results[1]);
        System.out.println("Maximum Value: " + results[2]);
    }
}