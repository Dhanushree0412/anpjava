package day8;

public class GroceryBill {

	public static void main(String[] args) {
		//--------Rice-------
		 String item1 = "Rice";
	        int quantity1 = 10;
	        float price1 = 60.0f;
	        int member1 = 1;

	        float subtotal1 = quantity1 * price1;

	        float discount1 = 0;
	        if (member1 == 1) {
	            discount1 = subtotal1 * 0.10f;
	        }

	        float afterDiscount1 = subtotal1 - discount1;

	        float gst1;
	        if (afterDiscount1 > 500) {
	            gst1 = afterDiscount1 * 0.05f;
	        } else {
	            gst1 = afterDiscount1 * 0.12f;
	        }

	        float total1 = afterDiscount1 + gst1;

	        System.out.println("Item Name: " + item1);
	        System.out.println("Subtotal: " + subtotal1);
	        System.out.println("Discount: " + discount1);
	        System.out.println("GST: " + gst1);
	        System.out.println("Final Total: " + total1);

	        System.out.println("---------------------------");

	        // ----------- Soap -----------
	        String item2 = "Soap";
	        int quantity2 = 3;
	        float price2 = 50.0f;
	        int member2 = 0;

	        float subtotal2 = quantity2 * price2;

	        float discount2 = 0;
	        if (member2 == 1) {
	            discount2 = subtotal2 * 0.10f;
	        }

	        float afterDiscount2 = subtotal2 - discount2;

	        float gst2;
	        if (afterDiscount2 > 500) {
	            gst2 = afterDiscount2 * 0.05f;
	        } else {
	            gst2 = afterDiscount2 * 0.12f;
	        }

	        float total2 = afterDiscount2 + gst2;

	        System.out.println("Item Name: " + item2);
	        System.out.println("Subtotal: " + subtotal2);
	        System.out.println("Discount: " + discount2);
	        System.out.println("GST: " + gst2);
	        System.out.println("Final Total: " + total2);
	}
}
