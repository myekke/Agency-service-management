class NodeCustomers {

    private Node root;
    private Heap maxHeap = new Heap();

    static class Node {

        String name;
        String agency;
        String orders;
        int IMM;
        int index;
        Node next;

        Node(String name2, String agency2, String orders2, int IMM2, int index2) {
            name = name2;
            agency = agency2;
            IMM = IMM2;
            orders = orders2;
            index = index2;
            next = null;
        }
    }


    void OrderTWB(NodeCustomers list, String name2, String agency2, String order2, int IMM2, int index2) {


        Node next_node = new Node(name2, agency2, order2, IMM2, index2);
        next_node.next = null;


        maxHeap.insert(((IMM2 * 1000) + (100 - index2)));

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

    String ListOrders(NodeCustomers list) {

        int i = 0;


        Node newSubNode = list.root;
        while (newSubNode != null) {
            i = i + 1;
            newSubNode = newSubNode.next;
        }

        String result = "<html> ";

        Node newNode = list.root;
        int heapresult = maxHeap.getMax();


            if (heapresult - 2000 >= 0)
            {

                heapresult = 2100 - heapresult;

                while (newNode != null) {

                    if (newNode.index == heapresult) {
                        break;
                    }
                    newNode = newNode.next;

                }

                result = result.concat(" name:" + newNode.name + "   orders: " + newNode.orders + " <br/>  agency:" + newNode.agency + "    IMM: " + newNode.IMM + " <br/> ----------------------------  <br/> ");
                maxHeap.delete();
                heapresult = -1;

            }
            if (heapresult - 1000 >= 0)
            {
                heapresult = 1100 - heapresult;


                while (newNode != null) {

                    if (newNode.index == heapresult) {
                        break;
                    }
                    newNode = newNode.next;

                }


                result = result.concat(" name:" + newNode.name + "   orders: " + newNode.orders + " <br/>  agency:" + newNode.agency + "    IMM: " + newNode.IMM + " <br/> ----------------------------  <br/> ");
                maxHeap.delete();
                heapresult = -1;
            }
            if (heapresult >= 0)
            {

                heapresult = 100 - heapresult;


                while (newNode != null) {

                    if (newNode.index == heapresult) {
                        break;
                    }
                    newNode = newNode.next;

                }


                result = result.concat(" name:" + newNode.name + "   orders: " + newNode.orders + " <br/>  agency:" + newNode.agency + "    IMM: " + newNode.IMM + " <br/> ----------------------------  <br/> ");
                maxHeap.delete();
            }

        result = result.concat(" </html> ");
        return result;
    }
}

