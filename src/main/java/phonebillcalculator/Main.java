package phonebillcalculator;

public class Main {

    public static void main(String args[]) {
        PhoneBill bill1 = new PhoneBill();
        PhoneBill bill2 = new PhoneBill(23456);
        PhoneBill bill3 = new PhoneBill(34567, 85.5, 100, 120);
    }
}
