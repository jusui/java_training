class Exercise9_5 {
    public static void main(String[] args) {
	int total = 0, i, j;

	for ( i = 1; i <= 5; i++ ) {
	    for ( j = 1; j <= 5; j++ ) {
		if ( j > i ) {
		    break;
		}
		total++;
		System.out.println("(i, j) = " + i + ", "+ j);
		System.out.println("total++ " + total);		
	    }
	}
	System.out.println("total = " + total);
    }
}
