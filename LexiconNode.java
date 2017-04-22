//Nevin Bernet and Teiheim Edwards

import structure5.*;

public class LexiconNode implements Comparable{

    private boolean isWord;

    private char value;

    Vector<LexiconNode> children = new Vector<LexiconNode>();

    public LexiconNode(){

	isWord = false;
	//There was an error that you can't store null as a char. Switched it to the "null character"
	value = '\u0000';

    }

    public LexiconNode(char s){

	isWord = false;
	value = s;

    }

    public LexiconNode(char s, boolean v){

	isWord = v;
	value = s;

    }

    public void addChild(LexiconNode l){

	int count = 0;

	

	while(l.compareTo(children.get(count)) > -1)
	    count++;

	if(children.get(count).compareTo(l) == 0)
	    return;
	
	children.add(count, l);

    }

    public int compareTo(LexiconNode l){
	//There is a problem here that the thing can't be deferenced
	//Okay there is something wrong about the compareTo method 
	return(this.getValue().compareTo(l.getValue()));

    }

    public char getValue(){

	return value;

    }

    public boolean isWord(){

	return isWord;

    }

    public LexiconNode getChild(char c){

	return children.get(children.indexOf(c));

    }

    public boolean hasChild(char c){

	return children.contains(c);

    }

    public void removeChild(char c){

	children.remove(c);
	
    }

    public Iterator<LexiconNode> iterator(){

	return children.iterator();

    }

}
