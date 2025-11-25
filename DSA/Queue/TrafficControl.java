class Node {
    Vehicle data;
    Node next;

    Node(Vehicle v) {
        this.data = v;
        this.next = null;
    }
}

class Vehicle {
    String plate;
    int arrivalTime;

    Vehicle(String plate, int time) {
        this.plate = plate;
        this.arrivalTime = time;
    }
}

class TrafficQueue {
    public Node front;
    public Node rear;

    public TrafficQueue() {
        front = rear = null;
    }

    public void enqueue(Vehicle v) {
        Node newNode = new Node(v);

        if (rear == null) {
            front = rear = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;
    }

    public Vehicle dequeue() {
        if (front == null) return null;

        Vehicle v = front.data;
        front = front.next;

        if (front == null) rear = null;

        return v;
    }

    public boolean isEmpty() {
        return front == null;
    }
}

public class TrafficControl {
    public static void main(String[] args) {
        TrafficQueue lane1 = new TrafficQueue();
        TrafficQueue lane2 = new TrafficQueue();

        lane1.enqueue(new Vehicle("CAR123", 0));
        lane1.enqueue(new Vehicle("CAR888", 1));
        lane1.enqueue(new Vehicle("CAR999", 2));

        lane2.enqueue(new Vehicle("CARY123", 0));
        lane2.enqueue(new Vehicle("CARY888", 1));
        lane2.enqueue(new Vehicle("CARY999", 2));
        lane2.enqueue(new Vehicle("CARY000", 3));

        System.out.println("=== Green Light ===");

        int time = 0;
        while (!lane1.isEmpty() || !lane2.isEmpty()) {

            Vehicle v1 = lane1.isEmpty() ? null : lane1.front.data;
            Vehicle v2 = lane2.isEmpty() ? null : lane2.front.data;

            Vehicle nextCar;
            TrafficQueue fromLane;

            // Pick the car with the earliest arrival time
            if (v1 != null && (v2 == null || v1.arrivalTime <= v2.arrivalTime)) {
                nextCar = lane1.dequeue();
                fromLane = lane1;
            } else {
                nextCar = lane2.dequeue();
                fromLane = lane2;
            }

            int wait = time - nextCar.arrivalTime;
            if (wait < 0) wait = 0;

            String laneName = (fromLane == lane1) ? "lane1" : "lane2";
            System.out.println(nextCar.plate + " passed from " + laneName + " (waited " + wait + ") at time " + time);

            time++;
        }
    }
}
