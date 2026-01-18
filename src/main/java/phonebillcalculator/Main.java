package phonebillcalculator;

public class Main {

    public static void main(String args[]) {
        PhoneBill bill1 = new PhoneBill();
        PhoneBill bill2 = new PhoneBill(23456);
        PhoneBill bill3 = new PhoneBill(34567, 85.5, 100, 120);

        bill1.setBaseCost(75);
        bill2.setMinutesUsed(15);
        bill2.setAllottedMinutes(200);

        System.out.println("### FIRST BILL ###");
        System.out.println(bill1);
        System.out.println("\n\n### SECOND BILL ###");
        System.out.println(bill2);
        System.out.println("\n\n### THIRD BILL ###");
        System.out.println(bill3);
    }
}
