package lab6Generic;

import java.util.ArrayList;
import java.util.List;

public class LyricWordUsingGeneric {
    private static final Word[] lyric = {
            new Word("you",1),new Word("say",2),new Word("it",3),
            new Word("best",4), new Word("when",5), new Word("you",6),
            new Word("say",7), new Word("nothing",8),new Word("at",9),
            new Word("all",10)
    };

    public static void main(String[] args) {
        //Create a list thats implement by arraylist
        List<Word> lyric = new ArrayList<Word>();
        //add all String in String array to list
        for (Word w: lyric)
            lyric.add(w);

        //show all elements of words
        for (Word w:lyric){
            System.out.println(w.getValue()+ ", "+w.getPosition());
        }
    }

}
