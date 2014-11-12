package Model;

import InOut.ClassHelper;
import InOut.ClassInOut;

public class RedirectionClass {

    private int opcion;
    private int subMenuOption = 0;

    public void setSubMenuOption(int subMenuOption) {
        this.subMenuOption = subMenuOption;
    }

    public int getSubMenuOption() {
        return subMenuOption;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }

    public int getOpcion() {
        return opcion;
    }

    public void redireccionProyecto() {

        ClassInOut obj1IO = new ClassInOut();
        HangManClass obj1HM = new HangManClass();
        Class_learnEnglish learn = new Class_learnEnglish();
        JavaEnglish imageClass= new JavaEnglish();
        
        ClassHelper help = new ClassHelper();
        int opc = 0;
        boolean validation = false;
        do {

            obj1IO.menu();
            opc = obj1IO.requestIntPositive1_9("Choose an option");
            validation = validOption(opc);
            if (validation == false) {
                obj1IO.showError("Error");
            }
            setOpcion(opc);
        } while (validation == false);

        switch (getOpcion()) {
            case 1:

                do {
                    obj1IO.subMenu("\nLEARN PRESENT SIMPLE");
                    subMenuOption = obj1IO.requestIntPositive1_9("Choose an option");
                    validation = validOption(subMenuOption);
                    if (validation == false) {
                        obj1IO.showError("Error");
                    }
                    setSubMenuOption(subMenuOption);
                } while (validation == false);
                switch (getSubMenuOption()) {
                    case 1:
                        learn.simple(1);
                        break;
                    case 2: imageClass.imagePresent();
                        break;
                    case 3:
                        help.helpPresentSimple();
                        break;
                    case 4:
                        redireccionProyecto();
                        break;
                }

                break;
            case 2:
                do {
                    obj1IO.subMenu("\nLEARN PAST");
                    subMenuOption = obj1IO.requestIntPositive1_9("Choose an option");
                    validation = validOption(subMenuOption);
                    if (validation == false) {
                        obj1IO.showError("Error");
                    }
                    setSubMenuOption(subMenuOption);
                } while (validation == false);
                switch (getSubMenuOption()) {
                    case 1:
                        learn.simple(2);
                        break;
                    case 2: imageClass.imagePast();
                        break;
                  case 3:
                        help.past();
                        break;
                    case 4:
                        redireccionProyecto();
                        break;
                }

                break;
            case 3:
                do {
                    obj1IO.subMenu("\nLEARN FUTURE");
                    subMenuOption = obj1IO.requestIntPositive1_9("Choose an option");
                    validation = validOption(subMenuOption);
                    if (validation == false) {
                        obj1IO.showError("Error");
                    }
                    setSubMenuOption(subMenuOption);
                } while (validation == false);
                switch (getSubMenuOption()) {
                    case 1:
                        learn.simple(3);
                        break;
                    case 2: imageClass.imagefuture();
                        break;
                    case 3:
                        help.future();
                        break;
                    case 4:
                        redireccionProyecto();
                        break;
                }

                break;
            case 4:
                    obj1HM.executeMenu();
                break;
            case 5:
                System.exit(0);
                break;

        }

    }

    public boolean validOption(int opc) {
        if (opc < 1 || opc > 6) {
            return false;
        } else {
            return true;
        }

    }

}
