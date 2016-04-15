import java.util.Random;

public class Text {
<<<<<<< HEAD
=======

    private static int _numberOfFiles = 0;
    private int _numberOfWords;
    private int _id;
    private String _sourceText;
    private String[] _sourceWords;
>>>>>>> olag-second

    private static int numberOfFiles = 0;
    private int id;
    private String sourceText;
    private TextWordsSet textWordsSet;

    public Text(){
        id = numberOfFiles;
        numberOfFiles++;
        sourceText = concatenateWords(generateRandomWords(500));
    }

    private static String[] generateRandomWords(int numberOfWords) {
        String[] randomStrings = new String[numberOfWords];
        Random random = new Random();
        for(int i = 0; i < numberOfWords; i++)
        {
            char[] word = new char[random.nextInt(8)+3]; // words of length 3 through 10. (1 and 2 letter words are boring.)
            for(int j = 0; j < word.length; j++)
            {
                word[j] = (char)('a' + random.nextInt(26));
            }
            randomStrings[i] = new String(word);
        }
        return randomStrings;
    }

    private static String concatenateWords(String[] arrayOfWords){
        StringBuilder text = new StringBuilder();
        for(String word : arrayOfWords){
            text.append(" ");
            text.append(word);
        }
        return text.toString();
    }
}
