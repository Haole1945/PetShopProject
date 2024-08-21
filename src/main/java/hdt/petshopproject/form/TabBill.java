package hdt.petshopproject.form;

import hdt.petshopproject.DAO.cardSanPhamHome_List;
import hdt.petshopproject.DAO.hoaDon_List;
import hdt.petshopproject.model.cardSanPhamHome;
import hdt.petshopproject.model.hoaDon;
import hdt.petshopproject.swing.TableGradientCell;
import hdt.petshopproject.swing.scrollbar.ScrollBarCustom;
import hdt.petshopproject.util.helper;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class TabBill extends javax.swing.JPanel {

    private DefaultTableModel tblModel = new DefaultTableModel();
    
    public TabBill() {
        initComponents();   
        B_Xoa.setEnabled(false);
        ScrollBarCustom sb = new ScrollBarCustom(10, 10, 100);
        sb.setForeground(new Color(130, 130, 130));
        jScrollPane1.setVerticalScrollBar(sb);
        initTable();
        fillTable();
        B_table.setDefaultEditor(Object.class, null);
    }


    @SuppressWarnings("unchecked")
    
    public void initTable() {
        String[] header = new String[]{"Mã hóa đơn", "Tên khách hàng", "Ngày tạo", "Thành tiền", "Chi tiết"};
        tblModel.setColumnIdentifiers(header);
        B_table.setModel(tblModel);
    }
    
    public void fillTable() {
        List<hoaDon> lstHD = new ArrayList<>();
        try {
            hoaDon_List dao = new hoaDon_List();
            lstHD = dao.getAll();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Dữ liệu bill lỗi!!");
        }
        
        tblModel.setRowCount(0);
        for (hoaDon hd : lstHD) {
            tblModel.addRow(new String[]{String.valueOf(hd.getIdHD()), hd.getTenKH(), hd.getNgTao(), String.valueOf(hd.getThanhTien()), "--"});
        }
        tblModel.fireTableDataChanged();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chiTietDonHang = new javax.swing.JDialog();
        Title = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        lbNgayLapHD = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbTenKH1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lbTenKH2 = new javax.swing.JLabel();
        lbTenKH3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lbTenKH = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbIDNhanVien = new javax.swing.JLabel();
        lbTenNV = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lnIDKhachHang = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        B_Combo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        B_Input = new javax.swing.JTextField();
        B_LM = new javax.swing.JButton();
        B_Xoa = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        B_table = new javax.swing.JTable();

        chiTietDonHang.setAlwaysOnTop(true);
        chiTietDonHang.setSize(new java.awt.Dimension(400, 700));
        chiTietDonHang.setLocationRelativeTo(null);

        Title.setBackground(new java.awt.Color(28, 59, 90));
        Title.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        Title.setForeground(new java.awt.Color(204, 204, 204));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("ĐƠN HÀNG SỐ: <ID>");
        Title.setOpaque(true);

        jPanel1.setBackground(new java.awt.Color(242, 242, 249));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã", "Tên thú cưng", "Giá"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel6.setText("Ngày lập hóa đơn:");

        lbNgayLapHD.setBackground(new java.awt.Color(230, 230, 232));
        lbNgayLapHD.setForeground(new java.awt.Color(51, 51, 51));
        lbNgayLapHD.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbNgayLapHD.setText("<Ngày>");
        lbNgayLapHD.setOpaque(true);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Tổng tiền:");

        lbTenKH1.setBackground(new java.awt.Color(204, 204, 204));
        lbTenKH1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbTenKH1.setForeground(new java.awt.Color(51, 51, 51));
        lbTenKH1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbTenKH1.setText("x.000.000.000 đ");
        lbTenKH1.setOpaque(true);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Thành tiền:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Tổng khuyến mãi:");

        lbTenKH2.setBackground(new java.awt.Color(204, 204, 204));
        lbTenKH2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbTenKH2.setForeground(new java.awt.Color(51, 51, 51));
        lbTenKH2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbTenKH2.setText("x.000.000.000 đ");
        lbTenKH2.setOpaque(true);

        lbTenKH3.setBackground(new java.awt.Color(204, 204, 204));
        lbTenKH3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbTenKH3.setForeground(new java.awt.Color(51, 51, 51));
        lbTenKH3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbTenKH3.setText("x.000.000.000 đ");
        lbTenKH3.setOpaque(true);

        jButton3.setBackground(new java.awt.Color(43, 108, 140));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(204, 204, 204));
        jButton3.setText("Đóng");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(108, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbTenKH1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbTenKH2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbTenKH3, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(14, 14, 14))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbNgayLapHD, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNgayLapHD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTenKH3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTenKH2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTenKH1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(jButton3)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(242, 242, 249));

        lbTenKH.setBackground(new java.awt.Color(204, 204, 204));
        lbTenKH.setForeground(new java.awt.Color(51, 51, 51));
        lbTenKH.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbTenKH.setText("<TenKH>");
        lbTenKH.setOpaque(true);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("ID Nhân viên:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Tên nhân viên:");

        lbIDNhanVien.setBackground(new java.awt.Color(204, 204, 204));
        lbIDNhanVien.setForeground(new java.awt.Color(51, 51, 51));
        lbIDNhanVien.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbIDNhanVien.setText("<IDNV>");
        lbIDNhanVien.setOpaque(true);

        lbTenNV.setBackground(new java.awt.Color(204, 204, 204));
        lbTenNV.setForeground(new java.awt.Color(51, 51, 51));
        lbTenNV.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbTenNV.setText("<TenNV>");
        lbTenNV.setOpaque(true);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("ID Khách hàng:");

        lnIDKhachHang.setBackground(new java.awt.Color(204, 204, 204));
        lnIDKhachHang.setForeground(new java.awt.Color(51, 51, 51));
        lnIDKhachHang.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lnIDKhachHang.setText("<IDNV>");
        lnIDKhachHang.setOpaque(true);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Tên khách hàng:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lnIDKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbTenNV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                    .addComponent(lbIDNhanVien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbTenKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbIDNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lnIDKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout chiTietDonHangLayout = new javax.swing.GroupLayout(chiTietDonHang.getContentPane());
        chiTietDonHang.getContentPane().setLayout(chiTietDonHangLayout);
        chiTietDonHangLayout.setHorizontalGroup(
            chiTietDonHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        chiTietDonHangLayout.setVerticalGroup(
            chiTietDonHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, chiTietDonHangLayout.createSequentialGroup()
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                formAncestorRemoved(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(32767, 100));
        jPanel2.setMinimumSize(new java.awt.Dimension(500, 100));
        jPanel2.setPreferredSize(new java.awt.Dimension(1000, 100));

        B_Combo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        B_Combo.setForeground(new java.awt.Color(255, 255, 255));
        B_Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã đơn hàng", "Tên khách hàng" }));
        B_Combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_ComboActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Sắp xếp theo:");

        B_Input.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        B_Input.setToolTipText("Tìm kiếm");
        B_Input.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                B_InputFocusGained(evt);
            }
        });
        B_Input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_InputActionPerformed(evt);
            }
        });

        B_LM.setBackground(new java.awt.Color(235, 235, 235));
        B_LM.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        B_LM.setForeground(new java.awt.Color(51, 51, 51));
        B_LM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/refresh.png"))); // NOI18N
        B_LM.setText("Làm mới");
        B_LM.setMaximumSize(new java.awt.Dimension(109, 30));
        B_LM.setMinimumSize(new java.awt.Dimension(109, 30));
        B_LM.setPreferredSize(new java.awt.Dimension(109, 30));
        B_LM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_LMMouseClicked(evt);
            }
        });

        B_Xoa.setBackground(new java.awt.Color(255, 51, 0));
        B_Xoa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        B_Xoa.setForeground(new java.awt.Color(255, 255, 255));
        B_Xoa.setText("Xóa");
        B_Xoa.setMaximumSize(new java.awt.Dimension(72, 30));
        B_Xoa.setMinimumSize(new java.awt.Dimension(72, 30));
        B_Xoa.setPreferredSize(new java.awt.Dimension(72, 30));
        B_Xoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_XoaMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Tìm kiếm");

        jButton1.setBackground(new java.awt.Color(235, 235, 235));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-search-25.png"))); // NOI18N
        jButton1.setMaximumSize(new java.awt.Dimension(35, 30));
        jButton1.setMinimumSize(new java.awt.Dimension(35, 30));
        jButton1.setPreferredSize(new java.awt.Dimension(35, 30));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(B_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addComponent(B_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(B_LM, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(B_Combo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(B_Combo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(B_LM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(B_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        B_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã hóa đơn", "Tên khách hàng", "Ngày tạo", "Thành Tiền", "Chi tiết"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        B_table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        B_table.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        B_table.setDragEnabled(true);
        B_table.setRowHeight(25);
        B_table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        B_table.getTableHeader().setReorderingAllowed(false);
        B_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(B_table);
        if (B_table.getColumnModel().getColumnCount() > 0) {
            B_table.getColumnModel().getColumn(0).setResizable(false);
            B_table.getColumnModel().getColumn(0).setPreferredWidth(150);
            B_table.getColumnModel().getColumn(1).setResizable(false);
            B_table.getColumnModel().getColumn(1).setPreferredWidth(300);
            B_table.getColumnModel().getColumn(2).setResizable(false);
            B_table.getColumnModel().getColumn(2).setPreferredWidth(150);
            B_table.getColumnModel().getColumn(3).setResizable(false);
            B_table.getColumnModel().getColumn(3).setPreferredWidth(200);
            B_table.getColumnModel().getColumn(4).setResizable(false);
            B_table.getColumnModel().getColumn(4).setPreferredWidth(200);
        }
        B_table.setDefaultRenderer(Object.class, new TableGradientCell());
        B_table.setDefaultEditor(Object.class, null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1012, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    private void B_InputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_InputActionPerformed
        List<hoaDon> lstHD = new ArrayList<>();
        try {
            hoaDon_List dao = new hoaDon_List();
            
            lstHD = dao.findByTen(B_Input.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi tìm kiếm!!");
        }
        tblModel.setRowCount(0);
        for (hoaDon hd : lstHD) {
            tblModel.addRow(new String[]{String.valueOf(hd.getIdHD()), hd.getTenKH(), hd.getNgTao(), String.valueOf(hd.getThanhTien()), "--"});
        }
        tblModel.fireTableDataChanged();
    }//GEN-LAST:event_B_InputActionPerformed

    private void B_ComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_ComboActionPerformed
        String choss = (String) B_Combo.getSelectedItem();
        B_Xoa.setEnabled(false);
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(tblModel);
        B_table.setRowSorter(sorter);
        if (choss.equals("Mã đơn hàng")) {
            sorter.setSortable(0, true);
            List<RowSorter.SortKey> sortKeys = new ArrayList<>();
            sortKeys.add(new RowSorter.SortKey(0, SortOrder.ASCENDING));
            sorter.setSortKeys(sortKeys);
        } else {
            sorter.setSortable(1, true);
            List<RowSorter.SortKey> sortKeys = new ArrayList<>();
            sortKeys.add(new RowSorter.SortKey(1, SortOrder.ASCENDING));
            sorter.setSortKeys(sortKeys);
        }
    }//GEN-LAST:event_B_ComboActionPerformed

    private void B_LMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_LMMouseClicked
        fillTable();
        B_Input.setText("Tìm kiếm");
        B_Combo.setSelectedIndex(0);
        B_Xoa.setEnabled(false);
    }//GEN-LAST:event_B_LMMouseClicked

    private void B_InputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_B_InputFocusGained
        B_Input.setText("");
    }//GEN-LAST:event_B_InputFocusGained

    private void B_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_tableMouseClicked
        B_Xoa.setEnabled(true);
        int index = B_table.getSelectedRow();
        int ID = Integer.parseInt(String.valueOf(B_table.getValueAt(index, 0)));
        chiTietDonHang.setVisible(true);
        cardSanPhamHome_List dao = new cardSanPhamHome_List();
        try {
            String sql = "select b.ID_HD, nv.ID as IDNV, nv.ten as TENV, k.ID as IDKH, k.ten as TENKH, b.NgMua from Bill as b join khachHang as k on k.ID = b.ID_KH join nhanVien as nv on nv.ID = b.ID_NV where b.ID_HD = ?";
            Connection con = helper.openConnection();            
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, String.valueOf(ID));
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                Title.setText("ĐƠN HÀNG SỐ : " + rs.getString("ID_HD"));
                lbIDNhanVien.setText(rs.getString("IDNV"));
                lbTenNV.setText(rs.getString("TENV"));
                lnIDKhachHang.setText(rs.getString("IDKH"));
                lbTenKH.setText(rs.getString("TENKH"));
                lbNgayLapHD.setText(rs.getString("ngMua"));
                
                List<cardSanPhamHome> listSP = dao.chiTiet(ID);
                DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
                tableModel.setColumnIdentifiers(new String[]{"Mã", "Tên thú cưng", "Giá"});
                tableModel.setRowCount(0);
                for (cardSanPhamHome c : listSP) {
                    tableModel.addRow(new String[]{String.valueOf(c.getIdDV()), c.getTenDV(), String.valueOf(c.getGiaDV())});
                }
                
                hoaDon_List HD = new hoaDon_List();
                lbTenKH3.setText(String.valueOf(HD.getTien(ID)) + "đ");
                lbTenKH2.setText("0đ");
                lbTenKH1.setText(String.valueOf(HD.getTien(ID)) + "đ");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Lỗi Chi Tiết dữ liệu!!");
        }
    }//GEN-LAST:event_B_tableMouseClicked
    
    public JButton getB_Xoa() {
        return B_Xoa;
    }
    
    public void setB_Xoa(JButton B_Xoa) {
        this.B_Xoa = B_Xoa;
    }

    private void B_XoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_XoaMouseClicked
        try {
            int chos = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa ?", "Xóa Thư Cưng", JOptionPane.YES_NO_OPTION);
            if (chos == JOptionPane.YES_OPTION) {
                hoaDon_List dao = new hoaDon_List();
                boolean check = dao.delete(Integer.parseInt(B_table.getValueAt(B_table.getSelectedRow(), 0).toString()));
                if (check == true) {
                    fillTable();
                    chiTietDonHang.setVisible(false);
                    JOptionPane.showMessageDialog(this, "Xóa thành công!!");
                } else {
                    JOptionPane.showMessageDialog(this, "Lỗi dữ liệu!!");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Không thể xóa!!");            
        }
    }//GEN-LAST:event_B_XoaMouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        chiTietDonHang.setVisible(false);
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
               List<hoaDon> lstHD = new ArrayList<>();
        try {
            hoaDon_List dao = new hoaDon_List();
            
            lstHD = dao.findByTen(B_Input.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi tìm kiếm!!");
        }
        tblModel.setRowCount(0);
        for (hoaDon hd : lstHD) {
            tblModel.addRow(new String[]{String.valueOf(hd.getIdHD()), hd.getTenKH(), hd.getNgTao(), String.valueOf(hd.getThanhTien()), "--"});
        }
        tblModel.fireTableDataChanged();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formAncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_formAncestorRemoved
        initTable();
        fillTable();
    }//GEN-LAST:event_formAncestorRemoved


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> B_Combo;
    private javax.swing.JTextField B_Input;
    private javax.swing.JButton B_LM;
    private javax.swing.JButton B_Xoa;
    private javax.swing.JTable B_table;
    private javax.swing.JLabel Title;
    private javax.swing.JDialog chiTietDonHang;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbIDNhanVien;
    private javax.swing.JLabel lbNgayLapHD;
    private javax.swing.JLabel lbTenKH;
    private javax.swing.JLabel lbTenKH1;
    private javax.swing.JLabel lbTenKH2;
    private javax.swing.JLabel lbTenKH3;
    private javax.swing.JLabel lbTenNV;
    private javax.swing.JLabel lnIDKhachHang;
    // End of variables declaration//GEN-END:variables
}
