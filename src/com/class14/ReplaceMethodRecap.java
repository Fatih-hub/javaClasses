package com.class14;

public class ReplaceMethodRecap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="\n" + 
				"It’s bad enough to find a few fleas in your home, "
				+ "but it’s even worse when you realize there may be a lot more."
				+ " In fact, by the time you see a flea, there’s a good chance "
				+ "you have a full-blown flea infestation in your home. "
				+ "Adult fleas you can see, or are found on your pet, "
				+ "make up only 5% of a flea infestation. "
				+ "The remaining 95% consists of flea eggs, "
				+ "flea larvae and pupae hiding in your home and in your yard.";

		
		System.out.println(str.toLowerCase().replace("flea", "Audio"));
		//This code firstly converts all str to lower case then replace all fleas to 
		//Audio
		
	}

}
