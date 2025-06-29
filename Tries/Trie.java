package Tries;
public class Trie
{
    private final TrieNode root;

    public Trie()
    {
     root= new TrieNode();
    }

   // insert word into the trie

    public  void insert(String word)
    {
        TrieNode current = root;

        for(char ch:word.toCharArray())
        {
            int index = ch-'a';

            if(current.children[index]==null)
            {
                // create a new node at the same index pointing
                current.children[index] = new TrieNode();

            }

            current = current.children[index];
        }
        current.endOfWord=true; // at the end mark word is completed true;
    }

    public boolean search(String word)
    {
        TrieNode current =root;

        for(char ch:word.toCharArray())
        {
            int index= ch-'a';

            if(current.children[index]==null)
            {
                return false;
            }

            current= current.children[index];
        }

        return  current.endOfWord;
    }

    // search satrt with

    public boolean startWith(String prefix)
    {
        TrieNode current = root;

        for(char ch:prefix.toCharArray())
        {
            int index =ch-'a';

            if(current.children[index]==null)
            {
                return false;
            }

          current = current.children[index];
        }

        return true;
    }

    // Main method for testing
    public static void main(String[] args) {
        Trie trie = new Trie();

        String[] words = {"the", "a", "there", "their", "any", "thee"};

        for (String word : words) {
            trie.insert(word);
        }

        System.out.println("Search 'the': " + trie.search("the"));     // true
        System.out.println("Search 'these': " + trie.search("these")); // false
        System.out.println("Search 'their': " + trie.search("their")); // true
        System.out.println("Search 'thaw': " + trie.search("thaw"));   // false

        System.out.println("StartsWith 'th': " + trie.startWith("th")); // true
        System.out.println("StartsWith 'an': " + trie.startWith("an")); // true
        System.out.println("StartsWith 'ze': " + trie.startWith("ze")); // false
    }
}
