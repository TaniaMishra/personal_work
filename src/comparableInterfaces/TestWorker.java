package comparableInterfaces;

import java.util.ArrayList;

public class TestWorker {
	public static void main(String[] args) {
		ArrayList<WorkerStart> workers = new ArrayList<WorkerStart>();
		for (int i = 200; i > 100; i--) {
			workers.add(new WorkerStart(i-20, i+2));
		}
		
		int largest = 0;		//starts with index 0
		int smallest = 0;		//starts with index 0
		for (int i = 1; i < workers.size(); i++) {
			if (workers.get(i).compareTo(workers.get(largest)) == 1) {
				largest = i;
			}
			else if (workers.get(i).compareTo(workers.get(smallest)) == -1) {
				smallest = i;
			}
		}
		
		System.out.println("Smallest rate of workers: " + workers.get(smallest).toString());
		System.out.println("Largest rate of workers: " + workers.get(largest).toString());
	}
}
