class NodeRun {


    private Node root;

    static class Node {

        String linkagancy;
        String linkservice;
        Node next;

        Node(String linkagancy2, String linkservice2) {

            linkagancy = linkagancy2;
            linkservice = linkservice2;
            next = null;
        }

    }

    void addOffer(NodeRun list, String agency, String service) {


        Node next_Node = new Node(agency, service);
        next_Node.next = null;


        if (list.root == null) {
            list.root = next_Node;
        } else {

            Node last = list.root;
            while (last.next != null) {
                last = last.next;
            }

            last.next = next_Node;
        }

    }

    void Deleteagency(NodeRun list, String service, String agency) {

        Node newNode = list.root;
        Node back = null;

        if (list.root == null) {
            return;
        }

        if (list.root.linkagancy.contains(agency) && list.root.linkservice.contains(service)) {

            list.root = newNode.next;
            return;
        }

        do {

            if (newNode.linkservice.contains(service) && newNode.linkagancy.contains(agency)) {
                assert back != null;
                back.next = newNode.next;
                return;
            }
            back = newNode;
            newNode = newNode.next;

        } while (newNode != null);


    }

    boolean check(NodeRun list, String service) {
        Node newNode = list.root;
        boolean check;
        int index = 0;
        do {

            if (newNode.linkservice.contains(service)) {
                index++;
            }

            newNode.next = newNode;
        } while (newNode != null);

        if (index == 1) {
            check = true;
        } else {
            check = false;
        }
        return check;
    }


}
