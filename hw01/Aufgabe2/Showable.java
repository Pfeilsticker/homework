package main;


public abstract class Showable<T>{
	private T t;
	private static Showable<Integer> integerShowable;
	private static Showable<String> stringShowable;
	
	public Showable(T t){
		this.t=t;
	}
	
	/* Ich verstehe nicht ganz was diese Methode pair Showable und die Instanzen 
	 * integerShowable und stringShowable machen soll*/
	public static <S, T> Showable<Pair<S,T>> pairShowable(Showable<S> s ,Showable<T> t){
		return null;//new Showable(Pair(s,t));
	}

	
	/*
	 Aus irgend einem Grund funktioniert das Bounding bei den Rekursiven aufrufen in der Pair Methode, deshalb habe
	 ich das etwas unschön mit den if abfragen gelöst
	 */
	public static <T extends Pair> String show(T t){
	
		String a ="a";
		String b ="b";
		if(t.getKey() instanceof Integer)
			a = show((Integer) t.getKey());
		else if(t.getKey() instanceof String)
			a = show((String) t.getKey());
		else if(t.getKey() instanceof Pair)
			a = show((Pair) t.getKey());	
		
		if(t.getValue() instanceof Integer)
			b = show((Integer) t.getValue());
		else if(t.getValue() instanceof String)
			b = show((String) t.getValue());
		else if(t.getValue() instanceof Pair)
			b = show((Pair) t.getValue());
		return("("+ a +","+b+")");
	}
	public static <T extends String> String show(T t){
		return (String) t;
	}
	public static <T extends Integer> String show(T t){
		return(Integer.toString((Integer) t));
	}
	public static <T > String show(T t){
		System.out.println("t" +t.getClass());
		return("error");
	}	
	
	/*
	public static <T> String show(T t){
		if(t instanceof Pair){
			return("("+ Showable.show(((Pair) t).getKey())+","+Showable.show(((Pair) t).getValue())+")");
		}else if(t instanceof String){
			return (String) t;
		}
		else if(t instanceof Integer){
			return Integer.toString((Integer) t);
		}else
		return "Objekt kein String, Integer oder Pair"; 
	
	}*/	
}
