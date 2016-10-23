
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(Showable.show(new Pair<String,Integer>("Hello World",42)));
		System.out.println(Showable.show(42));
		System.out.println(Showable.show(new Pair<String,String>("Hello","World")));
		System.out.println(Showable.show(new Pair<Integer,Integer>(41,42)));
		System.out.println(Showable.show(42));
		System.out.println(Showable.show("Hello World"));
		System.out.println(Showable.show(new Pair<Pair,Pair>(new Pair<Integer,String>(1,"Hello "),new Pair<Integer,String>(2," World"))));
		System.out.println(Showable.show(new Pair<Pair, Pair>(new Pair<Integer,Integer>(1,2),new Pair<Integer,Integer>(2,3))));
		System.out.println(Showable.show(new Pair<Pair, Pair>(new Pair<String,String>("Hello "," World"),new Pair<String,String>(" World","Hello "))));
		System.out.println(Showable.show(new Pair<Pair, Pair>(new Pair<Integer,Pair>(1,new Pair<String,Integer>(" 2",3)),new Pair<String,Integer>(" 4",5))));
	}

}



