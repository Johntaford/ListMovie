
public class ListMovies {

	private String title;
	@Override
	public String toString() {
		return "ListMovies [title=" + title + ", category=" + category + "]";
	}

	private String category;

	public ListMovies(String title, String category) {
		this.category = category;
		this.title = title;
	}

	public void settitle(String title) {
		this.title = title;

	}

	public String gettitle() {
		return title;
	}

	public void setcategory(String category) {
		this.category = category;

	}

	public String getcategory() {
		return category;
	}

}