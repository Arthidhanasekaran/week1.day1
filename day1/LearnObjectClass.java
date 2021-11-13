package week1.day1;

public class LearnObjectClass {
	String brandname;
	int price;
	public void mbleprice() {
        System.out.println("Cost of mobile");
	}
	public void mblemodel() {
		System.out.println("Brand name");
	}
    public static void main(String[] args) {
    	LearnObjectClass mblespec = new LearnObjectClass();
    	mblespec.brandname = "1+";
    	mblespec.mblemodel();
    	System.out.println(mblespec.brandname);
    	mblespec.price = 40000;
    	mblespec.mbleprice();
    	System.out.println(mblespec.price);
    }
}
