package de.telran.d211125.concatenation.censor;

import de.telran.d211125.concatenation.censor.HomeWorkCensor;

public class HomeWorkMain {
    public static void main(String[] args) {

        String[] badWords2 = {"abc", "xyz", "ffkk"};

        HomeWorkCensor censor = new HomeWorkCensor(badWords2);

        System.out.println(censor.verify("xyz knows the answer to your question!"));
        System.out.println(censor.verify("Go and abc yourself!"));
        System.out.println(censor.verify("Hello, dear grandma!"));

        badWords2[0] = "cba";
        badWords2[0] = "xyz";
        badWords2[0] = "kkff";

        System.out.println(censor.verify("xyz knows the answer to your question!"));
        System.out.println(censor.verify("Go and abc yourself!"));
        System.out.println(censor.verify("Hello, dear grandma!"));

        String badWords = "F, FU, HS!, WTF, #$@&%*!";

        String question = "Want to check quickly for swear words and abuse?";
        String answer = "That's the best #$@&%*! question I've ever seen.";
        String debraMorgan = "I don't give a F who you F , just don't F with my investigation you F .";
        String sheldonCooper = "I'm Not Crazy. My Mother Had Me Tested.";

        System.out.println(new HomeWorkCensor(badWords.split(", ")).verify(debraMorgan));
        System.out.println(new HomeWorkCensor(badWords.split(", ")).verify(question));
        System.out.println(new HomeWorkCensor(badWords.split(", ")).verify(answer));
        System.out.println(new HomeWorkCensor(badWords.split(", ")).verify(sheldonCooper));

    }
}
/*
stack               heap - массив
badWords            abc xyz ffkk            <- vocabulary (меняется)
                    cba zyx kkff            <- vocabulary
 */