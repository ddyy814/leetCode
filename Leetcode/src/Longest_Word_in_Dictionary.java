import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * (720) Longest Word in Dictionary
 *
 * Given a list of strings words representing an English Dictionary, find the longest word in words that can be built
 * one character at a time by other words in words. If there is more than one possible answer, return the longest word
 * with the smallest lexicographical order.
 *
 * If there is no answer, return the empty string.
 * Example 1:
 *
 * Input:
 * words = ["w","wo","wor","worl", "world"]
 * Output: "world"
 * Explanation:
 * The word "world" can be built one character at a time by "w", "wo", "wor", and "worl".
 * Example 2:
 *
 * Input:
 * words = ["a", "banana", "app", "appl", "ap", "apply", "apple"]
 * Output: "apple"
 * Explanation:
 * Both "apply" and "apple" can be built from other words in the dictionary. However, "apple" is lexicographically
 * smaller than "apply".
 *
 *
 * Note:
 *
 * All the strings in the input will only contain lowercase letters.
 * The length of words will be in the range [1, 1000].
 * The length of words[i] will be in the range [1, 30].
 *
 *
 * Time complexity:
 * Space complexity:
 *
 *
 * Easy level
 *
 */
public class Longest_Word_in_Dictionary {
    public String longestWord(String[] words){
        Arrays.sort(words);
        Set<String> buildWords = new HashSet<>();
        String result = "";
        for(String word : words){
            if(word.length() == 1 || buildWords.contains(word.substring(0, word.length() - 1))){
                if(word.length() > result.length())
                    result = word;
                buildWords.add(word);
            }
        }
        return result;
    }
}
