/**
 * @author Vlasyuk Sergey
 *
 */
class ListOnEmpty extends Exception{
	String event = "List is empty!\n";
}

class WrongPositionOfElement extends Exception{
	String event = "Wrong defined element position!\n";
}

class DoubleList {
	Node first;
	Node last;
	int size;
	
	private static class Node{
		public int data;
		public Node prev;
		public Node next;
	}
	
	public int size(){
		return this.size;
	}
	
	public void add(int element, int position){
		try{
			if(position<0 || position>size){
				throw new WrongPositionOfElement();
				} 
			} 
			catch (WrongPositionOfElement e){
				System.out.println(e.event);
				e.printStackTrace();
			} 
		if(position>=0 & position<=size){
		Node elem = new Node();
		elem.data = element;
		if(size == 0){
			first = elem;
			last = elem;
			size++;
			return;
		}
		if(position == 0){
			elem.next=first;
			first.prev=elem;
			first=elem;
			size++;
			return;
		}
		if(position == size){
			last.next = elem;
			elem.prev=last;
			last=elem;
			size++;
			return;
		}
		Node temp = first;
		int count = 0;
		while (count<position){
			temp = temp.next;
			count++;
		}
		elem.next = temp.next;
		elem.prev = temp;
		temp.next.prev = elem;
		temp.next = elem;
		size++;
		}
	}
	
	public void delete (int position){
		try{
			if(first==null){
				throw new ListOnEmpty();
				} else {
				first = first.next;
				}
			} 
			catch (ListOnEmpty e){
				System.out.println(e.event);
				e.printStackTrace();
			} 
			finally{
				System.out.println("Finally\n");	
			}
		try{
			if(position<0 || position>=size){
				throw new WrongPositionOfElement();
				} 
			
			if(position>=0 & position<size){
				if(position == 0){
					size--;
					first = first.next;
					first.prev = null;
					return;
				}
				if(position == size-1){
					size--;
					last = last.prev;
					last.next = null;
					return;
				}			
				Node temp = first;
				int count = 0;
				while (count<position-1){
					temp = temp.next;
					count++;				
				}
				temp.next = temp.next.next;
				temp.next.prev = temp;
				size--;
			}
		} 
		catch (WrongPositionOfElement e){
			System.out.println(e.event);
			e.printStackTrace();
		} 
	}
	
	public Integer getElement(int position){		
		try{
			if(position<0 || position>=size){
				throw new WrongPositionOfElement();
				} 
			} 
			catch (WrongPositionOfElement e){
				System.out.println(e.event);
				e.printStackTrace();
			} 
		if(position<0 || position>=size){
			return null;
		} else {
			int counter = 0;
			Node temp = first;
			while(position>counter){
					counter++;
					temp = temp.next;
				} 
			return temp.data;
		}
	}	
}