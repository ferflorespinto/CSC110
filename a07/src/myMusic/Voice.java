/*
 * Student Name: Jorge Fernando Flores Pinto 
 * ID: V00880059
 * 
 * This class Voice stores the information about the set of notes in a song, the number
 * of notes and the instrument used to play them. The class calls the class Note to
 * perform the transposition on the whole set of notes. Finally, Voice also prints 
 * the number of notes, the instrument and the set of notes in a file.
 *
 * The classes Note and Voice are intended to be in a folder in the same directory as
 * the class TransposeSong. As you can see, I named the folder "myMusic", and made it
 * into a package so that the TransposeSong class can import information from that folder.
 *
 */

//myMusic is the package structure for Voice and Notes class
package myMusic;

import java.util.*;
import java.io.*;

public class Voice {
	public int numNotes;
	private String instrument;
	private static Note[] notes;
	 
	public Voice(Scanner input) {
		String line;
		String pitch, duration;
		
		//Scans the file until no more instruments, and thus notes, are found.
		while (input.hasNext()) {
			line = input.next();
			if (line.equals("instrument")) {
				line = input.next();
				
				//Read the instrument and number of notes
				instrument = line;
				input.next();
				numNotes = input.nextInt();
				
				//Create the notes array with the length of the number of notes
				notes = new Note[numNotes];
				for (int i = 0; i < numNotes; i++) {
					
					//Read the pitch and duration and create the Note structure
					pitch = input.next();
					duration = input.next();						
					notes[i] = new Note(pitch, duration);
				}
				break;
			}
		}	
					
	}
	
	//Prepares the entire voice 'block' of text that will be written to output file
	public String toString() {
		String text = "instrument " + instrument + "\n" +
					"notes " + numNotes + "\n";
		for (Note note: notes) {
			text += note.toString() + "\n";
		}
		return text;
	}
	
	//From the notes array, takes each note and transposes
	public void transpose(int semitone) {
		for (Note note: notes) {
			note.transpose(semitone);
		}		
	}

	//Call the entire voice 'block' of text and write it to output file
	public void toStream(PrintStream ps) {		
		ps.println(toString());		
	}
	
	public static void main(String[] args) throws Exception{
		//Just for testing
		/*Scanner sc1 = new Scanner(new File(args[0]));
		Voice voice = new Voice(sc1);
		sc1.close();*/
		
	}
}