class A1P3 {
    public static void main(String[] args) {
        int a = 10;
        Integer obj = Integer.valueOf(a);
        System.out.println("int to Integer: " + obj);
        System.out.println("Integer to int: " + obj.intValue());
        System.out.println("Parse int: " + Integer.parseInt("42"));
        System.out.println("Max int: " + Integer.MAX_VALUE);

        String s = "Hello";
        s = s + " World";
        System.out.println("String: " + s);

        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        sb.insert(5, ",");
        sb.reverse();
        System.out.println("StringBuffer: " + sb);
    }
}
