package Prac_16;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Area extends JFrame {
    private JPanel center = new JPanel();
    private JPanel west = new JPanel();
    private JPanel south = new JPanel();
    private JPanel north = new JPanel();
    private JPanel east = new JPanel();
    public Area() {
        super("Area");
        setSize(250,150);
        setLayout(new BorderLayout());

        center.setLayout(new GridBagLayout());
        add(center, BorderLayout.CENTER);
        center.add(new JLabel("CAO"));

        west.setLayout(new GridBagLayout());
        add(west, BorderLayout.WEST);
        west.add(new JLabel("ZAO"));

        south.setLayout(new GridBagLayout());
        add(south, BorderLayout.SOUTH);
        south.add(new JLabel("UAO"));

        north.setLayout(new GridBagLayout());
        add(north, BorderLayout.NORTH);
        north.add(new JLabel("SAO"));

        east.setLayout(new GridBagLayout());
        add(east, BorderLayout.EAST);
        east.add(new JLabel("VAO"));

        final Integer[] mouse_prev_position = {0};

        center.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {
                if (mouse_prev_position[0] == 1) return;
                JOptionPane.showMessageDialog(getContentPane(),"True","Welcome to the CAO",JOptionPane.PLAIN_MESSAGE);
                mouse_prev_position[0] = 1;
            }

            @Override
            public void mouseExited(MouseEvent e) {}
        });

        west.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {
                if (mouse_prev_position[0] == 2) return;
                JOptionPane.showMessageDialog(getContentPane(),"True","Welcome to the ZAO",JOptionPane.PLAIN_MESSAGE);
                mouse_prev_position[0] = 1;
            }

            @Override
            public void mouseExited(MouseEvent e) {}
        });

        south.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {
                if (mouse_prev_position[0] == 3) return;
                JOptionPane.showMessageDialog(getContentPane(),"True","Welcome to the UAO",JOptionPane.PLAIN_MESSAGE);
                mouse_prev_position[0] = 1;
            }

            @Override
            public void mouseExited(MouseEvent e) {}
        });

        north.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {
                if (mouse_prev_position[0] == 4) return;
                JOptionPane.showMessageDialog(getContentPane(),"True","Welcome to the SAO",JOptionPane.PLAIN_MESSAGE);
                mouse_prev_position[0] = 1;
            }

            @Override
            public void mouseExited(MouseEvent e) {}
        });

        east.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {
                if (mouse_prev_position[0] == 5) return;
                JOptionPane.showMessageDialog(getContentPane(),"True","Welcome to the VAO",JOptionPane.PLAIN_MESSAGE);
                mouse_prev_position[0] = 1;
            }

            @Override
            public void mouseExited(MouseEvent e) {}
        });
    }
}