/*
  단방향 Linked List 뒤부터 세기 in Java
*/

public class FindElementV3 {
    static class Reference {
        int count = 0;
    }
    public static LinkedList.Node solution1(LinkedList.Node node, int k, Reference reference) {
        if (node == null) {
            return null;
        }
        LinkedList.Node find = solution1(node.next, k, reference);
        reference.count++;
        if (reference.count == k) {
            find = node;
        }
        return find;
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);

        Reference reference = new Reference();
        LinkedList.Node answer = solution1(linkedList.header.next, 2, reference);
        System.out.println(answer.data);
    }
}
