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
		    return true;
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

	//return 0;
	numWords(children,0);

    }
    public int numWordsHelper(LexiconNode l, int c){
	//to be honest I'm not sure this will work the way I expect it too
	//I have a fear that the base case would be the problem
	if(!(l.hasNext())){
	    if(l.isWord) c++;
	    return c;
	}
	else {
	    while(l.hasNext()){
	    LexiconNode working = l.next()
	    if(working.isWord) c++;
	    c = c+numWordsHelper(working,c);
	    }
	    return c;
	}

    }

    public boolean containsWord(String word){

	//return true;
	LexiconNode working = children;
	for(int i = 0;i < word.length();i++){

	    if(working.hasChild(word.charAt(i))){

		working = working.getChild(word.charAt(i));

    if(i == (word.length()-1) && working.isWord()){

        return true;

    }

      }
	    else{

		return false;

	    }
	}

    }

    public boolean containsPrefix(String prefix){

	//return true;
  LexiconNode working = children;
  for(int i = 0;i < word.length();i++){

      if(working.hasChild(word.charAt(i))){

    working = working.getChild(word.charAt(i));

        if(i == (word.length()-1)){

          return true;

    }

      }
      else{

    return false;

      }
  }

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
