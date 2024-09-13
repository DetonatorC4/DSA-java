public class Operations {

    public static void getIthBit(int n, int index) {
        int bitMask = (1 << index);

        if ((n & bitMask) == 0) {
            System.out.println("The bit at index " + index + " is 0.");
        } else {
            System.out.println("The bit at index " + index + " is 1.");
        }
    }

    public static int setIthBit(int n, int index) {
        int bitMask = (1 << index);

        return (n | bitMask);
    }

    public static int clearIthBit(int n, int index) {
        int bitMask = (~(1 << index));

        return (n & bitMask);
    }

    public static int updateIthBit(int n, int index, int newBit) {
        if (newBit == 0) {
            return (clearIthBit(n, index));
        } else {
            return (setIthBit(n, index));
        }

        // approach2
        /*
         * n = clearIthBit(n, i);
         * int bitMask = newBit << i;
         * return n | bitMask;
         */
    }

    public static int clearLastIBits(int n, int index) {
        int bitMask = ~0 << index;

        return n & bitMask;
    }

    // important
    public static int clearIBits(int n, int startIndex, int endIndex) {
        int maskA = (~0) << endIndex + 1;
        int maskB = (1 << startIndex) - 1;
        int bitMask = maskA | maskB;

        return n & bitMask;
    }

    public static void main(String[] args) {
        // getIthBit(10, 3);

        // System.out.println(setIthBit(10, 2));

        // System.out.println(clearIthBit(29, 3));

        // System.out.println(updateIthBit(10, 2, 1));

        // System.out.println(clearLastIBits(15, 2));

        // System.out.println(clearIBits(10, 2, 4));
    }
}
