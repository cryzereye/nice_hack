package com.misys.tiplus2.customizationupgrader;

import java.io.File;
import java.util.Scanner;


public class Parser {
	// customized <tag name, used of not>
	// must reset every loop of message
	public Parser(String url, WordSearch dummy) {
		// loops all files within URL
		File xrp_dir = new File(url);
		for(File mini : xrp_dir.listFiles()){
			try{
				// scan per file
				Scanner scan = new Scanner(mini);
				// scan per line
				while(scan.hasNext()){
					// tokenize
				}
			}
			catch(Exception e){
				
			}
		}
	}
	
	private Boolean parseFile(File file){
		return true;
	}
}