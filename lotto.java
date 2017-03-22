//Write a program that generate 3 random numbers(1-10).
//Allow the user to enter in 3 guesses
//tell the user how many answers they have correct
//give the user 3 attempts
//(bonus, keep looping until the user gets all 3 correct)
/*lotto.java
@author Yo
22/03/2017
*/
public class lotto{
	//vars
	private int l1,l2,l3;
	private int g1,g2,g3;
	private int correct;

	//constructor
	public lotto(){
		l1=0;
		l2=0;
		l3=0;
		g1=0;
		g2=0;
		g3=0;
		correct=0;
	}
	//setters
	public void setG1(int g1){//void - doesn't return result
		this.g1=g1;// this. means I'm talking about this function or this file
	}
	public void setG2(int g2){//void - doesn't return result
		this.g2=g2;// this. means I'm talking about this function or this file
	}
	public void setG3(int g3){//void - doesn't return result
		this.g3=g3;// this. means I'm talking about this function or this file
	}
	//compute
	public void compareNumbers(){
		l1=(int)((Math.random()*3)+1);//*3 makes it generate from 1 to 3
		l2=(int)((Math.random()*3)+1);//casting
		l3=(int)((Math.random()*3)+1);
		if(g1==l1 || g1==l2 || g1==l3){
			//correct=correct+1;
			correct++;
		}
		if(g2==l1 || g2==l2 || g2==l3){
			//correct=correct+1;
			correct++;
		}
		if(g3==l1 || g3==l2 || g3==l3){
			//correct=correct+1;
			correct++;
		}
	}
	public int getCorrect(){
		return correct;
	}

}
