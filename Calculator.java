import java.awt.*;
import java.awt.event.*;

public class Calculator extends Frame implements ActionListener{
   // Creating Button and textfield
   Button button1 , button2 , button3 , button4;
    
   TextField textfield1=new TextField() , textfield2=new TextField() , textfield3=new TextField();


   Calculator(){
    //setLoaction of textfields 
  
   textfield1.setBounds(50,50,150,20);
   textfield2.setBounds(50,100,150,20);
   textfield3.setBounds(50,150,150,20);

   textfield3.setEditable(false);

   //Setloaction of Buttons
   button1=new Button("+");
   button1.setBounds(50,200,50,50);
   button2=new Button("-");
   button2.setBounds(100,200,50,50);
   button3=new Button("*");
   button3.setBounds(150,200,50,50);
   button4=new Button("/");
   button4.setBounds(200,200,50,50);

   //Adding action listener
   button1.addActionListener(this);
   button2.addActionListener(this);
   button3.addActionListener(this);
   button4.addActionListener(this);

   //Adding components to frame
   add(button1);
   add(button2);
   add(button3);
   add(button4);
   add(textfield1);
   add(textfield2);
   add(textfield3);

   //Frame size layout
   setSize(300,300);
   setLayout(null);
   setVisible(true);
   setTitle("[ Calculator ]"); 
   }

   //Calculating part 
   public void actionPerformed(ActionEvent e){
    String s1=textfield1.getText();
    String s2=textfield2.getText();
    int a =Integer.parseInt(s1);
    int b =Integer.parseInt(s2);
    int c=0;

    if(e.getSource()==button1){
        c=a+b;
    }
    else if(e.getSource()==button2){
        c=a-b;
    }
    else if(e.getSource()==button3){
        c=a*b;
    }
    else if(e.getSource()==button4){
    if (b!=0) {
        c=a/b;
    }
}
    else{
        textfield3.setText("Error");
        return;
    }
    
    
String result =String.valueOf(c);
textfield3.setText(result);
   }

   //Main method
   public static void main(String[] args){
    new Calculator();
   }
}