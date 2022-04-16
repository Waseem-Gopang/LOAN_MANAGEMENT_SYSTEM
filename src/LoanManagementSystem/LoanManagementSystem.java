package LoanManagementSystem;
import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;



public class LoanManagementSystem extends JFrame {
    
   //setting the username,password and database for mysql  
   private static final String username ="root";
   private static final String password ="waseem";
   private static final String dataCon ="jdbc:mysql://localhost:3306/loans";
   
   //setting the databases as null
   Connection sqlCon=null;
   PreparedStatement pst=null;
   ResultSet rs=null;
   
   int q,i;
    private Object jTable1;
    public LoanManagementSystem() {
        initComponents();
    }
    
    //method for uploading data to the mysql database system
    public void uploadDB()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlCon=DriverManager.getConnection(dataCon,username,password);
            pst= sqlCon.prepareStatement("select * from loans");
            rs=pst.executeQuery();
            ResultSetMetaData stData=rs.getMetaData();
            q=stData.getColumnCount();
            while(rs.next())
            {
                Vector columnData=new Vector();
                for(i=1;i<=q;i++)
                {
                    columnData.add(rs.getString("CNIC"));
                    columnData.add(rs.getString("NAME"));
                    columnData.add(rs.getString("MOBILE"));
                    columnData.add(rs.getString("EMAIL"));
                    columnData.add(rs.getString("GENDER"));
                    columnData.add(rs.getString("FNAME"));
                    columnData.add(rs.getString("ADDRESS"));
                    columnData.add(rs.getString("ACCOUNTTYPE"));
                    columnData.add(rs.getString("ACCOUNTNO"));
                    columnData.add(rs.getString("BRANCHCODE"));
                    columnData.add(rs.getString("BRANCHNAME"));
                    
                    columnData.add(rs.getString("AMOUNT"));
                    columnData.add(rs.getString("INTEREST"));
                    columnData.add(rs.getString("NOOFPAYMENTS"));
                    columnData.add(rs.getString("MONTHLYPAYMENTS"));
                    columnData.add(rs.getString("WITHDRAWAL"));
                    columnData.add(rs.getString("DEPOSIT"));
                    columnData.add(rs.getString("OVERDRAFT"));
                    columnData.add(rs.getString("PROPERTY"));
                }
            }
                   }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jFrame1 = new javax.swing.JFrame();
        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        PersonalInformation = new javax.swing.JPanel();
        cnic = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        Fname = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        accounttype = new javax.swing.JLabel();
        accountno = new javax.swing.JLabel();
        branchcode = new javax.swing.JLabel();
        Cnic = new javax.swing.JTextField();
        Name = new javax.swing.JTextField();
        FName = new javax.swing.JTextField();
        Address = new javax.swing.JTextField();
        AccountType = new javax.swing.JTextField();
        AccountNo = new javax.swing.JTextField();
        BranchCode = new javax.swing.JTextField();
        branchname = new javax.swing.JLabel();
        BranchName = new javax.swing.JTextField();
        mobileno = new javax.swing.JLabel();
        MobileNo = new javax.swing.JTextField();
        email = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        Gender = new javax.swing.JLabel();
        gender = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        EXIT = new javax.swing.JButton();
        RESET = new javax.swing.JButton();
        ADDNEW = new javax.swing.JButton();
        SEARCH = new javax.swing.JButton();
        LoanDetails = new javax.swing.JPanel();
        amountofloan = new javax.swing.JLabel();
        interestrate = new javax.swing.JLabel();
        noofpayments = new javax.swing.JLabel();
        monthlypayments = new javax.swing.JLabel();
        LoanAmount = new javax.swing.JTextField();
        InterestRate = new javax.swing.JTextField();
        NoOfPayments = new javax.swing.JTextField();
        MonthlyPayments = new javax.swing.JTextField();
        withdrawal = new javax.swing.JLabel();
        deposit = new javax.swing.JLabel();
        overdraft = new javax.swing.JLabel();
        Withdrawal = new javax.swing.JTextField();
        Deposit = new javax.swing.JTextField();
        Overdraft = new javax.swing.JComboBox<>();
        Property = new javax.swing.JLabel();
        property = new javax.swing.JComboBox<>();
        DEVELOPERS = new javax.swing.JLabel();

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255), 4));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 349, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 102), 4));
        jPanel1.setToolTipText("Loan Management System");
        jPanel1.setName("Loan Management System"); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        jLabel8.setText("LOAN MANAGEMENT SYSTEM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 1043, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
        );

        PersonalInformation.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51), 4));

        cnic.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cnic.setText("CNIC No. ");

        name.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        name.setText("Name");

        Fname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Fname.setText("F/Name");

        address.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        address.setText("Address");

        accounttype.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        accounttype.setText("Account Type");

        accountno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        accountno.setText("Account No.");

        branchcode.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        branchcode.setText("Branch Code");

        branchname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        branchname.setText("Branch Name");

        mobileno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mobileno.setText("Mobile No.");

        email.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        email.setText("Email");

        Gender.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Gender.setText("Gender");

        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));

        javax.swing.GroupLayout PersonalInformationLayout = new javax.swing.GroupLayout(PersonalInformation);
        PersonalInformation.setLayout(PersonalInformationLayout);
        PersonalInformationLayout.setHorizontalGroup(
            PersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PersonalInformationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PersonalInformationLayout.createSequentialGroup()
                        .addComponent(branchname)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BranchName, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PersonalInformationLayout.createSequentialGroup()
                        .addComponent(branchcode, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BranchCode, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PersonalInformationLayout.createSequentialGroup()
                        .addComponent(accountno, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AccountNo, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PersonalInformationLayout.createSequentialGroup()
                        .addComponent(accounttype)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AccountType, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PersonalInformationLayout.createSequentialGroup()
                        .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PersonalInformationLayout.createSequentialGroup()
                        .addComponent(Fname, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(FName, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PersonalInformationLayout.createSequentialGroup()
                        .addComponent(Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PersonalInformationLayout.createSequentialGroup()
                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PersonalInformationLayout.createSequentialGroup()
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PersonalInformationLayout.createSequentialGroup()
                        .addComponent(cnic, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Cnic, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PersonalInformationLayout.createSequentialGroup()
                        .addComponent(mobileno, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(MobileNo, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47))
        );
        PersonalInformationLayout.setVerticalGroup(
            PersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PersonalInformationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cnic, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cnic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PersonalInformationLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MobileNo, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(mobileno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Email, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(gender, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(Gender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(FName, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(Fname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Address, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(address, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AccountType, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(accounttype, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AccountNo, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(accountno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BranchCode, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(branchcode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(branchname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BranchName, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 4));

        EXIT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EXIT.setText("EXIT");
        EXIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXITActionPerformed(evt);
            }
        });

        RESET.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        RESET.setText("RESET");
        RESET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RESETActionPerformed(evt);
            }
        });

        ADDNEW.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ADDNEW.setText("ADD NEW");
        ADDNEW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDNEWActionPerformed(evt);
            }
        });

        SEARCH.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SEARCH.setText("LOAN HISTORY");
        SEARCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SEARCHActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(ADDNEW, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(RESET, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SEARCH, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addComponent(EXIT, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(EXIT, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(RESET, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(ADDNEW, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(SEARCH, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        LoanDetails.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204), 4));

        amountofloan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        amountofloan.setText("Amount of loan");

        interestrate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        interestrate.setText("Interest Rate");

        noofpayments.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        noofpayments.setText("No of payments");

        monthlypayments.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        monthlypayments.setText("Monthly payments");

        withdrawal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        withdrawal.setText("Withdrawal");

        deposit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        deposit.setText("Deposit");

        overdraft.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        overdraft.setText("Overdraft Required");

        Overdraft.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "YES", "NO" }));

        Property.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Property.setText("Property Replacement");

        property.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gold", "Bike", "Home", "Others" }));

        DEVELOPERS.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        DEVELOPERS.setForeground(new java.awt.Color(255, 0, 0));
        DEVELOPERS.setText("DEVELOPED BY: WASEEM ALI (20SW022) AND AQEEL ABBASS (20SW085)");

        javax.swing.GroupLayout LoanDetailsLayout = new javax.swing.GroupLayout(LoanDetails);
        LoanDetails.setLayout(LoanDetailsLayout);
        LoanDetailsLayout.setHorizontalGroup(
            LoanDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoanDetailsLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(LoanDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DEVELOPERS, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(LoanDetailsLayout.createSequentialGroup()
                        .addComponent(Property)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(property, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LoanDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(LoanDetailsLayout.createSequentialGroup()
                            .addGroup(LoanDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(interestrate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(amountofloan, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addGroup(LoanDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(LoanAmount, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                                .addComponent(InterestRate)))
                        .addGroup(LoanDetailsLayout.createSequentialGroup()
                            .addGroup(LoanDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(overdraft, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                .addComponent(noofpayments, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(monthlypayments, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(withdrawal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(deposit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addGroup(LoanDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(NoOfPayments)
                                .addComponent(MonthlyPayments)
                                .addComponent(Withdrawal)
                                .addComponent(Deposit)
                                .addComponent(Overdraft, 0, 343, Short.MAX_VALUE)))))
                .addGap(0, 49, Short.MAX_VALUE))
        );
        LoanDetailsLayout.setVerticalGroup(
            LoanDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoanDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LoanDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LoanAmount, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(amountofloan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(LoanDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(InterestRate, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(interestrate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LoanDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(noofpayments, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NoOfPayments, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LoanDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(monthlypayments, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MonthlyPayments, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LoanDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoanDetailsLayout.createSequentialGroup()
                        .addComponent(withdrawal, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 5, Short.MAX_VALUE))
                    .addComponent(Withdrawal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LoanDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Deposit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deposit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LoanDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(overdraft, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Overdraft, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LoanDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Property, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(property, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addComponent(DEVELOPERS, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PersonalInformation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LoanDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PersonalInformation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LoanDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

     private JFrame frame;
    private void EXITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXITActionPerformed
        frame=new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit","Loan Management System ",
                JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_EXITActionPerformed

    private void RESETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESETActionPerformed
        JTextField jtxt=null;
        JComboBox jcbo=null;
        for(Component c:PersonalInformation.getComponents())
        {
            if(c.getClass().toString().contains("javax.swing.JTextField"))
            {
                jtxt=(JTextField)c;
                jtxt.setText(null);
            }
        }
        
        for(Component c:LoanDetails.getComponents())
        {
            if(c.getClass().toString().contains("javax.swing.JTextField"))
            {
                jtxt=(JTextField)c;
                jtxt.setText(null);
            }
        }
        gender.setSelectedIndex(0);
        Overdraft.setSelectedIndex(0);
        property.setSelectedIndex(0);
       
    }//GEN-LAST:event_RESETActionPerformed

    private void ADDNEWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDNEWActionPerformed
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlCon=DriverManager.getConnection(dataCon, username, password);
            pst=sqlCon.prepareStatement("insert into loans.loans (CNIC,Name,MOBILE,Email,Gender,FName,Address,AccountType,"
             +"AccountNo,BranchCode,BranchName,AMOUNT,INTEREST,NoOfPayments,MonthlyPayments,Withdrawal,Deposit,OverDraft,Property)"
             +"value(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            
            pst.setString(1,Cnic.getText());
            pst.setString(2,Name.getText());
            pst.setString(3,MobileNo.getText());
            pst.setString(4,Email.getText());
            pst.setString(5,(String)gender.getSelectedItem());
            pst.setString(6,FName.getText());
            pst.setString(7,Address.getText());
            pst.setString(8,AccountType.getText());
            pst.setString(9,AccountNo.getText());
            pst.setString(10,BranchCode.getText());
            pst.setString(11,BranchName.getText());
            
            pst.setString(12,LoanAmount.getText());
            pst.setString(13,InterestRate.getText());
            pst.setString(14,NoOfPayments.getText());
            pst.setString(15,MonthlyPayments.getText());
            pst.setString(16,Withdrawal.getText());
            pst.setString(17,Deposit.getText());
            pst.setString(18,(String)Overdraft.getSelectedItem());
            pst.setString(20,(String)property.getSelectedItem());
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this,"Loan Record Updated");
            uploadDB();
                      
        }
        catch(ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(LoanManagementSystem.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
        }catch(SQLException ex)
       {
           java.util.logging.Logger.getLogger(LoanManagementSystem.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
        }
    }//GEN-LAST:event_ADDNEWActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
     uploadDB();        
    }//GEN-LAST:event_formWindowActivated

    private void SEARCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SEARCHActionPerformed
        frame=new JFrame("Input");
        String cnic=JOptionPane.showInputDialog(frame,"Enter Cnic");     
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlCon=DriverManager.getConnection(dataCon,username,password);
            pst= sqlCon.prepareStatement("select * from loans.loans where cnic="+cnic);
            rs=pst.executeQuery();
            ResultSetMetaData stData=rs.getMetaData();
            q=stData.getColumnCount(); 
            while(rs.next())
            {
                 
                Vector columnData=new Vector();
                {
                  
                    System.out.println("Loan Details of given Input are: ");
                    columnData.add("CNIC No :  "+rs.getString("CNIC"));
                    columnData.add("\nName :  "+rs.getString("NAME"));
                    columnData.add("\nMobile No :  "+rs.getString("MOBILE"));
                    columnData.add("\nEmail :  "+rs.getString("EMAIL"));
                    columnData.add("\nGender :  "+rs.getString("GENDER"));
                    columnData.add("\nFather's Name :  "+rs.getString("FNAME"));
                    columnData.add("\nAddress :  "+rs.getString("ADDRESS"));
                    columnData.add("\nAccount Type : "+rs.getString("ACCOUNTTYPE"));
                    columnData.add("\nAccount number : "+rs.getString("ACCOUNTNO"));
                    columnData.add("\nBranch code : "+rs.getString("BRANCHCODE"));
                    columnData.add("\nBranch Name :  "+rs.getString("BRANCHNAME"));
                    
                    columnData.add("\nAmount :  "+rs.getString("AMOUNT"));
                    columnData.add("\nInterest :  "+rs.getString("INTEREST"));
                    columnData.add("\nNo of Payments :  "+rs.getString("NOOFPAYMENTS"));
                    columnData.add("\nMonthly payments :  "+rs.getString("MONTHLYPAYMENTS"));
                    columnData.add("\nWithdrawal : "+rs.getString("WITHDRAWAL"));
                    columnData.add("\nDeposit : "+rs.getString("DEPOSIT"));
                    columnData.add("\nOverdraft : "+rs.getString("OVERDRAFT"));
                    columnData.add("\nProperty : "+rs.getString("PROPERTY"));
                }
                System.out.println(columnData);
            }
        } 
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_SEARCHActionPerformed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
         try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoanManagementSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoanManagementSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoanManagementSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoanManagementSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoanManagementSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoanManagementSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoanManagementSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoanManagementSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoanManagementSystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADDNEW;
    private javax.swing.JTextField AccountNo;
    private javax.swing.JTextField AccountType;
    private javax.swing.JTextField Address;
    private javax.swing.JTextField BranchCode;
    private javax.swing.JTextField BranchName;
    private javax.swing.JTextField Cnic;
    private javax.swing.JLabel DEVELOPERS;
    private javax.swing.JTextField Deposit;
    private javax.swing.JButton EXIT;
    private javax.swing.JTextField Email;
    private javax.swing.JTextField FName;
    private javax.swing.JLabel Fname;
    private javax.swing.JLabel Gender;
    private javax.swing.JTextField InterestRate;
    private javax.swing.JTextField LoanAmount;
    private javax.swing.JPanel LoanDetails;
    private javax.swing.JTextField MobileNo;
    private javax.swing.JTextField MonthlyPayments;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField NoOfPayments;
    private javax.swing.JComboBox<String> Overdraft;
    private javax.swing.JPanel PersonalInformation;
    private javax.swing.JLabel Property;
    private javax.swing.JButton RESET;
    private javax.swing.JButton SEARCH;
    private javax.swing.JTextField Withdrawal;
    private javax.swing.JLabel accountno;
    private javax.swing.JLabel accounttype;
    private javax.swing.JLabel address;
    private javax.swing.JLabel amountofloan;
    private javax.swing.JLabel branchcode;
    private javax.swing.JLabel branchname;
    private javax.swing.JLabel cnic;
    private javax.swing.JLabel deposit;
    private javax.swing.JLabel email;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JLabel interestrate;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel mobileno;
    private javax.swing.JLabel monthlypayments;
    private javax.swing.JLabel name;
    private javax.swing.JLabel noofpayments;
    private javax.swing.JLabel overdraft;
    private javax.swing.JComboBox<String> property;
    private javax.swing.JLabel withdrawal;
    // End of variables declaration//GEN-END:variables
}
