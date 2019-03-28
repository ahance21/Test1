import java.util.Scanner;

public class Cryptogrophy {

	public static void main(String[] args) 
	{
		char letter = 'z';
		int letterAsNumber = letter - 'a';
		int newNumber = letterAsNumber + 4;
		char newletter = (char)(newNumber + 'a');
		System.out.print(letterAsNumber);
        System.out.print((char) letterAsNumber); //generates question mark as there is an error locating e
        System.out.print((char) 101);//displays  letter at index 101
        System.out.print((char) (letterAsNumber + 'a')); //theoretically sstill returns 4e
        //Alphabet starts at 97
        //Uppercase and Lowercase letters are not near eachother 
        System.out.print("\n" + newletter);
        int newletter2 = letter + 4;  //Still gives I because it adds 4 
        System.out.print("\n" + (char) newletter2);
	}
	
	Scanner keyboard = new Scanner(System.in);
     
}
