package lab6;

public class CalculatorSimulator {
	 public static void main(String[] args) {

	        // Create object
	        TaxCalculator t = new TaxCalculator();

	        try {

	            // Call calculateTax method
	            double tax = t.calculateTax("Ron", true, 34000);

	            // Print tax amount
	            System.out.println("Tax Amount is: " + tax);

	        }

	        // Handle country exception
	        catch (CountryNotValidException e) {
	            System.out.println(e.getMessage());
	        }

	        // Handle employee name exception
	        catch (EmployeeNameInvalidException e) {
	            System.out.println(e.getMessage());
	        }

	        // Handle tax exception
	        catch (TaxNotEligibleException e) {
	            System.out.println(e.getMessage());
	        }
	    }
}
