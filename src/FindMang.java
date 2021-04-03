public class FindMang {
    public static void main(String[] args) {
        String[] str = {"hoa", "qua", "noi", "gian"};
        System.out.println(findString(str,"hoa"));
    }

    public static int findString(String[] str, String x) {
        if(str.length <= 0)
                return -2;
        for(int i = 0; i < str.length; i++) {
            if(str[i].equals(x)){
                return i+1;
            }
        }

        return -1;
    }
}
