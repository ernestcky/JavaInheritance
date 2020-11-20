class Animal {
    private int age;
    private double weight;

    public Animal(int a, double w) {
        this.age = a;
        this.weight = w;
    }

    public double getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void running() {
        System.out.println("Running");
    }

    public void eating() {
        System.out.println("Eat...Eat...Eat...");
    }
}
