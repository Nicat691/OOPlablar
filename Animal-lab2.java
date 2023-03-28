public class Animal {
    private String name;
    private int age;
    private boolean isRun;
    private boolean isFly;

    public Animal() {
    }

    public Animal(String name, int age, boolean isRun, boolean isFly) {
        this.name = name;
        this.age = age;
        this.isRun = isRun;
        this.isFly = isFly;
    }

    public void info() {
        System.out.println("Animal: " +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isRun=" + isRun +
                ", isFly=" + isFly
        );
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isRun() {
        return isRun;
    }

    public void setRun(boolean run) {
        isRun = run;
    }

    public boolean isFly() {
        return isFly;
    }

    public void setFly(boolean fly) {
        isFly = fly;
    }
}
