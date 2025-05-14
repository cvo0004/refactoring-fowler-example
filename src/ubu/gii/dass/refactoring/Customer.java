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
		double totalAmount = 0;
		int frequentRenterPoints = 0;
		StringBuilder result = new StringBuilder("Rental Record for " + getName() + "\n");

		for (Rental each : _rentals) {
			double thisAmount = each.getCharge();
			frequentRenterPoints += each.getFrequentRenterPoints();

			result.append("\t")
			      .append(each.getMovie().getTitle())
			      .append("\t")
			      .append(thisAmount)
			      .append("\n");

			totalAmount += thisAmount;
		}

		result.append("Amount owed is ").append(totalAmount).append("\n");
		result.append("You earned ").append(frequentRenterPoints).append(" frequent renter points");

		return result.toString();
	}
}
