package FirstHomeWork;

public class Tesla implements ICar{

    @Override
    public void energyType() {
        System.out.println("Tesla uses Electric");
    }

    @Override
    public void navigation() {
        System.out.println("Tesla has a navigation");
    }

    @Override
    public void autoPilot() {
        System.out.println("Tesla has an AutoPilot");
    }
    @Override
    public void bluetooth(){
        System.out.println("Tesla has a bluetooth connection");
    }
    public void playMario(){
        System.out.println("In Tesla you can play mario");
    }
    @Override
    public void idNo(){
        System.out.println("45664FGHQ123");
    }

}
