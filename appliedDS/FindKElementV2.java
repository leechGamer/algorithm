/*
    V2 : 단방향 Linked List 뒤부터 세기 (재귀 사용)
*/
public class FindKElement {
    public static int solution1(LinkedList.Node node, int k) {
        if (node == null) {
            return 0;
        }
        int count = solution1(node.next, k) + 1;
        if (count == k) {
            System.out.println(node.data);
        }
        return count;
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
