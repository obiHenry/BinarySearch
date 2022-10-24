public class Main {

    public static void main(String[] args){

        int[] intArray = {-22,-15,1, 7, 20, 35, 55};
        System.out.println(IterativeBinarySearch(intArray, 1));
        System.out.println(IterativeBinarySearch(intArray, 35));
        System.out.println(IterativeBinarySearch(intArray, 34893));
//        System.out.println(recursiveBinarySearch(intArray, 1));
//        System.out.println(recursiveBinarySearch(intArray, 35));
//        System.out.println(recursiveBinarySearch(intArray, 348));
    }

    public static  int IterativeBinarySearch(int[] input, int value){
        int start = 0;
        int end = input.length;

        while (start < end){
            int midpoint = (start + end)/ 2;
            System.out.println("midpoint  " + midpoint );

            if (input[midpoint] == value){
                return  midpoint;
            } else if (input[midpoint] < value) {
                start = midpoint +1;
            }else {
                end  = midpoint;
            }
        }

        return -1;
    }


    public static int recursiveBinarySearch(int [] input, int value){
        return  recursiveBinarySearch(input, 0, input.length, value);
    }

    public static int recursiveBinarySearch(int[] input, int start, int end, int  value){
        if (start >= end){
            return  -1;
        }

        int midPoint = (start + end) / 2;
        System.out.println("midpoint  "+ midPoint);

        if (input[midPoint] == value){
            return  midPoint;
        } else if (input[midPoint] < value) {

            return  recursiveBinarySearch(input, midPoint +1, end, value);

        }else {
            return recursiveBinarySearch(input, start, midPoint, value);
        }
    }
}
