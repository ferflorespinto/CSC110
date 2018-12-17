package myMusic;

public class Notes {
	public String pitch;
	public String duration;
	public String tone;
	public String octave;
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
		this.tone = pitch.substring(0, pitch.length() - 1);
		this.octave = pitch.substring(pitch.length() - 1);
	}
	
	public String toString() {
		this.pitch = this.tone + this.octave;
		return this.pitch;
	}
	
	private void transposeUp() {
		for (int i = 0; i < transposeTable.length; i++) {
			if (transposeTable[i][0].equals(this.tone)) {
			 this.tone = transposeTable[i][1];
			 break;
			}
		}
		toString();
	}
	private void transposeDown() {
		for (int i = 0; i < transposeTable.length; i++) {
			if (transposeTable[i][1].equals(this.tone)) {
			 this.tone = transposeTable[i][0];
			 break;
			}
		}
		toString();
		
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
		System.out.println(n1.pitch+" "+n1.duration);
		n1.transpose(-3);*/
	}
	
}