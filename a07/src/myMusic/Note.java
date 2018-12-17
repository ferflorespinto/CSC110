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
	private int octave;
	
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
		if (this.pitch.equals("r")) {
			this.tone = this.pitch;
			this.octave = 0;
		}
		else {
			this.octave = Integer.parseInt(pitch.substring(pitch.length() - 1));
			this.tone = pitch.substring(0, pitch.length() - 1);
		}
	}
	
	public String toString() {
		String note = this.pitch + " " + this.duration;
		return note;
	}
	
	/* For both up and down transpositions, we check if each tone exists
	 * in transposeTable; if not, the tone remains the same. This is useful
	 * when we find a silence and we don't want to alter the table.
	 */
	private void transposeUp() {
		if (tone.equals("b"))
			this.octave++;

		for (int i = 0; i < transposeTable.length; i++) {
			if (transposeTable[i][0].equals(this.tone)) {
			 this.tone = transposeTable[i][1];
			 break;
			}
		}
		this.pitch = this.tone + Integer.toString(this.octave);
	}
	private void transposeDown() {
		if (tone.equals("c"))
			this.octave--;
			 
		for (int i = 0; i < transposeTable.length; i++) {
			if (transposeTable[i][1].equals(this.tone)) {
			 this.tone = transposeTable[i][0];
			 break;
			}
		}
		this.pitch = this.tone + Integer.toString(this.octave);
		
	}	
	public void transpose(int semitones) {
		if (!tone.equals("r")) {

			if (semitones > 0)
				for (int i = 0; i < semitones; i++) {
					transposeUp();
				}
			else {
				for (int i = 0; i < Math.abs(semitones); i++) {
					transposeDown();
				}			
			}
		}
		
	}
	
	public static void main(String[] args) {
		/*Notes n1 = new Notes("r", "4");
		System.out.println(n1.toString());
		n1.transpose(-1);
		System.out.println(n1.toString());
		*/
	}
}