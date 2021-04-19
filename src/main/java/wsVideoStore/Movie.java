package wsVideoStore;

public abstract class Movie
{
	public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

	public Movie(String title, int priceCode) {
		this.title = title;
		PriceCode = priceCode;
	}

	private String title;
	private int PriceCode;

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPriceCode() {
		return PriceCode;
	}

	public void setPriceCode(int priceCode) {
		this.PriceCode = priceCode;
	}

	public Movie(String title) {
		this.title 		= title;
	}
		
	public String getTitle () {
		return title;
	}

  public abstract double determineAmount(int daysRented);

  public abstract int determineFrequentRenterPoints(int daysRented);
}