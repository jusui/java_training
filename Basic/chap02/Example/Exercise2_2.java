import static java.lang.System.*;

class Exercise2_2 {

    public static void main(String[] args) {
	Computer comp1 = new Computer();
	Computer comp2 = new Computer();

	comp1.model = "F-04E";
	comp1.serialNumber = 723984792;
	comp1.power = true;

	comp1.model = "G-02C";
	comp1.serialNumber = 395871239;
	comp1.power = false;
	
	comp1.powerButton();	
	comp1.powerButton();

    }

}
