import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class interview {
    public static void main(String[] args) {
        String phraseToCheck = "For we, which now behold these present days";
        String[] phraseToCheckArray = phraseToCheck.replaceAll("[ ,]","").split("");
        Map<String, Long> output = new HashMap<>();

        List<String> uniqueList = Arrays.stream(phraseToCheckArray).distinct().toList();


        uniqueList.forEach(uniqueLetter -> {
            long occurrences = Arrays.stream(phraseToCheckArray).filter(letter-> letter.equals(uniqueLetter)).count();
            output.put(uniqueLetter, occurrences);
        });

        System.out.println(output);
    }
}
