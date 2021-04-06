public class XoaMang {
    public static int[] xoa(int[] arr, int x) {
        int [] newarr = new int [arr.length];
        int index = 0;
        for(int  i = 0; i < arr.length; i ++) {
            if(arr[i] == x) {
                index++;
                continue;
            }
            newarr[i - index] = (arr[i]);
        }
        return newarr;
    }


    public static void main(String[] args) {
//        System.out.println(xoa(( new int[]{1,2,4 ,3,4,5}),4));


        for(int x : xoa( new int[]{1,2,4,3,4,5},4)) {

        System.out.println(x);
    }

    }
}
