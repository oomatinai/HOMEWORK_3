public class Main {
    public static void main(String[] args) {
        double[] numbers = new double[15];


        boolean firstTwoPositive = false;
        for (int i = 0; i < numbers.length; i++) {
            if (!firstTwoPositive) {
                numbers[i] = Math.random() * 10;
                firstTwoPositive = true;
            } else {

                double sign = Math.random() < 0.5 ? 1 : -1;
                numbers[i] = Math.random() * 10 * sign;
            }
        }

        boolean foundNegative = false;

        double sum = 0;
        int count = 0;

        for (double number : numbers) {
            if (foundNegative && number > 0) {
                sum += number;
                count++;
            } else if (!foundNegative && number < 0) {
                foundNegative = true;
            }
        }

        if (count > 0) {
            double average = sum / count;
            System.out.println("Среднее арифметическое положительных чисел после первого отрицательного: " + average);
        } else {
            System.out.println("После первого отрицательного числа не найдено положительных чисел.");
        }
    }
}
