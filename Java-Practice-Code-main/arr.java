import java.util.Arrays;
class arr{
    public static void sort(int[] arr){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


    }
    public static void main(String[] args){
        int [] numbers ={3,5,7,2};

        sort(numbers);
}
}