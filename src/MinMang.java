public class MinMang {

    public static int minmang(int[] arr) {
        if(arr.length <= 0)
            return -1;
        int min  = arr[0];
        for(int x : arr) {
            if(x < min)
                min = x;
        }
        return min;
    }
    public static void main(String [] args) {
        int[] arr = {1,2,3,4,5,6,7,8,0,-1};

        System.out.println(minmang(arr));
    }

}
