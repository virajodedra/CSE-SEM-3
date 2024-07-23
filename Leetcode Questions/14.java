// Write a function to find the longest common prefix string amongst an array of strings.

// If there is no common prefix, return an empty string "".

 

// Example 1:

// Input: strs = ["flower","flow","flight"]
// Output: "fl"
// Example 2:

// Input: strs = ["dog","racecar","car"]
// Output: ""
// Explanation: There is no common prefix among the input strings.

//solution is get by the 10% use of the chat gpt .
 


class Solution {
    static final int NumsOfChar = 26;

    class TrieNode {
        char data;
        TrieNode[] children = new TrieNode[NumsOfChar];

        TrieNode() {
            this.data = '\0'; 
        }

        TrieNode(char c) {
            this.data = c;
        }
    }

    TrieNode root = new TrieNode();

    void insert(String word) {
        TrieNode node = root;
        for (char ch : word.toCharArray()) {
            int index = ch - 'a';
            if (node.children[index] == null) 
                node.children[index] = new TrieNode(ch);
            node = node.children[index];
        }
    }

    String searchLongestCommonPrefix() {
        StringBuilder prefix = new StringBuilder();
        TrieNode node = root;
        while (true) {
            int childrenCount = 0;
            int nextChildIndex = -1;

            for (int i = 0; i < NumsOfChar; i++) {
                if (node.children[i] != null) {
                    childrenCount++;
                    nextChildIndex = i;
                }
            }

            if (childrenCount != 1 ) {
                break;
            }

            node = node.children[nextChildIndex];
            prefix.append((char) (nextChildIndex + 'a'));
        }
        return prefix.toString();
    }

    public String longestcommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        for (String str : strs) {
            insert(str);
        }
        String prefix = searchLongestCommonPrefix();
        for (String str : strs) {
            if (!str.startsWith(prefix)) {
                return "";
            }
        }
        return prefix;
    }

    public String longestCommonPrefix(String[] strs) {
        Solution s = new Solution();
        for (int i = 0; i < strs.length; i++) {
            s.insert(strs[i]);  
        }
        String str = s.longestcommonPrefix(strs);
        return str;  
    }
}
