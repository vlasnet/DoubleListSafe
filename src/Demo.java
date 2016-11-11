
public class Demo {
	public static void main(String[] args) {
			DoubleList test = new DoubleList();
//			test.delete(1);
			test.add(0, 0);//0
			test.add(1, 1);//1
			test.add(2, 2);//2
			test.add(3, 3);//3
			test.add(4, 4);//4
			test.add(5, 5);//5
//			test.add(10, 16);
//			test.delete(10);
			
			System.out.println("Size: " + test.size);
			int j = 2;
			System.out.println("Element content: "+  test.getElement(j-1) + " " + test.getElement(j) + " " + test.getElement(j+1));
			
//			test.delete(j);
//			System.out.println("Size: " + test.size);
//			System.out.println("Element content: "+  test.getElement(j-1) + " " + test.getElement(j) + " " + test.getElement(j+1) + " " + test.getElement(16));

		}

	}
