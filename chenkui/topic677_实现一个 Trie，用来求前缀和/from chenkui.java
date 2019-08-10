//方法1
/*
class MapSum {

    private class Node {
        Node[] child = new Node[26];
        int value;
    }

    private Node root = new Node();

    /** Initialize your data structure here. */
/*
    public MapSum() {

    }

    public void insert(String key, int val) {
        insert(key, root, val);
    }

    private void insert(String key, Node node, int val) {
        if (node == null) return;
        if (key.length() == 0) {
            node.value = val;
            return;
        }
        
        int index = indexForChar(key.charAt(0));
        if (node.child[index] == null) {
            node.child[index] = new Node();
        }
        insert(key.substring(1), node.child[index], val);
    }

    public int sum(String prefix) {
        return sum(prefix, root);
    }

    private int sum(String prefix, Node node) {
        if (node == null) return 0;
        if (prefix.length() != 0) {
            int index = indexForChar(prefix.charAt(0));
            return sum(prefix.substring(1), node.child[index]);
        }
        
        int sum = node.value;
        for (Node child : node.child) {
            sum = sum + sum(prefix, child);
        }
        return sum;
    }

    private int indexForChar(char c) {
        return c - 'a';
    }
}
*/

class MapSum {

    class Trie {
        int sum = 0;
        boolean isWord;
        Trie[] children = new Trie[26];
    }
    
    HashMap<String, Integer> map;
    Trie root;
    
    /** Initialize your data structure here. */
    public MapSum() {
        root = new Trie();
        map = new HashMap<>();
    }
    
    public void insert(String key, int val) {
        int curnum = 0;
        if (map.containsKey(key)) {
            curnum = map.get(key);
        }
        
        map.put(key, val);
        Trie[] children = root.children;
        
        for (int i = 0; i < key.length(); i++) {
            char ch = key.charAt(i);
            
            if (children[ch-'a'] == null) {
            	children[ch-'a'] = new Trie();
            }
            
            Trie temp = children[ch-'a'];
            temp.sum -= curnum;
            temp.sum += val;
            children = temp.children;
            
            if ( i == key.length()-1 ) { 
                temp.isWord = true; 
            }
        }
    }
    
    public int sum(String prefix) {
        Trie[] children = root.children;
        for (int i = 0; i < prefix.length(); i++) {
            char ch = prefix.charAt(i);
            Trie temp = children[ch-'a'];
            if (temp == null) {
                return 0;
            } 
            else {
                if ( i == prefix.length()-1 ){
                   return temp.sum; 
                } 
            }
            children = temp.children;
        }
        
        return 0;
    }
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */