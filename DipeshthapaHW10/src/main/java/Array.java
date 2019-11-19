
/**
 *Dipesh Thapa
 * CSCI 295
 * HW 10
 * 
 *
 */
public class Array {

    public static void main(String[] args) {

        int array[] = {1, -25, 4, 5, 100,6, -14, 66, 4, 5, 67, -8, 0};  // Same array used for all method

        System.out.println(" Maximum Value = " + getMax(array));
        System.out.println(" Minimum Value = " + getMin(array));
        System.out.printf(" The index of the largest value in the array is at %dth Place %n", getMaxIndex(array));
        System.out.printf(" The index of the smallest value in the array is at %dth  Place  ", getMinIndex(array));

    }

    public static int getMax(int[] array) {
        int maxValue = array[0];

        for (int i = 1; i < array.length; i++) {

            if (array[i] > maxValue) {
                maxValue = array[i];
            }

        }
        return maxValue;
    }

    public static int getMin(int[] array) {
        int minValue = array[0];

        for (int i = 1; i < array.length; i++) {

            if (array[i] < minValue) {
                minValue = array[i];
            }

        }
        return minValue;
    }

    public static int getMaxIndex(int[] array) {
        int maxValue = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (maxValue < array[i]) {
                maxValue = array[i];
                index = i;
            }
        }
        return index;

    }

    public static int getMinIndex(int[] array) {
        int minValue = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (minValue > array[i]) {
                minValue = array[i];
                index = i;
            }
        }
        return index;

    }


}
