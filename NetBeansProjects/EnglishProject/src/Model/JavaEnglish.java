package Model;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import InOut.ClassInOut;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class JavaEnglish {
	RedirectionClass objRedireccion = new RedirectionClass();
        
        private int notaPast = 0;
	private int notaPresent = 0;
	private int notafuture = 0;

	public int getNotaPast() {
		return notaPast;
	}

	public void setNotaPast(int notaPast) {
		this.notaPast = notaPast;
	}

	public int getNotaPresent() {
		return notaPresent;
	}

	public void setNotaPresent(int notaPresent) {
		this.notaPresent = notaPresent;
	}

	public int getNotafuture() {
		return notafuture;
	}

	public void setNotafuture(int notafuture) {
		this.notafuture = notafuture;
	}

	public void imagePast() {
            
		 ClassInOut obc = new ClassInOut();
                
                String[] answer = { "cried", "programmed", "walked", "ran", "read" };
		String[] userAnswers = new String[5];
		Calendar obj = new GregorianCalendar();
		int segundo = obj.get(Calendar.SECOND);
		segundo += obj.get(Calendar.MINUTE) * 60;
		segundo += obj.get(Calendar.HOUR_OF_DAY) * 3600;
		userAnswers[0] = ((String) JOptionPane.showInputDialog(null,"what is this?", "Java English", 0, new ImageIcon("D:\\EnglishProject\\cried.gif"),null, null));
		userAnswers[1] = ((String) JOptionPane.showInputDialog(null,"what is this?", "Java English", 0, new ImageIcon("D:\\EnglishProject\\programmed.jpg"), null, null));
		userAnswers[2] = ((String) JOptionPane.showInputDialog(null,"what is this?", "Java English", 0,new ImageIcon("D:\\EnglishProject\\walked.gif"), null, null));
		userAnswers[3] = ((String) JOptionPane.showInputDialog(null,"what is this?", "Java English", 0, new ImageIcon("D:\\EnglishProject\\ran.gif"),null, null));
		userAnswers[4] = ((String) JOptionPane.showInputDialog(null,"what is this?", "Java English", 0, new ImageIcon("D:\\EnglishProject\\read.gif"),null, null));
		Calendar obj1 = new GregorianCalendar();
		int segundo1 = obj1.get(Calendar.SECOND);
		segundo1 += obj1.get(Calendar.MINUTE) * 60;
		segundo1 += obj1.get(Calendar.HOUR_OF_DAY) * 3600;
		int resta = segundo1 - segundo;
		
		for (int i = 0; i < userAnswers.length; i++) {
			if (userAnswers[i].equals(answer[i])) {
				setNotaPast(getNotaPast() + 1);
			}
		}obc.showInfo("you waste  "+resta + " seconds\nand your grade is "+getNotaPast());
		objRedireccion.redireccionProyecto();
	}

	public void imagePresent() {
		 ClassInOut obc = new ClassInOut();
		String[] answer = { "He watches tv", "He sleeps", "He eats", "He cuts", "He dances" };
		String[] userAnswers = new String[5];
		Calendar obj = new GregorianCalendar();
		int segundo = obj.get(Calendar.SECOND);
		segundo += obj.get(Calendar.MINUTE) * 60;
		segundo += obj.get(Calendar.HOUR_OF_DAY) * 3600;

		userAnswers[0] = ((String) JOptionPane.showInputDialog(null,"What does he do?\n (He/watch)", "Java English", 0, new ImageIcon("D:\\EnglishProject\\watch tv.gif"), null, null));
		userAnswers[1] = ((String) JOptionPane.showInputDialog(null,"What does he do?\n (He/sleep)", "Java English", 0, new ImageIcon("D:\\EnglishProject\\sleep.gif"),null, null));
		userAnswers[2] = ((String) JOptionPane.showInputDialog(null,"What does he do?\n (He/eat)", "Java English", 0, new ImageIcon("D:\\EnglishProject\\eat.gif"),null, null));
		userAnswers[3] = ((String) JOptionPane.showInputDialog(null,"What does he do?\n (He/cut)", "Java English", 0, new ImageIcon("D:\\EnglishProject\\cut.gif"),null, null));
		userAnswers[4] = ((String) JOptionPane.showInputDialog(null,"What does he do?\n (He/dance)", "Java English", 0, new ImageIcon("D:\\EnglishProject\\dance.gif"),null, null));
		Calendar obj1 = new GregorianCalendar();
		int segundo1 = obj1.get(Calendar.SECOND);
		segundo1 += obj1.get(Calendar.MINUTE) * 60;
		segundo1 += obj1.get(Calendar.HOUR_OF_DAY) * 3600;
		int resta = segundo1 - segundo;
		
		for (int i = 0; i < userAnswers.length; i++) {
			if (userAnswers[i].equals(answer[i])) {
				setNotaPresent(getNotaPresent() + 1);
			}
		}
		obc.showInfo("you waste  "+resta + " seconds\nand your grade is " + getNotaPresent());
		objRedireccion.redireccionProyecto();
	}

	public void imagefuture() {
		 ClassInOut obc = new ClassInOut();
		String[] answer = { "will jump", "will play", "will fly",
				"will listen", "will kill" };
		String[] userAnswers = new String[5];
		Calendar obj = new GregorianCalendar();
		int segundo = obj.get(Calendar.SECOND);
		segundo += obj.get(Calendar.MINUTE) * 60;
		segundo += obj.get(Calendar.HOUR_OF_DAY) * 3600;

		userAnswers[0] = ((String) JOptionPane.showInputDialog(null,"what is this?", "Java English", 0, new ImageIcon("D:\\EnglishProject\\jump.gif"),null, null));
		userAnswers[1] = (String) JOptionPane.showInputDialog(null,"what is this?", "Java English", 0, new ImageIcon("D:\\EnglishProject\\play.gif"),null, null);
		userAnswers[2] = ((String) JOptionPane.showInputDialog(null,"what is this?", "Java English", 0, new ImageIcon("D:\\EnglishProject\\fly.gif"),null, null));
		userAnswers[3] = ((String) JOptionPane.showInputDialog(null,"what is this?", "Java English", 0,new ImageIcon("D:\\EnglishProject\\listen.gif"), null, null));
		userAnswers[4] = ((String) JOptionPane.showInputDialog(null,"what is this?", "Java English", 0, new ImageIcon("D:\\EnglishProject\\kill.gif"),null, null));
                
		Calendar obj1 = new GregorianCalendar();
		int segundo1 = obj1.get(Calendar.SECOND);
		segundo1 += obj1.get(Calendar.MINUTE) * 60;
		segundo1 += obj1.get(Calendar.HOUR_OF_DAY) * 3600;
		int resta = segundo1 - segundo;
		
		for (int i = 0; i < userAnswers.length; i++) {
			if (userAnswers[i].equals(answer[i])) {
				setNotafuture(getNotafuture() + 1);
			}
		}obc.showInfo("you waste  "+resta + " seconds\nand your grade is "+getNotafuture());
		objRedireccion.redireccionProyecto();
	}

}
