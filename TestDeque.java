package src.ifma.lista04;

public class TestDeque {
    public static void main(String[] args) {
        Deque deque = new Deque();  // Não é necessário especificar tipo, mas você poderia usar Deque<Aluno>

        Aluno aluno1 = new Aluno("Maisa");
        Aluno aluno2 = new Aluno("Guilherme");

        deque.addLast(aluno1);
        deque.addLast(aluno2);

        System.out.println("Deque: " + deque);

        System.out.println("Primeiro aluno: " + deque.getFirst());
        System.out.println("Último aluno: " + deque.getLast());

        System.out.println("Removendo o primeiro: " + deque.removeFirst());
        System.out.println("Deque: " + deque);
    }
}
