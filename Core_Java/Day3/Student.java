package college.student;



    private String name;
    private int roll;

    public Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    public void displayName() {
        System.out.println("Student Name: " + name);
    }

    public void displayRoll() {
        System.out.println("Roll Number: " + roll);
    }


