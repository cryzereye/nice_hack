package com.misys.tiplus2.customizationupgrader;

import java.util.ArrayList;


public class LetterNode {
	
	private ArrayList<LetterNode> children;
	private char letter;
	
	public LetterNode(String word, int index){
		children = new ArrayList<LetterNode>();
		this.letter = letter;
	}
	
	public LetterNode getChild(LetterNode node){
		return this;
	}
}
