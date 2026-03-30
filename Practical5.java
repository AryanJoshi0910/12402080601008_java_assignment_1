class Match {
    String team1, team2;
    Match(String t1, String t2) { team1 = t1; team2 = t2; }
    void display() { System.out.println("Match: " + team1 + " vs " + team2); }
}

class TestMatch extends Match {
    int days;
    TestMatch(String t1, String t2, int days) { super(t1, t2); this.days = days; }
    void display() { super.display(); System.out.println("Type: Test | Days: " + days); }
}

class ODI extends Match {
    int overs;
    ODI(String t1, String t2, int overs) { super(t1, t2); this.overs = overs; }
    void display() { super.display(); System.out.println("Type: ODI | Overs: " + overs); }
}

class A1P5 {
    public static void main(String[] args) {
        String t1 = args.length > 0 ? args[0] : "India";
        String t2 = args.length > 1 ? args[1] : "Australia";
        new TestMatch(t1, t2, 5).display();
        new ODI(t1, t2, 50).display();
    }
}
