/*
 * Student Name: Jorge Fernando Flores Pinto 
 * ID: V00880059
 * 
 * This class Note stores the information about a particular note's pitch and duration.
 * The class also performs the transposition of a single note, depending on the number
 * of semitones provided in the argument and if it is a transposition up or down.
 *
 * The classes Note and Voice are intended to be in a folder in the same directory as
 * the class TransposeSong. As you can see, I named the folder "myMusic", and made it
 * into a package so that the TransposeSong class can import information from that folder.
 */


//myMusic is the package structure for Voice and Notes class
package myMusic;

public class Note {
	private String pitch;
	private String duration;
	
	//Declare tone and octave to ease pitch's readability
	private String tone;
	private String octave;
	
	private static final String[][] transposeTable = { 
		{"c_", "c"},
		{"c", "d_"}, 
		{"c", "c^"}, 
		{"c^", "d"}, 
		{"d_", "d"}, 
		{"d", "d^"}, 
		{"d", "e_"}, 
		{"d^", "e"}, 
		{"e_", "e"}, 
		{"e", "e^"}, 
		{"e_", "f_"}, 
		{"e", "f"}, 
		{"e^", "f^"}, 
		{"f", "f^"}, 
		{"f", "g_"}, 
		{"f^", "g"}, 
		{"g", "g^"}, 
		{"g", "a_"}, 
		{"g^", "a"}, 
		{"a_", "a"}, 
		{"a", "a^"}, 
		{"a", "b_"}, 
		{"a^", "b"}, 
		{"b_", "b"}, 
		{"b_", "c_"}, 
		{"b", "b^"}, 
		{"b", "c"}, 
		{"b^", "c^"}
	};
	
	public Note(String pitch, String duration){
		this.pitch = pitch;
		this.duration = duration;
		this.tone = pitch.substring(0, pitch.length() - 1);
		this.octave = pitch.substring(pitch.length() - 1);
	}
	
	public String toString() {
		String note = this.pitch + " " + this.duration;
		return note;
	}
	
	/* For both up and down transpositions, we check if each tone exists
	 * in transposeTable; if not, the tone remains the same. This is useful
	 * when we find a silence and we don't want to alter the table.
	 *
	 */
	private void transposeUp() {
		for (int i = 0; i < transposeTable.length; i++) {
			if (transposeTable[i][0].equals(this.tone)) {
			 this.tone = transposeTable[i][1];
			 break;
			}
			//if (tone.equals())
		}
		this.pitch = this.tone + this.octave;
	}
	private void transposeDown() {
		for (int i = 0; i < transposeTable.length; i++) {
			if (transposeTable[i][1].equals(this.tone)) {
			 this.tone = transposeTable[i][0];
			 break;
			}
		}
		//if(tone.equals(c) && )
		this.pitch = this.tone + this.octave;
		
	}
	public void checkOctaveUp() {
		String originalOct = this.octave;
		int oct = 0;
		if(!tone.equals("r")) {
			oct = Integer.parseInt(originalOct);
			int newOct = oct + 1;
			originalOct = newOct + "";
			this.octave = originalOct;
		}


	}	
	public void transpose(int semitones) {
		if (!tone.equals("r")) {
			int originalOct = Integer.parseInt(this.octave);
		
			if (semitones > 0) { //&& !tone.equals("r")) {
				for (int i = 0; i < semitones; i++) {
					if (semitones >= 12) { //12
						checkOctaveUp();
						transposeUp();
					}
					else if(semitones == 11) {
						if(!tone.equals("c")) {
							checkOctaveUp();
						}
						transposeUp();

					}
					else if(semitones == 10) {
						if(!(tone.equals("c") || tone.equals("c^") || tone.equals("d_"))) {
							checkOctaveUp();	
						}
						transposeUp();
					}
					else if(semitones == 9) {
						if(!(tone.equals("c") || tone.equals("c^") || tone.equals("d_") || 
							tone.equals("d"))) {
							checkOctaveUp();
						}
						transposeUp();

					}
					else if(semitones == 8) {
						if(!(tone.equals("c") || tone.equals("c^") || tone.equals("d_") || 
							tone.equals("d") || tone.equals("d^") || tone.equals("e_"))) {
							checkOctaveUp();
						}
						transposeUp();

					}
					else if(semitones == 7) {
						if(!(tone.equals("c") || tone.equals("c^") || tone.equals("d_") || 
							tone.equals("d") || tone.equals("d^") || tone.equals("e_") ||
							tone.equals("e"))) {
							checkOctaveUp();
						}
						transposeUp();
					}
					else if(semitones == 6) {
						if(!(tone.equals("c") || tone.equals("c^") || tone.equals("d_") || 
							tone.equals("d") || tone.equals("d^") || tone.equals("e_") ||
							tone.equals("e") || tone.equals("f"))) {
							checkOctaveUp();
						}
						transposeUp();
					}
					else if(semitones == 5) {
						if(!(tone.equals("c") || tone.equals("c^") || tone.equals("d_") || 
							tone.equals("d") || tone.equals("d^") || tone.equals("e_") ||
							tone.equals("e") || tone.equals("f") || tone.equals("f^") ||
							tone.equals("g_"))) {
							checkOctaveUp();
						}
						transposeUp();
					}
					else if(semitones == 4) {
						if(!(tone.equals("c") || tone.equals("c^") || tone.equals("d_") || 
							tone.equals("d") || tone.equals("d^") || tone.equals("e_") ||
							tone.equals("e") || tone.equals("f") || tone.equals("f^") ||
							tone.equals("g_") || tone.equals("g"))) {
							checkOctaveUp();
						}
						transposeUp();
					}
					else if(semitones == 3) {
						if(!(tone.equals("c") || tone.equals("c^") || tone.equals("d_") || 
							tone.equals("d") || tone.equals("d^") || tone.equals("e_") ||
							tone.equals("e") || tone.equals("f") || tone.equals("f^") ||
							tone.equals("g_") || tone.equals("g") || tone.equals("g^") ||
							tone.equals("a_"))) {
							checkOctaveUp();
						}
						transposeUp();
					}
					else if(semitones == 2) {
						if(tone.equals("a^") || tone.equals("b_") || tone.equals("b")) {
							checkOctaveUp();
						}
						transposeUp();
					}
					else if(semitones == 1) {
						if(tone.equals("b")) {
							checkOctaveUp();
						}
						transposeUp();
					}
					//if(tone.equals("b")) {
					//	originalOct += 1;
					//	this.octave = originalOct + "";
					//	transposeUp();
					//}
					//else {
						//transposeUp();
					//}
				}

			}
			else {//if (semitones < 0 && !tone.equals("r")) {
				for (int i = 0; i < Math.abs(semitones); i++) {
					transposeDown();
				}			
			}
		}
		else if (tone.equals("r")) {

		}

		
	}
	
	public static void main(String[] args) {
		//Just for testing
		/*Note n1 = new Note("e_4", "2");
		System.out.println(n1.toString());
		n1.transpose(-3);*/
	}
	
}