package src.ifma.lista04;

public class Deque {
    private Node head;
    private Node tail;

    public void addLast(Aluno element) {  // Alterando para Aluno
        Node newNode = new Node(element);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
    }

    public Aluno getFirst() {  // Alterando para Aluno
        if (head == null) {
            throw new IllegalStateException("Vazio");
        }
        return head.getElement();  // Retorna um objeto Aluno
    }

    public Aluno getLast() {  // Alterando para Aluno
        if (tail == null) {
            throw new IllegalStateException("Vazio");
        }
        return tail.getElement();  // Retorna um objeto Aluno
    }

    public Aluno removeFirst() {  // Alterando para Aluno
        if (head == null) {
            throw new IllegalStateException("Vazio!");
        }
        Aluno element = head.getElement();
        head = head.getNext();
        if (head == null) {
            tail = null;
        }
        return element;
    }

    public Aluno removeLast() {  // Alterando para Aluno
        if (tail == null) {
            throw new IllegalStateException("Vazio!");
        }
        if (head == tail) { // Apenas um elemento
            Aluno element = tail.getElement();
            head = tail = null;
            return element;
        }
        Node current = head;
        while (current.getNext() != tail) {
            current = current.getNext();
        }
        Aluno element = tail.getElement();
        tail = current;
        tail.setNext(null);
        return element;
    }
}
