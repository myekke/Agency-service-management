class NodeAgency {

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

    void addagency(NodeAgency list, String value) {


        Node next_node = new Node(value);
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


    String Listagency(NodeAgency list) {

        Node newNode = list.root;

        String result = "<html> ";
        while (newNode != null) {

            result = result.concat(newNode.value + " <br/> ");
            newNode = newNode.next;
        }
        result = result.concat("</html>");
        return result;
    }


}
