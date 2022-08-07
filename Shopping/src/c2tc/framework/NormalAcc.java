package c2tc.framework;

public class NormalAcc extends ShopAcc {
	protected float deleverycharges=50;
	public NormalAcc(int accno, String accname, float charges) {
		super(accno, accname, charges);
	}
	public float getDeleverycharges() {
		return deleverycharges;
	}
	public void setDeleverychanges(float deleverycharges) {
		this.deleverycharges=deleverycharges;
	}

}
