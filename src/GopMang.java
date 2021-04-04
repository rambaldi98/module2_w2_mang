public class GopMang {

    public static int[] gopMang(int[] arr1, int[] arr2) {
        int[] newarr = new int[arr1.length + arr2.length];
        for(int i = 0; i < (arr1.length + arr2.length); i++) {
            if(i < arr1.length)
                newarr[i] = arr1[i];
            else
                newarr[i] = arr2[-arr1.length  + i];
        }
        return  newarr;
    }
    public static void main(String[] args) {
        for(int x : gopMang( new int[]{5,2,4,3,4,5},new int[] {1,2,3,4,5})) {
            System.out.println(x);
        }
    }
}
