import javax.swing.*;
import java.awt.event.ActionListener;

class Do {


    Do(NodeService nodeService1_1, NodeAgency nodeAgency1_1, NodeRun nodeRun1_1, NodeCustomers nodeCustomers1_1, int index) {

        ////

        JFrame form = new JFrame("Enter Your Number & click.");
        form.setSize(500, 400);
        JTextArea add = new JTextArea();
        add.setBounds(20, 20, 380, 30);
        JLabel result = new JLabel();
        JPanel panel = new JPanel();
        JScrollPane jScrollPane = new JScrollPane(panel);
        jScrollPane.setBounds(20, 70, 380, 310);
        JButton addbtn = new JButton("OK");
        addbtn.setBounds(410, 20, 80, 30);
        form.add(add);
        form.add(addbtn);
        panel.add(result);
        form.add(jScrollPane);

        String resulttext = "<html>" + "Enter a number: <br/>  " + "1.add service <br/>  " + "2.add subservice <br/>  " + "3.add agency <br/>  " + "4.list services <br/>  " + "5.list agency <br/>  " + "6.delete service <br/>  " + "7.add offer <br/>  " + "8.list subservices from a service <br/>  " + "9.list orders <br/>  " + "10.order service to agency  <br/> by customer with Immediacy Level <br/>  " + "</html>";
        result.setText(resulttext);

        ActionListener sb = e -> {

            String s = add.getText();
            new Do(Integer.parseInt(s), nodeService1_1, nodeAgency1_1, nodeRun1_1, nodeCustomers1_1 , index);
            form.dispose();
        };
        addbtn.addActionListener(sb);

        form.setLocationRelativeTo(null);
        form.setResizable(false);
        form.setLayout(null);
        form.setVisible(true);

    }

