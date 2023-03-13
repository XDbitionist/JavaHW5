package org.example;

public class First {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        printReversed(node1);
    }

    public static void printReversed(Node node) {
        if (node != null) {
            printReversed(node.next);
            System.out.print(node.value + "->");
        }
    }

    static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}

//Здесь мы создаем связанный список из четырех узлов и используем рекурсивную функцию printReversed для вывода значений узлов в перевернутом порядке.
// Функция вызывает сама себя с аргументом node.next до тех пор, пока не дойдет до последнего узла, после чего выводит значение узла в консоль.