public class Jaden {
    public String toJadenCase(String phrase) {
        if (phrase == null || phrase.isEmpty()) {
        return null;
        }
        String[] words = phrase.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
        sb.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
        }
        return sb.toString().trim();
    }
}
