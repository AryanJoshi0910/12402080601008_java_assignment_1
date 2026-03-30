class Outer {
    int x = 10;

    class Member {
        void show() { System.out.println("Member inner class, x = " + x); }
    }

    void localMethod() {
        class Local {
            void show() { System.out.println("Local inner class, x = " + x); }
        }
        new Local().show();
    }

    interface Greet { void greet(); }

    void anonymousMethod() {
        Greet g = new Greet() {
            public void greet() { System.out.println("Anonymous inner class, x = " + x); }
        };
        g.greet();
    }
}

public class A1P7 {
    public static void main(String[] args) {
        Outer obj = new Outer();
        obj.new Member().show();
        obj.localMethod();
        obj.anonymousMethod();
    }
}
