package FirstHomeWork;

public class Skoda implements ICar{
    @Override
    public void energyType() {
        System.out.println("Skoda needs gas");
    }

    @Override
    public void navigation() {
        System.out.println("Skoda is to old has not navigation");
    }

    @Override
    public void autoPilot() {
        System.out.println("Skada has not AutoPilot");
    }

    @Override
    public void bluetooth() {
        System.out.println("No Bluetooth");
    }
    @Override
    public void idNo(){
        System.out.println("23441SDFA23441");
    }
}
