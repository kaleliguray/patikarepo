public class PrimeNumber {

    public static void main(String[] args) {

        System.out.println("Prime Numbers 0 to 100");

        // begin the loop at 2 since the minimum prime number is 2
        for (int i = 2; i <= 100; i++){

            boolean isPrime = true;
            for (int j = 2; j <= i/2; j++){

                if ( i % j == 0){
                    isPrime = false;
                    break;
                }

            }

            if (isPrime == true){
                System.out.print(" "+i);
            }

        }



    }
}















