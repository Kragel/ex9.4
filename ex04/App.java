package t_09_interfaces.ex04;

public class App {

    static void call(AbstractClass obj)
    {
        // ((Derive) obj).print();
        obj.print();
    }

    public static void main(String[] args)
    {
        call(new Derive());
    }
}
