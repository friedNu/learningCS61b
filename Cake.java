public class Cake{

	String taste;
	int price;

	public Cake(int m, String n){
		this.price = m;
		this.taste = n;
	}

	public void Taste(){
		System.out.println("This cake tastes of " + this.taste);
	}

	public void Buy(int p){
		if(this.price > p){
			System.out.println("Your money is not enough!");
		}
		else {
			System.out.println("Purchase done." + "Cost" + this.price);
		}
	}

	public static void main(String[] args){
		Cake c1 = new Cake(10 , "strawberry");
		c1.Taste();
		c1.Buy(19);
		c1.Buy(9);
	}
}