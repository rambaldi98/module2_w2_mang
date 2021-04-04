public class ThemMang {

    public static int[] them(int[] arr, int x, int index) {
        int [] newarr = new int [arr.length + 1];
        int dem = 0;
        for(int  i = 0; i < arr.length; i ++) {
            if(index == i){
                dem ++;
                newarr[i] = x;
            }
            newarr[i + dem] = arr[i];

        }
        return newarr;
    }

    public static void main(String[] args) {
//        System.out.println(xoa(( new int[]{1,2,4 ,3,4,5}),4));
        for(int x : them( new int[]{5,2,4,3,4,5},25,3)) {
            System.out.println(x);
        }

    }
}
