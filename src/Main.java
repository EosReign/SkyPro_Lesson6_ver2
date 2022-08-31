public class Main {
    public static void main(String[] args) {
        //==============FirstTask==============
        System.out.println("==============FirstTask==============");
        int[] arr = generateRandomArray();

        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
        //==============SecondTask==============
        System.out.println("==============SecondTask==============");
        int numMax = 0;
        int numMin = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > numMax) {
                numMax = arr[i];
            }
            if (numMin == 0) {
                numMin = arr[i];
            }
            if (arr[i] < numMin) {
                numMin = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + numMin + " рублей.");
        System.out.println("Максимальная сумма трат за день составила " + numMax + " рублей.");
        //==============ThirdTask==============
        System.out.println("==============ThirdTask===============");
        double averageNum = sum / 30;
        System.out.println("Средняя сумма трат за месяц составила " + averageNum + " рублей.");
        //==============FourthTask==============
        System.out.println("==============FourthTask==============");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i != -1 ; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}