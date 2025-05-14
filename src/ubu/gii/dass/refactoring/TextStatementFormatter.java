package ubu.gii.dass.refactoring;

public class TextStatementFormatter implements StatementFormatter {

	@Override
	public String header(String customerName) {
		return "Rental Record for " + customerName + "\n";
	}

	@Override
	public String rentalLine(String movieTitle, double charge) {
		return  "\t" + movieTitle + "\t" + charge + "\n";
	}

	@Override
	public String footer(double totalCharge, int frequentPoints) {
		return  "Amount owed is " + totalCharge + "\n" +
	               "You earned " + frequentPoints + " frequent renter points";
	}

}
