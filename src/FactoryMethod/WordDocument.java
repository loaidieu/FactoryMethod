package FactoryMethod;

public class WordDocument implements Document{

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("Opening Word document");
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("Closing word document");
	}

}
