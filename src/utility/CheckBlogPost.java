package utility;

import model.Blog;

public class CheckBlogPost extends OffensiveWordsChecker implements OffensiveWordsInterface{
	
	String[] offensiveWords = {"ass", "bastard", "fuck", "anal", 
			"asshole", "bondage","boned", "boner", "climax", "bong", 
			"balls","cockmongruel", "boobs", "booby", "booger", "douche"
			, "douchebag", "ahole", "douche-fag", "douchewaffle"
			, "douchey", "drunk", "beaner"	, "cum", "bitch"};
	

	@Override
	public boolean checkBlogTitle(Blog blog) {
		// TODO Auto-generated method stub
		String btitle = blog.getBlogTitle().toLowerCase();
		for (String word : offensiveWords) {
			if (btitle.contains(word)) {
				return false;
			}
		}
		return true;
		
	}

	@Override
	public boolean checkBlogDescription(Blog blog) {
		// TODO Auto-generated method stub
		String btitle = blog.getBlogDescription().toLowerCase();
		for (String word : offensiveWords) {
			if (btitle.contains(word)) {
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean checkBlog(Blog blog) {
		// TODO Auto-generated method stub
		return checkBlogTitle(blog) && checkBlogDescription(blog);
	}
	
	
}