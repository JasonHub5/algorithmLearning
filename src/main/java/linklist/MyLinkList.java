package linklist;

public class MyLinkList<E> {

    /*
    addFirst(LNode node)
    addLast(LNode node)
    insertAfter(LNode node)
    insertBefore(LNode node)
    findByIndex(int index)
    deleteFirst()
    deleteLast()
    deleteIndex(int index)
    deleteNode(LNode node)
     */
    private static class LNode<E> {
        E data;
        LNode<E> next;

        LNode(E data, LNode<E> node) {
            this.data = data;
            this.next = next;
        }
    }

    int count = 0;

    LNode<E> head;

    public int count() {
        return count;
    }

    public void printList() {
        if (head == null) {
            return;
        }
        LNode<E> current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void addFirst(E data) {
        LNode<E> newNode = new LNode<>(data, null);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        count++;
    }

    public void addLast(E data) {
        LNode<E> newNode = new LNode<>(data, null);
        if (head == null) {
            head = newNode;
        } else {
            LNode tempNode = head;
            while (tempNode.next != null) {
                tempNode = tempNode.next;
            }
            tempNode.next = newNode;
        }
        count++;
    }

    public void insertAfter(LNode node) {
        if (node == null) {
            return;
        }

        if (head == node) {
            node.next = head.next;
            head.next = node;
        } else {
            LNode tempNode = head;
            while (tempNode != node && tempNode != null) {
                tempNode = tempNode.next;
            }
            if (tempNode == null) {
                return;
            }
            node.next = tempNode.next;
            tempNode.next = node;
        }
    }

    public void insertBefore(LNode node) {
        if (node == null) {
            return;
        }

        if (head == node) {
            node.next = head;
            head.next = node;
        } else {
            LNode tempNode = head;
            while (tempNode.next != node && tempNode != null) {
                tempNode = tempNode.next;
            }
            if (tempNode == null) {
                return;
            }
            node.next = tempNode.next;
            tempNode.next = node;
        }
    }

    public E findByIndex(int index) {
        if (index < 0) {
            return null;
        }

        LNode<E> node = head;
        for (int i = 1; i <= index; i++) {
            node = node.next;
        }
        if (node == null) {
            return null;
        }
        return node.data;
    }

    public void deleteFirst() {
        if (head == null) {
            return;
        }

        head = head.next;
    }

    public void deleteLast() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        LNode tempNode = head;
        while (tempNode.next.next != null) {
            tempNode = tempNode.next;
        }
        tempNode.next = null;
    }

    /**
     * 查找中间节点
     */
    public E findMidNode() {
        if (head == null) {
            return null;
        }

        LNode<E> tempNode = head;
        LNode<E> tempMidNode = head;
        int i = 0;
        while (tempNode.next != null) {
            tempNode = tempNode.next;
            if (i % 2 > 0) {
                tempMidNode = tempMidNode.next;
            }
            i++;
        }
        return tempMidNode.data;
    }
}
