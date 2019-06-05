
class NodeService {

    private Node root;

    static class Node {

        String value;
        Node next;
        Node subnext;

        Node(String d) {
            value = d;
            next = null;
            subnext = null;
        }
    }

    void addservice(NodeService list, String value2) {

        Node next_node = new Node(value2);
        next_node.next = null;
        next_node.subnext = null;


        if (list.root == null) {
            list.root = next_node;
        } else {
            Node last = list.root;
            while (last.next != null) {
                last = last.next;
            }

            last.next = next_node;
        }

    }

    void addSub(NodeService list, String value2, String service2) {

        Node next_node = new Node(value2);
        next_node.next = null;
        next_node.subnext = null;


        Node newNode = list.root;

        do {
            if (newNode.value.contains(service2)) {

                if (newNode.subnext == null) {
                    newNode.subnext = next_node;
                } else {
                    Node newSubNode = newNode.subnext;
                    while (newSubNode.next != null) {
                        newSubNode = newSubNode.next;
                    }

                    newSubNode.next = next_node;
                    return;
                }
            }
            newNode = newNode.next;
        } while (newNode != null);

    }


    String Listservice(NodeService list) {

        Node newNode = list.root;

        String result = "<html> ";

        while (newNode != null) {
            result = result.concat(newNode.value + " => ( ");
            if (newNode.subnext != null) {
                Node newNode2 = newNode.subnext;
                while (newNode2 != null) {
                    result = result.concat(newNode2.value + " ");
                    newNode2 = newNode2.next;
                }
            }
            result = result.concat(" )  <br/> ");
            newNode = newNode.next;
        }
        result = result.concat("</html>");
        System.out.println(result);
        return result;
    }

    String Listservicefrom(NodeService list, String value) {

        Node newNode = list.root;

        String result = "<html>";


        do {
            if (newNode.value.contains(value)) {

                Node newSubNode = newNode.subnext;
                result = result.concat(newNode.value + " ");
                result = result.concat("=> ( ");
                while (newSubNode != null) {
                    result = result.concat(newSubNode.value +"  ");
                    newSubNode = newSubNode.next;
                }
                result = result.concat(" ) ");
            }
            newNode = newNode.next;
        } while (newNode != null);

        result = result.concat("</html>");
        return result;
    }

    void Deleteservice(NodeService list, String value) {

        Node newNode = list.root;
        Node back = null;

        if (list.root == null) {
            return;
        }

        if (value.contains(list.root.value)) {

            list.root = newNode.next;
            return;
        }

        do {

            if (newNode.value.contains(value)) {
                assert null != back;
                back.next = newNode.next;
                return;
            }
            back = newNode;
            newNode = newNode.next;

        } while (newNode != null);


    }

}
