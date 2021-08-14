package tries;

public class Trie {
    private TrieNode root;
    private class TrieNode {
      private TrieNode[] children;
      boolean isWord;
      public TrieNode(){
          this.children = new TrieNode[26];
          this.isWord = false;
      }
    };
    public Trie(){
        root = new TrieNode();
    }
    public void insert(String word){
        if(word==null || word.isEmpty()){
            throw new IllegalArgumentException("Invalid input");
        }
        word = word.toLowerCase();
        TrieNode currentNode = root;
        for(int i=0;i<word.length();i++){
           char ch = word.charAt(i);
           int index = ch-'a';
           if(currentNode.children[index]==null){
               TrieNode node = new TrieNode();
               currentNode.children[index]=node;
               currentNode = node;
           }
           else {
               currentNode = currentNode.children[index];
           }
        }
        currentNode.isWord = true;
    }
    public boolean search(String word){
        TrieNode currentNode = root;
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            int index = ch-'a';
            if(currentNode.children[index]==null) return false;
            else currentNode = currentNode.children[index];
        }
       return currentNode.isWord;
    }
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("hello");
        System.out.println(trie.search("hello"));
        System.out.println(trie.search("hell"));
        trie.insert("hell");
        System.out.println(trie.search("hell"));
    }
};
