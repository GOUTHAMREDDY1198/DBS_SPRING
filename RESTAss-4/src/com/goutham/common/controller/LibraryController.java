package com.goutham.common.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.goutham.common.model.Library;


@RestController
@RequestMapping("/Library")
public class LibraryController {
	
	static ArrayList <Library> library = new ArrayList<Library>();
	static HashMap<Integer,Library> hm1 = new HashMap<Integer,Library>();
	static String display_books="";

	public static void createLibrary() {
//		Library b1= new Library (1,"It started with a friend request","Sudeep Nagarkar",350);
//		Library b2 =new Library (2,"The shiva Trialgy","Amish Tripathi",1500);
//		Library b3= new Library (3,"One Indian girl","Chetan Bagath",200);
//		Collections.addAll(library,b1,b2,b3);
//		
//		for(int i=0;i<library.size();i++) {
//			hm1.put(library.get(i).getId(),library.get(i));
//		}
	}
	
		@RequestMapping(value="/display_all")
		public String getBooks() {
			createLibrary();
			
			display_books="";
			for(Map.Entry<Integer,Library> books : hm1.entrySet()) {
				
				display_books= display_books + " ID: "+ books.getValue().getId() +" Name: "+ books.getValue().getName()+" Author: " + books.getValue().getAuthor() + " Cost: " + books.getValue().getCost()+"\r\n"+"  ";
				
			}
			return display_books;
		}
		
		@RequestMapping(value="display/{id}",method=RequestMethod.GET)
		public String display(@PathVariable int id) {
			
			return hm1.get(id).toString();
		}
		
		@RequestMapping(value="/addbook",method=RequestMethod.POST)
		public String insert(@RequestBody String book) {
//			System.out.println(book);
			Library b = new Library(Integer.parseInt(book.split("&")[0].split("=")[1]), 
									book.split("&")[1].split("=")[1],
									book.split("&")[2].split("=")[1],
									Integer.parseInt(book.split("&")[3].split("=")[1])
								   );
			library.add(b);
			hm1.put(b.getId(), b);
			return "Book added";
			
		}
		
		@RequestMapping(value="/updatebook",method=RequestMethod.POST)
		public String updateBook(@RequestBody String book) {
			Library b= hm1.get( Integer.parseInt(book.split("&")[0].split("=")[1] ));
					b.setCost(Integer.parseInt(book.split("&")[1].split("=")[1]));
			return "Book updated";
		}
		
		@RequestMapping(value="/deletebook",method=RequestMethod.POST)
		public String deleteBook(@RequestBody String id) {
			
			hm1.remove(Integer.parseInt(id.split("&")[0].split("=")[1]));
			return id;
		}
		
	
}