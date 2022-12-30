// Java Program to Remove All Whitespaces.

class WhiteSpace {
    public static void main(String[] args) {
        String sentence = "Za  im   ZAMI  N.";
        System.out.println("Original sentence: " + sentence);

        sentence = sentence.replaceAll("\\s", "");
        System.out.println("After replacement: " + sentence);
    }
}
