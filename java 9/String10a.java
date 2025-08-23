class VowelWordCount {
    public static void main(String[] args) {
        String str = "Apple is an orange umbrella under eagle tree";
        str = str.toLowerCase(); // convert to lowercase to handle case-insensitive check

        String words[] = str.split(" ");  // split into words
        int count = 0;

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 0) { // ensure word is not empty
                char first = words[i].charAt(0); // first letter of word
                if (first == 'a' || first == 'e' || first == 'i' || first == 'o' || first == 'u') {
                    count++;
                }
            }
        }

        System.out.println("Number of words starting with vowel = " + count);
    }
}
