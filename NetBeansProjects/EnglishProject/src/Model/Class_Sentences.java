package Model;

import InOut.ClassInOut;
import java.util.Random;

public class Class_Sentences {

    private int index;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String[] wordsPresent = {
        "work",
        "see",
        "play",
        "run",
        "works",
        "sing",
        "celebrate",
        "draw",
        "see",
        "walk",
        "rain",
        "invite",
        "wait",
        "smile"

    };

    public String[] badPhrasesPresent = {
        "I _ _ _ _ _ with my father in the newspaper\n" + "play\n"+ "sing\n"+ "walk\n"+ "work\n",
        "I _ _ _ my girlfriend every friday\n"+ "run\n"+ "see\n"+ "saw\n"+ "ran\n",
        "You _ _ _ _ soccer with my brother\n"+ "play\n"+ "draw\n"+ "walk\n"+ "work",
        "You _ _ _ in the park every monday\n"+ "say\n"+ "use\n"+ "see"+ "run",
        "He _ _ _ _ _ for Microsoft\n"+ "comes\n"+ "Takes\n"+ "works\n"+ "makes",
        "They _ _ _ _ in a rock band\n"+ "sing\n"+ "look\n"+ "give\n"+ "tell",
        "They _ _ _ _ _ _ _ _ _  together\n"+ "celebrate\n"+ "cooperate\n"+ "reorganize\n",
        "They _ _ _ _ good cartoons\n"+ "draw\n"+ "play\n"+ "take\n"+ "have\n",
        "We _ _ _ every day London Olympics\n"+ "lie\n"+ "see\n"+ "use\n"+ "ask\n",
        "Do you _ _ _ _ to school?\n"+ "wait\n"+ "walk\n"+ "look\n"+ "find",
        "Does it _ _ _ _ a lot in England?\n"+ "come\n"+ "give\n"+ "rain\n"+ "work\n",
        "Do they _ _ _ _ _ _ their friends to the party?\n"+ "wanted\n"+ "worked\n"+ "invite\n"+ "leaved\n",
        "Do we _ _ _ _ at the bus stop?\n"+ "rain\n"+ "wait\n"+ "have\n"+ "walk",
        "Does he _ _ _ _ _ in the mornings?\n"+ "gives\n"+ "smile\n"+ "looks\n"+ "wants"
    };

    public String[] listaVerbos = {
        "arise", "arose", "awake", "awoke", "bear", "bore", "beat", "beat", "become", "became", "begin", "began", "bend", "bent", "bid", "bid", "bet", "bet", "bind", "bound", "bite", "bit", "bleed", "bled", "blow", "blew", "break", "broke", "breed", "bred", "bring", "brought", "build", "built", "burn", "burnt", "burst", "burst", "buy", "bought", "cast", "cast", "catch", "caught", "choose", "chose", "cling", "clung", "come", "came", "cost", "cost", "creep", "crept", "cut", "cut", "deal", "dealt", "dig", "dug", "do", "did", "draw", "drew", "dream", "dreamt", "drive", "drove", "drink", "drank", "eat", "ate", "fall", "fell", "feed", "fed", "feel", "felt", "fight", "fought", "find", "found", "flee", "fled", "fly", "flew", "forbid", "forbade", "forget", "forgot", "forgive", "forgave", "freeze", "froze", "get", "got", "give", "gave", "go", "went"};

 

    public String[] wordsPast = {
        "went",
        "bought",
        "played",
        "called",
        "cleaned",
        "returned",
        "flew",
        "played",
        "studied",
        "arrived",
        "bought"

    };

    public String[] badPhrasesPast = {
        "John _ _ _ _ (go)to the cinema to see a horror movie ",
        "I _ _ _ _ _ _  (buy)a dress yesterday.",
        "She _ _ _ _ _ _ (play)basketball in Germany",
        "My cousin _ _ _ _ _ _ (call)me to leave",
        "She _ _ _ _ _ _ _ (clean)her house",
        "He _ _ _ _ _ _ _ _ (return)to Italy",
        "He _ _ _ _ (fly)on a helicopter",
        "we _ _ _ _ _ _ (play)all afternoon",
        "We _ _ _ _ _ _ _ (study)for the test las week.",
        "They _ _ _ _ _ _ _ (arrive)this morning.",
        "I _ _ _ _ _ _ (buy)milk and bread at the grocery "
    };

    public String[] wordsFuture = {
        "will study",
        "will win",
        "will be",
        "will come",
        "will get",
        "will go",
        "will fail",
        "will go",
        "will be",
        "will"

    };

    public String[] badPhrasesFuture = {
        "I ____ _____ (study)tomorrow.\n",
        "We ____ ___ (win)next time.\n",
        "She ____ __ (be)my girlfriend. \n",
        "My best friend ____ ____ (come)home next week.",
        "The things you do ____ ___ (get)you in trouble. \n",
        "After the game we ____ __ (go)for some snacks. \n",
        "If you don't study today, you ____ ____ (fail)tomorrow. \n",
        "Next month he ____ __ (go)to Europe. \n",
        "Some of them ____ __ (be)sick next day. \n",
        "We ____ rock you."
    };
   public String selectWord() {

        String word = "";
        int indice = 0;
        Random GENERATOR = new Random();
        indice = GENERATOR.nextInt(listaVerbos.length);
        word = listaVerbos[indice];
        return word;
    }

    public String selectSentencesPresent() {
        String word = "";
        int indice = 0;
        Random GENERATOR = new Random();
        indice = GENERATOR.nextInt(badPhrasesPresent.length);
        setIndex(indice);
        word = badPhrasesPresent[indice];
        return word;
    }
    
    
    public String selectSentencesPast() {
        String word = "";
        int indice = 0;
        Random GENERATOR = new Random();
        indice = GENERATOR.nextInt(badPhrasesPast.length);
        setIndex(indice);
        word = badPhrasesPast[indice];
        return word;
    }
    
    
    public String selectSentencesFuture() {
        String word = "";
        int indice = 0;
        Random GENERATOR = new Random();
        indice = GENERATOR.nextInt(badPhrasesFuture.length);
        setIndex(indice);
        word = badPhrasesFuture[indice];
        return word;
    }
}
