
package InOut;

import Model.RedirectionClass;

import javax.swing.JOptionPane;

public class ClassHelper {

    public void helpPresentSimple() {
        Model.RedirectionClass return_menu = new RedirectionClass();

        String help = "";
        help += "Use the Simple Present to express the idea that an action is repeated or usual. \nThe action can be a habit, a hobby, a daily event, a scheduled event or something that often happens. \nIt can also be something a person often forgets or usually does not do.\n"
                + "\n"
                + "Examples:\n"
                + "\n"
                + "I play tennis.\n"
                + "She does not play tennis.\n"
                + "Does he play tennis?\n"
                + "The train leaves every morning at 8 AM.\n"
                + "The train does not leave at 9 AM.\n"
                + "When does the train usually leave?\n"
                + "She always forgets her purse.\n"
                + "He never forgets his wallet.\n"
                + "Every twelve months, the Earth circles the Sun.\n"
                + "Does the Sun circle the Earth?";
        JOptionPane.showMessageDialog(null, help);
        return_menu.redireccionProyecto();
    }

    public void future() {
        Model.RedirectionClass return_menu = new RedirectionClass();

        String help = "";
        help += "Simple Future has two different forms in English: \"will\" and \"be going to.\" \nAlthough the two forms can sometimes be used interchangeably, they often express two very different meanings. \nThese different meanings might seem too abstract at first, but with time and practice, \nthe differences will become clear. \nBoth \"will\" and \"be going to\" refer to a specific time in the future. "
                + "\n[will + verb]\n"
                + "\n"
                + "Examples:\n"
                + "\n"
                + "You will help him later.\n"
                + "Will you help him later?\n"
                + "You will not help him later."
                + "*****************************\n"
                + "[am/is/are + going to + verb]\n"
                + "\n"
                + "Examples:\n"
                + "\n"
                + "You are going to meet Jane tonight.\n"
                + "Are you going to meet Jane tonight?\n"
                + "You are not going to meet Jane tonight.";

        JOptionPane.showMessageDialog(null, help);
        return_menu.redireccionProyecto();
    }

    public void past() {
        Model.RedirectionClass return_menu = new RedirectionClass();

        String help = "";
        help += "Use the Simple Past to express the idea that an action started and finished at a specific time in the past. \nSometimes, the speaker may not actually mention the specific time, \nbut they do have one specific time in mind.\n"
                + "\n"
                + "Examples:\n"
                + "\n"
                + "I saw a movie yesterday.\n"
                + "I didn't see a play yesterday.\n"
                + "Last year, I traveled to Japan.\n"
                + "Last year, I didn't travel to Korea.\n"
                + "Did you have dinner last night?\n"
                + "She washed her car.\n"
                + "He didn't wash his car.";
        JOptionPane.showMessageDialog(null, help);
        return_menu.redireccionProyecto();
    }
}
