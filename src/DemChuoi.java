import static sun.util.locale.LocaleUtils.isEmpty;

public class DemChuoi {
    public static int soKyTu(String str,char x) {
        boolean a = str.isEmpty();
        if(str.length() <= 0) {
            return -1;
        }
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(x == str.charAt(i)) {
                count++;
            }

        }
        return count;
    }




    public static void main(String[] args) {
        System.out.println(soKyTu("hello",'h'));
    }
}