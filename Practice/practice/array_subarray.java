package Practice.practice;

public class array_subarray {

    public static void subarray(int numbers[]) {
        int sum = 0;
        int tp = 0;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;

            for (int j = i; j < numbers.length; j++) {
                int temp = 0;
                int end = j;

                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " ");
                    temp = temp + numbers[k];

                }

                System.out.println("------------------> sum =" + temp);
                sum = sum + temp;

                tp++;
                System.out.println();
            }
            System.out.println();

        }
        System.out.println("Total Number of Subarray " + tp);
        System.out.println("Total sum :" + sum);
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        subarray(numbers);
    }

}
