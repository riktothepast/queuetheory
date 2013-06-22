package iface;

import methods.Mms;

import javax.swing.*;

public class GuiMethod extends javax.swing.JDialog {
    private javax.swing.JPanel contentPane;
    private javax.swing.JButton buttonOK;
    private JTextField a0TextField;
    private JComboBox comboBox1;
    private JTextField a0TextField1;
    private JTextField a0TextField2;
    private JTextField a0TextField3;
    private JTextField a0TextField4;
    private JTextField a0TextField5;
    private JTextArea textArea1;

    public GuiMethod() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        buttonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                onOK();
            }
        });


// call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent e) {
                onCancel();
            }
        });

// call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                onCancel();
            }
        }, javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0), javax.swing.JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void onOK() {
    /*  M/M/1   = 0
        M/M/S   = 1
        M/G/1   = 2
        M/D/1   = 3
        M/D/S   = 4
        M/E/K/1 = 5
        M/E/K/S = 6
        */
        String result="";
        switch(comboBox1.getSelectedIndex()){
            case 0:
                Mms mms=new Mms();
                mms.setValues(Float.valueOf(a0TextField.getText()),Float.valueOf(a0TextField1.getText()),Float.valueOf(a0TextField2.getText()),Float.valueOf(a0TextField3.getText()));
                result+="W= "+mms.getW()+"\n";
                result+="Wq= "+mms.getWq()+"\n";
                result+="L= "+mms.getL()+"\n";
                result+="Lq= "+mms.getLq()+"\n";

                break;
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;
            case 6:

                break;
        }
        textArea1.setText(result);
    }

    private void onCancel() {
// add your code here if necessary
        dispose();
    }

}
