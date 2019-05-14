package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class Composicao2 {
	public static void main(String[]args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("Wow that's awesome!");
		Post p1 = new Post(
				sdf.parse("21/06/218 13:05:44"),
				"Traveling to new zealand",
				"I'm going to visit...",
				12);
		p1.addComment(c1);
		p1.addComment(c2);
		
		
		System.out.println(p1);
	}
}
