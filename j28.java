class Main {
    public static void main(String[] args) {
        String text = "Java is a programming language";

        String[] words = text.trim().split("\\s+");

        System.out.println("Number of words: " + words.length);
    }
}
