package Prac_12;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.Timer;

public class PrimitivesApp {
    private final Button animateButton;
    private final Button addButton;
    private final JComboBox shapesList;
    private JFrame frame;
    private DrawerPanel drawerPanel;

    public static void main(String[] args) {
        PrimitivesApp app = new PrimitivesApp();
        app.start();
    }

    public PrimitivesApp(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(400, 260);

        drawerPanel = new DrawerPanel();
        drawerPanel.setSize(400, 200);

        Container mainContainer = frame.getContentPane();
        mainContainer.setLayout(new BorderLayout());

        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new GridLayout(1, 3));
        bottomPanel.setSize(400, 30);

        mainContainer.add(bottomPanel, BorderLayout.SOUTH);
        mainContainer.add(drawerPanel, BorderLayout.CENTER);

        shapesList = new JComboBox(new String[]{"Rectangle", "Circle"});
        shapesList.setSelectedIndex(0);
        bottomPanel.add(shapesList);

        addButton = new Button("Add");
        addButton.addActionListener(e -> onAddClick());
        bottomPanel.add(addButton);

        animateButton = new Button("Animate");
        animateButton.addActionListener(e -> onAnimateClick());
        bottomPanel.add(animateButton);
    }

    private void onAddClick() {
        String selected = shapesList.getSelectedItem().toString();

        if(selected.equals("Rectangle")){
            drawerPanel.addRectangle();
        }else if(selected.equals("Circle")){
            drawerPanel.addCircle();
        }

        drawerPanel.repaint();
    }

    private void onAnimateClick() {
        drawerPanel.animating = !drawerPanel.animating;
        animateButton.setLabel(drawerPanel.animating?"Stop":"Animate");
    }

    private void start() {
        frame.setVisible(true);
        startTimer();
    }

    private void startTimer() {
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                if(drawerPanel.animating) {
                    drawerPanel.nextState();
                }
            }
        };

        Timer timer = new Timer();
        timer.schedule(task, 0, 10);
    }
}
