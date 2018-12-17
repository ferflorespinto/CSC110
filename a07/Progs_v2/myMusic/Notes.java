//myMusic is the package structure for Voice and Notes class
package myMusic;

public class Notes {
	private String pitch;
	private String duration;
	
	//Declare tone and octave for more readable purpose
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
	
	public Notes(String pitch, String duration){
		this.pitch = pitch;
		this.duration = duration;
		this.tone = pitch.substring(0,pitch.length()-1);
		this.octave = pitch.substring(pitch.length()-1);
	}
	
	public String toString() {
		String note = this.pitch + " " + this.duration;
		return note;
	}
	
	//For both up and down transpose, we look if each tone exists
	//in transposeTable; if not, the tone remains the same.
	//This is good when we found a silence tone and we don't want alter it

	private void transposeUp() {
		for (int i = 0; i < transposeTable.length; i++) {
			if (transposeTable[i][0].equals(this.tone)) {
			 this.tone = transposeTable[i][1];
			 break;
			}
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
		this.pitch = this.tone + this.octave;
		
	}	
	public void transpose(int semitones) {
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
	
	public static void main(String[] args) {
		/*Notes n1 = new Notes("e_4", "2");
		System.out.println(n1.toString());
		n1.transpose(-3);*/
	}
	
}