/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paperbackrecords;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.time.Month;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.time.*;

/**
 *
 * @author S145
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    PaperbackRecords PR = new PaperbackRecords();
    LocalDate currentdate = LocalDate.now();
    public static int sellQuantity;
    String ConnectionString = "jdbc:mysql://localhost:3306/paperbackrecords";
    
    private void UpdateBookTable(){
        int c;
        
        try{
            Connection con = (Connection)
            DriverManager.getConnection(ConnectionString, "root", "root"); // make a connection to database
            PreparedStatement st = (PreparedStatement) con.prepareStatement("select * from book"); // make sql statement
            
            ResultSet rs = st.executeQuery();
            ResultSetMetaData rss = rs.getMetaData();
            c = rss.getColumnCount();
            
            DefaultTableModel df = (DefaultTableModel) BookTable.getModel();
            df.setRowCount(0);
            
            while (rs.next()){
                Vector v2 = new Vector();
                
                for (int a = 1; a <= c; a++){
                    v2.add(rs.getString("book_id"));
                    v2.add(rs.getString("title"));
                    v2.add(rs.getString("author"));
                    v2.add(rs.getString("genre"));
                    v2.add(rs.getString("publisher"));
                    v2.add(rs.getString("price"));
                    
                }
                
                df.addRow(v2);
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null,e); // print the error in the console
        }
        
    }
    
    private void UpdateStockTable(){
        int c;
        
        try{
            Connection con = (Connection)
            DriverManager.getConnection(ConnectionString, "root", "root"); // make a connection to database
            PreparedStatement st = (PreparedStatement) con.prepareStatement("select * from stock"); // make sql statement
            
            ResultSet rs = st.executeQuery();
            ResultSetMetaData rss = rs.getMetaData();
            c = rss.getColumnCount();
            
            DefaultTableModel df = (DefaultTableModel) StockTable.getModel();
            df.setRowCount(0);
            
            while (rs.next()){
                Vector v2 = new Vector();
                
                for (int a = 1; a <= c; a++){
                    v2.add(rs.getString("book_id"));
                    v2.add(rs.getString("available_copies"));
                    v2.add(rs.getString("sold_copies"));
                }
                
                df.addRow(v2);
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null,e); // print the error in the console
        }
        
    }
    
    private void UpdateCategoriesTable(){
        int c;
        
        try{
            Connection con = (Connection)
            DriverManager.getConnection(ConnectionString, "root", "root"); // make a connection to database
            PreparedStatement st = (PreparedStatement) con.prepareStatement("select * from book"); // make sql statement
            
            ResultSet rs = st.executeQuery();
            ResultSetMetaData rss = rs.getMetaData();
            c = rss.getColumnCount();
            
            DefaultTableModel df = (DefaultTableModel) CategoriesTable.getModel();
            df.setRowCount(0);
            
            while (rs.next()){
                Vector v2 = new Vector();
                
                for (int a = 1; a <= c; a++){
                    v2.add(rs.getString("book_id"));
                    v2.add(rs.getString("title"));
                    v2.add(rs.getString("author"));
                    v2.add(rs.getString("genre"));
                    v2.add(rs.getString("publisher"));
                    v2.add(rs.getString("price"));
                    
                }
                
                df.addRow(v2);
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null,e); // print the error in the console
        }
        
    }
    
    void resetColorOfBtns(JPanel panel){ // reset the colors of sidepane buttons
        this.ManageBookBtn.setBackground(new Color(30, 30, 30));
        this.ManageStockBtn.setBackground(new Color(30, 30, 30));
        this.MonthlyReportBtn.setBackground(new Color(30, 30, 30));
        this.CategoriesBtn.setBackground(new Color(30, 30, 30));
        this.ContactUsBtn.setBackground(new Color(30, 30, 30));
        
        panel.setBackground(new Color(0, 204, 51));
    }
    
    void MakePanelVisible(JPanel panel){ // make only the specified panel visible
        this.ManageBookPanel.setVisible(false);
        this.ManageStockPanel.setVisible(false);
        this.MonthlyReportPanel.setVisible(false);
        this.CategoriesPanel.setVisible(false);
        this.ContactUsPanel.setVisible(false);
        
        panel.setVisible(true);
    }
    
    public Dashboard() {
        initComponents();
        
        resetColorOfBtns(ManageBookBtn);
        MakePanelVisible(ManageBookPanel);
        UpdateBookTable();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        Background = new javax.swing.JPanel();
        SideBar = new javax.swing.JPanel();
        Branding = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        extraHeadbar = new javax.swing.JPanel();
        ManageBookBtn = new javax.swing.JPanel();
        ManageBooks = new javax.swing.JLabel();
        ManageStockBtn = new javax.swing.JPanel();
        ManageStock = new javax.swing.JLabel();
        MonthlyReportBtn = new javax.swing.JPanel();
        MonthlyReport = new javax.swing.JLabel();
        CategoriesBtn = new javax.swing.JPanel();
        Categories = new javax.swing.JLabel();
        ContactUsBtn = new javax.swing.JPanel();
        ContactUs = new javax.swing.JLabel();
        LogoutBtn = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Headbar = new javax.swing.JPanel();
        closeBtn = new javax.swing.JLabel();
        MainPanel = new javax.swing.JPanel();
        ManageStockPanel = new javax.swing.JPanel();
        ManageBooksTitle1 = new javax.swing.JLabel();
        refreshStockDatabaseBtn = new javax.swing.JLabel();
        SeachLabel1 = new javax.swing.JLabel();
        searchTextField1 = new javax.swing.JTextField();
        SearchByDropdown1 = new javax.swing.JComboBox<>();
        SearchBtn1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        StockTable = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        update_soldcopies_text = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        update_id_text_stock = new javax.swing.JTextField();
        update_id_text3 = new javax.swing.JTextField();
        update_availcopies_text = new javax.swing.JTextField();
        UpdateStockBtn = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        RestockTxt = new javax.swing.JTextArea();
        jLabel29 = new javax.swing.JLabel();
        MonthlyReportPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        YearTxt = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        book3 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        TotalSoldCopies = new javax.swing.JTextField();
        MonthTxt = new javax.swing.JTextField();
        book1 = new javax.swing.JTextField();
        book2 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        author1 = new javax.swing.JTextField();
        author2 = new javax.swing.JTextField();
        author3 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        genre1 = new javax.swing.JTextField();
        genre2 = new javax.swing.JTextField();
        genre3 = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        RestockReTxt = new javax.swing.JTextArea();
        jLabel37 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        TotalRevenue = new javax.swing.JTextField();
        CategoriesPanel = new javax.swing.JPanel();
        refreshDatabaseCategoriesBtn = new javax.swing.JLabel();
        searchTextField2 = new javax.swing.JTextField();
        SeachLabel2 = new javax.swing.JLabel();
        SearchByDropdown2 = new javax.swing.JComboBox<>();
        SearchBtn2 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        CategoriesTable = new javax.swing.JTable();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        SearchByDropdown3 = new javax.swing.JComboBox<>();
        searchTextField3 = new javax.swing.JTextField();
        SubmitBtn = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        update_id_text1 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        update_id_text5 = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        UpdateBtn = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        update_genre_text2 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        update_title_text3 = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        update_author_text4 = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        update_genre_text5 = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        CategoriesNoteTxt = new javax.swing.JTextArea();
        ContactUsPanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        ManageBookPanel = new javax.swing.JPanel();
        ManageBooksTitle = new javax.swing.JLabel();
        refreshDatabaseBtn = new javax.swing.JLabel();
        searchTextField = new javax.swing.JTextField();
        SearchBtn = new javax.swing.JLabel();
        SearchByDropdown = new javax.swing.JComboBox<>();
        SeachLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        BookTable = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        update_author_text = new javax.swing.JTextField();
        update_publisher_text = new javax.swing.JTextField();
        sell_input_text = new javax.swing.JTextField();
        update_genre_text = new javax.swing.JTextField();
        update_id_text = new javax.swing.JTextField();
        update_title_text = new javax.swing.JTextField();
        UpdateRecordBtn = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        add_price_text = new javax.swing.JTextField();
        add_publisher_text = new javax.swing.JTextField();
        add_genre_text = new javax.swing.JTextField();
        add_author_text = new javax.swing.JTextField();
        add_title_text = new javax.swing.JTextField();
        add_id_text = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        AddRecordBtn = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        add_note_text = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        update_note_text = new javax.swing.JTextArea();
        DeleteRecordBtn = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        update_price_text1 = new javax.swing.JTextField();
        SellBookBtn = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(43, 53, 51));
        setMaximumSize(new java.awt.Dimension(1470, 860));
        setMinimumSize(new java.awt.Dimension(1270, 660));
        setName("frame"); // NOI18N
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Background.setBackground(new java.awt.Color(43, 53, 51));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SideBar.setBackground(new java.awt.Color(0, 0, 0));
        SideBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Branding.setBackground(new java.awt.Color(0, 0, 0));
        Branding.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PaperBack");
        Branding.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 94, -1, -1));

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Records");
        Branding.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 129, -1, -1));

        extraHeadbar.setBackground(new java.awt.Color(0, 0, 0));
        extraHeadbar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                extraHeadbarMouseDragged(evt);
            }
        });
        extraHeadbar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                extraHeadbarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout extraHeadbarLayout = new javax.swing.GroupLayout(extraHeadbar);
        extraHeadbar.setLayout(extraHeadbarLayout);
        extraHeadbarLayout.setHorizontalGroup(
            extraHeadbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        extraHeadbarLayout.setVerticalGroup(
            extraHeadbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        Branding.add(extraHeadbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 256, -1));

        SideBar.add(Branding, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 256, 230));

        ManageBookBtn.setBackground(new java.awt.Color(30, 30, 30));
        ManageBookBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ManageBookBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ManageBookBtnMouseClicked(evt);
            }
        });
        ManageBookBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ManageBooks.setFont(new java.awt.Font("Consolas", 1, 21)); // NOI18N
        ManageBooks.setForeground(new java.awt.Color(255, 255, 255));
        ManageBooks.setText("Manage Books");
        ManageBookBtn.add(ManageBooks, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        SideBar.add(ManageBookBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 251, 256, 60));

        ManageStockBtn.setBackground(new java.awt.Color(30, 30, 30));
        ManageStockBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ManageStockBtn.setPreferredSize(new java.awt.Dimension(210, 61));
        ManageStockBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ManageStockBtnMouseClicked(evt);
            }
        });
        ManageStockBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ManageStock.setFont(new java.awt.Font("Consolas", 1, 22)); // NOI18N
        ManageStock.setForeground(new java.awt.Color(255, 255, 255));
        ManageStock.setText("Manage Stock");
        ManageStockBtn.add(ManageStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        SideBar.add(ManageStockBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 325, 256, -1));

        MonthlyReportBtn.setBackground(new java.awt.Color(30, 30, 30));
        MonthlyReportBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MonthlyReportBtn.setPreferredSize(new java.awt.Dimension(210, 61));
        MonthlyReportBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MonthlyReportBtnMouseClicked(evt);
            }
        });
        MonthlyReportBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MonthlyReport.setFont(new java.awt.Font("Consolas", 1, 22)); // NOI18N
        MonthlyReport.setForeground(new java.awt.Color(255, 255, 255));
        MonthlyReport.setText("Monthly Report");
        MonthlyReportBtn.add(MonthlyReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        SideBar.add(MonthlyReportBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 256, -1));

        CategoriesBtn.setBackground(new java.awt.Color(30, 30, 30));
        CategoriesBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CategoriesBtn.setPreferredSize(new java.awt.Dimension(210, 61));
        CategoriesBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CategoriesBtnMouseClicked(evt);
            }
        });
        CategoriesBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Categories.setFont(new java.awt.Font("Consolas", 1, 22)); // NOI18N
        Categories.setForeground(new java.awt.Color(255, 255, 255));
        Categories.setText("Categories");
        CategoriesBtn.add(Categories, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        SideBar.add(CategoriesBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 475, 256, -1));

        ContactUsBtn.setBackground(new java.awt.Color(30, 30, 30));
        ContactUsBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ContactUsBtn.setMinimumSize(new java.awt.Dimension(186, 49));
        ContactUsBtn.setPreferredSize(new java.awt.Dimension(210, 61));
        ContactUsBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ContactUsBtnMouseClicked(evt);
            }
        });
        ContactUsBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ContactUs.setFont(new java.awt.Font("Consolas", 1, 22)); // NOI18N
        ContactUs.setForeground(new java.awt.Color(255, 255, 255));
        ContactUs.setText("Contact Us");
        ContactUsBtn.add(ContactUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        SideBar.add(ContactUsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 256, -1));

        LogoutBtn.setBackground(new java.awt.Color(255, 51, 51));
        LogoutBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LogoutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutBtnMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("LOG OUT");

        javax.swing.GroupLayout LogoutBtnLayout = new javax.swing.GroupLayout(LogoutBtn);
        LogoutBtn.setLayout(LogoutBtnLayout);
        LogoutBtnLayout.setHorizontalGroup(
            LogoutBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogoutBtnLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(20, 20, 20))
        );
        LogoutBtnLayout.setVerticalGroup(
            LogoutBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogoutBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        SideBar.add(LogoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 699, -1, -1));

        Background.add(SideBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 760));

        Headbar.setBackground(new java.awt.Color(43, 53, 51));
        Headbar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                HeadbarMouseDragged(evt);
            }
        });
        Headbar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HeadbarMousePressed(evt);
            }
        });

        closeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/close.png"))); // NOI18N
        closeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout HeadbarLayout = new javax.swing.GroupLayout(Headbar);
        Headbar.setLayout(HeadbarLayout);
        HeadbarLayout.setHorizontalGroup(
            HeadbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeadbarLayout.createSequentialGroup()
                .addGap(0, 1086, Short.MAX_VALUE)
                .addComponent(closeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        HeadbarLayout.setVerticalGroup(
            HeadbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeadbarLayout.createSequentialGroup()
                .addComponent(closeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        Background.add(Headbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 1110, 30));

        MainPanel.setLayout(new java.awt.CardLayout());

        ManageStockPanel.setBackground(new java.awt.Color(43, 53, 51));
        ManageStockPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ManageBooksTitle1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ManageBooksTitle1.setForeground(new java.awt.Color(255, 255, 255));
        ManageBooksTitle1.setText("Manage Stock");
        ManageStockPanel.add(ManageBooksTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        refreshStockDatabaseBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/refreshDB.png"))); // NOI18N
        refreshStockDatabaseBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        refreshStockDatabaseBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshStockDatabaseBtnMouseClicked(evt);
            }
        });
        ManageStockPanel.add(refreshStockDatabaseBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 30, 40));

        SeachLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SeachLabel1.setForeground(new java.awt.Color(240, 240, 240));
        SeachLabel1.setText("Search :");
        ManageStockPanel.add(SeachLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, 60, 20));

        searchTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTextField1ActionPerformed(evt);
            }
        });
        ManageStockPanel.add(searchTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, 150, -1));

        SearchByDropdown1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "book_id" }));
        ManageStockPanel.add(SearchByDropdown1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 10, -1, -1));

        SearchBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SearchIcon.png"))); // NOI18N
        SearchBtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SearchBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchBtn1MouseClicked(evt);
            }
        });
        ManageStockPanel.add(SearchBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 10, -1, -1));

        StockTable.setBackground(new java.awt.Color(0, 0, 0));
        StockTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        StockTable.setForeground(new java.awt.Color(255, 255, 255));
        StockTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Available Copies", "Sold Copies"
            }
        ));
        StockTable.setGridColor(new java.awt.Color(240, 240, 240));
        StockTable.setRowHeight(25);
        StockTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StockTableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(StockTable);

        ManageStockPanel.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 1090, 270));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Sold Copies");
        ManageStockPanel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 320, 160, 50));

        update_soldcopies_text.setBackground(new java.awt.Color(43, 53, 51));
        update_soldcopies_text.setForeground(new java.awt.Color(240, 240, 240));
        update_soldcopies_text.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        update_soldcopies_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_soldcopies_textActionPerformed(evt);
            }
        });
        ManageStockPanel.add(update_soldcopies_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 370, 220, 50));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Suggestions / Tips / Recommendations:");
        ManageStockPanel.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 370, 50));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("ID");
        ManageStockPanel.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 40, 50));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Available Copies");
        ManageStockPanel.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, 280, 50));

        update_id_text_stock.setEditable(false);
        update_id_text_stock.setBackground(new java.awt.Color(43, 53, 51));
        update_id_text_stock.setForeground(new java.awt.Color(240, 240, 240));
        update_id_text_stock.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        update_id_text_stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_id_text_stockActionPerformed(evt);
            }
        });
        ManageStockPanel.add(update_id_text_stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 220, 50));

        update_id_text3.setBackground(new java.awt.Color(43, 53, 51));
        update_id_text3.setForeground(new java.awt.Color(240, 240, 240));
        update_id_text3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_id_text3ActionPerformed(evt);
            }
        });
        ManageStockPanel.add(update_id_text3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 220, 50));

        update_availcopies_text.setBackground(new java.awt.Color(43, 53, 51));
        update_availcopies_text.setForeground(new java.awt.Color(240, 240, 240));
        update_availcopies_text.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        update_availcopies_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_availcopies_textActionPerformed(evt);
            }
        });
        ManageStockPanel.add(update_availcopies_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 370, 220, 50));

        UpdateStockBtn.setBackground(new java.awt.Color(0, 204, 51));
        UpdateStockBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        UpdateStockBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateStockBtnMouseClicked(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Submit");

        javax.swing.GroupLayout UpdateStockBtnLayout = new javax.swing.GroupLayout(UpdateStockBtn);
        UpdateStockBtn.setLayout(UpdateStockBtnLayout);
        UpdateStockBtnLayout.setHorizontalGroup(
            UpdateStockBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpdateStockBtnLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel28)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        UpdateStockBtnLayout.setVerticalGroup(
            UpdateStockBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UpdateStockBtnLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel28)
                .addContainerGap())
        );

        ManageStockPanel.add(UpdateStockBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 370, 120, -1));

        RestockTxt.setBackground(new java.awt.Color(43, 53, 51));
        RestockTxt.setColumns(20);
        RestockTxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        RestockTxt.setForeground(new java.awt.Color(255, 255, 255));
        RestockTxt.setRows(5);
        jScrollPane5.setViewportView(RestockTxt);

        ManageStockPanel.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 1070, 200));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Update Record :");
        ManageStockPanel.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 150, 50));

        MainPanel.add(ManageStockPanel, "card3");

        MonthlyReportPanel.setBackground(new java.awt.Color(43, 53, 51));
        MonthlyReportPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Year :");
        MonthlyReportPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 10, 50, -1));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Monthly Report");
        MonthlyReportPanel.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Top Selling Books :");
        MonthlyReportPanel.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 160, -1));

        YearTxt.setEditable(false);
        YearTxt.setBackground(new java.awt.Color(43, 53, 51));
        YearTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        YearTxt.setForeground(new java.awt.Color(255, 255, 255));
        YearTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        YearTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YearTxtActionPerformed(evt);
            }
        });
        MonthlyReportPanel.add(YearTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 10, 100, 30));

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("For The Month Of :");
        MonthlyReportPanel.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, 160, -1));

        book3.setEditable(false);
        book3.setBackground(new java.awt.Color(43, 53, 51));
        book3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        book3.setForeground(new java.awt.Color(255, 255, 255));
        book3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        book3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                book3ActionPerformed(evt);
            }
        });
        MonthlyReportPanel.add(book3, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 250, 240, 30));

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Total Books Sold :");
        MonthlyReportPanel.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 160, -1));

        TotalSoldCopies.setEditable(false);
        TotalSoldCopies.setBackground(new java.awt.Color(43, 53, 51));
        TotalSoldCopies.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TotalSoldCopies.setForeground(new java.awt.Color(255, 255, 255));
        TotalSoldCopies.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TotalSoldCopies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalSoldCopiesActionPerformed(evt);
            }
        });
        MonthlyReportPanel.add(TotalSoldCopies, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 880, 30));

        MonthTxt.setEditable(false);
        MonthTxt.setBackground(new java.awt.Color(43, 53, 51));
        MonthTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        MonthTxt.setForeground(new java.awt.Color(255, 255, 255));
        MonthTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        MonthTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MonthTxtActionPerformed(evt);
            }
        });
        MonthlyReportPanel.add(MonthTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 10, 100, 30));

        book1.setEditable(false);
        book1.setBackground(new java.awt.Color(43, 53, 51));
        book1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        book1.setForeground(new java.awt.Color(255, 255, 255));
        book1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        book1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                book1ActionPerformed(evt);
            }
        });
        MonthlyReportPanel.add(book1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 240, 30));

        book2.setEditable(false);
        book2.setBackground(new java.awt.Color(43, 53, 51));
        book2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        book2.setForeground(new java.awt.Color(255, 255, 255));
        book2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        book2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                book2ActionPerformed(evt);
            }
        });
        MonthlyReportPanel.add(book2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, 240, 30));

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Top Selling Authors :");
        MonthlyReportPanel.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 170, -1));

        author1.setEditable(false);
        author1.setBackground(new java.awt.Color(43, 53, 51));
        author1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        author1.setForeground(new java.awt.Color(255, 255, 255));
        author1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        author1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                author1ActionPerformed(evt);
            }
        });
        MonthlyReportPanel.add(author1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 240, 30));

        author2.setEditable(false);
        author2.setBackground(new java.awt.Color(43, 53, 51));
        author2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        author2.setForeground(new java.awt.Color(255, 255, 255));
        author2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        author2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                author2ActionPerformed(evt);
            }
        });
        MonthlyReportPanel.add(author2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 320, 240, 30));

        author3.setEditable(false);
        author3.setBackground(new java.awt.Color(43, 53, 51));
        author3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        author3.setForeground(new java.awt.Color(255, 255, 255));
        author3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        author3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                author3ActionPerformed(evt);
            }
        });
        MonthlyReportPanel.add(author3, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 320, 240, 30));

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Top Selling Genre :");
        MonthlyReportPanel.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 170, -1));

        genre1.setEditable(false);
        genre1.setBackground(new java.awt.Color(43, 53, 51));
        genre1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        genre1.setForeground(new java.awt.Color(255, 255, 255));
        genre1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        genre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genre1ActionPerformed(evt);
            }
        });
        MonthlyReportPanel.add(genre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 240, 30));

        genre2.setEditable(false);
        genre2.setBackground(new java.awt.Color(43, 53, 51));
        genre2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        genre2.setForeground(new java.awt.Color(255, 255, 255));
        genre2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        genre2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genre2ActionPerformed(evt);
            }
        });
        MonthlyReportPanel.add(genre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 390, 240, 30));

        genre3.setEditable(false);
        genre3.setBackground(new java.awt.Color(43, 53, 51));
        genre3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        genre3.setForeground(new java.awt.Color(255, 255, 255));
        genre3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        genre3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genre3ActionPerformed(evt);
            }
        });
        MonthlyReportPanel.add(genre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 390, 240, 30));

        RestockReTxt.setBackground(new java.awt.Color(43, 53, 51));
        RestockReTxt.setColumns(20);
        RestockReTxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        RestockReTxt.setForeground(new java.awt.Color(255, 255, 255));
        RestockReTxt.setRows(5);
        jScrollPane6.setViewportView(RestockReTxt);

        MonthlyReportPanel.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 1070, 200));

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Suggestions / Tips / Recommendations:");
        MonthlyReportPanel.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 370, 50));

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Total Revenue :");
        MonthlyReportPanel.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 130, -1));

        TotalRevenue.setEditable(false);
        TotalRevenue.setBackground(new java.awt.Color(43, 53, 51));
        TotalRevenue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TotalRevenue.setForeground(new java.awt.Color(255, 255, 255));
        TotalRevenue.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TotalRevenue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalRevenueActionPerformed(evt);
            }
        });
        MonthlyReportPanel.add(TotalRevenue, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 880, 30));

        MainPanel.add(MonthlyReportPanel, "card4");

        CategoriesPanel.setBackground(new java.awt.Color(43, 53, 51));
        CategoriesPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        refreshDatabaseCategoriesBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/refreshDB.png"))); // NOI18N
        refreshDatabaseCategoriesBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        refreshDatabaseCategoriesBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshDatabaseCategoriesBtnMouseClicked(evt);
            }
        });
        CategoriesPanel.add(refreshDatabaseCategoriesBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 30, 40));

        searchTextField2.setBackground(new java.awt.Color(43, 53, 51));
        searchTextField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        searchTextField2.setForeground(new java.awt.Color(255, 255, 255));
        searchTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        searchTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTextField2ActionPerformed(evt);
            }
        });
        CategoriesPanel.add(searchTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, 220, 50));

        SeachLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SeachLabel2.setForeground(new java.awt.Color(240, 240, 240));
        SeachLabel2.setText("Search :");
        CategoriesPanel.add(SeachLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, 60, 20));

        SearchByDropdown2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "book_id", "title", "author", "genre" }));
        SearchByDropdown2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchByDropdown2ActionPerformed(evt);
            }
        });
        CategoriesPanel.add(SearchByDropdown2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 190, 50));

        SearchBtn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SearchIcon.png"))); // NOI18N
        SearchBtn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SearchBtn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchBtn2MouseClicked(evt);
            }
        });
        CategoriesPanel.add(SearchBtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 10, -1, -1));

        CategoriesTable.setBackground(new java.awt.Color(0, 0, 0));
        CategoriesTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CategoriesTable.setForeground(new java.awt.Color(255, 255, 255));
        CategoriesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "TITLE", "AUTHOR", "GENRE", "PUBLISHER", "PRICE"
            }
        ));
        CategoriesTable.setGridColor(new java.awt.Color(240, 240, 240));
        CategoriesTable.setRowHeight(25);
        CategoriesTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CategoriesTableMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(CategoriesTable);

        CategoriesPanel.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 1090, 270));

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Categories");
        CategoriesPanel.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Search By :");
        CategoriesPanel.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 110, 50));

        SearchByDropdown3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "book_id", "title", "author", "genre" }));
        SearchByDropdown3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchByDropdown3ActionPerformed(evt);
            }
        });
        CategoriesPanel.add(SearchByDropdown3, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 10, -1, -1));

        searchTextField3.setBackground(new java.awt.Color(43, 53, 51));
        searchTextField3.setForeground(new java.awt.Color(255, 255, 255));
        searchTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTextField3ActionPerformed(evt);
            }
        });
        CategoriesPanel.add(searchTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, 150, -1));

        SubmitBtn.setBackground(new java.awt.Color(0, 204, 51));
        SubmitBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SubmitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SubmitBtnMouseClicked(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Search");

        javax.swing.GroupLayout SubmitBtnLayout = new javax.swing.GroupLayout(SubmitBtn);
        SubmitBtn.setLayout(SubmitBtnLayout);
        SubmitBtnLayout.setHorizontalGroup(
            SubmitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SubmitBtnLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel40)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        SubmitBtnLayout.setVerticalGroup(
            SubmitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SubmitBtnLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel40)
                .addContainerGap())
        );

        CategoriesPanel.add(SubmitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 350, 120, -1));

        update_id_text1.setEditable(false);
        update_id_text1.setBackground(new java.awt.Color(43, 53, 51));
        update_id_text1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        update_id_text1.setForeground(new java.awt.Color(240, 240, 240));
        update_id_text1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        update_id_text1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_id_text1ActionPerformed(evt);
            }
        });
        CategoriesPanel.add(update_id_text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 560, 170, 40));

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("ID :");
        CategoriesPanel.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 60, 40));

        update_id_text5.setBackground(new java.awt.Color(43, 53, 51));
        update_id_text5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        update_id_text5.setForeground(new java.awt.Color(240, 240, 240));
        update_id_text5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        update_id_text5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_id_text5ActionPerformed(evt);
            }
        });
        CategoriesPanel.add(update_id_text5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 450, 50, 50));

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("ID");
        CategoriesPanel.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 40, 50));

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("Update Record :");
        CategoriesPanel.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 150, 50));

        UpdateBtn.setBackground(new java.awt.Color(0, 204, 51));
        UpdateBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        UpdateBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateBtnMouseClicked(evt);
            }
        });

        jLabel44.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Update");

        javax.swing.GroupLayout UpdateBtnLayout = new javax.swing.GroupLayout(UpdateBtn);
        UpdateBtn.setLayout(UpdateBtnLayout);
        UpdateBtnLayout.setHorizontalGroup(
            UpdateBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpdateBtnLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel44)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        UpdateBtnLayout.setVerticalGroup(
            UpdateBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UpdateBtnLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel44)
                .addContainerGap())
        );

        CategoriesPanel.add(UpdateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 450, -1, 50));

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("Genre");
        CategoriesPanel.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, 60, 50));

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("Info :");
        CategoriesPanel.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 60, 50));

        update_genre_text2.setBackground(new java.awt.Color(43, 53, 51));
        update_genre_text2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        update_genre_text2.setForeground(new java.awt.Color(240, 240, 240));
        update_genre_text2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        update_genre_text2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_genre_text2ActionPerformed(evt);
            }
        });
        CategoriesPanel.add(update_genre_text2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 450, 170, 50));

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("Title :");
        CategoriesPanel.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 560, 60, 40));

        update_title_text3.setEditable(false);
        update_title_text3.setBackground(new java.awt.Color(43, 53, 51));
        update_title_text3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        update_title_text3.setForeground(new java.awt.Color(240, 240, 240));
        update_title_text3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        update_title_text3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_title_text3ActionPerformed(evt);
            }
        });
        CategoriesPanel.add(update_title_text3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 560, 170, 40));

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("Author :");
        CategoriesPanel.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 560, 80, 40));

        update_author_text4.setEditable(false);
        update_author_text4.setBackground(new java.awt.Color(43, 53, 51));
        update_author_text4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        update_author_text4.setForeground(new java.awt.Color(240, 240, 240));
        update_author_text4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        update_author_text4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_author_text4ActionPerformed(evt);
            }
        });
        CategoriesPanel.add(update_author_text4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 560, 170, 40));

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("Note :");
        CategoriesPanel.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 610, 80, 40));

        update_genre_text5.setEditable(false);
        update_genre_text5.setBackground(new java.awt.Color(43, 53, 51));
        update_genre_text5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        update_genre_text5.setForeground(new java.awt.Color(240, 240, 240));
        update_genre_text5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        update_genre_text5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_genre_text5ActionPerformed(evt);
            }
        });
        CategoriesPanel.add(update_genre_text5, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 560, 170, 40));

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("Genre :");
        CategoriesPanel.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 560, 80, 40));

        CategoriesNoteTxt.setEditable(false);
        CategoriesNoteTxt.setBackground(new java.awt.Color(43, 53, 51));
        CategoriesNoteTxt.setColumns(20);
        CategoriesNoteTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CategoriesNoteTxt.setForeground(new java.awt.Color(255, 255, 255));
        CategoriesNoteTxt.setRows(5);
        jScrollPane8.setViewportView(CategoriesNoteTxt);

        CategoriesPanel.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 610, 660, 80));

        MainPanel.add(CategoriesPanel, "card5");

        ContactUsPanel.setBackground(new java.awt.Color(43, 53, 51));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Contact Us");

        javax.swing.GroupLayout ContactUsPanelLayout = new javax.swing.GroupLayout(ContactUsPanel);
        ContactUsPanel.setLayout(ContactUsPanelLayout);
        ContactUsPanelLayout.setHorizontalGroup(
            ContactUsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContactUsPanelLayout.createSequentialGroup()
                .addGap(459, 459, 459)
                .addComponent(jLabel8)
                .addContainerGap(521, Short.MAX_VALUE))
        );
        ContactUsPanelLayout.setVerticalGroup(
            ContactUsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContactUsPanelLayout.createSequentialGroup()
                .addGap(338, 338, 338)
                .addComponent(jLabel8)
                .addContainerGap(363, Short.MAX_VALUE))
        );

        MainPanel.add(ContactUsPanel, "card6");

        ManageBookPanel.setBackground(new java.awt.Color(43, 53, 51));
        ManageBookPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ManageBooksTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ManageBooksTitle.setForeground(new java.awt.Color(255, 255, 255));
        ManageBooksTitle.setText("Manage Book");
        ManageBookPanel.add(ManageBooksTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        refreshDatabaseBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/refreshDB.png"))); // NOI18N
        refreshDatabaseBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        refreshDatabaseBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshDatabaseBtnMouseClicked(evt);
            }
        });
        ManageBookPanel.add(refreshDatabaseBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 30, 40));

        searchTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTextFieldActionPerformed(evt);
            }
        });
        ManageBookPanel.add(searchTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 10, 150, -1));

        SearchBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SearchIcon.png"))); // NOI18N
        SearchBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SearchBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchBtnMouseClicked(evt);
            }
        });
        ManageBookPanel.add(SearchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 10, -1, -1));

        SearchByDropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "book_id", "title", "author", "genre" }));
        ManageBookPanel.add(SearchByDropdown, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 10, -1, -1));

        SeachLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SeachLabel.setForeground(new java.awt.Color(240, 240, 240));
        SeachLabel.setText("Search :");
        ManageBookPanel.add(SeachLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, 60, 20));

        BookTable.setBackground(new java.awt.Color(0, 0, 0));
        BookTable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BookTable.setForeground(new java.awt.Color(240, 240, 240));
        BookTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "TITLE", "AUTHOR", "GENRE", "PUBLISHER", "PRICE"
            }
        ));
        BookTable.setEditingColumn(0);
        BookTable.setEditingRow(0);
        BookTable.setGridColor(new java.awt.Color(240, 240, 240));
        BookTable.setRowHeight(25);
        BookTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BookTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(BookTable);

        ManageBookPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 1090, 270));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Note");
        ManageBookPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 600, 50, 20));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Add Record :");
        ManageBookPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 150, 50));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("ID");
        ManageBookPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 40, 50));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Title");
        ManageBookPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 40, 50));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Author");
        ManageBookPanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, 70, 50));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Genre");
        ManageBookPanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 320, 60, 50));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Publisher");
        ManageBookPanel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 320, 100, 50));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Price");
        ManageBookPanel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 320, 50, 50));

        update_author_text.setBackground(new java.awt.Color(43, 53, 51));
        update_author_text.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        update_author_text.setForeground(new java.awt.Color(240, 240, 240));
        update_author_text.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        update_author_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_author_textActionPerformed(evt);
            }
        });
        ManageBookPanel.add(update_author_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, 180, 50));

        update_publisher_text.setBackground(new java.awt.Color(43, 53, 51));
        update_publisher_text.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        update_publisher_text.setForeground(new java.awt.Color(240, 240, 240));
        update_publisher_text.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        update_publisher_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_publisher_textActionPerformed(evt);
            }
        });
        ManageBookPanel.add(update_publisher_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 370, 150, 50));

        sell_input_text.setBackground(new java.awt.Color(43, 53, 51));
        sell_input_text.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sell_input_text.setForeground(new java.awt.Color(240, 240, 240));
        sell_input_text.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sell_input_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sell_input_textActionPerformed(evt);
            }
        });
        ManageBookPanel.add(sell_input_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 680, 90, 30));

        update_genre_text.setBackground(new java.awt.Color(43, 53, 51));
        update_genre_text.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        update_genre_text.setForeground(new java.awt.Color(240, 240, 240));
        update_genre_text.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        update_genre_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_genre_textActionPerformed(evt);
            }
        });
        ManageBookPanel.add(update_genre_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 370, 160, 50));

        update_id_text.setBackground(new java.awt.Color(43, 53, 51));
        update_id_text.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        update_id_text.setForeground(new java.awt.Color(240, 240, 240));
        update_id_text.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        update_id_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_id_textActionPerformed(evt);
            }
        });
        ManageBookPanel.add(update_id_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 50, 50));

        update_title_text.setBackground(new java.awt.Color(43, 53, 51));
        update_title_text.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        update_title_text.setForeground(new java.awt.Color(240, 240, 240));
        update_title_text.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        update_title_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_title_textActionPerformed(evt);
            }
        });
        ManageBookPanel.add(update_title_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 170, 50));

        UpdateRecordBtn.setBackground(new java.awt.Color(0, 204, 51));
        UpdateRecordBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        UpdateRecordBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateRecordBtnMouseClicked(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Update");

        javax.swing.GroupLayout UpdateRecordBtnLayout = new javax.swing.GroupLayout(UpdateRecordBtn);
        UpdateRecordBtn.setLayout(UpdateRecordBtnLayout);
        UpdateRecordBtnLayout.setHorizontalGroup(
            UpdateRecordBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpdateRecordBtnLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel18)
                .addContainerGap(73, Short.MAX_VALUE))
        );
        UpdateRecordBtnLayout.setVerticalGroup(
            UpdateRecordBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpdateRecordBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        ManageBookPanel.add(UpdateRecordBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 430, 200, -1));

        add_price_text.setBackground(new java.awt.Color(43, 53, 51));
        add_price_text.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add_price_text.setForeground(new java.awt.Color(240, 240, 240));
        add_price_text.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add_price_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_price_textActionPerformed(evt);
            }
        });
        ManageBookPanel.add(add_price_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 530, 90, 50));

        add_publisher_text.setBackground(new java.awt.Color(43, 53, 51));
        add_publisher_text.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add_publisher_text.setForeground(new java.awt.Color(240, 240, 240));
        add_publisher_text.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add_publisher_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_publisher_textActionPerformed(evt);
            }
        });
        ManageBookPanel.add(add_publisher_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 530, 150, 50));

        add_genre_text.setBackground(new java.awt.Color(43, 53, 51));
        add_genre_text.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add_genre_text.setForeground(new java.awt.Color(240, 240, 240));
        add_genre_text.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add_genre_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_genre_textActionPerformed(evt);
            }
        });
        ManageBookPanel.add(add_genre_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 530, 160, 50));

        add_author_text.setBackground(new java.awt.Color(43, 53, 51));
        add_author_text.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add_author_text.setForeground(new java.awt.Color(240, 240, 240));
        add_author_text.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add_author_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_author_textActionPerformed(evt);
            }
        });
        ManageBookPanel.add(add_author_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 530, 180, 50));

        add_title_text.setBackground(new java.awt.Color(43, 53, 51));
        add_title_text.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add_title_text.setForeground(new java.awt.Color(240, 240, 240));
        add_title_text.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add_title_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_title_textActionPerformed(evt);
            }
        });
        ManageBookPanel.add(add_title_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 530, 170, 50));

        add_id_text.setBackground(new java.awt.Color(43, 53, 51));
        add_id_text.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add_id_text.setForeground(new java.awt.Color(240, 240, 240));
        add_id_text.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add_id_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_id_textActionPerformed(evt);
            }
        });
        ManageBookPanel.add(add_id_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 530, 50, 50));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Sell Books :");
        ManageBookPanel.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 680, 150, 30));

        AddRecordBtn.setBackground(new java.awt.Color(0, 204, 51));
        AddRecordBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddRecordBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AddRecordBtnMousePressed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Add");

        javax.swing.GroupLayout AddRecordBtnLayout = new javax.swing.GroupLayout(AddRecordBtn);
        AddRecordBtn.setLayout(AddRecordBtnLayout);
        AddRecordBtnLayout.setHorizontalGroup(
            AddRecordBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddRecordBtnLayout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addGap(83, 83, 83))
        );
        AddRecordBtnLayout.setVerticalGroup(
            AddRecordBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddRecordBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        ManageBookPanel.add(AddRecordBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 590, 200, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Note");
        ManageBookPanel.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, 50, 30));

        add_note_text.setBackground(new java.awt.Color(43, 53, 51));
        add_note_text.setColumns(20);
        add_note_text.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add_note_text.setForeground(new java.awt.Color(240, 240, 240));
        add_note_text.setRows(5);
        add_note_text.setWrapStyleWord(true);
        jScrollPane2.setViewportView(add_note_text);

        ManageBookPanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 590, 650, 80));

        update_note_text.setBackground(new java.awt.Color(43, 53, 51));
        update_note_text.setColumns(20);
        update_note_text.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        update_note_text.setForeground(new java.awt.Color(240, 240, 240));
        update_note_text.setRows(5);
        update_note_text.setWrapStyleWord(true);
        jScrollPane3.setViewportView(update_note_text);

        ManageBookPanel.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 650, 90));

        DeleteRecordBtn.setBackground(new java.awt.Color(211, 63, 73));
        DeleteRecordBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DeleteRecordBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteRecordBtnMouseClicked(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Delete Record");

        javax.swing.GroupLayout DeleteRecordBtnLayout = new javax.swing.GroupLayout(DeleteRecordBtn);
        DeleteRecordBtn.setLayout(DeleteRecordBtnLayout);
        DeleteRecordBtnLayout.setHorizontalGroup(
            DeleteRecordBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DeleteRecordBtnLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel23)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        DeleteRecordBtnLayout.setVerticalGroup(
            DeleteRecordBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DeleteRecordBtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel23)
                .addContainerGap())
        );

        ManageBookPanel.add(DeleteRecordBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 670, 160, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Update Record :");
        ManageBookPanel.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 150, 50));

        update_price_text1.setBackground(new java.awt.Color(43, 53, 51));
        update_price_text1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        update_price_text1.setForeground(new java.awt.Color(240, 240, 240));
        update_price_text1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        update_price_text1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_price_text1ActionPerformed(evt);
            }
        });
        ManageBookPanel.add(update_price_text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 370, 90, 50));

        SellBookBtn.setBackground(new java.awt.Color(0, 204, 51));
        SellBookBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SellBookBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SellBookBtnMouseClicked(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Sell");

        javax.swing.GroupLayout SellBookBtnLayout = new javax.swing.GroupLayout(SellBookBtn);
        SellBookBtn.setLayout(SellBookBtnLayout);
        SellBookBtnLayout.setHorizontalGroup(
            SellBookBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SellBookBtnLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel24)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        SellBookBtnLayout.setVerticalGroup(
            SellBookBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SellBookBtnLayout.createSequentialGroup()
                .addComponent(jLabel24)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        ManageBookPanel.add(SellBookBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 680, 90, 30));

        MainPanel.add(ManageBookPanel, "card2");

        Background.add(MainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 1110, 730));

        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 760));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    int x, y; // to grab c-ordinates
    private void HeadbarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeadbarMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_HeadbarMousePressed

    private void HeadbarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeadbarMouseDragged
        int xx = evt.getXOnScreen();
        int yy = evt.getYOnScreen();
        this.setLocation(xx - x, yy - y);
    }//GEN-LAST:event_HeadbarMouseDragged

    private void closeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseClicked
        System.exit(0); // kill the Application
    }//GEN-LAST:event_closeBtnMouseClicked

    private void LogoutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutBtnMouseClicked
        this.dispose(); // kill the window
        new login().setVisible(true); // call the Login window
    }//GEN-LAST:event_LogoutBtnMouseClicked

    private void ManageBookBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageBookBtnMouseClicked
        resetColorOfBtns(ManageBookBtn);
        MakePanelVisible(ManageBookPanel);
        UpdateBookTable();
    }//GEN-LAST:event_ManageBookBtnMouseClicked

    private void ManageStockBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageStockBtnMouseClicked
        resetColorOfBtns(ManageStockBtn);
        MakePanelVisible(ManageStockPanel);
        UpdateStockTable();
        
        try{
            Connection con = (Connection)
            DriverManager.getConnection(ConnectionString, "root", "root"); // make a connection to database
            PreparedStatement st = (PreparedStatement) con.prepareStatement("select title from restock order by available_copies asc limit 5"); // restock is a VIEW
            
            ResultSet rs = st.executeQuery();
            String Text = "Add more Copies For :";
            //rs.next();
            int i = 1;
            while(i <= 5){
                rs.next();
                Text += "\n" + rs.getString(1);
                i++;
            }
            
            RestockTxt.setText(Text);
            
            
            
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null,e); // print the error in the console
        }
    }//GEN-LAST:event_ManageStockBtnMouseClicked

    private void CategoriesBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CategoriesBtnMouseClicked
        resetColorOfBtns(CategoriesBtn);
        MakePanelVisible(CategoriesPanel);
        UpdateCategoriesTable();
    }//GEN-LAST:event_CategoriesBtnMouseClicked

    private void ContactUsBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContactUsBtnMouseClicked
        //resetColorOfBtns(ContactUsBtn);
        //MakePanelVisible(ContactUsPanel);
        new ContactUs().setVisible(true);
    }//GEN-LAST:event_ContactUsBtnMouseClicked

    private void extraHeadbarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_extraHeadbarMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_extraHeadbarMousePressed

    private void extraHeadbarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_extraHeadbarMouseDragged
        int xx = evt.getXOnScreen();
        int yy = evt.getYOnScreen();
        this.setLocation(xx - x, yy - y);
    }//GEN-LAST:event_extraHeadbarMouseDragged

    private void MonthlyReportBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MonthlyReportBtnMouseClicked
        MonthTxt.setText(currentdate.getMonth().toString());
        YearTxt.setText("" + currentdate.getYear());
        
        resetColorOfBtns(MonthlyReportBtn);
        MakePanelVisible(MonthlyReportPanel);
        
        try{
            Connection con = (Connection)
            DriverManager.getConnection(ConnectionString, "root", "root"); // make a connection to database
            PreparedStatement st = (PreparedStatement) con.prepareStatement("select sum(monthly_sold) from monthly_sales;"); // make sql statement
            ResultSet rs = st.executeQuery();
            rs.next();
            TotalSoldCopies.setText(rs.getString(1)); 
            
            PreparedStatement rev = (PreparedStatement) con.prepareStatement("select sum(revenueofbook) from revenue;"); // revenue is a VIEW
            ResultSet revrs = rev.executeQuery();
            revrs.next();
            TotalRevenue.setText(revrs.getString(1)); 
            
            PreparedStatement st2 = (PreparedStatement) con.prepareStatement("select * from MonthlyReport order by monthly_sold desc limit 3;"); // monthlyReport is a VIEW
            ResultSet rs2 = st2.executeQuery();
            
            rs2.next(); // first book
            book1.setText(rs2.getString("title"));
            author1.setText(rs2.getString("author"));
            genre1.setText(rs2.getString("genre"));
            
            rs2.next(); // second book
            book2.setText(rs2.getString("title"));
            author2.setText(rs2.getString("author"));
            genre2.setText(rs2.getString("genre"));
            
            rs2.next(); // third book
            book3.setText(rs2.getString("title"));
            author3.setText(rs2.getString("author"));
            genre3.setText(rs2.getString("genre"));
            

        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e); // print the error in the console
        }
        
        try{
            Connection con = (Connection)
            DriverManager.getConnection(ConnectionString, "root", "root"); // make a connection to database
            PreparedStatement st = (PreparedStatement) con.prepareStatement("select title from restock order by available_copies asc limit 5"); // restock is a VIEW
            
            ResultSet rs = st.executeQuery();
            String Text = "Add more Copies For :";
            //rs.next();
            int i = 1;
            while(i <= 5){
                rs.next();
                Text += "\n" + rs.getString(1);
                i++;
            }
            
            RestockReTxt.setText(Text);
            
            
            
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null,e); // print the error in the console
        }
    }//GEN-LAST:event_MonthlyReportBtnMouseClicked

    private void refreshDatabaseBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshDatabaseBtnMouseClicked
        UpdateBookTable();
    }//GEN-LAST:event_refreshDatabaseBtnMouseClicked

    private void searchTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTextFieldActionPerformed

    private void update_author_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_author_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_update_author_textActionPerformed

    private void update_publisher_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_publisher_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_update_publisher_textActionPerformed

    private void sell_input_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sell_input_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sell_input_textActionPerformed

    private void update_genre_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_genre_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_update_genre_textActionPerformed

    private void update_id_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_id_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_update_id_textActionPerformed

    private void update_title_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_title_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_update_title_textActionPerformed

    private void UpdateRecordBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateRecordBtnMouseClicked
        String id = update_id_text.getText();
        String title = update_title_text.getText();
        String author = update_author_text.getText();
        String genre = update_genre_text.getText();
        String publisher = update_publisher_text.getText();
        String price = update_price_text1.getText();
        String note = update_note_text.getText();
        
        if ("".equals(id) || "".equals(title)){
            JOptionPane.showMessageDialog(null,"Few Input Field(s) are/is Empty");
            return ;
        }
        
//        try{
//            sellQuantity = Integer.parseInt(update_price_text1.getText());
//        }catch (Exception e){
//            JOptionPane.showMessageDialog(null,"Enter a Number!");
//            update_price_text1.setText("");
//            return;
//        }
        
        
        try{
            Connection con = (Connection)
            DriverManager.getConnection(ConnectionString, "root", "root"); // make a connection to database
            PreparedStatement st = (PreparedStatement) con.prepareStatement("update book set title = ?, author = ?, genre = ?, publisher = ?, price = ? where book_id = ?"); // make sql statement
            
            st.setString(1, title);
            st.setString(2, author);
            st.setString(3, genre);
            st.setString(4, publisher);
            st.setString(5, price);
            st.setString(6, id);
            
            int rs = st.executeUpdate();
            
            PreparedStatement notest = (PreparedStatement) con.prepareStatement("update notes set note = ? where book_id = ?"); // add a row in notes table
            notest.setString(1, note);
            notest.setString(2, id);
            notest.executeUpdate();
            
            if(rs == 1){
                JOptionPane.showMessageDialog(null,"Changes Made Successfully");
            }else {
                
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e); // print the error in the console
        }
        
        UpdateBookTable();
    }//GEN-LAST:event_UpdateRecordBtnMouseClicked

    private void add_price_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_price_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_add_price_textActionPerformed

    private void add_publisher_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_publisher_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_add_publisher_textActionPerformed

    private void add_genre_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_genre_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_add_genre_textActionPerformed

    private void add_author_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_author_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_add_author_textActionPerformed

    private void add_title_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_title_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_add_title_textActionPerformed

    private void add_id_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_id_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_add_id_textActionPerformed

    private void DeleteRecordBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteRecordBtnMouseClicked
         String id = update_id_text.getText();
         System.out.println("id = " + id);
         //if (id == "") return;
         
         try{
                Connection con = (Connection)
                DriverManager.getConnection(ConnectionString, "root", "root"); // make a connection to database
                
                PreparedStatement notest = (PreparedStatement) con.prepareStatement("delete from notes where book_id = ?"); // add a row in notes table
                notest.setString(1, id);
                notest.executeUpdate();
                
                PreparedStatement monthly = (PreparedStatement) con.prepareStatement("delete from monthly_sales where book_id = ?"); // add a row in notes table
                monthly.setString(1, id);
                monthly.executeUpdate();
                
                PreparedStatement stockst = (PreparedStatement) con.prepareStatement("delete from stock where book_id = ?"); // add a row in notes table
                stockst.setString(1, id);
                stockst.executeUpdate(); 
                
                PreparedStatement st = (PreparedStatement) con.prepareStatement("delete from book where book_id = ?"); // make sql statement

                st.setString(1, id);

                int rs = st.executeUpdate();

                
                
                if(rs == 1){
                    JOptionPane.showMessageDialog(null,"Book has Been Deleted");
                }else {
                    // do nothing
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e); // print the error in the console
            }
        
        UpdateBookTable();
    }//GEN-LAST:event_DeleteRecordBtnMouseClicked

    private void update_price_text1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_price_text1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_update_price_text1ActionPerformed

    private void SellBookBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SellBookBtnMouseClicked
        try{
            sellQuantity = Integer.parseInt(sell_input_text.getText());
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Enter a Number!");
            sell_input_text.setText("");
            return;
        }
        System.out.println("Enter value is : " + sellQuantity);
        
        try{
                Connection con = (Connection)
                DriverManager.getConnection(ConnectionString, "root", "root"); // make a connection to database
                
                PreparedStatement notest = (PreparedStatement) con.prepareStatement("select available_copies from stock where book_id = ?"); // add a row in notes table
                notest.setString(1, update_id_text.getText());
                

                ResultSet rs = notest.executeQuery();
                rs.next();
                
                if (Integer.parseInt(rs.getString("available_copies")) >= sellQuantity){
                    PreparedStatement notest1 = (PreparedStatement) con.prepareStatement("update stock set available_copies = available_copies - " + sellQuantity + ", sold_copies = sold_copies + " + sellQuantity + " where book_id = ?"); // add a row in notes table
                notest1.setString(1, update_id_text.getText());
                int rs1 = notest1.executeUpdate();
                
                PreparedStatement monthlyst = (PreparedStatement) con.prepareStatement("update monthly_sales set monthly_sold = monthly_sold + " + sellQuantity + " where book_id = ?"); // add a row in notes table
                monthlyst.setString(1, update_id_text.getText());
                
                int rs2 = monthlyst.executeUpdate();

                if(rs1 == 1){
                    JOptionPane.showMessageDialog(null,"success");
                }else {
                    // do nothing
                }
                }else{
                    JOptionPane.showMessageDialog(null,"Not Enough Copies Available");
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e); // print the error in the console
            }
        
        
    }//GEN-LAST:event_SellBookBtnMouseClicked

    private void refreshStockDatabaseBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshStockDatabaseBtnMouseClicked
        UpdateStockTable();
    }//GEN-LAST:event_refreshStockDatabaseBtnMouseClicked

    private void searchTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTextField1ActionPerformed

    private void update_soldcopies_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_soldcopies_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_update_soldcopies_textActionPerformed

    private void update_id_text_stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_id_text_stockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_update_id_text_stockActionPerformed

    private void update_id_text3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_id_text3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_update_id_text3ActionPerformed

    private void update_availcopies_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_availcopies_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_update_availcopies_textActionPerformed

    private void UpdateStockBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateStockBtnMouseClicked
        String id, avail_copies, sold_copies;
        id = update_id_text_stock.getText();
        avail_copies = update_availcopies_text.getText();
        sold_copies = update_soldcopies_text.getText();
        
        if (id.equals("") || avail_copies.equals("") || sold_copies.equals("")){
            JOptionPane.showMessageDialog(null,"Few Field(s) is/are Empty");
            return ;
        }
        
        try{
            Connection con = (Connection)
            DriverManager.getConnection(ConnectionString, "root", "root"); // make a connection to database
            PreparedStatement st = (PreparedStatement) con.prepareStatement("update stock set available_copies = ?, sold_copies = ? where book_id = ?"); // make sql statement
            st.setString(1, avail_copies);
            st.setString(2, sold_copies);
            st.setString(3, id);
            
            int rs = st.executeUpdate();
            
            if (rs == 1){
                JOptionPane.showMessageDialog(null,"success");
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null,e); // print the error in the console
        }
        
        UpdateStockTable();       
        
        
    }//GEN-LAST:event_UpdateStockBtnMouseClicked

    private void YearTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YearTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_YearTxtActionPerformed

    private void book3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_book3ActionPerformed

    private void TotalSoldCopiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalSoldCopiesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalSoldCopiesActionPerformed

    private void MonthTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MonthTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MonthTxtActionPerformed

    private void book1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_book1ActionPerformed

    private void book2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_book2ActionPerformed

    private void author1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_author1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_author1ActionPerformed

    private void author2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_author2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_author2ActionPerformed

    private void author3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_author3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_author3ActionPerformed

    private void genre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genre1ActionPerformed

    private void genre2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genre2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genre2ActionPerformed

    private void genre3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genre3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genre3ActionPerformed

    private void refreshDatabaseCategoriesBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshDatabaseCategoriesBtnMouseClicked
        UpdateCategoriesTable();
    }//GEN-LAST:event_refreshDatabaseCategoriesBtnMouseClicked

    private void searchTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTextField2ActionPerformed

    private void searchTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTextField3ActionPerformed

    private void SubmitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmitBtnMouseClicked
        String selectedItem = SearchByDropdown2.getSelectedItem().toString();
        String SearchTxt = searchTextField2.getText();
        
        if (SearchTxt.equals("")){
            JOptionPane.showMessageDialog(null,"input Field is Empty");
            return ;
        }
        
        System.out.println("item : " + selectedItem);
        System.out.println("criteria : " + SearchTxt);
        
        int c;
        
        try{
            Connection con = (Connection)
            DriverManager.getConnection(ConnectionString, "root", "root"); // make a connection to database
            PreparedStatement st = (PreparedStatement) con.prepareStatement("select * from book where " + selectedItem + " regexp ?"); // make sql 
            st.setString(1, SearchTxt);
            
            ResultSet rs = st.executeQuery();
            ResultSetMetaData rss = rs.getMetaData();
            c = rss.getColumnCount();
            
            DefaultTableModel df = (DefaultTableModel) CategoriesTable.getModel();
            df.setRowCount(0);
            
            while (rs.next()){
                Vector v2 = new Vector();
                
                for (int a = 1; a <= c; a++){
                    v2.add(rs.getString("book_id"));
                    v2.add(rs.getString("title"));
                    v2.add(rs.getString("author"));
                    v2.add(rs.getString("genre"));
                    v2.add(rs.getString("publisher"));
                    v2.add(rs.getString("price"));
                    
                }
                
                df.addRow(v2);
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null,e); // print the error in the console
        } 
    }//GEN-LAST:event_SubmitBtnMouseClicked

    private void update_id_text1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_id_text1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_update_id_text1ActionPerformed

    private void update_id_text5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_id_text5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_update_id_text5ActionPerformed

    private void UpdateBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateBtnMouseClicked
        String id, genre;
        id = update_id_text5.getText();
        genre = update_genre_text2.getText();
        
        if(id.equals("") || genre.equals("")){
            JOptionPane.showMessageDialog(null,"Field(s) is/are Empty");
        }
        
        try{
            Connection con = (Connection)
            DriverManager.getConnection(ConnectionString, "root", "root"); // make a connection to database
            PreparedStatement st = (PreparedStatement) con.prepareStatement("update book set genre = ? where book_id = ?"); // make sql statement
            st.setString(1, genre);
            st.setString(2, id);
            
            int rs = st.executeUpdate();
            
            if (rs == 1){
                JOptionPane.showMessageDialog(null,"Changes Made Successfully");
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null,e); // print the error in the console
        }
        
        UpdateCategoriesTable();
    }//GEN-LAST:event_UpdateBtnMouseClicked

    private void update_genre_text2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_genre_text2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_update_genre_text2ActionPerformed

    private void update_title_text3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_title_text3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_update_title_text3ActionPerformed

    private void update_author_text4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_author_text4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_update_author_text4ActionPerformed

    private void update_genre_text5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_genre_text5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_update_genre_text5ActionPerformed

    private void AddRecordBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddRecordBtnMousePressed
        String id = add_id_text.getText();
        String title = add_title_text.getText();
        String author = add_author_text.getText();
        String genre = add_genre_text.getText();
        String publisher = add_publisher_text.getText();
        String price = add_price_text.getText();
        String note = add_note_text.getText();
        
        if ("".equals(id) || "".equals(title)){
            JOptionPane.showMessageDialog(null,"Few Input Field(s) are/is Empty");
            return ;
        }

        
        try{
            sellQuantity = Integer.parseInt(add_price_text.getText());
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Enter a Number!");
            add_price_text.setText("");
            return;
        }
        
        
        
        try{
            if(id == "") return;
            Connection con = (Connection)
            DriverManager.getConnection(ConnectionString, "root", "root"); // make a connection to database
            PreparedStatement st = (PreparedStatement) con.prepareStatement("insert into book values(?, ?, ?, ?, ?, ?)"); // make sql statement
            st.setString(1, id);
            st.setString(2, title);
            st.setString(3, author);
            st.setString(4, genre);
            st.setString(5, publisher);
            st.setString(6, price);
            
            int rs = st.executeUpdate();
            
            PreparedStatement notest = (PreparedStatement) con.prepareStatement("insert into notes values(?, ?)"); // add a row in notes table
            notest.setString(1, id);
            notest.setString(2, note);
            notest.executeUpdate();
            
            PreparedStatement ststock = (PreparedStatement) con.prepareStatement("insert into stock values(?, 1, 0)"); // add a row in stock table
            ststock.setString(1, id);
            ststock.executeUpdate();
            
            PreparedStatement monthly = (PreparedStatement) con.prepareStatement("insert into monthly_sales values(?, 1)"); // add a row in stock table
            monthly.setString(1, id);
            monthly.executeUpdate();
            
            if(rs == 1){
                JOptionPane.showMessageDialog(null,"Book has been Added Successfully");
            }else {
                // do nothing
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Few Field(s) is/are Empty"); // print the error in the console
        }
        
        UpdateBookTable();
    }//GEN-LAST:event_AddRecordBtnMousePressed

    private void BookTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BookTableMouseClicked
        DefaultTableModel df = (DefaultTableModel) BookTable.getModel();
        int selectedIndex = BookTable.getSelectedRow();
        
        update_id_text.setText(df.getValueAt(selectedIndex, 0).toString());
        update_title_text.setText(df.getValueAt(selectedIndex, 1).toString());
        update_author_text.setText(df.getValueAt(selectedIndex, 2).toString());
        update_genre_text.setText(df.getValueAt(selectedIndex, 3).toString());
        update_publisher_text.setText(df.getValueAt(selectedIndex, 4).toString());
        update_price_text1.setText(df.getValueAt(selectedIndex, 5).toString());
        
        try{
            Connection con = (Connection)
            DriverManager.getConnection(ConnectionString, "root", "root"); // make a connection to database
            PreparedStatement st = (PreparedStatement) con.prepareStatement("select note from notes where book_id = ?"); // make sql statement
            st.setString(1, df.getValueAt(selectedIndex, 0).toString());
            
            ResultSet rs = st.executeQuery();
            
            rs.next();
            if (rs.getString("note")!= ""){
                update_note_text.setText(rs.getString("note"));
            }else{
                // do nothing
            }
            
        }catch(Exception e){
            //JOptionPane.showMessageDialog(null,"no note found"); // print the error in the console
            System.out.println(e);
            update_note_text.setText("");
        }
        
        
    }//GEN-LAST:event_BookTableMouseClicked

    private void StockTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StockTableMouseClicked
        DefaultTableModel df = (DefaultTableModel) StockTable.getModel();
        int selectedIndex = StockTable.getSelectedRow();
        
        update_id_text_stock.setText(df.getValueAt(selectedIndex, 0).toString());
        update_availcopies_text.setText(df.getValueAt(selectedIndex, 1).toString());
        update_soldcopies_text.setText(df.getValueAt(selectedIndex, 2).toString());
        
        
    }//GEN-LAST:event_StockTableMouseClicked

    private void CategoriesTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CategoriesTableMouseClicked
        DefaultTableModel df = (DefaultTableModel) CategoriesTable.getModel();
        int selectedIndex = CategoriesTable.getSelectedRow();
        
        update_id_text5.setText(df.getValueAt(selectedIndex, 0).toString());
        update_id_text1.setText(df.getValueAt(selectedIndex, 0).toString());
        update_title_text3.setText(df.getValueAt(selectedIndex, 1).toString());
        update_author_text4.setText(df.getValueAt(selectedIndex, 2).toString());
        update_genre_text5.setText(df.getValueAt(selectedIndex, 3).toString());
        update_genre_text2.setText(df.getValueAt(selectedIndex, 3).toString());
        update_publisher_text.setText(df.getValueAt(selectedIndex, 4).toString());
        update_price_text1.setText(df.getValueAt(selectedIndex, 5).toString());
        
        try{
            Connection con = (Connection)
            DriverManager.getConnection(ConnectionString, "root", "root"); // make a connection to database
            PreparedStatement st = (PreparedStatement) con.prepareStatement("select note from notes where book_id = ?"); // make sql statement
            st.setString(1, df.getValueAt(selectedIndex, 0).toString());
            
            ResultSet rs = st.executeQuery();
            
            rs.next();
            if (rs.getString("note")!= ""){
                CategoriesNoteTxt.setText(rs.getString("note"));
            }else{
                // do nothing
            }
            
        }catch(Exception e){
            //JOptionPane.showMessageDialog(null,"no note found"); // print the error in the console
            System.out.println(e);
            CategoriesNoteTxt.setText("");
        }
    }//GEN-LAST:event_CategoriesTableMouseClicked

    private void SearchByDropdown2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchByDropdown2ActionPerformed
        Object selectedObject = SearchByDropdown2.getSelectedItem();
        System.out.println("index is " + selectedObject.toString());
    }//GEN-LAST:event_SearchByDropdown2ActionPerformed

    private void SearchBtn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchBtn2MouseClicked
        String selectedItem = SearchByDropdown3.getSelectedItem().toString();
        String SearchTxt = searchTextField3.getText();
        
        if ("".equals(SearchTxt)){
            JOptionPane.showMessageDialog(null, "Input Field is Empty");
            return ;
        }
        
        System.out.println("item : " + selectedItem);
        System.out.println("criteria : " + SearchTxt);
        
        int c;
        
        try{
            Connection con = (Connection)
            DriverManager.getConnection(ConnectionString, "root", "root"); // make a connection to database
            PreparedStatement st = (PreparedStatement) con.prepareStatement("select * from book where " + selectedItem + " regexp ?"); // make sql 
            st.setString(1, SearchTxt);
            
            ResultSet rs = st.executeQuery();
            ResultSetMetaData rss = rs.getMetaData();
            c = rss.getColumnCount();
            
            DefaultTableModel df = (DefaultTableModel) CategoriesTable.getModel();
            df.setRowCount(0);
            
            while (rs.next()){
                Vector v2 = new Vector();
                
                for (int a = 1; a <= c; a++){
                    v2.add(rs.getString("book_id"));
                    v2.add(rs.getString("title"));
                    v2.add(rs.getString("author"));
                    v2.add(rs.getString("genre"));
                    v2.add(rs.getString("publisher"));
                    v2.add(rs.getString("price"));
                    
                }
                
                df.addRow(v2);
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null,e); // print the error in the console
        }
    }//GEN-LAST:event_SearchBtn2MouseClicked

    private void SearchBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchBtnMouseClicked
          String selectedItem = SearchByDropdown.getSelectedItem().toString();
        String SearchTxt = searchTextField.getText();
        
        if ("".equals(SearchTxt)){
            JOptionPane.showMessageDialog(null, "Input Field is Empty");
            return ;
        }
        
        System.out.println("item : " + selectedItem);
        System.out.println("criteria : " + SearchTxt);
        
        int c;
        
        try{
            Connection con = (Connection)
            DriverManager.getConnection(ConnectionString, "root", "root"); // make a connection to database
            PreparedStatement st = (PreparedStatement) con.prepareStatement("select * from book where " + selectedItem + " regexp ?"); // make sql 
            st.setString(1, SearchTxt);
            
            ResultSet rs = st.executeQuery();
            ResultSetMetaData rss = rs.getMetaData();
            c = rss.getColumnCount();
            
            DefaultTableModel df = (DefaultTableModel) BookTable.getModel();
            df.setRowCount(0);
            
            while (rs.next()){
                Vector v2 = new Vector();
                
                for (int a = 1; a <= c; a++){
                    v2.add(rs.getString("book_id"));
                    v2.add(rs.getString("title"));
                    v2.add(rs.getString("author"));
                    v2.add(rs.getString("genre"));
                    v2.add(rs.getString("publisher"));
                    v2.add(rs.getString("price"));
                    
                }
                
                df.addRow(v2);
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null,e); // print the error in the console
        }
    }//GEN-LAST:event_SearchBtnMouseClicked

    private void SearchBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchBtn1MouseClicked
        String selectedItem = SearchByDropdown1.getSelectedItem().toString();
        String SearchTxt = searchTextField1.getText();
        
        if ("".equals(SearchTxt)){
            JOptionPane.showMessageDialog(null, "Input Field is Empty");
            return ;
        }
        
        System.out.println("item : " + selectedItem);
        System.out.println("criteria : " + SearchTxt);
        
        int c;
        
        try{
            Connection con = (Connection)
            DriverManager.getConnection(ConnectionString, "root", "root"); // make a connection to database
            PreparedStatement st = (PreparedStatement) con.prepareStatement("select * from stock where " + selectedItem + " regexp ?"); // make sql 
            st.setString(1, SearchTxt);
            
            ResultSet rs = st.executeQuery();
            ResultSetMetaData rss = rs.getMetaData();
            c = rss.getColumnCount();
            
            DefaultTableModel df = (DefaultTableModel) StockTable.getModel();
            df.setRowCount(0);
            
            while (rs.next()){
                Vector v2 = new Vector();
                
                for (int a = 1; a <= c; a++){
                    v2.add(rs.getString("book_id"));
                    v2.add(rs.getString("available_copies"));
                    v2.add(rs.getString("sold_copies"));
                    
                }
                
                df.addRow(v2);
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null,e); // print the error in the console
        }
    }//GEN-LAST:event_SearchBtn1MouseClicked

    private void TotalRevenueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalRevenueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalRevenueActionPerformed

    private void SearchByDropdown3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchByDropdown3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchByDropdown3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddRecordBtn;
    private javax.swing.JPanel Background;
    private javax.swing.JTable BookTable;
    private javax.swing.JPanel Branding;
    private javax.swing.JLabel Categories;
    private javax.swing.JPanel CategoriesBtn;
    private javax.swing.JTextArea CategoriesNoteTxt;
    private javax.swing.JPanel CategoriesPanel;
    private javax.swing.JTable CategoriesTable;
    private javax.swing.JLabel ContactUs;
    private javax.swing.JPanel ContactUsBtn;
    private javax.swing.JPanel ContactUsPanel;
    private javax.swing.JPanel DeleteRecordBtn;
    private javax.swing.JPanel Headbar;
    private javax.swing.JPanel LogoutBtn;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel ManageBookBtn;
    private javax.swing.JPanel ManageBookPanel;
    private javax.swing.JLabel ManageBooks;
    private javax.swing.JLabel ManageBooksTitle;
    private javax.swing.JLabel ManageBooksTitle1;
    private javax.swing.JLabel ManageStock;
    private javax.swing.JPanel ManageStockBtn;
    private javax.swing.JPanel ManageStockPanel;
    private javax.swing.JTextField MonthTxt;
    private javax.swing.JLabel MonthlyReport;
    private javax.swing.JPanel MonthlyReportBtn;
    private javax.swing.JPanel MonthlyReportPanel;
    private javax.swing.JTextArea RestockReTxt;
    private javax.swing.JTextArea RestockTxt;
    private javax.swing.JLabel SeachLabel;
    private javax.swing.JLabel SeachLabel1;
    private javax.swing.JLabel SeachLabel2;
    private javax.swing.JLabel SearchBtn;
    private javax.swing.JLabel SearchBtn1;
    private javax.swing.JLabel SearchBtn2;
    private javax.swing.JComboBox<String> SearchByDropdown;
    private javax.swing.JComboBox<String> SearchByDropdown1;
    private javax.swing.JComboBox<String> SearchByDropdown2;
    private javax.swing.JComboBox<String> SearchByDropdown3;
    private javax.swing.JPanel SellBookBtn;
    private javax.swing.JPanel SideBar;
    private javax.swing.JTable StockTable;
    private javax.swing.JPanel SubmitBtn;
    private javax.swing.JTextField TotalRevenue;
    private javax.swing.JTextField TotalSoldCopies;
    private javax.swing.JPanel UpdateBtn;
    private javax.swing.JPanel UpdateRecordBtn;
    private javax.swing.JPanel UpdateStockBtn;
    private javax.swing.JTextField YearTxt;
    private javax.swing.JTextField add_author_text;
    private javax.swing.JTextField add_genre_text;
    private javax.swing.JTextField add_id_text;
    private javax.swing.JTextArea add_note_text;
    private javax.swing.JTextField add_price_text;
    private javax.swing.JTextField add_publisher_text;
    private javax.swing.JTextField add_title_text;
    private javax.swing.JTextField author1;
    private javax.swing.JTextField author2;
    private javax.swing.JTextField author3;
    private javax.swing.JTextField book1;
    private javax.swing.JTextField book2;
    private javax.swing.JTextField book3;
    private javax.swing.JLabel closeBtn;
    private javax.swing.JPanel extraHeadbar;
    private javax.swing.JTextField genre1;
    private javax.swing.JTextField genre2;
    private javax.swing.JTextField genre3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JLabel refreshDatabaseBtn;
    private javax.swing.JLabel refreshDatabaseCategoriesBtn;
    private javax.swing.JLabel refreshStockDatabaseBtn;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JTextField searchTextField1;
    private javax.swing.JTextField searchTextField2;
    private javax.swing.JTextField searchTextField3;
    private javax.swing.JTextField sell_input_text;
    private javax.swing.JTextField update_author_text;
    private javax.swing.JTextField update_author_text4;
    private javax.swing.JTextField update_availcopies_text;
    private javax.swing.JTextField update_genre_text;
    private javax.swing.JTextField update_genre_text2;
    private javax.swing.JTextField update_genre_text5;
    private javax.swing.JTextField update_id_text;
    private javax.swing.JTextField update_id_text1;
    private javax.swing.JTextField update_id_text3;
    private javax.swing.JTextField update_id_text5;
    private javax.swing.JTextField update_id_text_stock;
    private javax.swing.JTextArea update_note_text;
    private javax.swing.JTextField update_price_text1;
    private javax.swing.JTextField update_publisher_text;
    private javax.swing.JTextField update_soldcopies_text;
    private javax.swing.JTextField update_title_text;
    private javax.swing.JTextField update_title_text3;
    // End of variables declaration//GEN-END:variables
}
