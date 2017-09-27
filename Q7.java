class Q7 {

	public static int output1;

	public static void CreatePin(int alpha, int beta, int gamma) {

		int a = 0, b = 0, g = 0;
		
		if (alpha <= 999) {
			a = alpha % 10;
		}
		if (beta <= 9) {
			b = beta;
		} else if (beta > 9) {
			b = (beta / 10) % 10;
		}
		if (gamma == 0) {
			g = 9;
		} else if (gamma <= 99) {
			g = gamma % 10;
		} else if (gamma > 99) {
			g = (gamma / 100) % 10;
		}
		System.out.println("" + g + b + a);
	}

	public static void main(String[] args) {
		CreatePin(0, 0, 0);
	}
}



/*public int compareTo(Object obj) {
	// TODO Auto-generated method stub
	System.out.println("I'm called");
	Emp e1=(Emp)obj;
	return this.name.compareTo(e1.name);
}*/