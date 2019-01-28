package MODEL;

public class ShopDbBean {

	private int MobId;
	private String product;
	private int available;
	public ShopDbBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ShopDbBean(int mobId, String product, int available) {
		super();
		MobId = mobId;
		this.product = product;
		this.available = available;
	}
	@Override
	public String toString() {
		return "ShopDbBean [MobId=" + MobId + ", product=" + product + ", available=" + available + "]";
	}
	public int getMobId() {
		return MobId;
	}
	public void setMobId(int mobId) {
		MobId = mobId;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public int getAvailable() {
		return available;
	}
	public void setAvailable(int available) {
		this.available = available;
	}
	
}
