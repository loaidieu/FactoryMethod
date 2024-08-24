package FactoryMethod;

public class Driver {
	public static void main(String[] args)
	{
		DocumentCreator wordDocumentCreator = new WordDocumentCreator();
		wordDocumentCreator.openDocument();
	}
}
