package singleton;

public class Main {
    public static void main (String [] args)
    {
        Singleton s = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(s == s2);
    }
}
