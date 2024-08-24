package FactoryMethod;

public abstract class DocumentCreator {
	public abstract Document createDocument();
	public void openDocument() {
		Document doc = createDocument();
		doc.open();
	}
}
