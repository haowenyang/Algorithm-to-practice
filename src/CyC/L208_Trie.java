package CyC;

public class L208_Trie {
    public class Node{
        private Node[] next;
        private char val;
        private boolean isend;
        Node(char c){
            next = new Node[26];
            this.val = c;
            isend = false;
        }
    }
    private  Node root;
    public L208_Trie() {
        root = new Node(' ');
    }
    public void insert(String word) {
        if (word==null||word.length()==0)
            return ;
        Node node = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (node.next[c-'a']==null){
                node.next[c-'a'] = new Node(word.charAt(i));
            }
            node = node.next[c-'a'];
        }
        node.isend=true;
    }
    public boolean search(String word) {
        Node node = root;
        if (word==null||word.length()==0)
            return false;
        for (int i = 0; i <word.length() ; i++) {
            char c = word.charAt(i);
            if (node.next[c-'a']==null){
                return false;
            }
            else {
                node = node.next[c-'a'];
            }
        }
        if (!node.isend)
            return false;
        return true;
    }

    public boolean startsWith(String prefix) {
        Node node = root;
        if (prefix.length()==0||prefix==null)
            return false;
        for (int i = 0; i <prefix.length() ; i++) {
            char c = prefix.charAt(i);
            if (node.next[c-'a']==null)
                return false;
            node=node.next[c-'a'];
        }
        return true;
    }
}
