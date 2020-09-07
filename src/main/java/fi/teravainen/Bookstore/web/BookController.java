package fi.teravainen.Bookstore.web;

import java.awt.print.Book;
import java.util.ArrayList;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class BookController {

	
	public ArrayList <String> books = new ArrayList<String>();
	
	@GetMapping(value = "index")
	public String askName(Model model) {
		model.addAttribute("books", new Book());
		return "aksBook";
	}
	
	@PostMapping(value = "save")
	public String insertData(@RequestParam(required = false) String book, Model model) {
		
		if (book != null && book.length() >=3) {
	}
		
		model.addAttribute("books", books);
		return "bookInfo";
}
}
