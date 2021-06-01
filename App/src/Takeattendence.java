
import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.JComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("unused")
public class Takeattendence extends javax.swing.JFrame {

    
	private static final long serialVersionUID = 3502024109032056383L;
	public Takeattendence(String k) {
        initComponents(k);
    }

	public void UpdateJTable(){
		
	}
    @SuppressWarnings("unchecked")
	private void initComponents(String s) {
    	String sub=s;
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Attendance for Students");
        
        @SuppressWarnings("rawtypes")
		JComboBox stucb = new JComboBox();
        
        JLabel lblStudent = new JLabel("Student");
        lblStudent.setFont(new Font("Tahoma", Font.PLAIN, 16));
        
        JButton btnAbsent = new JButton("Absent");
        btnAbsent.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		String stu = (String) stucb.getSelectedItem();
        		try{    
      	           String f ="src\\"+sub+".txt";
      	           BufferedWriter output = new BufferedWriter(new FileWriter(f, true));
      	           output.append(stu+",Absent"+"\n");
        	       output.newLine();
      	           output.close();
      	           }
        		catch(Exception e1){
        			System.out.println(e1);
        		} 
        	}
        });
        
        JButton btnPresent = new JButton("Present");
        btnPresent.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		String stu = (String) stucb.getSelectedItem();
        		try{    
      	           String f ="src\\"+sub+".txt";
      	           BufferedWriter output = new BufferedWriter(new FileWriter(f, true));
      	           output.append(stu+",Present"+"\n");
        	       output.newLine();
      	           output.close();
      	           }
        		catch(Exception e1){
        			System.out.println(e1);
        		}
        	}
        });
        
        JButton btnSubmit = new JButton("Submit");
        btnSubmit.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Teacher1 f1 = new Teacher1("");
                f1.setVisible(true);
                dispose();
        	}
        });
        try {
        	String file = "src\\students.txt";
            @SuppressWarnings("resource")
			BufferedReader br=new BufferedReader(new FileReader(file));
        	String line, stu;
            while ((line = br.readLine()) != null) {
                stu = line.split(",")[0];
                if(stu!="")
                stucb.addItem(stu);
            }
            
        } catch (Exception e) {
            System.out.println("Somethig is wrong");
            JOptionPane.showMessageDialog(null, e);

        } 
        
        JButton btnBack = new JButton("Back");
        btnBack.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Teacher1 f1 = new Teacher1("");
                f1.setVisible(true);
                dispose();
        }});
        GroupLayout groupLayout = new GroupLayout(getContentPane());
        groupLayout.setHorizontalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addContainerGap(86, Short.MAX_VALUE)
        			.addComponent(lblStudent)
        			.addGap(58)
        			.addComponent(stucb, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
        			.addGap(108))
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGap(107)
        			.addComponent(btnAbsent)
        			.addGap(90)
        			.addComponent(btnPresent)
        			.addContainerGap(152, Short.MAX_VALUE))
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(184)
        					.addComponent(btnSubmit, GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
        					.addGap(106)
        					.addComponent(btnBack))
        				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 433, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap(36, Short.MAX_VALUE))
        );
        groupLayout.setVerticalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jLabel1)
        			.addGap(18)
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(stucb, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lblStudent, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btnPresent)
        				.addComponent(btnAbsent))
        			.addGap(18)
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btnSubmit)
        				.addComponent(btnBack))
        			.addContainerGap(35, Short.MAX_VALUE))
        );
        getContentPane().setLayout(groupLayout);

        pack();
    }

    
    public static void main(String args[]) {
        new Takeattendence("Maths").setVisible(true);
    }
    private javax.swing.JLabel jLabel1;
}
