package src.ifma.lista04;

public class Node {
    private Aluno element;  // Alterando para Aluno
    private Node next;

    public Node(Aluno element) {  // Alterando o construtor para Aluno
        this.element = element;
    }

    public Aluno getElement() {  // Alterando para retornar Aluno
        return element;
    }

    public void setElement(Aluno element) {  // Alterando para Aluno
        this.element = element;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
