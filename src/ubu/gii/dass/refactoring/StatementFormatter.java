package ubu.gii.dass.refactoring;

public interface StatementFormatter {
    String header(String customerName);
    String rentalLine(String movieTitle, double charge);
    String footer(double totalCharge, int frequentPoints);
}
