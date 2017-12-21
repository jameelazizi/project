import java.util.Hashtable;
public class SuperMarket {
	Hashtable<String, Grocery> superMarket;
	public SuperMarket(){
		superMarket= new Hashtable <>();

	}
	void addGrocery(Grocery grocery){
		superMarket.put(grocery.name, grocery);
	}
	void printStore(){
		for(String productName: superMarket.keySet()){
			System.out.println(superMarket.get(productName));
		}
	}
	public static void main(String[] args){
		SuperMarket superMarket= new SuperMarket();
		superMarket.addGrocery(new Grocery("Book","New",5,25));
		superMarket.addGrocery(new Grocery("Paint","New",2,4));
		superMarket.addGrocery(new Grocery("Camera","Old",1.25,7));
		superMarket.addGrocery(new Grocery("Phone","Old",1.25,7));
		superMarket.addGrocery(new Grocery("Helmet","New",8,43));
		superMarket.addGrocery(new Grocery("Jersey","New",5,4));
		superMarket.addGrocery(new Grocery("Pants","New",.50,35));
		superMarket.addGrocery(new Grocery("Chair","Fresh",.25,8));
		superMarket.addGrocery(new Grocery("Playstation","New",.75,40));
		superMarket.addGrocery(new Grocery("Computer","Old",1,11));
		superMarket.printStore();

		
	}

}