    private Do(int number, NodeService nodeService1_1, NodeAgency nodeAgency1_1, NodeRun nodeRun1_1, NodeCustomers nodeCustomers1_1, int index) {


        if (number == 1) {
            JFrame form2 = new JFrame("Form");
            form2.setSize(500, 400);
            JTextArea add = new JTextArea();
            add.setBounds(20, 20, 380, 30);
            JLabel result = new JLabel();
            JPanel panel = new JPanel();
            JScrollPane jScrollPane = new JScrollPane(panel);
            jScrollPane.setBounds(20, 70, 380, 310);
            JButton addbtn = new JButton("OK");
            addbtn.setBounds(410, 20, 80, 30);
            form2.add(add);
            form2.add(addbtn);
            panel.add(result);
            form2.add(jScrollPane);
            result.setText("Type your service name");

            ActionListener sb = e -> {

                String s = add.getText();
                nodeService1_1.addservice(nodeService1_1, s);
                JOptionPane.showMessageDialog(null, "added");
                form2.dispose();
                new Do(nodeService1_1, nodeAgency1_1, nodeRun1_1, nodeCustomers1_1, index);

            };
            addbtn.addActionListener(sb);
            form2.setLocationRelativeTo(null);
            form2.setResizable(false);
            form2.setLayout(null);
            form2.setVisible(true);
        } else if (number == 2) {
            JFrame form2 = new JFrame("Form");
            form2.setSize(500, 400);
            JTextArea add = new JTextArea();
            add.setBounds(20, 20, 380, 30);
            JLabel result = new JLabel();
            JPanel panel = new JPanel();
            JScrollPane jScrollPane = new JScrollPane(panel);
            jScrollPane.setBounds(20, 70, 380, 310);
            JButton addbtn = new JButton("OK");
            addbtn.setBounds(410, 20, 80, 30);
            form2.add(add);
            form2.add(addbtn);
            panel.add(result);
            form2.add(jScrollPane);
            result.setText("Type your service name and type your subservice name with  '-' ");

            ActionListener sb = e -> {

                String s = add.getText();
                String[] arrOfStr = s.split("-");
                String servicestring = arrOfStr[0];
                String valuestring = arrOfStr[1];
                nodeService1_1.addSub(nodeService1_1, valuestring, servicestring);
                JOptionPane.showMessageDialog(null, "added");
                form2.dispose();
                new Do(nodeService1_1, nodeAgency1_1, nodeRun1_1, nodeCustomers1_1 , index);

            };
            addbtn.addActionListener(sb);
            form2.setLocationRelativeTo(null);
            form2.setResizable(false);
            form2.setLayout(null);
            form2.setVisible(true);
        } else if (number == 3) {
            JFrame form2 = new JFrame("Form");
            form2.setSize(500, 400);
            JTextArea add = new JTextArea();
            add.setBounds(20, 20, 380, 30);
            JLabel result = new JLabel();
            JPanel panel = new JPanel();
            JScrollPane jScrollPane = new JScrollPane(panel);
            jScrollPane.setBounds(20, 70, 380, 310);
            JButton addbtn = new JButton("OK");
            addbtn.setBounds(410, 20, 80, 30);
            form2.add(add);
            form2.add(addbtn);
            panel.add(result);
            form2.add(jScrollPane);
            result.setText("Type your agency name");

            ActionListener sb = e -> {

                String s = add.getText();
                nodeAgency1_1.addagency(nodeAgency1_1, s);
                JOptionPane.showMessageDialog(null, "added");
                form2.dispose();
                new Do(nodeService1_1, nodeAgency1_1, nodeRun1_1, nodeCustomers1_1 , index);

            };
            addbtn.addActionListener(sb);
            form2.setLocationRelativeTo(null);
            form2.setResizable(false);
            form2.setLayout(null);
            form2.setVisible(true);
        } else if (number == 4) {

            JFrame form2 = new JFrame("Form");
            form2.setSize(500, 400);
            JTextArea add = new JTextArea();
            add.setBounds(20, 20, 380, 30);
            JLabel result = new JLabel();
            JPanel panel = new JPanel();
            JScrollPane jScrollPane = new JScrollPane(panel);
            jScrollPane.setBounds(20, 70, 380, 310);
            JButton addbtn = new JButton("OK");
            addbtn.setBounds(410, 20, 80, 30);
            JButton backbtn = new JButton("back");
            backbtn.setBounds(410, 70, 80, 30);
            form2.add(backbtn);
            form2.add(add);
            form2.add(addbtn);
            panel.add(result);
            form2.add(jScrollPane);
            result.setText("Click Ok To See");

            ActionListener sb = e -> {

                String a = nodeService1_1.Listservice(nodeService1_1);
                result.setText(a);


            };
            addbtn.addActionListener(sb);

            ActionListener bb = e -> {
                form2.dispose();
                new Do(nodeService1_1, nodeAgency1_1, nodeRun1_1, nodeCustomers1_1, index);
            };
            backbtn.addActionListener(bb);
            form2.setLocationRelativeTo(null);
            form2.setResizable(false);
            form2.setLayout(null);
            form2.setVisible(true);

        } else if (number == 5) {

            JFrame form2 = new JFrame("Form");
            form2.setSize(500, 400);
            JTextArea add = new JTextArea();
            add.setBounds(20, 20, 380, 30);
            JLabel result = new JLabel();
            JPanel panel = new JPanel();
            JScrollPane jScrollPane = new JScrollPane(panel);
            jScrollPane.setBounds(20, 70, 380, 310);
            JButton addbtn = new JButton("OK");
            addbtn.setBounds(410, 20, 80, 30);
            JButton backbtn = new JButton("back");
            backbtn.setBounds(410, 70, 80, 30);
            form2.add(backbtn);
            form2.add(add);
            form2.add(addbtn);
            panel.add(result);
            form2.add(jScrollPane);
            result.setText("Click Ok To See");

            ActionListener sb = e -> {

                String a = nodeAgency1_1.Listagency(nodeAgency1_1);
                result.setText(a);


            };
            addbtn.addActionListener(sb);

            ActionListener bb = e -> {
                form2.dispose();
                new Do(nodeService1_1, nodeAgency1_1, nodeRun1_1, nodeCustomers1_1, index);
            };
            backbtn.addActionListener(bb);
            form2.setLocationRelativeTo(null);
            form2.setResizable(false);
            form2.setLayout(null);
            form2.setVisible(true);

        } else if (number == 6) {

            JFrame form2 = new JFrame("Form");
            form2.setSize(500, 400);
            JTextArea add = new JTextArea();
            add.setBounds(20, 20, 380, 30);
            JLabel result = new JLabel();
            JPanel panel = new JPanel();
            JScrollPane jScrollPane = new JScrollPane(panel);
            jScrollPane.setBounds(20, 70, 380, 310);
            JButton addbtn = new JButton("OK");
            addbtn.setBounds(410, 20, 80, 30);
            JButton backbtn = new JButton("back");
            backbtn.setBounds(410, 70, 80, 30);
            form2.add(backbtn);
            form2.add(add);
            form2.add(addbtn);
            panel.add(result);
            form2.add(jScrollPane);
            result.setText("Type your service name that you want delete and agency with '-' ");

            ActionListener sb = e -> {

                String s = add.getText();
                String[] arrOfStr = s.split("-");

                boolean check = nodeRun1_1.check(nodeRun1_1, arrOfStr[0]);
                if (check) {
                    nodeService1_1.Deleteservice(nodeService1_1, arrOfStr[0]);
                    nodeRun1_1.Deleteagency(nodeRun1_1, arrOfStr[0], arrOfStr[1]);
                    JOptionPane.showMessageDialog(null, "deleted from agency and listservice");
                } else {
                    nodeRun1_1.Deleteagency(nodeRun1_1, arrOfStr[0], arrOfStr[1]);
                    JOptionPane.showMessageDialog(null, "deleted from Just from this agency ");
                }

                form2.dispose();
                new Do(nodeService1_1, nodeAgency1_1, nodeRun1_1, nodeCustomers1_1, index);


            };

            ActionListener bb = e -> {
                form2.dispose();
                new Do(nodeService1_1, nodeAgency1_1, nodeRun1_1, nodeCustomers1_1 , index);
            };
            backbtn.addActionListener(bb);

            addbtn.addActionListener(sb);
            form2.setLocationRelativeTo(null);
            form2.setResizable(false);
            form2.setLayout(null);
            form2.setVisible(true);
        } else if (number == 7) {
            JFrame form2 = new JFrame("Form");
            form2.setSize(500, 400);
            JTextArea add = new JTextArea();
            add.setBounds(20, 20, 380, 30);
            JLabel result = new JLabel();
            JPanel panel = new JPanel();
            JScrollPane jScrollPane = new JScrollPane(panel);
            jScrollPane.setBounds(20, 70, 380, 310);
            JButton addbtn = new JButton("OK");
            addbtn.setBounds(410, 20, 80, 30);
            form2.add(add);
            form2.add(addbtn);
            panel.add(result);
            form2.add(jScrollPane);
            result.setText("Type your service name and type your agency name with  '-' ");

            ActionListener sb = e -> {

                String s = add.getText();
                String[] arrOfStr = s.split("-");

                nodeRun1_1.addOffer(nodeRun1_1, arrOfStr[0], arrOfStr[1]);
                JOptionPane.showMessageDialog(null, "added");
                form2.dispose();
                new Do(nodeService1_1, nodeAgency1_1, nodeRun1_1, nodeCustomers1_1, index);

            };
            addbtn.addActionListener(sb);
            form2.setLocationRelativeTo(null);
            form2.setResizable(false);
            form2.setLayout(null);
            form2.setVisible(true);
        } else if (number == 8) {

            JFrame form2 = new JFrame("Form");
            form2.setSize(500, 400);
            JTextArea add = new JTextArea();
            add.setBounds(20, 20, 380, 30);
            JLabel result = new JLabel();
            JPanel panel = new JPanel();
            JScrollPane jScrollPane = new JScrollPane(panel);
            jScrollPane.setBounds(20, 70, 380, 310);
            JButton addbtn = new JButton("OK");
            addbtn.setBounds(410, 20, 80, 30);
            JButton backbtn = new JButton("back");
            backbtn.setBounds(410, 70, 80, 30);
            form2.add(backbtn);
            form2.add(add);
            form2.add(addbtn);
            panel.add(result);
            form2.add(jScrollPane);
            result.setText("Click Ok To See");

            ActionListener sb = e -> {

                String s = add.getText();
                String a = nodeService1_1.Listservicefrom(nodeService1_1, s);
                result.setText(a);

            };
            addbtn.addActionListener(sb);

            ActionListener bb = e -> {
                form2.dispose();
                new Do(nodeService1_1, nodeAgency1_1, nodeRun1_1, nodeCustomers1_1, index);
            };
            backbtn.addActionListener(bb);
            form2.setLocationRelativeTo(null);
            form2.setResizable(false);
            form2.setLayout(null);
            form2.setVisible(true);

        } else if (number == 9) {
            JFrame form2 = new JFrame("Form");
            form2.setSize(500, 400);
            JTextArea add = new JTextArea();
            add.setBounds(20, 20, 380, 30);
            JLabel result = new JLabel();
            JPanel panel = new JPanel();
            JScrollPane jScrollPane = new JScrollPane(panel);
            jScrollPane.setBounds(20, 70, 380, 310);
            JButton addbtn = new JButton("Next");
            addbtn.setBounds(410, 20, 80, 30);
            JButton backbtn = new JButton("back");
            backbtn.setBounds(410, 70, 80, 30);
            form2.add(backbtn);
            form2.add(add);
            form2.add(addbtn);
            panel.add(result);
            form2.add(jScrollPane);
            result.setText("Click Naxt To See");

            ActionListener sb = e -> {

                String a = nodeCustomers1_1.ListOrders(nodeCustomers1_1);
                result.setText(a);

            };
            addbtn.addActionListener(sb);

            ActionListener bb = e -> {
                form2.dispose();
                new Do(nodeService1_1, nodeAgency1_1, nodeRun1_1, nodeCustomers1_1 , index);
            };
            backbtn.addActionListener(bb);
            form2.setLocationRelativeTo(null);
            form2.setResizable(false);
            form2.setLayout(null);
            form2.setVisible(true);
        } else if (number == 10) {

            JFrame form2 = new JFrame("Form");
            form2.setSize(500, 400);
            JTextArea add = new JTextArea();
            add.setBounds(20, 20, 380, 30);
            JLabel result = new JLabel();
            JPanel panel = new JPanel();
            JScrollPane jScrollPane = new JScrollPane(panel);
            jScrollPane.setBounds(20, 70, 380, 310);
            JButton addbtn = new JButton("OK");
            addbtn.setBounds(410, 20, 80, 30);
            form2.add(add);
            form2.add(addbtn);
            panel.add(result);
            form2.add(jScrollPane);
            result.setText("<html>  Type your service and agency by customer name  <br/> and your immediacy(0 or 1 or 2)  and split with  '-' </html> ");

            int index1 = index + 1 ;

            ActionListener sb = e -> {

                String s = add.getText();
                String[] arrOfStr = s.split("-");


                nodeCustomers1_1.OrderTWB(nodeCustomers1_1, arrOfStr[0], arrOfStr[1], arrOfStr[2], Integer.parseInt(arrOfStr[3]), index );

                JOptionPane.showMessageDialog(null, "added");
                form2.dispose();
                new Do(nodeService1_1, nodeAgency1_1, nodeRun1_1, nodeCustomers1_1 , index1);

            };
            addbtn.addActionListener(sb);
            form2.setLocationRelativeTo(null);
            form2.setResizable(false);
            form2.setLayout(null);
            form2.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "NOT FOUND");
            new Do(nodeService1_1, nodeAgency1_1, nodeRun1_1, nodeCustomers1_1 , index);
        }
        //
    }

}

