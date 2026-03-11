package LLD_HLD.HighLevelDesign.DesignATMSystem;

public abstract class ATMDispenser {
    protected ATMDispenser nextDispenser;

    public void setNextDispenser(ATMDispenser nextDispenser){
        this.nextDispenser = nextDispenser;
    }

    public abstract void dispense(int amount);


}
