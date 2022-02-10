//Сделать добавление и удаление из односвязанного списка по инексу
package home.com;

public class OwnLinkedListMain {
    public static void main(String[] args) {
        OwnLinkedList<Integer> integerOwnLinkedList = new OwnLinkedList<>();
        integerOwnLinkedList.addNode("1",150);
        integerOwnLinkedList.addNode(347);
        integerOwnLinkedList.addNode(111);
        integerOwnLinkedList.addNode(789);
        integerOwnLinkedList.addNode(222);
        integerOwnLinkedList.addNode(345);
        integerOwnLinkedList.addNode(222);

        integerOwnLinkedList.deleteNode(0);



        integerOwnLinkedList.display();
        integerOwnLinkedList.display(2);
    }
}