public class StringCompression {

    public static String getCompressedString(String str) {
        String compressdStr = "";

        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            compressdStr += str.charAt(i);
            if (count > 1) {
                compressdStr += count.toString();
            }
        }

        return compressdStr;
    }

    public static void main(String[] args) {
        System.out.println(getCompressedString("AAABBCCCCDDD"));
    }
}
