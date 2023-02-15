class Employee extends Person {
    int id;

    public Employee(String name, String gender, int id) {
        super(name, gender);
        this.id = id;
    }

    public void work() {
        System.out.println("Worker works");
    }
}
