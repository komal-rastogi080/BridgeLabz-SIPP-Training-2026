package Algorithms.LinkedList;

public class TrainManagement {
    private Node head;

    private static class Node {
        int coachId;
        Node next;

        Node(int coachId) {
            this.coachId = coachId;
        }
    }

    public TrainManagement() {
        this.head = null;
    }

    public void addCoach(int coachId) {
        Node newNode = new Node(coachId);
        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public boolean removeCoach(int coachId) {
        if (head == null) {
            return false;
        }

        if (head.coachId == coachId) {
            head = head.next;
            return true;
        }

        Node current = head;
        while (current.next != null && current.next.coachId != coachId) {
            current = current.next;
        }

        if (current.next == null) {
            return false;
        }

        current.next = current.next.next;
        return true;
    }

    public void reverseTrain() {
        Node previous = null;
        Node current = head;
        Node nextNode;

        while (current != null) {
            nextNode = current.next;
            current.next = previous;
            previous = current;
            current = nextNode;
        }

        head = previous;
    }

    public int findMiddleCoach() {
        if (head == null) {
            throw new IllegalStateException("Train is empty");
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.coachId;
    }

    public boolean detectCircularCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public static TrainManagement mergeTwoSortedTrainSchedules(TrainManagement first, TrainManagement second) {
        TrainManagement merged = new TrainManagement();
        Node dummy = new Node(0);
        Node tail = dummy;

        Node current1 = first.head;
        Node current2 = second.head;

        while (current1 != null && current2 != null) {
            if (current1.coachId <= current2.coachId) {
                tail.next = current1;
                current1 = current1.next;
            } else {
                tail.next = current2;
                current2 = current2.next;
            }
            tail = tail.next;
        }

        if (current1 != null) {
            tail.next = current1;
        } else {
            tail.next = current2;
        }

        merged.head = dummy.next;
        return merged;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.coachId);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        TrainManagement train = new TrainManagement();
        train.addCoach(10);
        train.addCoach(20);
        train.addCoach(30);
        train.addCoach(40);

        System.out.println("Original train:");
        train.display();

        train.removeCoach(20);
        System.out.println("After removal:");
        train.display();

        train.reverseTrain();
        System.out.println("After reversal:");
        train.display();

        System.out.println("Middle coach: " + train.findMiddleCoach());

        TrainManagement first = new TrainManagement();
        first.addCoach(5);
        first.addCoach(15);
        first.addCoach(25);

        TrainManagement second = new TrainManagement();
        second.addCoach(10);
        second.addCoach(20);
        second.addCoach(30);

        TrainManagement merged = mergeTwoSortedTrainSchedules(first, second);
        System.out.println("Merged sorted train:");
        merged.display();
    }
}
