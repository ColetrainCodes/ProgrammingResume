public class TimeDemo {

    public static void main(String[] args) {

        Time t1 = new Time();
        Time t2 = new Time();

        int a = 17, b = 8, c = 20;

        t1.set(a,b,c);
        t2.set(23,59,59);

        t1.tick();
        t2.tick();

        t2.tick();

        String s1 = t1.toString();
        String s2 = t2.toString();

        System.out.println(s1);
        System.out.println(s2);
    }
}