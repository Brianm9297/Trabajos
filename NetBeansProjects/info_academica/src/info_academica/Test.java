package info_academica;

import javax.swing.JOptionPane;
import java.util.*;

public class Test {

    public static void main(String[] args) {

        info_academica.Test ob = new Test();
        /*  Student st1 = new Student(); st1.setName("Pedro");
         Student st2 = new Student(); st2.setName("Maria");
         Student st3 = new Student(); st3.setName("Camila");
         Teacher pr1 = new Teacher(); pr1.setEmail("na@na.com");
         Teacher pr2 = new Teacher(); pr2.setName("pepito");
         Course c1 = new Course(); c1.setName("Tecnicas");
         Course c2 = new Course(); c2.setName("Estructuras");
         Group g1 = new Group();
         g1.setCourse(c1);
         g1.setProfessor(pr2);
         ArrayList<Student> stud = new ArrayList<>();
         stud.add(st1);
         stud.add(st2);
         */
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> listaEstudiantes = new ArrayList<>();
        char respuesta = 'y';
        int cont = 0;

        do {
            Student st = new Student();
            //st.Createattents();
            
            String name = sc.nextLine();
            st.setName(name);
            listaEstudiantes.add(st);
            System.out.println("otro estudiante? " + cont);
            respuesta = sc.next().charAt(0);
            cont++;
        } while (respuesta == 'y');

        Group g2 = new Group();
        g2.setStudent(listaEstudiantes);

        for (Student student : listaEstudiantes) {
            System.out.println(" estuiante " + student.getName());
        }

    }

    public int solicitarData(String data) {
        return Integer.parseInt(JOptionPane.showInputDialog(data));
    }

    public void imprimir(String data) {
        JOptionPane.showMessageDialog(null, data);
    }

    public String solicitarDataString(String data) {
        return JOptionPane.showInputDialog(data);
    }

}
