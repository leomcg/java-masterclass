package abstractClasses;

public class MyLinkedList implements NodeList {
	
	private ListItem root = null;

	public MyLinkedList(ListItem root) {
		super();
		this.root = root;
	}

	@Override
	public ListItem getRoot() {
		return this.root;
	}

	@Override
	public boolean addItem(ListItem newItem) {
		if(this.root == null) {
			this.root = newItem;
			return true;
		}
		
		ListItem currentItem = this.root;
		while(currentItem != null) {
			int comparison = currentItem.compareTo(newItem);
			if(comparison < 0) {
				//New item is greater, move right if possible
				if(currentItem.next() != null) {
					currentItem = currentItem.next();
				} else {
					//reached the end of the list
					currentItem.setNext(newItem);
					newItem.setPrevious(currentItem);
					return true;
				}
			} else if(comparison > 0) {
				//new item is less, insert before
				if(currentItem.previous() != null) {
					currentItem.previous().setNext(newItem);
					newItem.setPrevious(currentItem.previous());
					newItem.setNext(currentItem);
					currentItem.setPrevious(newItem);
				} else {
					//the node without a previous is the root
					newItem.setNext(this.root);
					this.root.setPrevious(newItem);
					this.root = newItem;
				}
				return true;
			} else {
				System.out.println(newItem.getValue() + " is already in the list");
				return false;
			}
		}
		return false;
	}

	@Override
	public boolean removeItem(ListItem item) {
		
00	}

	@Override
	public void traverse(ListItem root) {
		if(root == null) {
			System.out.println("The list is empty");
		} else {
			while(root != null) {
				System.out.println(root.getValue());
				root = root.next();
			}
		}
		
	}

}
