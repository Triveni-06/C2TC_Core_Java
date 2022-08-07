package c2tc.application;
import c2tc.framework.NormalAcc;
import c2tc.framework.PrimeAcc;
import c2tc.framework.Shopfactory;
public class GSShopfactory implements Shopfactory {
	@Override
	public PrimeAcc getNewPrimeAccount(int accno, String accname, float charges) {
		PrimeAcc pa=new PrimeAcc(accno, accname, charges);
		return pa;
	}
	public NormalAcc getNormalAccount(int accno, String accname, float charges) {
		NormalAcc na=new NormalAcc(accno, accname, charges);
		return na;
	}
	@Override
	public NormalAcc getNewNormalAccount(int accno, String accname, float charges) {
		// TODO Auto-generated method stub
		return null;
	}

}
