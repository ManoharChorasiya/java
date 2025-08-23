class VowelWordCountManual {
    public static void main(String[] args) {
        String str = "Apple is an orange umbrella under eagle tree";
        str = str.toLowerCase(); // to ignore case

        int count = 0;
        String word = "";
        char ch;

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);

            if (ch != ' ') {  
                // build word manually
                word = word + ch;
            } else {
                // word finished → check first letter
                if (word.length() > 0) {
                    char first = word.charAt(0);
                    if (first == 'a' || first == 'e' || first == 'i' || first == 'o' || first == 'u') {
                        count++;
                    }
                }
                word = ""; // reset word
            }
        }

        // check last word (since no space after it)
        if (word.length() > 0) {
            char first = word.charAt(0);
            if (first == 'a' || first == 'e' || first == 'i' || first == 'o' || first == 'u') {
                count++;
            }
        }

        System.out.println("Number of words starting with vowel = " + count);
    }
}
