package Tries;

public class TrieNode
{
    TrieNode children[]  =  new TrieNode[26];
    boolean endOfWord;

    TrieNode()
    {
        endOfWord=false;

    }
}
