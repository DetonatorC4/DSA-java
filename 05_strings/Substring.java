public class Substring {

    public static String getSubString(String str, int si, int ei) {
        String subStr = "";

        for (int i = si; i < ei; i++) {
            subStr += str.charAt(i);
        }

        return subStr;
    }

    public static void main(String[] args) {
        String str = "HelloWorld";

        System.out.println(getSubString(str, 0, 4));

        // using in-bulit function
        System.out.println(str.substring(0, 4));

    }
}
