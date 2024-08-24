package FactoryMethod;

public class WordDocumentCreator extends DocumentCreator{

	@Override
	public Document createDocument() {
		// TODO Auto-generated method stub
		return (Document) new WordDocument();
	}
	
}
