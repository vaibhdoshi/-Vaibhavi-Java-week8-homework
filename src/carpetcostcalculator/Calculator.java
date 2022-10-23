package carpetcostcalculator;

public class Calculator {

    private Carpet carpet;
    private Floor floor;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet=carpet;
    }

    public double getTotalCost() {
        return floor.getArea() * carpet.getTotalCost();

    }
}
