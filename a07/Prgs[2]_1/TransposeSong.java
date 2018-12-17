import myMusic.*;
import java.util.*;
import java.io.*;

class TransposeSong {
	
	public static void main(String[] args) throws Exception{
		String sourceFile = args[0];
		String outputFile = args[1];
		int semitone = Integer.parseInt(args[2]);

		String tempo;
		int voices;
		String title;
		
		Scanner input = new Scanner(new File(sourceFile));
		
		tempo = input.nextLine();
		input.next();
		voices = input.nextInt();
		input.next();
		title = input.nextLine();

		Voice voice = new Voice(input);
		
		FileOutputStream fs = new FileOutputStream(outputFile);
		PrintStream ps = new PrintStream(fs); 
		
		ps.println(tempo);
		ps.println("voices " + voices);
		ps.println("title" + title);
		ps.println();
	
		voice.transpose(semitone);
		voice.toStream(ps);

		ps.close();  
		fs.close();
		
		input.close();

		
	}
}