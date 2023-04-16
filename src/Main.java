public class Main {
    public static void main(String[] args)
    {
        customer c1= new customer(11, "mohammed",50);
        Account a1 = new Account(1112891872,c1, 42000);
        System.out.println(a1.toString());
    }
}