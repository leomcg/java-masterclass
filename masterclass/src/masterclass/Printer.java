package masterclass;

public class Printer {
	private boolean isDuplex;
	private int tonerLevel = 100;
	private int pagesPrinted = 0;
	private int sheetsUsed = 0;
	public Printer(boolean isDuplex, int tonerLevel) {
		super();
		this.isDuplex = isDuplex;
		if(tonerLevel > 0 && tonerLevel <= 100) {
			this.tonerLevel = tonerLevel;
		}
	}
	
	public void print(int numberOfPages) {
		this.tonerLevel -= numberOfPages;
		if(this.tonerLevel <= 0) {
			System.out.println("Please refill toner!");
			return;
		}
		this.pagesPrinted += numberOfPages;
		if(this.isDuplex) {
			this.sheetsUsed += numberOfPages / 2;		
		} else {
			this.sheetsUsed += numberOfPages;
		}
		System.out.println("Toner level: " + this.tonerLevel);
		System.out.println("Pages printed: " + this.pagesPrinted);
		System.out.println("Sheets used: " + this.sheetsUsed);
	}
	
}
