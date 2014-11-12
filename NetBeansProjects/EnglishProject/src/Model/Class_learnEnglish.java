package Model;

import InOut.ClassInOut;


public class Class_learnEnglish {

    public void simple(int type) {
        RedirectionClass obBack = new RedirectionClass();
        Model.Class_Sentences obPhrase = new Class_Sentences();
        InOut.ClassInOut obInOut = new ClassInOut();

        String charUser = "";
        String phrase = "";
        String correctWord = "";

        if (type == 1) {
            phrase = obPhrase.selectSentencesPresent();
            correctWord = obPhrase.wordsPresent[obPhrase.getIndex()];

        } else if (type == 2) {
            phrase = obPhrase.selectSentencesPast();
            correctWord = obPhrase.wordsPast[obPhrase.getIndex()];

        } else if (type == 3) {
            phrase = obPhrase.selectSentencesFuture();
            correctWord = obPhrase.wordsFuture[obPhrase.getIndex()];
        }

        // obInOut.showInfo(phrase+"\n"+correctWord );
        boolean validate = false;
        String question;
        char letter;
        //charUser = "Enter the correct Words\n" + phrase + "\n";
          //obInOut.requestOnlyString(charUser);
          //obInOut.showInfo(charUser + " "+correctWord);
        do {
            boolean trueWork = false;
            do {
                charUser = obInOut.requestInfo("Enter the correct Words\n" + phrase + "\n");
                if (obInOut.validateStringBoolean(charUser)==true) {
                    
                    trueWork = true;
                }if (obInOut.validateStringBoolean(charUser)==false) {
                    obInOut.showInfo("Please.. Enter the correct Words");
                    trueWork=false;
                }
            } while (trueWork==false);
            
            if (correctWord == null ? charUser == null : correctWord.equals(charUser)) {
                obInOut.showInfo("Perfect");
                //aqui renueva la nueva frase
                //y la palabra que le corresponde
                if (type == 1) {
                    phrase = obPhrase.selectSentencesPresent();
                    correctWord = obPhrase.wordsPresent[obPhrase.getIndex()];

                } else if (type == 2) {
                    phrase = obPhrase.selectSentencesPast();
                    correctWord = obPhrase.wordsPast[obPhrase.getIndex()];

                } else if (type == 3) {
                    phrase = obPhrase.selectSentencesFuture();
                    correctWord = obPhrase.wordsFuture[obPhrase.getIndex()];
                }

                question = obInOut.requestInfo("You Win!!, Do you want to play again?\n y/n");
                letter = question.charAt(0);
                if (letter == 'y' || letter == 'Y') {
                    obInOut.showInfo("perfect play again");
                    validate = false;
                } else {
                    obInOut.showInfo("that's bad!!, bye");
                    validate = true;
                    obBack.redireccionProyecto();
                }
            } else {
                
                boolean charLetter= false;
                do {                    
                    question = obInOut.requestInfo("You Lose, Do you want to play again?\n y/n");
                    
                    if (obInOut.validateCharBoolean(question)==true) {
                        charLetter = true;
                    }if (obInOut.validateCharBoolean(question)==false) {
                       charLetter = false; 
                    }
                } while (charLetter == false);
                
                letter = question.charAt(0);    
                if (letter == 'y' || letter == 'Y') {
                    obInOut.showInfo("perfect, play again");
                    validate = false;
                } else {
                    obInOut.showInfo("that's bad!!, bye");
                    validate = true;
                    obBack.redireccionProyecto();
                }
            }

        } while (validate == false);

    }

}
