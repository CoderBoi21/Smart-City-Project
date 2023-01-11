import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GraphicalUserInterface {

    Client client_details;
    ArrayList<Client> dataList;

    GraphicalUserInterface(ArrayList<Client> dataList){
        client_details = new Client();
        this.dataList = dataList; 
        frame1();
    }

    // mission and vision
    void frame1(){
        //declared elements
        ImageIcon coderboiimage = new ImageIcon("Ankur.jfif");
        JFrame f1 = new JFrame("Welcome To Our Smart City's Application!!");
        JTextField tf_cityname = new JTextField("Coder Boi's Smart City!!");
        JButton bt_login = new JButton("Login");
        JButton bt_signup = new JButton("SignUp");
        JPanel panel1 = new JPanel();

        //ImageIcon For Background
        f1.setContentPane(new JLabel(new ImageIcon("Background img(1).jpg")));

        //Image
        JLabel img1 = new JLabel(new ImageIcon("Vision(1).png"));
        JLabel img2 = new JLabel(new ImageIcon("Making_City_Smart(1).png"));

        //Configuring Elements
        f1.setIconImage(coderboiimage.getImage());
        panel1.setLayout(null);
        panel1.setOpaque(false);
        img1.setBounds(50,90,600,300);
        img2.setBounds(430,400,700,350);
        panel1.add(img1);

        //JButtons
        bt_login.setBounds(930,20,100,50);
        bt_login.setVisible(true);
        bt_login.setFocusable(false);
        bt_login.setFont(new Font("monotype corsiva",Font.ITALIC,20));
        bt_login.setForeground(Color.yellow);
        bt_login.setBackground(Color.BLACK);
        bt_signup.setBounds(1060,20,100,50);
        bt_signup.setVisible(true);
        bt_signup.setFocusable(false);
        bt_signup.setFont(new Font("monotype corsiva",Font.ITALIC,20));
        bt_signup.setForeground(Color.yellow);
        bt_signup.setBackground(Color.BLACK);

        //JTextField
        tf_cityname.setBounds(450,20,400,40);
        tf_cityname.setFont(new Font("monotype corsiva",Font.BOLD,40));
        tf_cityname.setEditable(false);
        tf_cityname.setForeground(Color.WHITE);
        tf_cityname.setBackground(Color.BLACK);

        //Elements are added to frame 1
        f1.add(tf_cityname);
        f1.add(bt_login);
        f1.add(bt_signup);
        f1.add(img2);
        f1.add(img1);

        f1.setResizable(false);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setBounds(100,20,1200,800);
        f1.setVisible(true);

        bt_signup.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f1.setVisible(false);
                frame2();
            }
        });

        bt_login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f1.setVisible(false);
                frame3();
            }
        });
    }

    // join out mission (signup)
    void frame2(){
        JFrame f2 = new JFrame("Joining Our Mission!!");
        ImageIcon coderboiimage = new ImageIcon("Ankur.jfif");

        //ImageIcon For Background
        f2.setContentPane(new JLabel(new ImageIcon("Background img(1).jpg")));

        //f2.setContentPane(new JLabel(new ImageIcon("filename")));

        //labels
        JLabel lb_name= new JLabel("Name :");
        JLabel lb_type= new JLabel("Type :");
        JLabel lb_gender= new JLabel("Gender : ");
        JLabel lb_smart_id= new JLabel("Smart ID : ");
        JLabel lb_address= new JLabel("Address : ");
        JLabel lb_password= new JLabel("Authentication key : ");
        JLabel lb_tnc = new JLabel("Terms and conditions : ");
        JLabel lb_ref = new JLabel("Reference :");

        lb_name.setFont(new Font("monotype corsiva",Font.BOLD,20));
        lb_type.setFont(new Font("monotype corsiva",Font.BOLD,20));
        lb_gender.setFont(new Font("monotype corsiva",Font.BOLD,20));
        lb_smart_id.setFont(new Font("monotype corsiva",Font.BOLD,20));
        lb_address.setFont(new Font("monotype corsiva",Font.BOLD,20));
        lb_tnc.setFont(new Font("monotype corsiva",Font.BOLD,20));
        lb_password.setFont(new Font("monotype corsiva",Font.BOLD,20));
        lb_ref.setFont(new Font("monotype corsiva",Font.BOLD,20));

        //bounds
        lb_name.setBounds(500,50,75,50);
        lb_type.setBounds(500,100,75,50);
        lb_gender.setBounds(500,150,75,50);
        lb_smart_id.setBounds(490,200,175,50);
        lb_address.setBounds(500,250,75,50);
        lb_password.setBounds(430,500,175,50);
        lb_tnc.setBounds(500,550,140,50);
        lb_ref.setBounds(500,600,140,50);

        //textfield and area
        JTextField tf_name = new JTextField("");
        JTextField tf_smart_id = new JTextField("");
        JTextArea tf_address = new JTextArea("");
        JTextField tf_password = new JTextField("");

        tf_name.setFont(new Font("monotype corsiva",Font.ITALIC,20));
        tf_smart_id.setFont(new Font("monotype corsiva",Font.ITALIC,20));
        tf_address.setFont(new Font("monotype corsiva",Font.ITALIC,20));
        tf_password.setFont(new Font("monotype corsiva",Font.ITALIC,20));

        //bounds
        tf_name.setBounds(625,65,100,25);
        tf_smart_id.setBounds(625,215,100,25);
        tf_address.setBounds(625,265,250,225);
        tf_password.setBounds(625,515,100,25);

        //list
        DefaultListModel<String> l = new DefaultListModel<>();
        l.addElement("Friends");
        l.addElement("Advertisement");
        l.addElement("Others");
        JList<String> list = new JList<>(l);
        list.setBounds(625 ,615, 125,75);
        list.setFont(new Font("monotype corsiva",Font.ITALIC,20));


        //combobox
        String[] type = {"Select a type","Local", "Tourist"};
        JComboBox list_type = new JComboBox<>(type);
        list_type.setBounds(625,115,125,50);
        list_type.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (type[0] == (String) list_type.getSelectedItem()) {
                    JOptionPane.showMessageDialog(null, "Select a type!");
                }
                else{
                    client_details.type = (String) list_type.getSelectedItem();
                }
            }
        });

        //radio-button
        JRadioButton rb1 = new JRadioButton("Male");
        JRadioButton rb2 = new JRadioButton("Female");
        rb1.setBounds(625,165,100,30);
        rb2.setBounds(750,165,100,30);
        ButtonGroup bg=new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);

        //checkbox
        JCheckBox checkbox1 = new JCheckBox("I give my consent to use the given details for future use.");
        checkbox1.setFont(new Font("monotype corsiva",Font.BOLD,20));
        checkbox1.setBounds(500,550,470,50);

        //button
        JButton next=new JButton("NEXT");
        next.setBounds(725,715,80,30);
        next.setBackground(Color.black);
        next.setForeground(Color.WHITE);

        next.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(!checkbox1.isSelected() || tf_name.getText().hashCode() == 0 || tf_smart_id.getText().hashCode() == 0 || tf_address.getText().hashCode() == 0 || tf_password.getText().hashCode() == 0 || !( rb1.isSelected() || rb2.isSelected()) || ! checkbox1.isSelected() || list.isSelectionEmpty())
                {
                    JOptionPane.showMessageDialog(null, "Some Fields are Empty");
                } else {

                    client_details.full_name = tf_name.getText();

                    if(rb1.isSelected()){
                        client_details.gender = "male";
                    }
                    else{
                        client_details.gender = "female";
                    }

                    client_details.smart_id = tf_smart_id.getText();
                    client_details.address = tf_address.getText();
                    client_details.authentication_key = tf_password.getText();

                    f2.setVisible(false);
                    
                    if( type[1] == (String) list_type.getSelectedItem() ){
                        frame4();
                    }
                    else{
                        frame5();
                    }

                    dataList.add(client_details);

                    try{
                        FileManager.saveList(dataList);
                    }
                    catch(Exception a){
                        System.out.println("Error occurred : " + e);
                    }

                    //next
                }
            }
        });
        /*File Managment Extra
        String smart_id = tf_smart_id.getText();
        String authentication_key = tf_password.getText();
        String full_name = tf_name.getText();
        String address = tf_address.getText();
        String type = (String) list_type.getSelectedItem();
         */

        //add
        f2.add(lb_name);
        f2.add(lb_address);
        f2.add(lb_password);
        f2.add(list_type);
        f2.add(lb_smart_id);
        f2.add(lb_gender);
        f2.add(lb_ref);
        f2.add(list);
        f2.add(rb1);
        f2.add(rb2);
        f2.add(lb_type);
        f2.add(tf_name);
        f2.add(tf_address);
        f2.add(tf_password);
        f2.add(tf_smart_id);
        f2.add(checkbox1);
        f2.add(next);

        f2.setIconImage(coderboiimage.getImage());
        f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f2.setResizable(false);
        f2.setBounds(180,25,1200,800);
        f2.setLayout(null);
        f2.setVisible(true);
    }

    // login
    void frame3(){
        JFrame f2 = new JFrame("Welcome Back!!");
        ImageIcon coderboiimage = new ImageIcon("Ankur.jfif");

        //ImageIcon For Background
        f2.setContentPane(new JLabel(new ImageIcon("Background img(1).jpg")));

        // f2.setContentPane(new JLabel(new ImageIcon("Untitled-1.jpg")));

        // labels
        JLabel l1 = new JLabel("Login");
        JLabel l2 = new JLabel("Smart ID : ");
        JLabel l3 = new JLabel("Authentication key: ");

        l1.setFont(new Font("monotype corsiva",Font.BOLD,20));
        l2.setFont(new Font("monotype corsiva",Font.BOLD,20));
        l3.setFont(new Font("monotype corsiva",Font.BOLD,20));

        l1.setBounds(550, 220, 100, 30);
        l2.setBounds(470, 290, 100, 30);
        l3.setBounds(400, 360, 170, 30);

        f2.add(l1);
        f2.add(l2);
        f2.add(l3);

        // Text Field
        JTextField tf1 = new JTextField("");
        JTextField tf2 = new JTextField("");

        tf1.setFont(new Font("monotype corsiva",Font.ITALIC,20));
        tf2.setFont(new Font("monotype corsiva",Font.ITALIC,20));

        tf1.setBounds(580, 290, 130, 30);
        tf2.setBounds(580, 360, 130, 30);

        tf1.setVisible(true);
        tf2.setVisible(true);

        f2.add(tf1);
        f2.add(tf2);

        // button
        JButton b1 = new JButton("Login");
        // JButton b2 = new JButton("Create new account");

        b1.setFont(new Font("monotype corsiva",Font.ITALIC,20));
        // b2.setFont(new Font("monotype corsiva",Font.ITALIC,20));

        b1.setBackground(new Color(128, 0, 128));
        b1.setForeground(Color.WHITE);
        //  b2.setBackground(new Color(128, 0, 128));

        b1.setBounds(500, 450, 170, 30);
        // b2.setBounds(500, 410, 170, 30);

        b1.setVisible(true);
        // b2.setVisible(true);

        f2.add(b1);
        // f2.add(b2);

        // frame setting
        f2.setBounds(180, 10, 1200, 800);
        f2.setIconImage(coderboiimage.getImage());
        f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f2.setResizable(false);
        f2.setLayout(null);
        f2.setVisible(true);
        f2.setResizable(false);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                boolean flag = true;
                
                if(tf1.getText().hashCode() == 0 || tf2.getText().hashCode() ==0 ){
                    System.out.println("Field can not be Empty");
                    JOptionPane.showMessageDialog(null, "Fields are empty!");
                }
                else {
                    String entered_email_address = tf1.getText();
                    String entered_passward = tf2.getText();

                    for(int i=0; i<dataList.size(); i++){
                        String temp_email = dataList.get(i).smart_id; 
                        String temp_passward = dataList.get(i).authentication_key;
                        
                        if(entered_email_address.equals(temp_email) && entered_passward.equals(temp_passward) ){
                            client_details = dataList.get(i);
                            f2.setVisible(false);

                            if( client_details.type.equals("Local") ){
                                frame4();
                            }
                            else{
                                frame5();
                            }

                            flag = false;
                            break;
                        }
                    }
                    if(flag){
                        JOptionPane.showMessageDialog(null, "smart_id or authentication_key Wrong!!!");
                    }
                    
                }
            }
        });
        
    }

    // frame for local
    void frame4(){
        JFrame f1 = new JFrame("Page for Local Smart Citizens!!");
        ImageIcon coderboiimage = new ImageIcon("Ankur.jfif");

        //ImageIcon For Background
        f1.setContentPane(new JLabel(new ImageIcon("Background img(1).jpg")));

        JLabel l1 = new JLabel("Choose Any One:");
        l1.setFont(new Font("monotype corsiva",Font.BOLD,40));
        l1.setBounds(475, 50, 400, 50);
        l1.setForeground(Color.BLACK);

        f1.add(l1);

        JButton b1 = new JButton("Details");
        JButton b2 = new JButton("Businessmen");
        JButton b3 = new JButton("Employees");
        JButton b4 = new JButton("Student");
        JButton b5 = new JButton("Senior Citizen");

        b1.setFont(new Font("monotype corsiva",Font.BOLD,40));
        b2.setFont(new Font("monotype corsiva",Font.BOLD,30));
        b3.setFont(new Font("monotype corsiva",Font.BOLD,40));
        b4.setFont(new Font("monotype corsiva",Font.BOLD,40));
        b5.setFont(new Font("monotype corsiva",Font.BOLD,30));

        b1.setForeground(Color.WHITE);
        b2.setForeground(Color.WHITE);
        b3.setForeground(Color.WHITE);
        b4.setForeground(Color.WHITE);
        b5.setForeground(Color.WHITE);

        b1.setBackground(new Color(128, 0, 128));
        b2.setBackground(new Color(128, 0, 128));
        b3.setBackground(new Color(128, 0, 128));
        b4.setBackground(new Color(128, 0, 128));
        b5.setBackground(new Color(128, 0, 128));

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                    frame6();
                
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                    f1.setVisible(false);
                    frame8();
                
            }
        });

        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                    f1.setVisible(false);
                    frame9();
                
            }
        });

        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                    f1.setVisible(false);
                    frame7();
                
            }
        });

        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                    f1.setVisible(false);
                    frame10();
                
            }
        });

        b1.setBounds(500, 510, 200, 100);
        b2.setBounds(200, 350, 200, 100);
        b3.setBounds(500, 350, 200, 100);
        b4.setBounds(800, 350, 200, 100);
        b5.setBounds(500, 190, 200, 100);

        b1.setFocusable(false);
        b2.setFocusable(false);
        b3.setFocusable(false);
        b4.setFocusable(false);
        b5.setFocusable(false);

        b1.setVisible(true);
        b2.setVisible(true);
        b3.setVisible(true);
        b4.setVisible(true);
        b5.setVisible(true);

        f1.add(b1);
        f1.add(b2);
        f1.add(b3);
        f1.add(b4);
        f1.add(b5);

        f1.setIconImage(coderboiimage.getImage());
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setBounds(180, 10, 1200, 800);
        f1.setLayout(null);
        f1.setVisible(true);
        f1.setResizable(false);
    
    }

    // frame for tourist
    void frame5(){
        JFrame f5 = new JFrame("Page For Smart Tourists!!");
        ImageIcon coderboiimage = new ImageIcon("Ankur.jfif");

        //ImageIcon For Background
        f5.setContentPane(new JLabel(new ImageIcon("Background img(1).jpg")));

        JLabel l1 = new JLabel("Choose Any One:");
        l1.setFont(new Font("monotype corsiva",Font.BOLD,40));
        l1.setBounds(475, 150, 400, 50);
        l1.setForeground(Color.BLACK);

        JButton b1 = new JButton("Famous hotels");
        b1.setBounds(130,260,350,120);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                    f5.setVisible(false);
                    frame12();
            }
        });

        JButton b2 = new JButton("Famous places");
        b2.setBounds(730,260,350,120);
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                    f5.setVisible(false);
                    frame11();
                
            }
        });

        JButton b3 = new JButton("Details");
        b3.setBounds(430,430,350,120);
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                    frame6();
                
            }
        });

        b1.setFont(new Font("monotype corsiva",Font.BOLD,40));
        b2.setFont(new Font("monotype corsiva",Font.BOLD,40));
        b3.setFont(new Font("monotype corsiva",Font.BOLD,40));

        b1.setBackground(new Color(128, 0, 128));
        b2.setBackground(new Color(128, 0, 128));
        b3.setBackground(new Color(128, 0, 128));

        b1.setForeground(Color.WHITE);
        b2.setForeground(Color.WHITE);
        b3.setForeground(Color.WHITE);

        b1.setVisible(true);
        b2.setVisible(true);
        b3.setVisible(true);

        b1.setLayout(null);
        b2.setLayout(null);
        b3.setLayout(null);

        b1.setFocusable(false);
        b2.setFocusable(false);
        b3.setFocusable(false);

        f5.add(b1);
        f5.add(b2);
        f5.add(b3);
        f5.add(l1);

        f5.setBounds(180, 20, 1200, 800);
        f5.setIconImage(coderboiimage.getImage());
        f5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f5.setResizable(false);
        f5.setLayout(null);
        f5.setVisible(true);
        
    }

    // details
    void frame6(){

        //Create Frame
        JFrame f1 = new JFrame("We Are Stubborn On Vision But Flexible On Details!!");
        ImageIcon coderboiimage = new ImageIcon("Ankur.jfif");

        //ImageIcon For Background
        f1.setContentPane(new JLabel(new ImageIcon("BG(1).jpg")));

        //Create Labels
        JLabel lb1 = new JLabel("                                                                                        Your");
        JLabel lb2 = new JLabel(" Information");

        JLabel lb3 = new JLabel("Full Name:");
        JLabel lb4 = new JLabel(client_details.full_name);

        JLabel lb5 = new JLabel("Gender:");
        JLabel lb6 = new JLabel(client_details.gender);

        JLabel lb7 = new JLabel("Smart ID:");
        JLabel lb8 = new JLabel (client_details.smart_id);

        JLabel lb9 = new JLabel("Authentication Key:");
        JLabel lb10 = new JLabel(client_details.authentication_key);

        JLabel lb11 = new JLabel("Address:");
        JLabel lb12 = new JLabel(client_details.address);

        //Adding all the labels to the frame
        f1.add(lb1);
        f1.add(lb2);
        f1.add(lb3);
        f1.add(lb4);
        f1.add(lb5);
        f1.add(lb6);
        f1.add(lb7);
        f1.add(lb8);
        f1.add(lb9);
        f1.add(lb10);
        f1.add(lb11);
        f1.add(lb12);
        
        //Layout Settings
        f1.setLayout(new GridLayout(6,2));
        f1.setResizable(false);
        f1.setIconImage(coderboiimage.getImage());
        f1.setBounds(500,200,600,600);
        f1.setVisible(true);
    
    }

    // student
    void frame7(){
        //Declared Elements
        JFrame f1 = new JFrame("Smart Student's Page!!");
        ImageIcon coderboiimage = new ImageIcon("Ankur.jfif");

        //Background Image
        f1.setContentPane(new JLabel(new ImageIcon("Background img(1).jpg")));
        //Images
        JLabel bt_left = new JLabel(new ImageIcon("Student.png"));
        JLabel bt_right = new JLabel(new ImageIcon("Modi.png"));
        JLabel ct_top = new JLabel(new ImageIcon("Best_Colleges(1).png"));
        JLabel ct_bottom = new JLabel(new ImageIcon("+(2).png"));
        bt_left.setBounds(-110,500,600,300);
        bt_right.setBounds(830,550,306,200);
        ct_top.setBounds(100,-30,1000,600);
        ct_bottom.setBounds(355,350,452,600);

        //Configuring Elements
        f1.setBounds(100,20,1200,800);
        f1.setVisible(true);

        //add elements
        f1.add(bt_left);
        f1.add(bt_right);
        f1.add(ct_top);
        f1.add(ct_bottom);
        f1.setIconImage(coderboiimage.getImage());
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setResizable(false);
        f1.setLayout(null);
    }

    // businessmen
    void frame8(){
        //Declared Elements
        JFrame f1 = new JFrame("Smart Business's Page!!");
        ImageIcon coderboiimage = new ImageIcon("Ankur.jfif");
        //Images and Background
        f1.setContentPane(new JLabel(new ImageIcon("Background img(1).jpg")));
        JLabel bt_right = new JLabel(new ImageIcon("Donald_trump(1).jpg"));
        JLabel ct_top = new JLabel(new ImageIcon("Loan List(3).png"));
        JLabel ct_bottom = new JLabel(new ImageIcon("Govt_Subsidies(1).jpg"));

        //Position of all Labels
        bt_right.setBounds(730,500,450,300);
        ct_top.setBounds(150,0,900,500);
        ct_bottom.setBounds(10,350,452,600);

        //Configuring Elements
        f1.setBounds(100,20,1200,800);
        f1.setVisible(true);

        //add elements
        f1.add(bt_right);
        f1.add(ct_top);
        f1.add(ct_bottom);
        f1.setIconImage(coderboiimage.getImage());
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setResizable(false);
        f1.setLayout(null);
    }

    // employees
    void frame9(){
        JFrame f1 = new JFrame("Smart Wages!!");
        ImageIcon coderboiimage = new ImageIcon("Ankur.jfif");

        //Image and Frame Configuration
        f1.setContentPane(new JLabel(new ImageIcon("Employees(1).jpg")));
        f1.setVisible(true);
        f1.setIconImage(coderboiimage.getImage());
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setResizable(false);
        f1.setBounds(180,25,1200,800);
    }

    // senior cit
    void frame10(){
        //Declared Elements
        JFrame f1 = new JFrame("Smart Superannuation Scheme!!");
        ImageIcon coderboiimage = new ImageIcon("Ankur.jfif");

        //Image and Frame Configuration
        f1.setContentPane(new JLabel(new ImageIcon("Senior_cit(2).png")));
        f1.setVisible(true);
        f1.setBounds(180,25,1200,800);
        f1.setIconImage(coderboiimage.getImage());
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setResizable(false);
    }

    // famous destinations
    void frame11(){
        //Declared Elements
        JFrame f1 = new JFrame("Smart Tourist Attractions!!");
        ImageIcon coderboiimage = new ImageIcon("Ankur.jfif");
        JPanel p1 = new JPanel();
        JLabel img1 = new JLabel(new ImageIcon("Places to visit(1).jpg"));
        img1.setBounds(0,0,1200,800);
        p1.add(img1);

        //Image and Frame Configuration
        //f1.setContentPane(new JLabel(new ImageIcon("Places to visit(1).jpg")));
        f1.setVisible(true);
        f1.add(p1);
        f1.setBounds(180,25,1200,800);
        f1.setIconImage(coderboiimage.getImage());
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setResizable(false);
    }

    // famous hotels
    void frame12(){
        //Declared Elements
        JFrame f1 = new JFrame("Smart Hotel Recommendation!!");
        //Background Img
        f1.setContentPane(new JLabel(new ImageIcon("Background img(1).jpg")));

        JLabel img1 = new JLabel(new ImageIcon("Smart_Hotels(1).png"));
        ImageIcon coderboiimage = new ImageIcon("Ankur.jfif");

        //Image and Frame Configuration
        img1.setBounds(0,50,1200,550);
        f1.add(img1);
        f1.setVisible(true);
        f1.setBounds(180,25,1200,800);
        f1.setIconImage(coderboiimage.getImage());
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setResizable(false);

    }
}
