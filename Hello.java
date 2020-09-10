class Hello {
	public static String salute(String name) {
		return "Hello, " + name + "!";
	}

	public static void main(String[] args) {
		System.out.println(salute(args[0]));
	}
}
