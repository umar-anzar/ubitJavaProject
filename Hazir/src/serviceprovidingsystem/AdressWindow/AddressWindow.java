/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviceprovidingsystem.AdressWindow;

import java.awt.Color;
import serviceprovidingsystem.Animations;
import serviceprovidingsystem.Database.DatabaseConnection;
import serviceprovidingsystem.SignInWindow;

/**
 *
 * @author omer
 */
public class AddressWindow extends javax.swing.JFrame {

    /**
     * Creates new form AddressWindow
     */
    //attribute
    DatabaseConnection database;
    //setting panel
        private boolean isSandwhichSettingPanelOpen = false;
        private int widthOfSettingPanel;
        private int heightOfSettingPanel;

    //Movable HomeBarPanel
        int XMouse;
        int YMouse;
    
    public AddressWindow(){
        initComponents();
    }
        
    public AddressWindow(DatabaseConnection database) {
        initComponents();
        this.database = database;
        this.setBackground(new Color(0,0,0,0));
        this.setOpacity(0f);
        this.setLocationRelativeTo(null);
        this.sandwichSettingPanel.setVisible(false);
        widthOfSettingPanel =  this.sandwichSettingPanel.getWidth();
        heightOfSettingPanel = this.sandwichSettingPanel.getHeight();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        logoBar = new com.k33ptoo.components.KGradientPanel();
        closeBar = new com.k33ptoo.components.KGradientPanel();
        jLabel3 = new javax.swing.JLabel();
        tItleBar = new com.k33ptoo.components.KGradientPanel();
        homeBar = new javax.swing.JLabel();
        sandwichSettingPanel = new com.k33ptoo.components.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        signOutBtn2 = new com.k33ptoo.components.KButton();
        signOutBtn5 = new com.k33ptoo.components.KButton();
        signOutBtn4 = new com.k33ptoo.components.KButton();
        signOutBtn1 = new com.k33ptoo.components.KButton();
        homeBackgroundPanel = new com.k33ptoo.components.KGradientPanel();
        kGradientPanel5 = new com.k33ptoo.components.KGradientPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        SelectOptionsWindow = new com.k33ptoo.components.KGradientPanel();
        btnSetMarker = new com.k33ptoo.components.KButton();
        btnAvailableAreas = new com.k33ptoo.components.KButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnAccept = new com.k33ptoo.components.KButton();
        houseField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        streetField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        phaseField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        areaField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLayeredPane1.setPreferredSize(new java.awt.Dimension(1066, 600));

        logoBar.setkEndColor(new java.awt.Color(24, 25, 25));
        logoBar.setkGradientFocus(50);
        logoBar.setkStartColor(new java.awt.Color(28, 40, 51));
        logoBar.setOpaque(false);

        javax.swing.GroupLayout logoBarLayout = new javax.swing.GroupLayout(logoBar);
        logoBar.setLayout(logoBarLayout);
        logoBarLayout.setHorizontalGroup(
            logoBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        logoBarLayout.setVerticalGroup(
            logoBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jLayeredPane1.add(logoBar);
        logoBar.setBounds(10, 0, 50, 40);

        closeBar.setkEndColor(new java.awt.Color(24, 25, 25));
        closeBar.setkGradientFocus(50);
        closeBar.setkStartColor(new java.awt.Color(28, 40, 51));
        closeBar.setOpaque(false);

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/serviceprovidingsystem/images/HomeWindow/close_window_32px.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.setPreferredSize(new java.awt.Dimension(21, 19));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout closeBarLayout = new javax.swing.GroupLayout(closeBar);
        closeBar.setLayout(closeBarLayout);
        closeBarLayout.setHorizontalGroup(
            closeBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        closeBarLayout.setVerticalGroup(
            closeBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jLayeredPane1.add(closeBar);
        closeBar.setBounds(1010, 0, 40, 40);

        tItleBar.setkEndColor(new java.awt.Color(24, 25, 25));
        tItleBar.setkGradientFocus(1000);
        tItleBar.setkStartColor(new java.awt.Color(28, 40, 51));
        tItleBar.setOpaque(false);

        homeBar.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 24)); // NOI18N
        homeBar.setForeground(new java.awt.Color(255, 255, 255));
        homeBar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        homeBar.setText("Address");
        homeBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                homeBarMouseDragged(evt);
            }
        });
        homeBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                homeBarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout tItleBarLayout = new javax.swing.GroupLayout(tItleBar);
        tItleBar.setLayout(tItleBarLayout);
        tItleBarLayout.setHorizontalGroup(
            tItleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tItleBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homeBar, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
                .addContainerGap())
        );
        tItleBarLayout.setVerticalGroup(
            tItleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tItleBarLayout.createSequentialGroup()
                .addComponent(homeBar, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLayeredPane1.add(tItleBar);
        tItleBar.setBounds(250, 0, 561, 70);

        sandwichSettingPanel.setkBorderRadius(15);
        sandwichSettingPanel.setkEndColor(new java.awt.Color(60, 156, 220));
        sandwichSettingPanel.setkStartColor(new java.awt.Color(180, 225, 255));
        sandwichSettingPanel.setOpaque(false);
        sandwichSettingPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/serviceprovidingsystem/images/HomeWindow/settings_32px.png"))); // NOI18N
        jLabel1.setText("Settings");
        sandwichSettingPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 20, -1, -1));

        signOutBtn2.setText("Password");
        signOutBtn2.setBorderPainted(false);
        signOutBtn2.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        signOutBtn2.setkEndColor(new java.awt.Color(255, 255, 255));
        signOutBtn2.setkForeGround(new java.awt.Color(0, 0, 0));
        signOutBtn2.setkHoverEndColor(new java.awt.Color(204, 204, 204));
        signOutBtn2.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        signOutBtn2.setkHoverStartColor(new java.awt.Color(240, 239, 239));
        signOutBtn2.setkStartColor(new java.awt.Color(255, 255, 255));
        sandwichSettingPanel.add(signOutBtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 154, 280, 30));

        signOutBtn5.setText("Mobile number");
        signOutBtn5.setBorderPainted(false);
        signOutBtn5.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        signOutBtn5.setkEndColor(new java.awt.Color(255, 255, 255));
        signOutBtn5.setkForeGround(new java.awt.Color(0, 0, 0));
        signOutBtn5.setkHoverEndColor(new java.awt.Color(204, 204, 204));
        signOutBtn5.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        signOutBtn5.setkHoverStartColor(new java.awt.Color(240, 239, 239));
        signOutBtn5.setkStartColor(new java.awt.Color(255, 255, 255));
        sandwichSettingPanel.add(signOutBtn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 202, 280, 30));

        signOutBtn4.setText("Address");
        signOutBtn4.setBorderPainted(false);
        signOutBtn4.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        signOutBtn4.setkEndColor(new java.awt.Color(255, 255, 255));
        signOutBtn4.setkForeGround(new java.awt.Color(0, 0, 0));
        signOutBtn4.setkHoverEndColor(new java.awt.Color(204, 204, 204));
        signOutBtn4.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        signOutBtn4.setkHoverStartColor(new java.awt.Color(240, 239, 239));
        signOutBtn4.setkStartColor(new java.awt.Color(255, 255, 255));
        sandwichSettingPanel.add(signOutBtn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 250, 280, 30));

        signOutBtn1.setText("Sign Out");
        signOutBtn1.setBorderPainted(false);
        signOutBtn1.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        signOutBtn1.setkEndColor(new java.awt.Color(255, 255, 255));
        signOutBtn1.setkForeGround(new java.awt.Color(0, 0, 0));
        signOutBtn1.setkHoverEndColor(new java.awt.Color(204, 204, 204));
        signOutBtn1.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        signOutBtn1.setkHoverStartColor(new java.awt.Color(240, 239, 239));
        signOutBtn1.setkStartColor(new java.awt.Color(255, 255, 255));
        signOutBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signOutBtn1ActionPerformed(evt);
            }
        });
        sandwichSettingPanel.add(signOutBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 398, 280, 30));

        jLayeredPane1.add(sandwichSettingPanel);
        sandwichSettingPanel.setBounds(62, 80, 410, 480);

        homeBackgroundPanel.setkBorderRadius(60);
        homeBackgroundPanel.setkEndColor(new java.awt.Color(255, 255, 255));
        homeBackgroundPanel.setkStartColor(new java.awt.Color(255, 255, 255));
        homeBackgroundPanel.setOpaque(false);

        kGradientPanel5.setkBorderRadius(50);
        kGradientPanel5.setkEndColor(new java.awt.Color(0, 0, 0));
        kGradientPanel5.setkStartColor(new java.awt.Color(28, 40, 51));
        kGradientPanel5.setOpaque(false);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/serviceprovidingsystem/images/HomeWindow/sandwichMenu_32x.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/serviceprovidingsystem/images/HomeWindow/contactUs_32x.png"))); // NOI18N

        javax.swing.GroupLayout kGradientPanel5Layout = new javax.swing.GroupLayout(kGradientPanel5);
        kGradientPanel5.setLayout(kGradientPanel5Layout);
        kGradientPanel5Layout.setHorizontalGroup(
            kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel2))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        kGradientPanel5Layout.setVerticalGroup(
            kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 444, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addGap(25, 25, 25))
        );

        kGradientPanel1.setkBorderRadius(20);
        kGradientPanel1.setkEndColor(new java.awt.Color(231, 231, 231));
        kGradientPanel1.setkGradientFocus(100);
        kGradientPanel1.setkStartColor(new java.awt.Color(231, 231, 231));
        kGradientPanel1.setOpaque(false);

        SelectOptionsWindow.setkBorderRadius(20);
        SelectOptionsWindow.setkEndColor(new java.awt.Color(60, 156, 220));
        SelectOptionsWindow.setkStartColor(new java.awt.Color(180, 225, 255));
        SelectOptionsWindow.setOpaque(false);

        btnSetMarker.setText("Mark Location");
        btnSetMarker.setToolTipText("");
        btnSetMarker.setBorderPainted(false);
        btnSetMarker.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        btnSetMarker.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSetMarker.setkEndColor(new java.awt.Color(226, 226, 226));
        btnSetMarker.setkForeGround(new java.awt.Color(0, 0, 0));
        btnSetMarker.setkHoverEndColor(new java.awt.Color(204, 204, 204));
        btnSetMarker.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        btnSetMarker.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        btnSetMarker.setkStartColor(new java.awt.Color(226, 226, 226));

        btnAvailableAreas.setText("Available Areas");
        btnAvailableAreas.setToolTipText("");
        btnAvailableAreas.setBorderPainted(false);
        btnAvailableAreas.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        btnAvailableAreas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAvailableAreas.setkEndColor(new java.awt.Color(226, 226, 226));
        btnAvailableAreas.setkForeGround(new java.awt.Color(0, 0, 0));
        btnAvailableAreas.setkHoverEndColor(new java.awt.Color(204, 204, 204));
        btnAvailableAreas.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        btnAvailableAreas.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        btnAvailableAreas.setkStartColor(new java.awt.Color(226, 226, 226));
        btnAvailableAreas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvailableAreasActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(28, 40, 51));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("asdasd");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/serviceprovidingsystem/images/MapWindow/setMarkerIcon_32px.png"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/serviceprovidingsystem/images/MapWindow/availabeAreasIcon_32px.png"))); // NOI18N

        javax.swing.GroupLayout SelectOptionsWindowLayout = new javax.swing.GroupLayout(SelectOptionsWindow);
        SelectOptionsWindow.setLayout(SelectOptionsWindowLayout);
        SelectOptionsWindowLayout.setHorizontalGroup(
            SelectOptionsWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SelectOptionsWindowLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SelectOptionsWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SelectOptionsWindowLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(42, 42, 42)
                        .addComponent(btnAvailableAreas, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SelectOptionsWindowLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SelectOptionsWindowLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSetMarker, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77))))
        );
        SelectOptionsWindowLayout.setVerticalGroup(
            SelectOptionsWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SelectOptionsWindowLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(SelectOptionsWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSetMarker, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(SelectOptionsWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAvailableAreas, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(26, 26, 26))
        );

        btnAccept.setText("GO");
        btnAccept.setToolTipText("");
        btnAccept.setBorderPainted(false);
        btnAccept.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        btnAccept.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAccept.setkEndColor(new java.awt.Color(255, 255, 255));
        btnAccept.setkForeGround(new java.awt.Color(0, 0, 0));
        btnAccept.setkHoverEndColor(new java.awt.Color(204, 204, 204));
        btnAccept.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        btnAccept.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        btnAccept.setkStartColor(new java.awt.Color(255, 255, 255));

        houseField.setBackground(new java.awt.Color(231, 231, 231));
        houseField.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        houseField.setForeground(new java.awt.Color(28, 40, 51));
        houseField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(230, 126, 34)));

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(28, 40, 51));
        jLabel4.setText("House/Flat no.");

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(28, 40, 51));
        jLabel5.setText("Street no.");

        streetField.setBackground(new java.awt.Color(231, 231, 231));
        streetField.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        streetField.setForeground(new java.awt.Color(28, 40, 51));
        streetField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(230, 126, 34)));

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(28, 40, 51));
        jLabel6.setText("Block/Phase no.");

        phaseField.setBackground(new java.awt.Color(231, 231, 231));
        phaseField.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        phaseField.setForeground(new java.awt.Color(28, 40, 51));
        phaseField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(230, 126, 34)));

        jLabel7.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(28, 40, 51));
        jLabel7.setText("Area name");

        areaField.setBackground(new java.awt.Color(231, 231, 231));
        areaField.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        areaField.setForeground(new java.awt.Color(28, 40, 51));
        areaField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(230, 126, 34)));

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap())
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(houseField, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(streetField, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(phaseField, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(areaField, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(SelectOptionsWindow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(btnAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(136, 136, 136))))))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(SelectOptionsWindow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(houseField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(streetField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(phaseField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(areaField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout homeBackgroundPanelLayout = new javax.swing.GroupLayout(homeBackgroundPanel);
        homeBackgroundPanel.setLayout(homeBackgroundPanelLayout);
        homeBackgroundPanelLayout.setHorizontalGroup(
            homeBackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeBackgroundPanelLayout.createSequentialGroup()
                .addComponent(kGradientPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102)
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(131, Short.MAX_VALUE))
        );
        homeBackgroundPanelLayout.setVerticalGroup(
            homeBackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(homeBackgroundPanelLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLayeredPane1.add(homeBackgroundPanel);
        homeBackgroundPanel.setBounds(0, 50, 1070, 552);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1081, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        Animations.windowCloseAnimation(this, 1f);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void homeBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBarMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - XMouse, y - YMouse);
    }//GEN-LAST:event_homeBarMouseDragged

    private void homeBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBarMousePressed
        // TODO add your handling code here:
        XMouse = evt.getX() + (int) homeBackgroundPanel.getX()+ 255;
        YMouse = evt.getY() + (int) homeBackgroundPanel.getY() - 50;
    }//GEN-LAST:event_homeBarMousePressed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        if(isSandwhichSettingPanelOpen){
            Animations.panelCloseAnimation(this.sandwichSettingPanel,widthOfSettingPanel,heightOfSettingPanel);
            isSandwhichSettingPanelOpen = false;
        } else{
            Animations.panelAppearAnimation(this.sandwichSettingPanel,widthOfSettingPanel,heightOfSettingPanel);
            isSandwhichSettingPanelOpen = true;
        }

    }//GEN-LAST:event_jLabel2MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        Animations.windowAppearAnimation(this, 1f);
    }//GEN-LAST:event_formWindowOpened

    private void signOutBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signOutBtn1ActionPerformed
        // TODO add your handling code here:

        Animations.windowCloseAnimation(this, 1f);
        new SignInWindow(database).setVisible(true);
    }//GEN-LAST:event_signOutBtn1ActionPerformed

    private void btnAvailableAreasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvailableAreasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAvailableAreasActionPerformed

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
            java.util.logging.Logger.getLogger(AddressWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddressWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddressWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddressWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddressWindow(new DatabaseConnection()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KGradientPanel SelectOptionsWindow;
    private javax.swing.JTextField areaField;
    private com.k33ptoo.components.KButton btnAccept;
    private com.k33ptoo.components.KButton btnAvailableAreas;
    private com.k33ptoo.components.KButton btnSetMarker;
    private com.k33ptoo.components.KGradientPanel closeBar;
    private com.k33ptoo.components.KGradientPanel homeBackgroundPanel;
    private javax.swing.JLabel homeBar;
    private javax.swing.JTextField houseField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel5;
    private com.k33ptoo.components.KGradientPanel logoBar;
    private javax.swing.JTextField phaseField;
    private com.k33ptoo.components.KGradientPanel sandwichSettingPanel;
    private com.k33ptoo.components.KButton signOutBtn1;
    private com.k33ptoo.components.KButton signOutBtn2;
    private com.k33ptoo.components.KButton signOutBtn4;
    private com.k33ptoo.components.KButton signOutBtn5;
    private javax.swing.JTextField streetField;
    private com.k33ptoo.components.KGradientPanel tItleBar;
    // End of variables declaration//GEN-END:variables
}
