
import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout;
import java.awt.Font;
import java.awt.*;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import java.io.*;
import java.util.*;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;


@SuppressWarnings("unused")
public class Entryportal extends javax.swing.JFrame {

    
	private static final long serialVersionUID = 7522526792628754248L;
	public Entryportal() {
        initComponents();
    }
    @SuppressWarnings({ "rawtypes", "unchecked" })
	private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel1.setFont(new Font("Tahoma", Font.PLAIN, 16));
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setFont(new Font("Tahoma", Font.PLAIN, 16));
        jLabel3 = new javax.swing.JLabel();
        jLabel3.setFont(new Font("Tahoma", Font.PLAIN, 16));
        userid = new javax.swing.JTextField();
        mode = new javax.swing.JComboBox();
        loginb = new javax.swing.JButton();
        cancelb = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel4.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		JOptionPane.showMessageDialog(null, "This Project is for storing the information\n and attendence of the students of DSCE");
        	}
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Portal");
        setName("Entryportal");

        jLabel1.setText("Username");

        jLabel2.setText("Password");

        jLabel3.setText("User Type");

        mode.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administrator", "Teacher" }));

        loginb.setText("Login");
        loginb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cancelb.setText("Cancel");
        cancelb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Student Details and Attendance Management System");
        
        pwd = new JTextField();
        
        JLabel label = new JLabel("");
        label.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		JOptionPane.showMessageDialog(null, "Dayananda Sagar College Of Engineering");
        	}
        });
        Image img=new ImageIcon(this.getClass().getResource("/images.png")).getImage();
        label.setIcon(new ImageIcon(img));
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap(184, Short.MAX_VALUE)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel2)
        						.addComponent(jLabel1)
        						.addGroup(layout.createSequentialGroup()
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(loginb, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
        								.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE))))
        					.addGap(87)
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(mode, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
        						.addComponent(userid, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
        						.addComponent(pwd, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
        						.addComponent(cancelb, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))
        					.addGap(68))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(116)
        					.addComponent(jLabel4)
        					.addPreferredGap(ComponentPlacement.RELATED)))
        			.addComponent(label, GroupLayout.PREFERRED_SIZE, 259, GroupLayout.PREFERRED_SIZE)
        			.addGap(33))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(18)
        					.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel1)
        						.addComponent(userid, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addGap(23)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel2)
        						.addComponent(pwd, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addGap(31)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel3)
        						.addComponent(mode, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addGap(58)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(cancelb, GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        						.addComponent(loginb, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)))
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(label, GroupLayout.PREFERRED_SIZE, 281, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap(56, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
    }
    
    @SuppressWarnings("resource")
	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
    	try {
    		String username = userid.getText();
        	String password = pwd.getText();
        	String file = "src\\users.txt";
            BufferedReader br=new BufferedReader(new FileReader(file));
        	String line, user, pass;
            boolean isLoginSuccess = false;
            while ((line = br.readLine()) != null) {
                user = line.split(",")[0];
                pass = line.split(",")[1];
                if (user.equals(username) && pass.equals(password)) {
                    isLoginSuccess = true;
                }
            }
            if (isLoginSuccess) {
                JOptionPane.showMessageDialog(null, "Succesfully logged in");
                
                if( mode.getSelectedItem()=="Administrator")
                {
                admin f2 = new admin(userid.getText());
                f2.setVisible(true);
                dispose();
                }
                else
                if( mode.getSelectedItem()=="Teacher")
                {
                Teacher1 f2 = new Teacher1(userid.getText());
                f2.setVisible(true);
                dispose();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Invalid username or paswword");
            }
        } catch (Exception e) {
            System.out.println("Somethig is wrong");
            JOptionPane.showMessageDialog(null, e);

        }  
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(1);
    }

    public static void main(String args[]) {
        
    	new Entryportal().setVisible(true);
    	
    }
    private javax.swing.JTextField userid;
    @SuppressWarnings("rawtypes")
	private javax.swing.JComboBox mode;
    private javax.swing.JButton loginb;
    private javax.swing.JButton cancelb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private JTextField pwd;
}
