package phonebillcalculator;

public class PhoneBill {
    //Fields
    private int id;
    private double baseCost;
    private int allottedMinutes;
    private int minutesUsed;
    private static final double TAX_RATE = 0.15;
    private static final double OVERAGE_RATE = 0.25;

    //Constructors
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

    //Methods get and set
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    public int getAllottedMinutes() {
        return allottedMinutes;
    }

    public void setAllottedMinutes(int allottedMinutes) {
        this.allottedMinutes = allottedMinutes;
    }

    public int getMinutesUsed() {
        return minutesUsed;
    }

    public void setMinutesUsed(int minutesUsed) {
        this.minutesUsed = minutesUsed;
    }

    //Methods calculations
    public double calculateOverageCost() {
        double overageCost;
        if(minutesUsed > allottedMinutes) {
            overageCost = (minutesUsed - allottedMinutes) * OVERAGE_RATE;
        } else {
            overageCost = 0;
        }
        return overageCost;
    }

    public double calculateTaxCost() {
        return (baseCost + calculateOverageCost()) * TAX_RATE;
    }

    public double calculateTotalCost() {
        return baseCost + calculateOverageCost() + calculateTaxCost();
    }
}
