import java.util.ArrayList;

class Fruit implements Eatable {
	public String toString() { return "Fruit";}
}
class Apple extends Fruit { public String toString() { return "Apple";}}
class Grape extends Fruit { public String toString() { return "Grape";}}
class Toy                 { public String toString() { return "Toy"  ;}}

interface Eatable {}

class Ex12_3 {
	public static void main(String[] args) {
		Box b = null;
		Box<String> bStr = null;
		
		b = (Box)bStr;	// Box<String> -> Box : possible but warning
		bStr = (Box<String>)b;	// Box -> Box<String> : possible but warning	
	}  // main
}

class FruitBox<T extends Fruit & Eatable> extends Box<T> {}	//Eatable이 없어도 동일조상이므로 구현가능

class Box<T> {
	ArrayList<T> list = new ArrayList<T>();		//item을 저장할 리스트
	void add(T item) { list.add(item);     }	//박스에item을추가
	T get(int i)     { return list.get(i); }	//박스에서item	을꺼내올때
	int size()       { return list.size(); }
	public String toString() { return list.toString();}
}