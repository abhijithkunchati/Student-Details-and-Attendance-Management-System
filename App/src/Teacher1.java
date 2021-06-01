
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;


@SuppressWarnings("unused")
public class Teacher1 extends javax.swing.JFrame {
    
	private static final long serialVersionUID = -5925756146593045815L;

	public Teacher1(String s) {
    	initComponents(s);
    }
    String iddd = null;
    @SuppressWarnings({ "rawtypes", "unchecked" })
	private void initComponents(String s) {
    	String name = s;
        jLabel1 = new javax.swing.JLabel();
        sub = new javax.swing.JComboBox();
        sub.setModel(new DefaultComboBoxModel(new String[] {"Maths", "Physics", "Chemistry"}));
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		Takeattendence t = new Takeattendence((String) sub.getSelectedItem());
        		t.setVisible(true);
        		dispose();
        	}
        });
        jButton2 = new javax.swing.JButton();
        jButton2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Report t = new Report((String) sub.getSelectedItem());
        		t.setVisible(true);
        		dispose();
        	}
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        jLabel1.setText("WELCOME "+name);

        sub.setEditable(true);

        jLabel2.setText("Choose Subject");

        jButton1.setText("Take Attendance");
        
        jButton2.setText("Attendence Report");
        
        JButton btnStudentReport = new JButton("Student Report");
        btnStudentReport.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Sreport t = new Sreport("");
        		t.setVisible(true);
        		dispose();
        	}
        });
        
        JButton btnLogout = new JButton("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	int op = JOptionPane.showConfirmDialog(null,"Do you really want to logout?","confirm",0);
                if(op == 0)
                {
                Entryportal f1 = new Entryportal();
                f1.setVisible(true);
                dispose();
                }
                else{
                   // dispose();
                }
            }
        });
        

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(72)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        				.addComponent(jButton1, GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
        				.addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        			.addGap(11)
        			.addComponent(btnStudentReport)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        				.addComponent(jButton2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(sub, 0, 133, Short.MAX_VALUE))
        			.addContainerGap(97, Short.MAX_VALUE))
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(198, Short.MAX_VALUE)
        			.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 264, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(btnLogout)
        			.addGap(21))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(22)
        					.addComponent(btnLogout))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(30)
        					.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)))
        			.addGap(72)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(sub, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel2))
        			.addGap(71)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jButton1)
        				.addComponent(jButton2)
        				.addComponent(btnStudentReport))
        			.addContainerGap(83, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
    }
    
    public static void main(String args[]) {
    	new Teacher1("Maths").setVisible(true);
    }
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    @SuppressWarnings("rawtypes")
	private javax.swing.JComboBox sub;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
}
