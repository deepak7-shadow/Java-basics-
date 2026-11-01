import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        str1 = str1.toLowerCase().replaceAll("\\s+", "");
        str2 = str2.toLowerCase().replaceAll("\\s+", "");

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Strings are Anagrams");
        } else {
            System.out.println("Strings are not Anagrams");
        }
    }
}
