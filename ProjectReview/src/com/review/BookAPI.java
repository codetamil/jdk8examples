package com.review;

import java.util.ArrayList;
import java.util.Scanner;

public class BookAPI {
	
	public static void main(String[] args) {
		int temp=0,temp2=0;
	    
	    ArrayList<String> books=new ArrayList<String>();
	    books.add("java");
	    books.add("sql");
	    books.add("Dotnet");
	    System.out.println("Enter  book name to add:");
	    
	   
	    Scanner i=new Scanner(System.in);
	    String BookName=i.next();
	    
	   // books.add(BookName);
	    try
	    {
	    	for(temp=0;temp<books.size();temp++)
	    	{
	    	if(!BookName.equals(books.get(temp)))
	    	{
	    		books.add(BookName);
	    		break;
	    	}
	    	else 
	        throw new Exception(" Book Already exists");
	    	}
	    }
	    
	    catch(Exception e)
	    {
	    	System.out.println(e);
	    }
	    
	    
	    
	    
	    System.out.println("Enter book you want to search");
	    String searchBook=i.next();
	    try
	    {
	    	for(temp2=0;temp2<books.size();temp2++)
	    	{
	    	if(searchBook.equals(books.get(temp)))
	    	{
	    		System.out.println("Is at"+books.indexOf(searchBook));
	    	}
	    	else 
	        throw new Exception();
	    	}
	    }
	    catch(Exception e)
	    {
	    	System.out.println("Book not available" + e);
		}
		}

}
