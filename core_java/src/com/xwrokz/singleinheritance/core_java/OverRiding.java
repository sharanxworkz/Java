
public class OverRiding {
public static void main(String[] args) {
	Rbi rbi = new Rbi ();
	StateBank statebank = new StateBank();
	Hdfc hdfc = new Hdfc ();
	rbi.InterestRate();
	statebank.InterestRate();
	hdfc.InterestRate();
	
	
}
}
