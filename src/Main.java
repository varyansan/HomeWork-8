import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задание №1");

        int[] firstMassive = new int[3];
        firstMassive[0] = 1;
        firstMassive[1] = 2;
        firstMassive[2] = 3;
        double[] secondMassive = {1.57, 7.654, 9.986};
        long[] thirdMassive = {65, 2563, 5475, 9586};

        System.out.println("Задание №2");

        for (int i = 0; i < 3; i++) {
            System.out.print(firstMassive[i]);
            if (i != firstMassive[1]) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int a = 0; a < 3; a++) {
            System.out.print(secondMassive[a]);
            if (a != secondMassive.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int c = 0; c < thirdMassive.length; c++) {
            System.out.print(thirdMassive[c]);
            if (c != thirdMassive.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();

        System.out.println("Задание №3");

        for (int d = firstMassive.length - 1; d >= 0; d--) {
            if (d == 0) {
                System.out.print(firstMassive[d]);
            } else {
                System.out.print(firstMassive[d] + ", ");
            }
        }
        System.out.println();

        for (int j = secondMassive.length - 1; j >= 0; j--) {
            if (j == 0) {
                System.out.print(secondMassive[j]);
            } else {
                System.out.print(secondMassive[j] + ", ");
            }
        }
        System.out.println();

        for (int l = thirdMassive.length - 1; l >= 0; l--) {
            if (l == 0) {
                System.out.print(thirdMassive[l]);
            } else {
                System.out.print(thirdMassive[l] + ", ");
            }
        }
        System.out.println();

        System.out.println("Задание №4");
        for (int m = 0; m < firstMassive.length; m++) {
            if (firstMassive[m] % 2 != 0) {
                firstMassive[m]++;
            }
        }
        System.out.println(Arrays.toString(firstMassive));

    }
}
