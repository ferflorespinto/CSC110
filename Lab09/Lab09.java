class xyz {
	int a;
	int b;

	void get() {
		int a;

		this.a = 10;
		b = 20;

	}
	void display() {
		System.out.println("The value of 'a' is " + a);
		System.out.println("The value of 'b' is " + b);

	}
	public static void main(String[] args) {
		xyz q = new xyz();
		q.get();
		q.display();

	}
}