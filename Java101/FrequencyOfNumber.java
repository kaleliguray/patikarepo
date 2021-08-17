public class FrequencyOfNumber {

    public static void main(String[] args) {

        int[] arrays = {10, 20, 20, 10, 10, 20, 5, 20};

        int ten = 0, twenty = 0, five = 0;

        for (int i = 0; i < arrays.length - 1; i++) {

            if (arrays[i] == 10) {
                ten++;
            } else if (arrays[i] == 20) {
                twenty++;
            } else if (arrays[i] == 5) {
                five++;
            }

        }

        System.out.println("10 sayısı " + ten + " kere tekrar etmiştir.");
        System.out.println("20 sayısı " + twenty + " kere tekrar etmiştir.");
        System.out.println("5 sayısı " + five + " kere tekrar etmiştir.");

    }

}



















