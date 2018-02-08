package com.misys.tiplus2.customizationupgrader;

public class WordSearch {
	private LetterNode root;
	public WordSearch(String[] words){
		int len = words.length;
		for(int i = 0; i < len; i++){
			if(root == null) {
				root = new LetterNode(words[i], 0);
			}
			else{
				
			}
		}
	}
	
	public Boolean search_word(String word){
		
		return false;
	}
}
