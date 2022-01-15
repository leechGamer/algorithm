public class FindKElement {
    public static int solution1(LinkedList linkedList, int k) {
        LinkedList.Node node = linkedList.header;
        int size = 0;
        while (node.next != null) {
            size++;
            node = node.next;
        }
        node = linkedList.header.next;

        int count = 0;
        while (node.next != null) {
            int num = size - count;
            if (num == k) {
                return node.data;
            }
            node = node.next;
            count++;
        }
        return -1;
    }
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);

        int answer = solution1(linkedList, 2);
        System.out.print(answer);
    }
}
