package Factory;

public class Blog extends Website {

	public void createWebsite() {
		
		pages.add(new PostPage());
		pages.add(new AboutPage());
		pages.add(new ContactPage());
		pages.add(new CommentPage());

	}

}
