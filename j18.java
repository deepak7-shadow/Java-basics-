class Main {
    public static void main(String[] args) {
        String text = "Java";
        String reversed = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }

        System.out.println("Original string: " + text);
        System.out.println("Reversed string: " + reversed);
    }
}
