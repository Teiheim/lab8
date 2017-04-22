//Nevin Bernet and Teiheim Edwards

import structure5.*;
import java.util.Iterator;

public class LexiconTrie implements Lexicon{
    
    //Vector<LexiconNode> children = new Vector<LexiconNode>();
    private LexiconNode children = new LexiconNode();

    public boolean addWord(String word){

	//Something to Work With When LexiconNode.Java is Ready
		char c;
		LexiconNode node;
		LeixconNode working = children;
		//We might hit a indexoutofbounds
		for(int i = 0;i<word.length();i++){
		    
		    c = word.charAt((i));
		    node = new LexiconNode(c);
		    working.addChild(c);
		    if(i == word.legnth()-1){
		    working = working.getChild(c);
		    }
		    else {working = working.getChild(c,True);}
		}
    }

    public int addWordsFromFile(String filename){

	return 0;

    }

    public boolean removeWord(String word){

	return true;

    }

    public int numWords(){

	return 0;

    }

    public boolean containsWord(String word){

	return true;

    }

    public boolean containsPrefix(String prefix){

	return true;

    }

    public Iterator<String> iterator(){

	return null;

    }

    public Set<String> suggestCorrections(String target, int maxDistance){

	return null;

    }

    public Set<String> matchRegex(String pattern){

	return null;

    }

}
