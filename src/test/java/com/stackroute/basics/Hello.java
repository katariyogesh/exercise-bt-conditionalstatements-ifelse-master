package com.stackroute.basics;

public class Hello {
	public static void main(String[] args)
	{
	System.out.println(new Hello().getInput());
//	System.out.println(hs.indexOf(s1));
//	System.out.println(hs.indexOf(s2));
	}
	public String getInput() {
	    	String searchString ="string does not comes later";
	    	String firstString = null;
	    	String secondString = "string";
	    	int result1 = new Hello().findString(searchString, firstString, secondString);
	    	return new Hello().displayResult(result1);
	    	 
	       
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
    	System.out.println(result);
		return result;
    }
	
}
