class d50Q27kadai {
	public static void main(String[] args) {
		int control =  3;
		String mode;

		switch (control) {
			case 1:
				mode = "Warm";
			case 2:
				mode = "Coo1";
			default:
				mode = "Wind";
				break;
			}
		System.out.print(mode);
	}
}
