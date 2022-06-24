package lab6Generic;

import java.util.ArrayList;
import java.util.List;

public class LyricWordWithoutGeneric {
    private static final Word[] lyric = {
            new Word("you",1),new Word("say",2),new Word("it",3),
            new Word("best",4),new Word("when",5),new Word("you",6),
            new Word("say",7),new Word("nothing",8),new Word("at",9),
            new Word("all",10)
    };

    public static void main(String[] args) {
        //create a list that implemented by arraylist
        List lyric = new ArrayList();

        //Add all String in string array to list
     for (Object s:lyric)
         lyric.add(s);

     //show all elements of words

        for (Object o:lyric
             ) {
            Word w=(Word) o;
            System.out.println(w.getValue()+", "+w.getPosition());

        }


    }
}
