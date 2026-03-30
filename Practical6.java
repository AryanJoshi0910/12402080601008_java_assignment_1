abstract class Cipher {
    String text;
    Cipher(String text) { this.text = text; }
    abstract String encrypt();
    abstract String decrypt();
    void display() {
        System.out.println("Original: " + text);
        System.out.println("Encrypted: " + encrypt());
        System.out.println("Decrypted: " + decrypt());
    }
}

class CaesarCipher extends Cipher {
    int shift;
    CaesarCipher(String text, int shift) { super(text); this.shift = shift; }

    String encrypt() {
        StringBuilder sb = new StringBuilder();
        for (char c : text.toCharArray())
            sb.append(Character.isLetter(c) ? (char)((c - 'a' + shift) % 26 + 'a') : c);
        return sb.toString();
    }

    String decrypt() {
        StringBuilder sb = new StringBuilder();
        for (char c : encrypt().toCharArray())
            sb.append(Character.isLetter(c) ? (char)((c - 'a' - shift + 26) % 26 + 'a') : c);
        return sb.toString();
    }
}

class A1P6 {
    public static void main(String[] args) {
        new CaesarCipher("hello", 3).display();
    }
}
