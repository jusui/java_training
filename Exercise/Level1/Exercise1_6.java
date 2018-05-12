class Exercise1_6 {
    public static void main(String[] args) {
	int total = 0, i;

	i = 1;
	while ( i <= 8 && total <= 22 ) {
	    total = total + i;
	    i++;
	    System.out.println(i + "\t" + total);
	}
	System.out.println("total =" + total);
    }
}
