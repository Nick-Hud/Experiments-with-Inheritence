public class Birds extends Animal{
    private Float flySpeed;
    public Birds() {
        super(age);
    }
    public Float getFlySpeed() {
        return this.flySpeed;
    }

    public void setFlySpeed(Float newFlySpeed){
        this.flySpeed = newFlySpeed;
    }

    public void describe(){
        System.out.println("Birds fly");
    }
}
