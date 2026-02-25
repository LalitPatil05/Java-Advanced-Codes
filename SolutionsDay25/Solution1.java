import java.util.*;

public class Solution1 {
    public int[] sortByBits(int[] arr) {

        Integer[] temp = new Integer[arr.length];

        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }

        Arrays.sort(temp, (a, b) -> {
            int bitsA = Integer.bitCount(a);
            int bitsB = Integer.bitCount(b);

            if (bitsA == bitsB) {
                return a - b;
            }
            return bitsA - bitsB;
        });

        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }

        return arr;
    }

    public static void main(String[] args) {

        int[] arr = {0,1,2,3,4,5,6,7,8};

        Solution1 obj = new Solution1();
        int[] result = obj.sortByBits(arr);

        // print array
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
    
}