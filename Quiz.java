import javax.swing.JOptionPane;

public class Quiz {

	public static void main(String[] args) {
		
		// Question asked
		String question = "What is RAM?\n";
		
		// the list of answers
		question += "A. Read Access Memory\n";
		question += "B. Computer hard disk drive\n";
		question += "C. Computer main memory\n";
		question += "D. Central processing unit\n";
		question += "E. Computer solid-state drive\n";
		
		while (true) {
			String answer = JOptionPane.showInputDialog(question);
		
			answer = answer.toUpperCase();
		
			// Condition Section
		
			// the if statement to select the correct answer
			if (answer.equals("C")) {
				JOptionPane.showMessageDialog(null,"Correct!");
				break;
			}
			
			/* condition for incorrect answer
			 * once one of the proposition is false, condition will be true
			 */
			else if (answer.equals("A") || answer.equals("B") || answer.equals("D") || answer.equals("E")) {
				JOptionPane.showMessageDialog(null,"Incorrect answer. Please try again.");
			}
			
			// condition for other letters and characters that don't have an answer
			else {
				JOptionPane.showMessageDialog(null,"Invalid. Try A, B, C, D or E");
			}
			
		}
		
	}
	
}	
