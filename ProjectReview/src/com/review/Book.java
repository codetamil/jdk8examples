package com.review;

import java.util.ArrayList;
import java.util.Scanner;

public class Book {
	
	
	public static void main(String[] args) {

	    ArrayList<String> books=new ArrayList<String>();
	    System.out.println("Give book name");
	    Scanner i=new Scanner(System.in);
	    String nBook=i.nextLine();
	    int i1=0;
	    int i2=0;
	    
	    try
	    {
	    	for(i1=0;i1<=books.size();i1++)
	    	{
	    	if(nBook!=books.get(i1))
	    	{
	    		books.add(nBook);
	    		break;
	    	}
	    	else 
	        throw new Exception("Already exists");
	    	}
	    }
	    catch(Exception e)
	    {
	    	System.out.println(e);
	    }
	    System.out.println("Enter book you want to search");
	    String sBook=i.nextLine();
	    try
	    {
	    	for(i2=0;i2<=books.size();i2++)
	    	{
	    	if(sBook==books.get(i1))
	    	{
	    		System.out.println("Is at"+books.indexOf(sBook));
	    	}
	    	else 
	        throw new BookNotFoundException("Doesnt exist");
	    	}
	    }
	    catch(BookNotFoundException e)
	    {
	    	System.out.println(e);
		}
		}



}
