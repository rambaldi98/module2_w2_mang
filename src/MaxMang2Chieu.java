public class MaxMang2Chieu {
    public static String max(int[][] arr) {

        int x = 0;
        int y = 0;
        int max = arr[0][0];
        String a ="";
        for(int i = 0; i < arr.length; i ++) {
            for (int j = 0; j < arr[i].length; j ++) {
                if(max < arr[i][j]){
                    max = arr[i][j];
                    x = i;
                    y = j;
                }

            }
        }
        a = String.valueOf(max) + " " + String.valueOf(x) + " " +String.valueOf(y) ;
        return a;
    }

    public static String min(int[][] arr) {

        int x = 0;
        int y = 0;
        int min = arr[0][0];
        String a ="";
        for(int i = 0; i < arr.length; i ++) {
            for (int j = 0; j < arr[i].length; j ++) {
                if(min > arr[i][j]){
                    min = arr[i][j];
                    x = i;
                    y = j;
                }

            }
        }
        a = String.valueOf(min) + " " + String.valueOf(x) + " " +String.valueOf(y) ;
        return a;
    }

    public static void main(String[] args) {
        String a = min( new int[][] {{1,2,3,4}, {-1,6,7,8},{3,15,6}} );
        System.out.println(a);
    }
}
