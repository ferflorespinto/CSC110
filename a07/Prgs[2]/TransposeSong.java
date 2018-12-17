//myMusic is the package structure for Voice and Notes class
import myMusic.*;

import java.util.*;
import java.io.*;

class TransposeSong {
	
	public static void main(String[] args) throws Exception{
		//Read the parameters and store to more readable variables
		String sourceFile = args[0];
		String outputFile = args[1];
		int semitone = Integer.parseInt(args[2]);

		String tempo;
		int voices;
		String title;
		
		//Prepare source and output .sng files
		Scanner input = new Scanner(new File(sourceFile));
		FileOutputStream fs = new FileOutputStream(outputFile);
		PrintStream ps = new PrintStream(fs); 
		
		//Read the first 3 lines from source and write them to the output file
		tempo = input.nextLine();
		input.next();
		voices = input.nextInt();
		input.next();
		title = input.nextLine();

		ps.println(tempo);
		ps.println("voices " + voices);
		ps.println("title" + title);
		ps.println();

		//Prepare array Voice. Array length is as indicated from the second line
		//of source file
		Voice[] voice = new Voice[voices];
		
		//For each voice block in source file, read the instrument, number of notes 
		//and note details. Then transpose the notes and write them to the output file
		for (int i = 0; i < voices; i++) {
			voice[i] = new Voice(input);
			voice[i].transpose(semitone);
			voice[i].toStream(ps);
		}
		
		//Close the file handlers
		ps.close();  
		fs.close();
		
		input.close();

		
	}
}