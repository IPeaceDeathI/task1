package Prac_16;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ThreadLocalRandom;

public class Ugadaika extends JFrame {
    JButton userButton = new JButton("TRY");
    public Ugadaika(){
        super("Ugadaika");
        setSize(250,150);
        setLayout(new BorderLayout());

        JTextField input = new JTextField();
        add(input,BorderLayout.CENTER);

        add(userButton, BorderLayout.SOUTH);
        final int[] counter = {0};
        Integer value = ThreadLocalRandom.current().nextInt(0, 20 + 1);

        userButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(input.getText().toString() == "") return;
                if (input.getText().toString().equals(value.toString())){
                    JOptionPane.showMessageDialog(getContentPane(),"True: " + value,"Good job",JOptionPane.PLAIN_MESSAGE);
                    setVisible(false);
                    dispose();
                }
                else if(counter[0] == 2){
                    JOptionPane.showMessageDialog(getContentPane(),"False: " + value,"Bad job",JOptionPane.PLAIN_MESSAGE);
                    setVisible(false);
                    dispose();
                }
                else{
                    counter[0]++;
                    if (Integer.parseInt(input.getText().toString()) > value){
                        JOptionPane.showMessageDialog(getContentPane(),"My value lower than yours: ","Nice try.",JOptionPane.PLAIN_MESSAGE);
                    }
                    else{
                        JOptionPane.showMessageDialog(getContentPane(),"My value bigger than yours","Nice try.",JOptionPane.PLAIN_MESSAGE);
                    }
                }
            }
        });
    }
}
