package com.simba.hackerrank;

import java.util.*;
/*
*Given a set of words and a set of sentences (composed of those words), determine how many sentences can be created by rearranging the letters of each word in each input sentence, where rearranging words is only possible if the resulting word is also present in the input set of words.
Example
wordSet = ['listen', 'silent', 'it', 'is']
sentence = 'listen it is silent'
Note: The words in the set are unique, sentences are composed only of words from the word set and a sentence is composed of words separated by a single
Determine that the letters of listen can be rearranged into silent (i.e. these words are anagrams). Those two words can be replaced with each other. The four sentences that can be created are:
_ listen it is silent
- listen it is listen
_ silent it is silent
- silent it is listen
Function Description
Complete the countSentences function in the editor below.
countSentences has the following parameters: string wordSet[n]: an array of unique strings string sentences[m]: an array of strings
Returns:
int[]: an array of m integers that denote the number of sentences that can be formed from each sentence
Constraints
• 0<n≤ 105
• 1 ≤ length of each word ≤ 20
1 ≤ m ≤  1000
• 3s words in a sentence ≤ 20
• Each word is made up of characters in the range ascii[a-z].
the input parameters are a List of string wordset and a list of string sentences
Explanation 0
Words bats and tabs are anagrams, as well as cat and act
Sentence 1: For the sentence "cat the bats", the sentences that can be formed are:
cat the bats
act the bats
cat the tabs
act the tabs
Sentence 2. For the sentence "in the act", the sentences that can be formed are:
:black_circle: in the act
in the cat
Sentence 3. For the sentence "act tabs in", the sentences that can be formed are:
act tabs in
cat tabs in
• act bats in
• cat bats in
*/
public class SentenceAnagrams {
    public static List<Integer> countSentences(List<String> wordSet, List<String> sentences) {
        Map<String, Set<String>> anagramMap = new HashMap<>();
        // Populate a map with anagrams grouped together
        for (String word : wordSet) {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);
            anagramMap.putIfAbsent(sortedWord, new HashSet<>());
            anagramMap.get(sortedWord).add(word);
        }
        List<Integer> result = new ArrayList<>();
        // Check each sentence for anagrams and count the valid sentences
        for (String sentence : sentences) {
            String[] words = sentence.split(" ");
            int sentenceCount = 1;
            for (String word : words) {
                char[] charArray = word.toCharArray();
                Arrays.sort(charArray);
                String sortedWord = new String(charArray);
                if (anagramMap.containsKey(sortedWord)) {
                    sentenceCount *= anagramMap.get(sortedWord).size();
                } else {
                    sentenceCount = 0;
                    break;
                }
            }
            result.add(sentenceCount);
        }
        return result;
    }
    public static void main(String[] args) {
        List<String> wordSet = Arrays.asList("listen", "silent", "it", "is");
        List<String> sentences = Arrays.asList("listen it is silent", "silent it is listen");
        List<Integer> result = countSentences(wordSet, sentences);
        System.out.println("Number of sentences that can be formed for each sentence:");
        for (int count : result) {
            System.out.println(count);
        }
    }
}
