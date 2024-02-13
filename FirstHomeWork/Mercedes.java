package FirstHomeWork;

public class Mercedes implements ICar{
    @Override
    public void energyType() {
        System.out.println("Mercedes uses a diesel");
    }

    @Override
    public void navigation() {
        System.out.println("Mercedes have a navigation");
    }

    @Override
    public void autoPilot() {
        System.out.println("Mercedes doesn't have an AutoPilot");
    }
    @Override
    public void bluetooth(){
        System.out.println("Mercedes has a bluetooth connection");
    }
    @Override
    public void idNo(){
        System.out.println("8765EWDF1234");
    }
}
