//方法1
/*
class Trie {

    private class Node {
        Node[] childs = new Node[26];
        boolean isLeaf;
    }

    private Node root = new Node();
    
    /** Initialize your data structure here. */
    public Trie() {
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        insert(word, root);
    }

    private void insert(String word, Node node) {
        if (node == null){
            return;
        } 
        if (word.length() == 0) {
            node.isLeaf = true;
            return;
        }
        
        int index = indexForChar(word.charAt(0));
        if (node.childs[index] == null) {
            node.childs[index] = new Node();
        }
        insert(word.substring(1), node.childs[index]);
    }
     
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        return search(word, root);
    }

    private boolean search(String word, Node node) {
        if (node == null){
            return false;
        } 
        if (word.length() == 0){
            return node.isLeaf;
        } 
        int index = indexForChar(word.charAt(0));
        return search(word.substring(1), node.childs[index]);
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        return startWith(prefix, root);
    }

    private boolean startWith(String prefix, Node node) {
        if (node == null){
            return false; 
        } 
        if (prefix.length() == 0){
            return true;
        } 
        
        int index = indexForChar(prefix.charAt(0));
        return startWith(prefix.substring(1), node.childs[index]);
    }

    private int indexForChar(char c) {
        return c - 'a';
    }
}
*/
    
//方法2
class TrieNode {
    public TrieNode[] letters;
    public char val;
    public boolean isWord;
    
    public TrieNode() {
        this.letters = new TrieNode[26];
        this.isWord = false;
    }
}

class Trie {
    TrieNode head;
    
    /** Initialize your data structure here. */
    public Trie() {
        this.head = new TrieNode();
        this.head.val = ' ';
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode current = head;
        
        for(char c:word.toCharArray()) {
            if(current.letters[c-'a']==null) {
                current.letters[c-'a'] = new TrieNode();
                current.letters[c-'a'].val = (char)(c-'a');
            }
            current = current.letters[c-'a'];
        }
        current.isWord = true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode current = head;
        for(char c:word.toCharArray()) {
            if(current.letters[c-'a']==null){
                return false;
            } 
            current = current.letters[c-'a'];
        }
        return current.isWord;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode current = head;
        for(char c:prefix.toCharArray()) {
            if(current.letters[c-'a']==null){
                return false;
            }
            current = current.letters[c-'a'];
        }
        return true;
    }
}
    

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
