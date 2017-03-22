/*lottoApp.java
@author Yo
22/03/2017
*/
import javax.swing.JOptionPane;
public class lottoApp{
	public static void main(String args[]){
	//declare vars
	int g1,g2,g3,l1,l2,l3;
	int correct;
	//objects
	lotto l;
	l=new lotto();
	for(int i=0;i<3;i++){
	//inputs
	g1=Integer.parseInt(JOptionPane.showInputDialog(null, "First guess"));
	g2=Integer.parseInt(JOptionPane.showInputDialog(null, "Second guess"));
	g3=Integer.parseInt(JOptionPane.showInputDialog(null, "Third guess"));
	//set
	l.setG1(g1);
	l.setG2(g2);
	l.setG3(g3);
	//compute
	l.compareNumbers();
	//get
	correct=l.getCorrect();
	//output
	JOptionPane.showMessageDialog(null,correct+" right guesses");
	}
}
}//how to do if we have to get 9 answers? while=(correct<9)