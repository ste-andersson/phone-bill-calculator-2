package phonebillcalculator;

public class PhoneBill {
    private int id;
    private double baseCost;
    private int allottedMinutes;
    private int minutesUsed;
    private static final double TAX_RATE = 0.15;
    private static final double OVERAGE_RATE = 0.25;

    public PhoneBill(int id, double baseCost, int allottedMinutes, int minutesUsed) {
        this.id = id;
        this.baseCost = baseCost;
        this.allottedMinutes = allottedMinutes;
        this.minutesUsed = minutesUsed;
    }
    public PhoneBill(int id) {
        this.id = id;
        this.baseCost = 85.5;
        this.allottedMinutes = 100;
        this.minutesUsed = 120;
    }

    public PhoneBill() {
        this.id = 34567;
        this.baseCost = 85.5;
        this.allottedMinutes = 100;
        this.minutesUsed = 120;
    }
}
