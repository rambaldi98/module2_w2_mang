public class SVPass {
    public static int demPass(int[] arr) {
        if(arr.length <= 0)
            return -1;
        int count = 0;
        for(int x : arr) {
            if(x >= 5 && x <= 10)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(demPass( new int[] {1,2,3,4,5,6,7,8,9}));
    }
}
