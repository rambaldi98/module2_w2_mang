public class TongCot {
    public static int tongCot(int[][] arr, int x) {
        if (arr.length <= 0 | x < 0)
            return -1;
        int dem = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length -1 >= x){
                dem += arr[i][x];
            }
            continue;
        }
        return dem;
    }
    public static void main(String[] args) {
        System.out.println(tongCot( new int[][] {{1,2,3,4}, {-1,6,7,8}, {3,15,6},{1,2,3,4,5,6}},2));
    }
}
