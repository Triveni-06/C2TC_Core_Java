package c2tc.application;
import c2tc.framework.NormalAcc;
public class GSNormalAcc extends NormalAcc {
	
	 public GSNormalAcc(int accno, String accname, float charges) {
		 super(accno, accname, charges);
	 }
	 @Override
	 public void bookProducts(float charges) {
		 System.out.println("you have purchased the product with charges:"+charges+"along with delevery charges :"+deleverycharges);
		 
	 }
	 @Override
	 public String toString() {
		 return "GSNormalAcc [getDeleverycharges()=" + getDeleverycharges() + ", getAccno()= " + getAccno()
		 		+ ", getAccname()=" + getaccname() + ", getCharges()=" + getCharges() + "]";
	 }
}
