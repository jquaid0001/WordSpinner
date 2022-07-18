public class SpinWords {

    public String spinWords(String sentence) {
        if (sentence.length() < 5) {
            return sentence;
        } else if (!sentence.contains(" ")) {
            return String.valueOf(new StringBuilder(sentence).reverse());
        } else {
            // Split the sentence on whitespaces (one or more) then check to see if any
            // elements have length >5 and if so, reverse those elements. Then, join the
            // array of strings and return the spun sentence
            String[] splitted = sentence.split("\\s+");
            for (int word = 0; word < splitted.length; word++) {
                if (splitted[word].length() > 4) {
                    splitted[word] = String.valueOf(new StringBuilder(splitted[word]).reverse());
                }
            }
            return String.join(" ", splitted);
        }
    }
}