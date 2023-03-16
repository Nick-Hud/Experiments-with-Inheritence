public class App {
    public static void main(String[] args) throws Exception {
        Animal dog = new Animal();
        dog.setAge(7);
        System.out.println(dog.getAge());
        Birds chicken = new Birds();
        chicken.setAge(2);
        chicken.setFlySpeed(10);
        System.out.println(chicken.getAge());
        System.out.println(chicken.getFlySpeed());
    }
}
