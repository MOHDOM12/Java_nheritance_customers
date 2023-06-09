public class customer {
    private int ID;
    private String name;
    private char gender;

    public customer(int ID, String name, int discount)
    {
        this.ID = ID;
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "customer" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", gender=" + gender;
    }
}
