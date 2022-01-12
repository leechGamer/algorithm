
public class FindElementV4 {
    public static LinkedList.Node solution1(LinkedList.Node node, int k) {
        LinkedList.Node p1 = node;
        LinkedList.Node p2 = node;

        for (int i=0;i<k;i++) {
            if (p2 == null) return null;
            p2 = p2.next;
        }

        while (p2 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);

        LinkedList.Node answer = solution1(linkedList.header.next, 4);
        System.out.println(answer.data);
    }
}
