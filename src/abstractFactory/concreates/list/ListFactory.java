package abstractFactory.concreates.list;

import abstractFactory.abstracts.Link;
import abstractFactory.abstracts.Page;
import abstractFactory.abstracts.Tray;

public class ListFactory {
	public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
