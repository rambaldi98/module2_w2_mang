public class MaxMang {
    public static void main(String[] args) {
        int[] arr = new int [5];
//        System.out.println(arr[1]);
        System.out.println(findMax(arr));
    }
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int x : arr) {
            if(max < x)
                max = x;
        }
        return max;
    }


}
