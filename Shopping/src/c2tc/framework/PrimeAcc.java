package c2tc.framework;

public class PrimeAcc extends ShopAcc {
	public PrimeAcc(int accno, String accname, float charges) {
		super(accno,accname, charges);
		
	}
	private static boolean isPrime=true;
	public boolean isPrime() {
		return isPrime;
	}
	public void setPrime(boolean isPrime) {
		this.isPrime = isPrime;
	}
	@Override
	public String toString() {
		return "PrimeAcc [isPrime=" + isPrime + ", getAccno()=" + getAccno() +", getAccname()=" + getaccname() 
		+ ", getCharges()=" + getCharges() +"]";
	}
}
