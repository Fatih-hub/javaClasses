package com.class14;

public class StringMethodRecap {

	public static void main(String[] args) {
		//.replace
		String str="your Syntax Technologies";
		System.out.println(str.replace('y', 'i'));
		System.out.println("******************************");
		System.out.println(str.replace("your", "My"));
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		//replaceAll
		String str2="\n" + 
				"It’s bad enough to find a few fleas in your home, "
				+ "but it’s even worse when you realize there may be a lot more."
				+ " In fact, by the time you see a flea, there’s a good chance "
				+ "you have a full-blown flea infestation in your home. "
				+ "Adult fleas you can see, or are found on your pet, "
				+ "make up only 5% of a flea infestation. "
				+ "The remaining 95% consists of flea eggs, "
				+ "flea larvae and pupae hiding in your home and in your yard.";
		System.out.println(str2.replaceAll("find(.*)", ""));
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&");
		String str3="22345H454el6554l54o";
		System.out.println(str3.replaceAll("[0-9]",""));
		System.out.println(str3.replaceAll("[^0-9]",""));
		System.out.println(str3.replaceAll("[^a-zA-Z]",""));
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		System.out.println(str2.replaceFirst(" ", ""));

	}

}
