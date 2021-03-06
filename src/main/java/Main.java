public class Main {

    public String[] nextLetterString(String[] input) {
        if (input == null || input.length == 0) {
            return new String[0];
        }

        final int ASCII_CODE_a = 97;
        final int ASCII_CODE_z = 122;
        String[] output = new String[input.length];

        for (int i = 0; i < input.length; i++) {
            String text = input[i];
            char[] letters = text.toLowerCase().toCharArray();
            StringBuilder formattedText = new StringBuilder();

            for (char letter: letters) {
                int currentAsciiCode = letter;

                if (currentAsciiCode < ASCII_CODE_a || currentAsciiCode > ASCII_CODE_z) {
                    continue;
                }

                formattedText.append((currentAsciiCode == ASCII_CODE_z) ? (char) ASCII_CODE_a : (char) (currentAsciiCode + 1));
            }

            output[i] = formattedText.toString();
        }

        return output;
    }

    public static void main(String[] args) {

        String[] input = {"abcdez","a b c", "a $ &", "% Pd @ez 4 !"};
        Main main = new Main();

        String[] output = main.nextLetterString(input);

        for(String text : output) {
            System.out.println(text);
        }
    }

}
