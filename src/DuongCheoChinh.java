public class DuongCheoChinh {
    public static int duongCheoChinh(int[][] arr) {
        if(arr.length <= 0)
            return -1;
        int tong = 0;
        for (int i = 0; i < arr.length; i++) {
            tong += arr[i][i];
        }
        return tong;
    }
    public static void main(String[] args) {
        System.out.println(duongCheoChinh(new int[][]{{1, 2, 3, 4}, {1, 6, 7, 8}, {3, 15, 6,4}, {1, 2, 3, 4}}));
    }
}
