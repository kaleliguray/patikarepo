public class PatternBasedMethod {

    public static void recursivePatter(int number, int recursiveNumber, boolean flag){

        System.out.print(recursiveNumber + " ");

        if (flag == false && number == recursiveNumber){
            return;
        }
        if (flag){
            if (recursiveNumber - 5 > 0){
                recursivePatter(number, recursiveNumber - 5, true);
            }else {
                recursivePatter(number, recursiveNumber - 5, false );
            }
        } else {
            recursivePatter(number, recursiveNumber + 5, false);
        }


    }

    public static void main(String[] args) {

        int number = 15;

        recursivePatter(number, number, true);


    }



}



























