package ubu.gii.dass.refactoring;

import java.util.*;


public class Customer {
	private String _name;
	private List<Rental> _rentals;

	public Customer(String name) {
		_name = name;
		_rentals = new ArrayList<Rental>();
	}

	public void addRental(Rental arg) {
		_rentals.add(arg);
	}

	public String getName() {
		return _name;
	}

	public String statement() {
		return createStatementResult(new TextStatementFormatter());
	}
	
	public String htmlStatement() {
	    return createStatementResult(new HtmlStatementFormatter());
	}

	private String createStatementResult(StatementFormatter formatter) {
		double totalAmount = 0;
		int frequentRenterPoints = 0;
		StringBuilder result = new StringBuilder(formatter.header(getName()));

		for (Rental each : _rentals) {
			double thisAmount = each.getCharge();
			frequentRenterPoints += each.getFrequentRenterPoints();

			result.append(formatter.rentalLine(each.getMovie().getTitle(), thisAmount));

			totalAmount += thisAmount;
		}

		result.append(formatter.footer(totalAmount, frequentRenterPoints));

		return result.toString();
	}
}
