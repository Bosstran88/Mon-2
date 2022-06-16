package lyric;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LyricWord {
    private static final String[] lyric = {"you", "say", "it","best",
    "when", "you", "say", "nothing", "at", "all"};
    private String list;

    public static void main(String[] args) {
        List words = new ArrayList();
        for (String w : lyric)
            words.add(w);
        for (Object o: words)
            System.out.print(o+ "");
        System.out.println("\n--------------------");

        System.out.println("Contain [you]? :" + words.contains("you"));
        System.out.println("Contain [me]?:" + words.contains("me"));
        System.out.println("Where's [say]?:"+words.indexOf("say"));
        System.out.println("where's the last [say]?:"+  words.lastIndexOf("say"));

        Collections.sort(words);

        for (Object o: words
             ) {
            System.out.print(o + " ");

        }
    }
}
