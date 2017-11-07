
public class ThreeStackTestClient {

	public static void main(String[] args) {
		ThreeStackQueue tq = new ThreeStackQueue();

		tq.enqueue(1);
		tq.enqueue(2);
		tq.enqueue(3);
		tq.enqueue(4);

		;
		System.out.println(tq.dequeue());
		System.out.println(tq.dequeue());
		System.out.println(tq.dequeue());
		System.out.println(tq.dequeue());
		tq.enqueue(5);
		System.out.println(tq.dequeue());
	}
}
