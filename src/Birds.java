public class Birds extends Animal{
    private Integer flySpeed;
    public Birds() {
        //super(age);
    }
    public Integer getFlySpeed() {
        return this.flySpeed;
    }

    public void setFlySpeed(Integer newFlySpeed){
        this.flySpeed = newFlySpeed;
    }

    public void describe(){
        System.out.println("Birds fly");
    }
}
