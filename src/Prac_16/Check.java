package Prac_16;
import javax.swing.*;
import java.awt.*;

public class Check extends JFrame {
    private JLabel serviceLabel = new JLabel("Service: ");
    private JPanel serviceLabelPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
    private JPanel serviceFieldPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
    private JTextField serviceField = new JTextField();
    private JPanel nameLabelPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
    private JLabel nameLabel = new JLabel("User name: ");
    private JPanel nameFieldPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
    private JTextField nameField = new JTextField();
    private JPanel passwordLabelPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
    private JLabel passwordLabel = new JLabel("Password: ");
    private JPanel passwordFieldPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
    private JTextField passwordField = new JTextField();
    public Check(){
        super("Check");
        Container contentPane = getContentPane();
        SpringLayout layout = new SpringLayout();
        contentPane.setLayout(layout);
        setSize(500,300);

        serviceLabelPanel.add(serviceLabel);
        add(serviceLabelPanel);

        serviceField.setPreferredSize(new Dimension(100, 20));;
        serviceField.setBorder(BorderFactory.createLineBorder(Color.black));
        serviceFieldPanel.add(serviceField);
        add(serviceFieldPanel);

        nameLabelPanel.add(nameLabel);
        add(nameLabelPanel);

        nameField.setPreferredSize(new Dimension(100, 20));;
        nameField.setBorder(BorderFactory.createLineBorder(Color.black));
        nameFieldPanel.add(nameField);
        add(nameFieldPanel);

        passwordLabelPanel.add(passwordLabel);
        add(passwordLabelPanel);

        passwordField.setPreferredSize(new Dimension(100, 20));;
        passwordField.setBorder(BorderFactory.createLineBorder(Color.black));
        passwordFieldPanel.add(passwordField);
        add(passwordFieldPanel);

        layout.putConstraint(SpringLayout.WEST, serviceLabelPanel, 5, SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.WEST, serviceFieldPanel, 100, SpringLayout.WEST, serviceLabelPanel);
        layout.putConstraint(SpringLayout.NORTH, nameLabelPanel, 15, SpringLayout.SOUTH,serviceLabelPanel );
        layout.putConstraint(SpringLayout.WEST, nameLabelPanel, 5, SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, nameFieldPanel, 10, SpringLayout.SOUTH,serviceFieldPanel );
        layout.putConstraint(SpringLayout.WEST, nameFieldPanel, 100, SpringLayout.WEST, nameLabelPanel);
        layout.putConstraint(SpringLayout.NORTH, passwordLabelPanel, 15, SpringLayout.SOUTH,nameLabelPanel );
        layout.putConstraint(SpringLayout.WEST, passwordLabelPanel, 5, SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, passwordFieldPanel, 15, SpringLayout.SOUTH,nameFieldPanel );
        layout.putConstraint(SpringLayout.WEST, passwordFieldPanel, 100, SpringLayout.WEST, passwordLabelPanel);
    }
}