package bookshelf;

public class BookShelf extends Shelf implements Queue {

	@Override
	public void enQueue(String title) {
		shelf.add(title);
	}

	@Override
	public String deQueue() {
		return shelf.remove(0);  //맨앞에 줄선애
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return getCount();
	}

}
