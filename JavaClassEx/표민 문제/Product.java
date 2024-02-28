package ex05;

public class Product {
	
	private String product;
	private String comm;
	private int price;
	int num =0;
	
	private static int count = 1200;
	
	//생성자
	public Product() {
		
		this.setProduct("새우깡");
		this.setComm("농심");
		this.setPrice(1900);
		this.list();
		
		this.setProduct("빼빼로");
		this.setComm("롯데");
		this.setPrice(2200);
		this.list();
		
		this.setProduct("먹태깡");
		this.setComm("농심");
		this.setPrice(2500);
		this.list();
		
		this.setProduct("수미칩");
		this.setComm("몰루");
		this.setPrice(21000);
		this.list();		
		
		System.out.println("\n 출고 상품 : " + num);	
	}

	public void list() {	
		System.out.println(count +"\t"+ product +"\t"+ comm +"\t"+ price+ "원" );
		count++;
		num++;
	}
	//getter, setter

	public static int getCount() {
		return count;
	}
	
	public static void setCount(int count) {
		Product.count = count;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getComm() {
		return comm;
	}

	public void setComm(String comm) {
		this.comm = comm;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	

}
