public class TwoBlocks {
    public static LinkedList.Node solution1(LinkedList.Node node, int x) {
        /**
            LinkedList에 있는 노드들은
            x값을 기준으로
            값이 작은 것들은 왼쪽 큰것들은 오른쪽
            두파트로 나누시요(단, x는 오른쪽 파트 어디에 놔도 상관없음)
        */
        
        LinkedList.Node left = null;
        LinkedList.Node right = null;
        LinkedList.Node leftLast = null;
        LinkedList.Node rightLast = null;

        while (node != null) {
            LinkedList.Node next = node.next;
            node.next = null;
            if (node.data < x) {
                if (left == null) {
                    left = node;
                    leftLast = left;
                } else {
                    leftLast.next = node;
                    leftLast = node;
                }
            } else {
                if (right == null) {
                    right = node;
                    rightLast = node;
                } else {
                    rightLast.next = node;
                    rightLast = node;
                }
            }
            node = next;
        }

        if (left != null) {
            leftLast.next = right;
        }
        return left;
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.append(8);
        linkedList.append(5);
        linkedList.append(2);
        linkedList.append(7);
        linkedList.append(3);

        LinkedList.Node answer = solution1(linkedList.header.next, 5);
        
        while (answer != null) {
            System.out.println(answer.data);
            answer = answer.next;
        }
    }
}
