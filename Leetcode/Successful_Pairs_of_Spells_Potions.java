import java.util.Arrays;

public class Successful_Pairs_of_Spells_Potions {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length;
        int m = potions.length;
        int[] arr = new int[n];

        Arrays.sort(potions);  // Sort potions once

        for (int i = 0; i < n; i++) {
            long minPotion = (success + spells[i] - 1) / spells[i];  // ceil(success / spells[i])
            int index = binarySearch(potions, minPotion);
            arr[i] = m - index;  // All potions from index to end are valid
        }

        return arr;
    }

    public int binarySearch(int[] potions, long target) {
        int left = 0;
        int right = potions.length - 1;
        int index = potions.length; // Default to length if none found

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (potions[mid] >= target) {
                index = mid;       // Possible answer, search left
                right = mid - 1;
            } else {
                left = mid + 1;    // Too small, search right
            }
        }

        return index;
    }
}

