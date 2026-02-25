public class SolutionDay24_2 {

    public String intToRoman(int num) {

        int[] values = {
            1000, 900, 500, 400,
            100, 90, 50, 40,
            10, 9, 5, 4, 1
        };

        String[] symbols = {
            "M", "CM", "D", "CD",
            "C", "XC", "L", "XL",
            "X", "IX", "V", "IV", "I"
        };

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                result.append(symbols[i]);
                num -= values[i];
            }
        }

        return result.toString();
    }

    public static void main(String args[]) {

        SolutionDay24_2 s1 = new SolutionDay24_2();

        int num = 3764;

        System.out.println("Output is : "+s1.intToRoman(num)); // MMMDCCLXIV
    }
}