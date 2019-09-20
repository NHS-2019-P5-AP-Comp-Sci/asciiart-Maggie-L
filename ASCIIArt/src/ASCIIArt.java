/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using ASCII 
 * (American Standard Code for Information Interchange). Using the already created file 
 * named `ASCIIArt.java` write a program that outputs your artwork to the console. 
 * The goal of this project is to use ONLY what we have learned in Unit 1 to create 
 * anything you would like so be creative (and school appropriate). Artwork must also have a caption describing what it's depicting.  
 * 
 * For those of you who have dabbled in coding before, try to contain your code to 
 * just what we have discussed in this unit.  
 * 
 * @author Mr. Rasmussen 
 *
 */

// YOU CODE HERE :) 

public class ASCIIArt {
	public static void main (String [] args) {
		//This is putting the chicken together 
		talking();
		head();
		body();
		legsAndGrass();
	}
	public static void head() {
		//This draws the head of the chicken 
		System.out.println("     \\\\___");
		System.out.println("     /.__.\\");
		System.out.println("     \\ \\/ /");
	}
	public static void body() {
		//this draws the body of the chicken
		System.out.println("  '__/    \\");
		System.out.println("   \\-      )");
		System.out.println("    \\_____/");
	}
	public static void legsAndGrass() {
		//this draws the legs of the chicken 
		System.out.println("______|_|___________");
		System.out.println("      \" \"");
	}
	public static void talking () {
		//This draws the chicken saying hi 
		System.out.println("          ________");
		System.out.println("         (_ HI!___)");
		System.out.println("           )/");
	}
}