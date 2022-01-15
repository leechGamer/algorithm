/*
정렬되지 않은 linkedlist가 있다. 중복값을 제거하라. (단, buffer 사용 불가)
*/
  public void removeDuplicate() {
        Node node = this.header.next;
        while (node != null && node.next != null) {
            int num = node.data;
            Node node2 = node;
            while (node2.next != null){
                if (num == node2.next.data) {
                    node2.next = node2.next.next;
                } else {
                    node2 = node2.next;
                }
            }
            node = node.next;
        }
  }
