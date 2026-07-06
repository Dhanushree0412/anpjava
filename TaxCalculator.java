package lab6;

public class TaxCalculator {
	// Method to calculate tax
    public double calculateTax(String empName, boolean isIndian, double empSal)
            throws CountryNotValidException,
                   EmployeeNameInvalidException,
                   TaxNotEligibleException {

        // Variable to store tax
        double taxAmount = 0;

        // Check employee is Indian or not
        if (!isIndian) {
            throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax");
        }

        // Check employee name
        if (empName == null || empName.isEmpty()) {
            throw new EmployeeNameInvalidException("The employee name cannot be empty");
        }

        // Calculate tax
        if (empSal > 100000) {
            taxAmount = empSal * 0.08;
        }
        else if (empSal > 50000) {
            taxAmount = empSal * 0.06;
        }
        else if (empSal > 30000) {
            taxAmount = empSal * 0.05;
        }
        else if (empSal > 10000) {
            taxAmount = empSal * 0.04;
        }
        else {
            throw new TaxNotEligibleException("The employee does not need to pay tax");
        }

        // Return tax
        return taxAmount;
    }
}
