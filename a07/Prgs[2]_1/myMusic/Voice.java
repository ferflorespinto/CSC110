package myMusic;

import java.util.*;
import java.io.*;

public class Voice {
	public int numNotes;
	public int semitone;
	public String instrument;
	public static Notes[] notes;
	 
	public Voice(Scanner input) {
	
		String line;
		String pitch, duration;
		
		while (input.hasNext()) {
			line = input.next();
			if (line.equals("instrument")) {
				line = input.next();
				instrument = line;
				input.next();
				numNotes = input.nextInt();
				notes = new Notes[numNotes];
				for (int i = 0; i < numNotes; i++) {
					pitch = input.next();
					duration = input.next();						
					notes[i] = new Notes(pitch, duration);
				}
			}
		}	
					
	}
	
	public String toString() {
		String text = "instrument " + instrument + "\n" +
					"notes " + numNotes + "\n";
		for (Notes note: this.notes) {
			text += note.pitch + " " + note.duration + "\n";
		}
		return text;
	}
	
	public void transpose(int semitone) {
		for (Notes note: this.notes) {
			note.transpose(semitone);
		}		
	}

	public void toStream(PrintStream ps) {		
		ps.println(toString());		
	}
	
	public static void main(String[] args) throws Exception{
		//Scanner sc1 = new Scanner(new File(args[0]));
		//Voice voice = new Voice(sc1);
		//sc1.close();
		
		//voice.semitone = -3;
		//voice.toStream(ps);
		
		//notes[0] = new Notes("e_4", "2");
		//notes[0].transpose(-3);
	}
}