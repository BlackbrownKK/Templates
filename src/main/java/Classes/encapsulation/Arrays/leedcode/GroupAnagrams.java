package Classes.encapsulation.Arrays.leedcode;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    /*Given an array of strings strs, group the anagrams together. You can return the answer in any order.
An Anagram is a word or phrase formed by rearranging the letters of a
 different word or phrase, typically using all the original letters exactly once.

 Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

     */

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> anagrams = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            anagrams.computeIfPresent(sorted, (k, v) -> {
                v.add(str);
                return v;
            });

            anagrams.computeIfAbsent(sorted, s -> new ArrayList<String>() {{
                add(str);
            }});
        }
        return new ArrayList<>(anagrams.values());
    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        groupAnagrams(strs).stream().forEach(System.out::println);

    }
}
