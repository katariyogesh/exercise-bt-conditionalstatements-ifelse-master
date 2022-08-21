package com.stackroute.basics;

import java.util.Scanner;

public class StringFinder {
    //Create Scanner object as instance variable
	Scanner value = new Scanner(System.in);

    public static void main(String[] args) {
        //Get three strings from the user
    	System.out.println(new StringFinder().getInput());
    }

    public String getInput() {
    	String searchString = value.next();
    	String firstString = value.next();
    	String secondString = value.next();
    	new StringFinder().closeScanner();
    	int result1 = new StringFinder().findString(searchString, firstString, secondString);
    	return new StringFinder().displayResult(result1);
    	 
       
    }

    public String displayResult(int result) {
    	String res= "";
        if(result==1) {
        	res="Found as expected";
        }
        else if(result==0) {
        	res="Not found";
        }
        else if(result== -1) {
        	res="Empty string or null";
        }
		return res;
    }
    int result ;
    public int findString(String searchString, String firstString, String secondString) {
    	
    	if(((searchString == "" || searchString == null)) || (firstString == "" ||firstString== null) ||(secondString == "" ||secondString== null)) {
        	result = -1;
    	}
    	else if(searchString.indexOf(secondString)>searchString.indexOf(firstString)) {
        	result = 1;
        }
        else {
        	result = 0;
        }
    	//System.out.println(result);
		return result;
    }

    public void closeScanner() {
    	
		value.close();
    }
}
