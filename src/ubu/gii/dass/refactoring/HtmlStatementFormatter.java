package ubu.gii.dass.refactoring;

public class HtmlStatementFormatter implements StatementFormatter {

	@Override
	public String header(String customerName) {
		return "<h1>Rentals for <em>" + customerName + "</em></h1><ul>\n";
	}

	@Override
	public String rentalLine(String movieTitle, double charge) {
		return "<li>" + movieTitle + ": " + charge + "</li>\n";
	}

	@Override
	public String footer(double totalCharge, int frequentPoints) {
		return "</ul><p>Amount owed is <em>" + totalCharge + "</em></p>\n" +
	               "<p>You earned <em>" + frequentPoints + "</em> frequent renter points</p>";
	}

}
