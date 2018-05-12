class Exercise9_4 {
    public static void main(String[] args) {
	int total = 0, i;

	for ( i = 1; i <= 10; i++ ) {

	    if ( i >= 8) {
		System.out.println("i(loop1) = " + i);				
		continue;
	    }
	    total++;
	    System.out.println("total(loop1) = " + total);
	    
	    if ( i >= 4 && i <= 7 ) {
		System.out.println("i(loop2) = " + i);		
		continue;
	    }
	    total++;
	    System.out.println("total(loop2) = " + total);		
	    
	}
	System.out.println("total = " + total);
    }
}
