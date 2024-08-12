import java.awt.*;
import java.awt.event.*;

public class AgeFinder5 extends Frame implements ActionListener{

    TextField textfield1,textfield2,textfield3;
    Button button1;
    Label l1,l2,l3;
    
    AgeFinder5(){

    l1=new Label("Enter Birth year = ");
    l1.setBounds(45, 45, 100, 30);
    l2=new Label("Enter Current year = ");
    l2.setBounds(45, 75, 100, 30);
    l3=new Label("Your Current Age = ");
    l3.setBounds(45, 103, 100, 30);
    textfield1=new TextField();
    textfield1.setBounds(150, 80, 150, 20);
    textfield2=new TextField();
    textfield2.setBounds(150, 50, 150, 20);
    textfield3=new TextField();
    textfield3.setBounds(150,110,150,20);
    textfield3.setEditable(false);
    button1=new Button("Find My Age"); 
    button1.setBounds(150, 150, 150, 30);
    
    button1.addActionListener(this);

    add(l1);
    add(textfield1);
    add(l2);
    add(textfield2);
    add(l3);
    add(textfield3);
    add(button1);

    setSize(300,300);
    setLayout(null);
    setVisible(true);
    setTitle("Age Finder");
    }

    public void actionPerformed(ActionEvent e){
        String s1=textfield1.getText();
        String s2 = textfield2.getText();

        int a=Integer.parseInt(s1);
        int b=Integer.parseInt(s2);

        int c=a-b;

        String result=String.valueOf(c);
        textfield3.setText(result);
    }

    public static void main(String[] args){
new AgeFinder5();
    }
    
}