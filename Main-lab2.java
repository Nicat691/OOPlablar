public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal("Dog", 3, true, false);
        dog.info();

        Animal cat = new Animal("Cat", 7, true, false);
        cat.info();

        Animal eagle = new Animal();
        eagle.setName("Eagle");
        eagle.setAge(5);
        eagle.setRun(false);
        eagle.setFly(true);
        eagle.info();

    }
}