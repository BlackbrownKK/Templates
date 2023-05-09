package Classes.encapsulation.Arrays.leedcode;

import java.util.*;

public class TopKFrequent {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 1, 2, 2, 3};
        topKFrequent(nums, 2);
    }

    public static int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];

        HashMap<Integer, Integer> hash_map = new HashMap<Integer, Integer>();
        for (int n : nums) {
            if (!hash_map.containsKey(n)) {
                hash_map.put(n, 1);
            } else {
                int newVal = hash_map.get(n) + 1;
                hash_map.put(n, newVal);
            }
        }
        for (int i : hash_map.keySet()) {
            System.out.println("key: " + i + " value: " + hash_map.get(i));
        }


        for (int i = 0; i < k; i++) {
            int keyMax = hash_map.entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getKey();
            System.out.println("num # " + i + "; max = " + keyMax);
            res[i] = keyMax;
            hash_map.remove(keyMax);

            for (int j : hash_map.keySet()) {
                System.out.println("key: " + i + " value: " + hash_map.get(j));
            }

        }
        return res;
    }
}
