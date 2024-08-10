/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MCO2;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 * MainPage is the View of our program. This allows to graphically visualize
 * the code of the Vending Machine Factory.
 * @author Ford Ainstein Tan Chung
 * @author Johans Venedict L. Cipriano
 */
public class MainPage extends javax.swing.JFrame {

    private static RegularVM regularVM;
    private static SpecialVM specialVM;
    
    /**
     * Creates new form MainPage
     */
    public MainPage() {
        initComponents();
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        MainPanel = new javax.swing.JTabbedPane();
        javax.swing.JPanel mainMenu = new javax.swing.JPanel();
        javax.swing.JPanel title = new javax.swing.JPanel();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        javax.swing.JPanel exitButton = new javax.swing.JPanel();
        javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
        javax.swing.JLabel logo2 = new javax.swing.JLabel();
        javax.swing.JPanel betaButton = new javax.swing.JPanel();
        javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
        javax.swing.JLabel logo1 = new javax.swing.JLabel();
        javax.swing.JPanel createButton = new javax.swing.JPanel();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        javax.swing.JLabel logo = new javax.swing.JLabel();
        javax.swing.JPanel create = new javax.swing.JPanel();
        javax.swing.JPanel tabcover = new javax.swing.JPanel();
        javax.swing.JPanel titlebg = new javax.swing.JPanel();
        javax.swing.JLabel jLabel5 = new javax.swing.JLabel();
        optionsTabs = new javax.swing.JTabbedPane();
        javax.swing.JPanel optionsbg = new javax.swing.JPanel();
        javax.swing.JPanel jPanel2 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel6 = new javax.swing.JLabel();
        javax.swing.JPanel createExitButton = new javax.swing.JPanel();
        javax.swing.JLabel jLabel7 = new javax.swing.JLabel();
        javax.swing.JPanel jPanel3 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel8 = new javax.swing.JLabel();
        javax.swing.JPanel createReg1 = new javax.swing.JPanel();
        javax.swing.JPanel jPanel7 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel9 = new javax.swing.JLabel();
        javax.swing.JPanel titleRegular = new javax.swing.JPanel();
        javax.swing.JLabel jLabel12 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel11 = new javax.swing.JLabel();
        javax.swing.JPanel jPanel9 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel13 = new javax.swing.JLabel();
        javax.swing.JPanel jPanel10 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel14 = new javax.swing.JLabel();
        javax.swing.JPanel jPanel11 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel15 = new javax.swing.JLabel();
        javax.swing.JPanel pnlCreateSpecial2 = new javax.swing.JPanel();
        javax.swing.JPanel titleRegular1 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel23 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel24 = new javax.swing.JLabel();
        javax.swing.JPanel jPanel16 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel27 = new javax.swing.JLabel();
        javax.swing.JPanel jPanel17 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel28 = new javax.swing.JLabel();
        javax.swing.JPanel jPanel18 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel29 = new javax.swing.JLabel();
        displaySite = new javax.swing.JTabbedPane();
        javax.swing.JPanel defaultTab = new javax.swing.JPanel();
        javax.swing.JPanel defaultHeader = new javax.swing.JPanel();
        javax.swing.JPanel indx1 = new javax.swing.JPanel();
        javax.swing.JPanel jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        javax.swing.JPanel indx2 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel16 = new javax.swing.JLabel();
        javax.swing.JPanel jPanel6 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel17 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel18 = new javax.swing.JLabel();
        tfCol = new javax.swing.JTextField();
        tfRow = new javax.swing.JTextField();
        javax.swing.JButton jButton1 = new javax.swing.JButton();
        javax.swing.JPanel indx3 = new javax.swing.JPanel();
        javax.swing.JPanel jPanel8 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel19 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel20 = new javax.swing.JLabel();
        javax.swing.JButton btnConfirm = new javax.swing.JButton();
        javax.swing.JPanel indx4 = new javax.swing.JPanel();
        javax.swing.JPanel jPanel12 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel21 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel22 = new javax.swing.JLabel();
        javax.swing.JLabel lblIngredients = new javax.swing.JLabel();
        javax.swing.JButton jButton2 = new javax.swing.JButton();
        javax.swing.JPanel indx5 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel26 = new javax.swing.JLabel();
        javax.swing.JPanel jPanel14 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel30 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel31 = new javax.swing.JLabel();
        tfCol1 = new javax.swing.JTextField();
        tfRow1 = new javax.swing.JTextField();
        javax.swing.JButton jButton3 = new javax.swing.JButton();
        javax.swing.JPanel indx6 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel32 = new javax.swing.JLabel();
        syrup = new javax.swing.JPanel();
        javax.swing.JLabel jLabel64 = new javax.swing.JLabel();
        javax.swing.JButton caramel = new javax.swing.JButton();
        javax.swing.JButton chocolate1 = new javax.swing.JButton();
        javax.swing.JButton strawberry = new javax.swing.JButton();
        javax.swing.JButton con2 = new javax.swing.JButton();
        add2 = new javax.swing.JTextField();
        milk = new javax.swing.JPanel();
        javax.swing.JLabel jLabel33 = new javax.swing.JLabel();
        normal = new javax.swing.JButton();
        soy = new javax.swing.JButton();
        oat = new javax.swing.JButton();
        almond = new javax.swing.JButton();
        add = new javax.swing.JTextField();
        con = new javax.swing.JButton();
        topping = new javax.swing.JPanel();
        javax.swing.JLabel jLabel62 = new javax.swing.JLabel();
        icecream = new javax.swing.JButton();
        chocolate = new javax.swing.JButton();
        oreo = new javax.swing.JButton();
        con1 = new javax.swing.JButton();
        add1 = new javax.swing.JTextField();
        indx7 = new javax.swing.JPanel();
        javax.swing.JPanel jPanel20 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel34 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel35 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel36 = new javax.swing.JLabel();
        javax.swing.JLabel lblIngredients1 = new javax.swing.JLabel();
        javax.swing.JButton jButton4 = new javax.swing.JButton();
        indx8 = new javax.swing.JPanel();
        javax.swing.JPanel testingMenu2 = new javax.swing.JPanel();
        javax.swing.JPanel jPanel22 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel37 = new javax.swing.JLabel();
        javax.swing.JPanel jPanel21 = new javax.swing.JPanel();
        javax.swing.JPanel jPanel23 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel40 = new javax.swing.JLabel();
        javax.swing.JPanel jPanel24 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel38 = new javax.swing.JLabel();
        javax.swing.JPanel jPanel27 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel39 = new javax.swing.JLabel();
        maintenancePanelRVM = new javax.swing.JPanel();
        javax.swing.JPanel jPanel4 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        options = new javax.swing.JPanel();
        javax.swing.JPanel btnStock = new javax.swing.JPanel();
        javax.swing.JLabel jLabel43 = new javax.swing.JLabel();
        javax.swing.JPanel btnUpPrice = new javax.swing.JPanel();
        javax.swing.JLabel jLabel49 = new javax.swing.JLabel();
        javax.swing.JPanel btnCollect = new javax.swing.JPanel();
        javax.swing.JLabel jLabel50 = new javax.swing.JLabel();
        javax.swing.JPanel btnReplenish = new javax.swing.JPanel();
        javax.swing.JLabel jLabel51 = new javax.swing.JLabel();
        javax.swing.JPanel btnDisplaystats = new javax.swing.JPanel();
        javax.swing.JLabel jLabel52 = new javax.swing.JLabel();
        javax.swing.JPanel btnExitMaintenance = new javax.swing.JPanel();
        javax.swing.JLabel jLabel53 = new javax.swing.JLabel();
        mPanel = new javax.swing.JTabbedPane();
        javax.swing.JPanel m0 = new javax.swing.JPanel();
        javax.swing.JPanel m1 = new javax.swing.JPanel();
        javax.swing.JScrollPane jScrollPane2 = new javax.swing.JScrollPane();
        itemTable = new javax.swing.JTable();
        javax.swing.JPanel jPanel28 = new javax.swing.JPanel();
        tabStonks = new javax.swing.JTabbedPane();
        javax.swing.JPanel tb1 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel44 = new javax.swing.JLabel();
        slotNUM = new java.awt.TextField();
        javax.swing.JButton jButton6 = new javax.swing.JButton();
        javax.swing.JPanel tb2 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel45 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel47 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel48 = new javax.swing.JLabel();
        javax.swing.JLabel tfPriceStocking = new javax.swing.JLabel();
        tfQuantityStocking = new javax.swing.JTextField();
        tfProductNameStocking = new javax.swing.JTextField();
        tfCaloriesStocking = new javax.swing.JTextField();
        tfPriceStocking2 = new javax.swing.JTextField();
        javax.swing.JButton jButton5 = new javax.swing.JButton();
        javax.swing.JButton jButton8 = new javax.swing.JButton();
        maxQuantityDisplay1 = new javax.swing.JLabel();
        javax.swing.JPanel tb3 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel46 = new javax.swing.JLabel();
        maxQuantityDisplay = new javax.swing.JLabel();
        tfAddStocks = new javax.swing.JTextField();
        javax.swing.JButton jButton7 = new javax.swing.JButton();
        javax.swing.JButton jButton9 = new javax.swing.JButton();
        javax.swing.JLabel jLabel56 = new javax.swing.JLabel();
        javax.swing.JPanel tb6 = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        slotNUM2 = new java.awt.TextField();
        jButton13 = new javax.swing.JButton();
        tb7 = new javax.swing.JPanel();
        tfUpdatePrice1 = new javax.swing.JTextField();
        javax.swing.JButton jButton14 = new javax.swing.JButton();
        javax.swing.JButton jButton15 = new javax.swing.JButton();
        javax.swing.JLabel maxQuantityDisplay3 = new javax.swing.JLabel();
        javax.swing.JPanel m2 = new javax.swing.JPanel();
        javax.swing.JPanel jPanel29 = new javax.swing.JPanel();
        currentMoney = new javax.swing.JLabel();
        javax.swing.JLabel jLabel58 = new javax.swing.JLabel();
        tfCollectMoney = new javax.swing.JTextField();
        javax.swing.JButton jButton10 = new javax.swing.JButton();
        javax.swing.JPanel m3 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel54 = new javax.swing.JLabel();
        javax.swing.JPanel jPanel30 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel57 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel59 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel61 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel63 = new javax.swing.JLabel();
        hundred = new javax.swing.JButton();
        ones = new javax.swing.JButton();
        fives = new javax.swing.JButton();
        tens = new javax.swing.JButton();
        twenty = new javax.swing.JButton();
        fifty = new javax.swing.JButton();
        javax.swing.JLabel jLabel65 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel66 = new javax.swing.JLabel();
        javax.swing.JPanel m4 = new javax.swing.JPanel();
        javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
        summaryTable = new javax.swing.JTable();
        totalSales = new javax.swing.JLabel();
        javax.swing.JPanel m5 = new javax.swing.JPanel();
        javax.swing.JPanel beta1 = new javax.swing.JPanel();
        javax.swing.JPanel jPanel32 = new javax.swing.JPanel();
        javax.swing.JPanel jPanel33 = new javax.swing.JPanel();
        javax.swing.JPanel jPanel34 = new javax.swing.JPanel();
        javax.swing.JPanel jPanel62 = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        javax.swing.JTextField jTextField2 = new javax.swing.JTextField();
        javax.swing.JLabel jLabel112 = new javax.swing.JLabel();
        javax.swing.JPanel jPanel35 = new javax.swing.JPanel();
        javax.swing.JPanel jPanel63 = new javax.swing.JPanel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        javax.swing.JTextField jTextField3 = new javax.swing.JTextField();
        javax.swing.JLabel jLabel115 = new javax.swing.JLabel();
        javax.swing.JPanel jPanel36 = new javax.swing.JPanel();
        javax.swing.JPanel jPanel64 = new javax.swing.JPanel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        javax.swing.JTextField jTextField4 = new javax.swing.JTextField();
        javax.swing.JLabel jLabel25 = new javax.swing.JLabel();
        javax.swing.JPanel jPanel37 = new javax.swing.JPanel();
        javax.swing.JPanel jPanel76 = new javax.swing.JPanel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        javax.swing.JTextField jTextField6 = new javax.swing.JTextField();
        javax.swing.JLabel jLabel113 = new javax.swing.JLabel();
        javax.swing.JPanel jPanel38 = new javax.swing.JPanel();
        javax.swing.JPanel jPanel66 = new javax.swing.JPanel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        javax.swing.JTextField jTextField5 = new javax.swing.JTextField();
        javax.swing.JLabel jLabel117 = new javax.swing.JLabel();
        javax.swing.JPanel jPanel39 = new javax.swing.JPanel();
        javax.swing.JPanel jPanel70 = new javax.swing.JPanel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        javax.swing.JTextField jTextField7 = new javax.swing.JTextField();
        javax.swing.JLabel jLabel114 = new javax.swing.JLabel();
        javax.swing.JPanel jPanel40 = new javax.swing.JPanel();
        jPanel71 = new javax.swing.JPanel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        javax.swing.JTextField jTextField8 = new javax.swing.JTextField();
        javax.swing.JLabel jLabel119 = new javax.swing.JLabel();
        javax.swing.JPanel jPanel41 = new javax.swing.JPanel();
        javax.swing.JPanel jPanel72 = new javax.swing.JPanel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        javax.swing.JTextField jTextField9 = new javax.swing.JTextField();
        javax.swing.JLabel jLabel116 = new javax.swing.JLabel();
        javax.swing.JPanel jPanel42 = new javax.swing.JPanel();
        javax.swing.JPanel jPanel73 = new javax.swing.JPanel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        javax.swing.JTextField jTextField11 = new javax.swing.JTextField();
        javax.swing.JLabel jLabel120 = new javax.swing.JLabel();
        javax.swing.JPanel jPanel43 = new javax.swing.JPanel();
        javax.swing.JPanel jPanel74 = new javax.swing.JPanel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        javax.swing.JTextField jTextField12 = new javax.swing.JTextField();
        javax.swing.JLabel jLabel121 = new javax.swing.JLabel();
        javax.swing.JPanel jPanel44 = new javax.swing.JPanel();
        javax.swing.JPanel jPanel75 = new javax.swing.JPanel();
        jLabel84 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        javax.swing.JTextField jTextField10 = new javax.swing.JTextField();
        javax.swing.JLabel jLabel118 = new javax.swing.JLabel();
        javax.swing.JPanel jPanel45 = new javax.swing.JPanel();
        SVM_Espresso = new javax.swing.JPanel();
        jButton59 = new javax.swing.JButton();
        jTextField30 = new javax.swing.JTextField();
        jTextField31 = new javax.swing.JTextField();
        jPanel46 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        betaTotalMoney = new javax.swing.JLabel();
        jButton31 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        defaulttab = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        SVM_Personalized = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jButton48 = new javax.swing.JButton();
        jButton49 = new javax.swing.JButton();
        jButton50 = new javax.swing.JButton();
        jButton51 = new javax.swing.JButton();
        SVM_Personalized1 = new javax.swing.JPanel();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jButton52 = new javax.swing.JButton();
        jButton53 = new javax.swing.JButton();
        jButton54 = new javax.swing.JButton();
        SVM_Personalized2 = new javax.swing.JPanel();
        jTextField27 = new javax.swing.JTextField();
        jTextField28 = new javax.swing.JTextField();
        jButton55 = new javax.swing.JButton();
        jButton56 = new javax.swing.JButton();
        jButton57 = new javax.swing.JButton();
        jTextField29 = new javax.swing.JTextField();
        jButton58 = new javax.swing.JButton();
        javax.swing.JPanel jPanel47 = new javax.swing.JPanel();
        javax.swing.JPanel beta2 = new javax.swing.JPanel();
        javax.swing.JPanel jPanel49 = new javax.swing.JPanel();
        javax.swing.JPanel jPanel79 = new javax.swing.JPanel();
        javax.swing.JPanel jPanel80 = new javax.swing.JPanel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        javax.swing.JTextField jTextField13 = new javax.swing.JTextField();
        javax.swing.JLabel jLabel123 = new javax.swing.JLabel();
        javax.swing.JPanel jPanel81 = new javax.swing.JPanel();
        javax.swing.JPanel jPanel82 = new javax.swing.JPanel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        javax.swing.JTextField jTextField14 = new javax.swing.JTextField();
        javax.swing.JLabel jLabel124 = new javax.swing.JLabel();
        javax.swing.JPanel jPanel83 = new javax.swing.JPanel();
        javax.swing.JPanel jPanel84 = new javax.swing.JPanel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        javax.swing.JTextField jTextField15 = new javax.swing.JTextField();
        javax.swing.JLabel jLabel125 = new javax.swing.JLabel();
        javax.swing.JPanel jPanel85 = new javax.swing.JPanel();
        javax.swing.JPanel jPanel86 = new javax.swing.JPanel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        javax.swing.JLabel jLabel126 = new javax.swing.JLabel();
        javax.swing.JPanel jPanel87 = new javax.swing.JPanel();
        javax.swing.JPanel jPanel88 = new javax.swing.JPanel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        javax.swing.JTextField jTextField16 = new javax.swing.JTextField();
        javax.swing.JLabel jLabel127 = new javax.swing.JLabel();
        javax.swing.JPanel jPanel89 = new javax.swing.JPanel();
        javax.swing.JPanel jPanel90 = new javax.swing.JPanel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        javax.swing.JTextField jTextField18 = new javax.swing.JTextField();
        javax.swing.JLabel jLabel129 = new javax.swing.JLabel();
        javax.swing.JPanel jPanel91 = new javax.swing.JPanel();
        javax.swing.JPanel jPanel92 = new javax.swing.JPanel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        javax.swing.JTextField jTextField20 = new javax.swing.JTextField();
        javax.swing.JLabel jLabel122 = new javax.swing.JLabel();
        javax.swing.JPanel jPanel93 = new javax.swing.JPanel();
        javax.swing.JPanel jPanel94 = new javax.swing.JPanel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        javax.swing.JTextField jTextField19 = new javax.swing.JTextField();
        javax.swing.JLabel jLabel128 = new javax.swing.JLabel();
        javax.swing.JPanel jPanel95 = new javax.swing.JPanel();
        javax.swing.JPanel jPanel96 = new javax.swing.JPanel();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        javax.swing.JTextField jTextField21 = new javax.swing.JTextField();
        javax.swing.JLabel jLabel131 = new javax.swing.JLabel();
        javax.swing.JPanel jPanel97 = new javax.swing.JPanel();
        javax.swing.JPanel jPanel98 = new javax.swing.JPanel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        javax.swing.JTextField jTextField22 = new javax.swing.JTextField();
        javax.swing.JLabel jLabel132 = new javax.swing.JLabel();
        javax.swing.JPanel jPanel99 = new javax.swing.JPanel();
        javax.swing.JPanel jPanel100 = new javax.swing.JPanel();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        javax.swing.JTextField jTextField23 = new javax.swing.JTextField();
        javax.swing.JLabel jLabel130 = new javax.swing.JLabel();
        jPanel58 = new javax.swing.JPanel();
        jPanel59 = new javax.swing.JPanel();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        betaTotalMoney1 = new javax.swing.JLabel();
        jButton39 = new javax.swing.JButton();
        jLabel88 = new javax.swing.JLabel();
        jButton40 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        jButton47 = new javax.swing.JButton();
        jPanel60 = new javax.swing.JPanel();
        javax.swing.JPanel beta3 = new javax.swing.JPanel();
        javax.swing.JPanel jPanel50 = new javax.swing.JPanel();
        javax.swing.JScrollPane jScrollPane3 = new javax.swing.JScrollPane();
        tableRVM = new javax.swing.JTable();
        javax.swing.JPanel jPanel67 = new javax.swing.JPanel();
        jPanel48 = new javax.swing.JPanel();
        jPanel51 = new javax.swing.JPanel();
        jButton68 = new javax.swing.JButton();
        jButton69 = new javax.swing.JButton();
        jButton70 = new javax.swing.JButton();
        jButton71 = new javax.swing.JButton();
        jButton72 = new javax.swing.JButton();
        jButton73 = new javax.swing.JButton();
        jButton74 = new javax.swing.JButton();
        jButton75 = new javax.swing.JButton();
        jButton76 = new javax.swing.JButton();
        jButton77 = new javax.swing.JButton();
        jButton78 = new javax.swing.JButton();
        jButton79 = new javax.swing.JButton();
        betaTotalMoney3 = new javax.swing.JLabel();
        jButton81 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        Text = new javax.swing.JTextArea();
        jPanel13 = new javax.swing.JPanel();
        jButton60 = new javax.swing.JButton();
        jButton61 = new javax.swing.JButton();
        jButton62 = new javax.swing.JButton();
        jButton63 = new javax.swing.JButton();
        jButton64 = new javax.swing.JButton();
        jButton65 = new javax.swing.JButton();
        jButton66 = new javax.swing.JButton();
        jLabel111 = new javax.swing.JLabel();
        Regular_Check = new javax.swing.JTextField();
        Regular_Done = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel25.setBackground(new java.awt.Color(128, 128, 128));

        jPanel26.setBackground(new java.awt.Color(128, 128, 128));

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
            .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel25Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel25Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Vending Machine Factory");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        getContentPane().setLayout(null);

        mainMenu.setBackground(new java.awt.Color(238, 227, 203));

        title.setBackground(new java.awt.Color(155, 171, 184));
        title.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("VENDING MACHINE FACTORY");

        javax.swing.GroupLayout titleLayout = new javax.swing.GroupLayout(title);
        title.setLayout(titleLayout);
        titleLayout.setHorizontalGroup(
            titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titleLayout.createSequentialGroup()
                .addGap(364, 364, 364)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        titleLayout.setVerticalGroup(
            titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titleLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel2)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        exitButton.setBackground(new java.awt.Color(150, 126, 118));
        exitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitButtonMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("EXIT");

        logo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/close.png"))); // NOI18N

        javax.swing.GroupLayout exitButtonLayout = new javax.swing.GroupLayout(exitButton);
        exitButton.setLayout(exitButtonLayout);
        exitButtonLayout.setHorizontalGroup(
            exitButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitButtonLayout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addComponent(logo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        exitButtonLayout.setVerticalGroup(
            exitButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitButtonLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(exitButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitButtonLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitButtonLayout.createSequentialGroup()
                        .addComponent(logo2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))))
        );

        betaButton.setBackground(new java.awt.Color(150, 126, 118));
        betaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                betaButtonMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("BETA TESTING");

        logo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/gear.png"))); // NOI18N

        javax.swing.GroupLayout betaButtonLayout = new javax.swing.GroupLayout(betaButton);
        betaButton.setLayout(betaButtonLayout);
        betaButtonLayout.setHorizontalGroup(
            betaButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, betaButtonLayout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addComponent(logo1)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        betaButtonLayout.setVerticalGroup(
            betaButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(betaButtonLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(betaButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, betaButtonLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, betaButtonLayout.createSequentialGroup()
                        .addComponent(logo1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))))
        );

        createButton.setBackground(new java.awt.Color(150, 126, 118));
        createButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createButtonMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CREATE VENDING MACHINE");

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/add_white.png"))); // NOI18N
        logo.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout createButtonLayout = new javax.swing.GroupLayout(createButton);
        createButton.setLayout(createButtonLayout);
        createButtonLayout.setHorizontalGroup(
            createButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createButtonLayout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        createButtonLayout.setVerticalGroup(
            createButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(createButtonLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mainMenuLayout = new javax.swing.GroupLayout(mainMenu);
        mainMenu.setLayout(mainMenuLayout);
        mainMenuLayout.setHorizontalGroup(
            mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainMenuLayout.createSequentialGroup()
                .addGap(329, 329, 329)
                .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(betaButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(401, Short.MAX_VALUE))
        );
        mainMenuLayout.setVerticalGroup(
            mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMenuLayout.createSequentialGroup()
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(createButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(betaButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 183, Short.MAX_VALUE))
        );

        MainPanel.addTab("tab1", mainMenu);

        create.setBackground(new java.awt.Color(31, 30, 41));
 
        create.setLayout(null);

        tabcover.setBackground(new java.awt.Color(31, 30, 40));

        javax.swing.GroupLayout tabcoverLayout = new javax.swing.GroupLayout(tabcover);
        tabcover.setLayout(tabcoverLayout);
        tabcoverLayout.setHorizontalGroup(
            tabcoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1070, Short.MAX_VALUE)
        );
        tabcoverLayout.setVerticalGroup(
            tabcoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        create.add(tabcover);
        tabcover.setBounds(40, 120, 1070, 40);

        titlebg.setBackground(new java.awt.Color(16, 70, 90));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CREATE VENDING MACHINES");

        javax.swing.GroupLayout titlebgLayout = new javax.swing.GroupLayout(titlebg);
        titlebg.setLayout(titlebgLayout);
        titlebgLayout.setHorizontalGroup(
            titlebgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titlebgLayout.createSequentialGroup()
                .addContainerGap(439, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(351, 351, 351))
        );
        titlebgLayout.setVerticalGroup(
            titlebgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titlebgLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(41, 41, 41))
        );

        create.add(titlebg);
        titlebg.setBounds(0, 0, 1147, 113);

        optionsTabs.setBackground(new java.awt.Color(31, 30, 41));
        optionsTabs.setPreferredSize(new java.awt.Dimension(270, 540));

        optionsbg.setBackground(new java.awt.Color(115, 139, 133));
        optionsbg.setPreferredSize(new java.awt.Dimension(270, 540));
        
        optionsbg.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(217, 252, 238));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(16, 70, 90));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setText("Regular Vending Machine");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        optionsbg.add(jPanel2);
        jPanel2.setBounds(19, 80, 231, 50);

        createExitButton.setBackground(new java.awt.Color(217, 252, 238));
        createExitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createExitButtonMouseClicked(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(16, 70, 90));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setText("EXIT");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout createExitButtonLayout = new javax.swing.GroupLayout(createExitButton);
        createExitButton.setLayout(createExitButtonLayout);
        createExitButtonLayout.setHorizontalGroup(
            createExitButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createExitButtonLayout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );
        createExitButtonLayout.setVerticalGroup(
            createExitButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createExitButtonLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel7)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        optionsbg.add(createExitButton);
        createExitButton.setBounds(19, 388, 231, 50);

        jPanel3.setBackground(new java.awt.Color(217, 252, 238));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(16, 70, 90));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setText("Special Vending Machine");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(14, 14, 14))
        );

        optionsbg.add(jPanel3);
        jPanel3.setBounds(19, 222, 231, 50);

        optionsTabs.addTab("tab1", optionsbg);
        optionsbg.getAccessibleContext().setAccessibleName("optionbg");

        createReg1.setBackground(new java.awt.Color(115, 139, 133));
        createReg1.setLayout(null);

        jPanel7.setBackground(new java.awt.Color(217, 252, 238));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(16, 70, 90));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setText("EXIT");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(17, 17, 17))
        );

        createReg1.add(jPanel7);
        jPanel7.setBounds(20, 400, 231, 56);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText(" N = 8 to 20 || M = 10 to 15");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Choose N slots and M item per slot");

        javax.swing.GroupLayout titleRegularLayout = new javax.swing.GroupLayout(titleRegular);
        titleRegular.setLayout(titleRegularLayout);
        titleRegularLayout.setHorizontalGroup(
            titleRegularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titleRegularLayout.createSequentialGroup()
                .addGroup(titleRegularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(titleRegularLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(titleRegularLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        titleRegularLayout.setVerticalGroup(
            titleRegularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titleRegularLayout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        createReg1.add(titleRegular);
        titleRegular.setBounds(0, 0, 270, 63);

        jPanel9.setBackground(new java.awt.Color(217, 252, 238));
        jPanel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel9MouseClicked(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(16, 70, 90));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel13.setText("Preloaded Cafe VM");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(32, 32, 32))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(18, 18, 18))
        );

        createReg1.add(jPanel9);
        jPanel9.setBounds(20, 300, 230, 60);

        jPanel10.setBackground(new java.awt.Color(217, 252, 238));
        jPanel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel10MouseClicked(evt);
            }
        });

        jLabel14.setBackground(new java.awt.Color(16, 70, 90));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel14.setText("Default NxM");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(65, 65, 65))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(17, 17, 17))
        );

        createReg1.add(jPanel10);
        jPanel10.setBounds(20, 200, 230, 56);

        jPanel11.setBackground(new java.awt.Color(217, 252, 238));
        jPanel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel11MouseClicked(evt);
            }
        });

        jLabel15.setBackground(new java.awt.Color(16, 70, 90));
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel15.setText("Custom NxM");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(14, 14, 14))
        );

        createReg1.add(jPanel11);
        jPanel11.setBounds(20, 100, 230, 50);

        optionsTabs.addTab("tab2", createReg1);

        pnlCreateSpecial2.setBackground(new java.awt.Color(115, 139, 133));
        pnlCreateSpecial2.setLayout(null);

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setText(" N = 11 to 20 || M = 10 ");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setText("Choose N slots and M item per slot");

        javax.swing.GroupLayout titleRegular1Layout = new javax.swing.GroupLayout(titleRegular1);
        titleRegular1.setLayout(titleRegular1Layout);
        titleRegular1Layout.setHorizontalGroup(
            titleRegular1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titleRegular1Layout.createSequentialGroup()
                .addGroup(titleRegular1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(titleRegular1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(titleRegular1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        titleRegular1Layout.setVerticalGroup(
            titleRegular1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titleRegular1Layout.createSequentialGroup()
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlCreateSpecial2.add(titleRegular1);
        titleRegular1.setBounds(0, 0, 270, 63);

        jPanel16.setBackground(new java.awt.Color(217, 252, 238));
        jPanel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel16MouseClicked(evt);
            }
        });

        jLabel27.setBackground(new java.awt.Color(16, 70, 90));
        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel27.setText("Default NxM");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addComponent(jLabel27)
                .addGap(65, 65, 65))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel27)
                .addGap(17, 17, 17))
        );

        pnlCreateSpecial2.add(jPanel16);
        jPanel16.setBounds(20, 110, 230, 56);

        jPanel17.setBackground(new java.awt.Color(217, 252, 238));
        jPanel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel17MouseClicked(evt);
            }
        });

        jLabel28.setBackground(new java.awt.Color(16, 70, 90));
        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel28.setText("Preloaded Cafe VM");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(jLabel28)
                .addGap(32, 32, 32))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel28)
                .addGap(18, 18, 18))
        );

        pnlCreateSpecial2.add(jPanel17);
        jPanel17.setBounds(20, 230, 230, 60);

        jPanel18.setBackground(new java.awt.Color(217, 252, 238));
        jPanel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel18MouseClicked(evt);
            }
        });

        jLabel29.setBackground(new java.awt.Color(16, 70, 90));
        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel29.setText("EXIT");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel29)
                .addGap(17, 17, 17))
        );

        pnlCreateSpecial2.add(jPanel18);
        jPanel18.setBounds(20, 350, 231, 56);

        optionsTabs.addTab("tab3", pnlCreateSpecial2);

        create.add(optionsTabs);
        optionsTabs.setBounds(40, 130, 270, 540);

        defaultTab.setBackground(new java.awt.Color(71, 92, 101));
        defaultTab.setLayout(null);

        defaultHeader.setLayout(null);
        defaultTab.add(defaultHeader);
        defaultHeader.setBounds(0, 0, 730, 50);

        displaySite.addTab("default", defaultTab);

        indx1.setBackground(new java.awt.Color(71, 92, 101));
        indx1.setLayout(null);

        jPanel5.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("REGULAR VENDING MACHINE");
        jPanel5.add(jLabel10);
        jLabel10.setBounds(17, 6, 226, 34);

        indx1.add(jPanel5);
        jPanel5.setBounds(0, 0, 730, 50);

        displaySite.addTab("1", indx1);

        indx2.setBackground(new java.awt.Color(71, 92, 101));
        indx2.setLayout(null);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Enter M number of Quantity [10 - 15]: ");
        indx2.add(jLabel16);
        jLabel16.setBounds(30, 340, 363, 22);

        jPanel6.setLayout(null);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("REGULAR VENDING MACHINE - Custom NxM");
        jPanel6.add(jLabel17);
        jLabel17.setBounds(17, 6, 430, 34);

        indx2.add(jPanel6);
        jPanel6.setBounds(0, 0, 730, 50);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Enter N number of Slot [11 - 20]: ");
        indx2.add(jLabel18);
        jLabel18.setBounds(30, 110, 316, 22);

        tfCol.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        tfCol.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        
        tfCol.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfColKeyPressed(evt);
            }
        });
        indx2.add(tfCol);
        tfCol.setBounds(30, 390, 300, 40);

        tfRow.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        tfRow.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        tfRow.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        
        tfRow.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfRowKeyPressed(evt);
            }
        });
        indx2.add(tfRow);
        tfRow.setBounds(30, 160, 300, 40);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        indx2.add(jButton1);
        jButton1.setBounds(580, 510, 120, 40);

        displaySite.addTab("2", indx2);

        indx3.setBackground(new java.awt.Color(71, 92, 101));
        indx3.setLayout(null);

        jPanel8.setLayout(null);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("REGULAR VENDING MACHINE - Default NxM");
        jPanel8.add(jLabel19);
        jLabel19.setBounds(17, 6, 430, 34);

        indx3.add(jPanel8);
        jPanel8.setBounds(0, 0, 730, 50);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Generate 11x10 Vending Machine? ");
        indx3.add(jLabel20);
        jLabel20.setBounds(140, 220, 430, 30);

        btnConfirm.setText("Generate");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });
        indx3.add(btnConfirm);
        btnConfirm.setBounds(280, 320, 150, 60);

        displaySite.addTab("3", indx3);

        indx4.setBackground(new java.awt.Color(71, 92, 101));
        indx4.setLayout(null);

        jPanel12.setLayout(null);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("REGULAR VENDING MACHINE - Preloaded Cafe Vending Machine");
        jPanel12.add(jLabel21);
        jLabel21.setBounds(17, 6, 570, 34);

        indx4.add(jPanel12);
        jPanel12.setBounds(0, 0, 730, 50);

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Coffee Ingredients:");
        indx4.add(jLabel22);
        jLabel22.setBounds(30, 80, 240, 30);

        lblIngredients.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblIngredients.setForeground(new java.awt.Color(255, 255, 255));
        lblIngredients.setText("<html> +Coffee<br>   &emsp[1] Espresso shot<br><br> +Types of Milk<br>   &emsp[2] Almond Milk<br>  &emsp[3] Normal Milk<br>   &emsp[4] Soy Milk<br>   &emsp[5] Oat Milk<br><br> +Toppings<br>  &emsp[6] Oreo<br>   &emsp[7] Icecream<br>   &emsp[8] Chocolate<br><br> +Flavorings Syrup(not for sale)<br>    &emsp -Strawberry<br>    &emsp -Caramel<br>   &emsp -Chocolate<br>  <html>");
        indx4.add(lblIngredients);
        lblIngredients.setBounds(30, 118, 400, 420);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Generate");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        indx4.add(jButton2);
        jButton2.setBounds(550, 500, 120, 40);

        displaySite.addTab("4", indx4);

        indx5.setBackground(new java.awt.Color(71, 92, 101));
        indx5.setLayout(null);

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Enter M number of Columns [10 - 15]: ");
        indx5.add(jLabel26);
        jLabel26.setBounds(30, 340, 362, 22);

        jPanel14.setLayout(null);

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel30.setText("Special VENDING MACHINE - Default");
        jPanel14.add(jLabel30);
        jLabel30.setBounds(17, 6, 430, 34);

        indx5.add(jPanel14);
        jPanel14.setBounds(0, 0, 730, 50);

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Enter N number of Rows [8 - 20]: ");
        indx5.add(jLabel31);
        jLabel31.setBounds(30, 110, 318, 22);

        tfCol1.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        tfCol1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        
        tfCol1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfCol1KeyPressed(evt);
            }
        });
        indx5.add(tfCol1);
        tfCol1.setBounds(30, 390, 300, 40);

        tfRow1.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        tfRow1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        tfRow1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
 
        tfRow1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfRow1KeyPressed(evt);
            }
        });
        indx5.add(tfRow1);
        tfRow1.setBounds(30, 160, 300, 40);

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setText("Save");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        indx5.add(jButton3);
        jButton3.setBounds(580, 510, 120, 40);

        displaySite.addTab("5", indx5);

        indx6.setBackground(new java.awt.Color(71, 92, 101));
        indx6.setLayout(null);

        jPanel19.setLayout(null);

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel32.setText("SPECIAL VENDING MACHINE - Default 11x10");
        jPanel19.add(jLabel32);
        jLabel32.setBounds(17, 6, 430, 34);

        indx6.add(jPanel19);
        jPanel19.setBounds(0, 0, 730, 50);

        syrup.setBackground(new java.awt.Color(71, 92, 101));
        syrup.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel64.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(255, 255, 255));
        jLabel64.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel64.setText("Choose at least 1 Syrup");

        caramel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        caramel.setText("Caramel Syrup");
        caramel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                caramelMouseClicked(evt);
            }
        });

        chocolate1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        chocolate1.setText("Chocolate Syrup");
        chocolate1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chocolate1MouseClicked(evt);
            }
        });

        strawberry.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        strawberry.setText("Strawberry Syrup");
        strawberry.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                strawberryMouseClicked(evt);
            }
        });

        con2.setText("Generate");
        con2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                con2MouseClicked(evt);
            }
        });

        add2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        add2.setText("Added: ");

        javax.swing.GroupLayout syrupLayout = new javax.swing.GroupLayout(syrup);
        syrup.setLayout(syrupLayout);
        syrupLayout.setHorizontalGroup(
            syrupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(syrupLayout.createSequentialGroup()
                .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(syrupLayout.createSequentialGroup()
                .addGroup(syrupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(syrupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(syrupLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(add2, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, syrupLayout.createSequentialGroup()
                            .addGap(133, 133, 133)
                            .addGroup(syrupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(strawberry, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(chocolate1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(caramel, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(syrupLayout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(con2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        syrupLayout.setVerticalGroup(
            syrupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(syrupLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(strawberry, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(caramel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(chocolate1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(add2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(con2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        indx6.add(syrup);
        syrup.setBounds(100, 60, 530, 420);

        milk.setBackground(new java.awt.Color(71, 92, 101));
        milk.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("Choose at least 1 Milk");

        normal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        normal.setText("Normal Milk");
        normal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                normalMouseClicked(evt);
            }
        });

        soy.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        soy.setText("Soy Milk");
        soy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                soyMouseClicked(evt);
            }
        });

        oat.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        oat.setText("Oat Milk");
        oat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                oatMouseClicked(evt);
            }
        });
        

        almond.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        almond.setText("Almond Milk");
        almond.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                almondMouseClicked(evt);
            }
        });

        add.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        add.setText("Added: ");

        con.setText("Continue");
        con.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                conMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout milkLayout = new javax.swing.GroupLayout(milk);
        milk.setLayout(milkLayout);
        milkLayout.setHorizontalGroup(
            milkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(milkLayout.createSequentialGroup()
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(milkLayout.createSequentialGroup()
                .addGroup(milkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(milkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(milkLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, milkLayout.createSequentialGroup()
                            .addGap(133, 133, 133)
                            .addGroup(milkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(almond, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(oat, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(soy, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(normal, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(milkLayout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(con, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        milkLayout.setVerticalGroup(
            milkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(milkLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(almond, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(normal, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(soy, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(oat, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(con, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        indx6.add(milk);
        milk.setBounds(100, 60, 530, 420);

        topping.setBackground(new java.awt.Color(71, 92, 101));
        topping.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel62.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(255, 255, 255));
        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel62.setText("Choose at least 1 Topping");

        icecream.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        icecream.setText("Icecream");
        icecream.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icecreamMouseClicked(evt);
            }
        });

        chocolate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        chocolate.setText("Chocolate");
        chocolate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chocolateMouseClicked(evt);
            }
        });

        oreo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        oreo.setText("Oreo");
        oreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                oreoMouseClicked(evt);
            }
        });

        con1.setText("Continue");
        con1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                con1MouseClicked(evt);
            }
        });

        add1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        add1.setText("Added: ");

        javax.swing.GroupLayout toppingLayout = new javax.swing.GroupLayout(topping);
        topping.setLayout(toppingLayout);
        toppingLayout.setHorizontalGroup(
            toppingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(toppingLayout.createSequentialGroup()
                .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(toppingLayout.createSequentialGroup()
                .addGroup(toppingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(toppingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(toppingLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(add1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, toppingLayout.createSequentialGroup()
                            .addGap(133, 133, 133)
                            .addGroup(toppingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(oreo, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(chocolate, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(icecream, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(toppingLayout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(con1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        toppingLayout.setVerticalGroup(
            toppingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(toppingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(oreo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(icecream, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(chocolate, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(add1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(con1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        indx6.add(topping);
        topping.setBounds(100, 60, 530, 420);

        displaySite.addTab("6", indx6);

        indx7.setBackground(new java.awt.Color(71, 92, 101));
        indx7.setLayout(null);

        jPanel20.setLayout(null);

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel34.setText("SPECIAL VENDING MACHINE - Preloaded Cafe Vending Machine");
        jPanel20.add(jLabel34);
        jLabel34.setBounds(17, 6, 570, 34);

        indx7.add(jPanel20);
        jPanel20.setBounds(0, 0, 730, 50);

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel35.setText("REGULAR VENDING MACHINE - Preloaded Cafe Vending Machine");
        indx7.add(jLabel35);
        jLabel35.setBounds(17, 6, 570, 34);

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Coffee Ingredients:");
        indx7.add(jLabel36);
        jLabel36.setBounds(30, 80, 240, 30);

        lblIngredients1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblIngredients1.setForeground(new java.awt.Color(255, 255, 255));
        lblIngredients1.setText("<html> +Coffee<br>   &emsp[1] Espresso shot<br><br> +Types of Milk<br>   &emsp[2] Almond Milk<br>  &emsp[3] Normal Milk<br>   &emsp[4] Soy Milk<br>   &emsp[5] Oat Milk<br><br> +Toppings<br>  &emsp[6] Oreo<br>   &emsp[7] Icecream<br>   &emsp[8] Chocolate<br><br> +Flavorings Syrup(not for sale)<br>    &emsp -Strawberry<br>    &emsp -Caramel<br>   &emsp -Chocolate<br>  <html>");
        indx7.add(lblIngredients1);
        lblIngredients1.setBounds(30, 118, 400, 420);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("Generate");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        indx7.add(jButton4);
        jButton4.setBounds(550, 500, 120, 40);

        displaySite.addTab("7", indx7);

        indx8.setBackground(new java.awt.Color(71, 92, 101));

        javax.swing.GroupLayout indx8Layout = new javax.swing.GroupLayout(indx8);
        indx8.setLayout(indx8Layout);
        indx8Layout.setHorizontalGroup(
            indx8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
        );
        indx8Layout.setVerticalGroup(
            indx8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 569, Short.MAX_VALUE)
        );

        displaySite.addTab("8", indx8);

        create.add(displaySite);
        displaySite.setBounds(370, 130, 730, 600);

        MainPanel.addTab("tab2", create);

        testingMenu2.setBackground(new java.awt.Color(0, 0, 0));
        testingMenu2.setLayout(null);

        jPanel22.setBackground(new java.awt.Color(27, 27, 27));

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("TESTING MENU");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap(443, Short.MAX_VALUE)
                .addComponent(jLabel37)
                .addGap(409, 409, 409))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel37)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        testingMenu2.add(jPanel22);
        jPanel22.setBounds(0, 0, 1133, 100);

        jPanel21.setBackground(new java.awt.Color(41, 41, 41));

        jPanel23.setBackground(new java.awt.Color(128, 128, 128));
        jPanel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel23MouseClicked(evt);
            }
        });

        jLabel40.setBackground(new java.awt.Color(255, 163, 26));
        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 163, 26));
        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/VR.png"))); // NOI18N
        jLabel40.setText("BETA TESTING");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel40)
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel40)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel24.setBackground(new java.awt.Color(128, 128, 128));
        jPanel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel24MouseClicked(evt);
            }
        });

        jLabel38.setBackground(new java.awt.Color(255, 163, 26));
        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 163, 26));
        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/maintenanceIcon.png"))); // NOI18N
        jLabel38.setText("MAINTENANCE");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel27.setBackground(new java.awt.Color(128, 128, 128));
        jPanel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel27MouseClicked(evt);
            }
        });

        jLabel39.setBackground(new java.awt.Color(255, 163, 26));
        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 163, 26));
        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/exit.png"))); // NOI18N
        jLabel39.setText("EXIT");

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(193, Short.MAX_VALUE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel39)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        testingMenu2.add(jPanel21);
        jPanel21.setBounds(340, 190, 470, 470);

        MainPanel.addTab("tab3", testingMenu2);

        maintenancePanelRVM.setBackground(new java.awt.Color(0, 0, 0));
        maintenancePanelRVM.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(27, 27, 27));
        jPanel4.setLayout(null);

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("MAINTENANCE");
        jPanel4.add(jLabel42);
        jLabel42.setBounds(413, 31, 286, 52);

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/menuIcon.png"))); // NOI18N
        jLabel41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel41MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel41);
        jLabel41.setBounds(20, 30, 60, 40);

        maintenancePanelRVM.add(jPanel4);
        jPanel4.setBounds(0, 0, 1150, 100);

        options.setBackground(new java.awt.Color(27, 27, 27));
        options.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(27, 27, 27), 3, true));

        btnStock.setBackground(new java.awt.Color(27, 27, 27));

        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/stocking.png"))); // NOI18N
        jLabel43.setText("Stocking / Restocking");
        jLabel43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel43MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnStockLayout = new javax.swing.GroupLayout(btnStock);
        btnStock.setLayout(btnStockLayout);
        btnStockLayout.setHorizontalGroup(
            btnStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnStockLayout.createSequentialGroup()
                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btnStockLayout.setVerticalGroup(
            btnStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnStockLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel43)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        btnUpPrice.setBackground(new java.awt.Color(27, 27, 27));
        

        jLabel49.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/price.png"))); // NOI18N
        jLabel49.setText("Update Price");
        jLabel49.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel49MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnUpPriceLayout = new javax.swing.GroupLayout(btnUpPrice);
        btnUpPrice.setLayout(btnUpPriceLayout);
        btnUpPriceLayout.setHorizontalGroup(
            btnUpPriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnUpPriceLayout.createSequentialGroup()
                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 41, Short.MAX_VALUE))
        );
        btnUpPriceLayout.setVerticalGroup(
            btnUpPriceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnUpPriceLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel49)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        btnCollect.setBackground(new java.awt.Color(27, 27, 27));

        jLabel50.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/money.png"))); // NOI18N
        jLabel50.setText("Collect Money");
        jLabel50.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel50MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnCollectLayout = new javax.swing.GroupLayout(btnCollect);
        btnCollect.setLayout(btnCollectLayout);
        btnCollectLayout.setHorizontalGroup(
            btnCollectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCollectLayout.createSequentialGroup()
                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 41, Short.MAX_VALUE))
        );
        btnCollectLayout.setVerticalGroup(
            btnCollectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCollectLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel50)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        btnReplenish.setBackground(new java.awt.Color(27, 27, 27));

        jLabel51.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/replenish.png"))); // NOI18N
        jLabel51.setText("Replenish Money");
        jLabel51.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel51MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnReplenishLayout = new javax.swing.GroupLayout(btnReplenish);
        btnReplenish.setLayout(btnReplenishLayout);
        btnReplenishLayout.setHorizontalGroup(
            btnReplenishLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnReplenishLayout.createSequentialGroup()
                .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 41, Short.MAX_VALUE))
        );
        btnReplenishLayout.setVerticalGroup(
            btnReplenishLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnReplenishLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel51)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        btnDisplaystats.setBackground(new java.awt.Color(27, 27, 27));

        jLabel52.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/stats.png"))); // NOI18N
        jLabel52.setText("Display Statistics");
        jLabel52.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel52MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnDisplaystatsLayout = new javax.swing.GroupLayout(btnDisplaystats);
        btnDisplaystats.setLayout(btnDisplaystatsLayout);
        btnDisplaystatsLayout.setHorizontalGroup(
            btnDisplaystatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnDisplaystatsLayout.createSequentialGroup()
                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 41, Short.MAX_VALUE))
        );
        btnDisplaystatsLayout.setVerticalGroup(
            btnDisplaystatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnDisplaystatsLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel52)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        btnExitMaintenance.setBackground(new java.awt.Color(27, 27, 27));
        btnExitMaintenance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMaintenanceMouseClicked(evt);
            }
        });

        jLabel53.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/exit2.png"))); // NOI18N
        jLabel53.setText("Exit");

        javax.swing.GroupLayout btnExitMaintenanceLayout = new javax.swing.GroupLayout(btnExitMaintenance);
        btnExitMaintenance.setLayout(btnExitMaintenanceLayout);
        btnExitMaintenanceLayout.setHorizontalGroup(
            btnExitMaintenanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnExitMaintenanceLayout.createSequentialGroup()
                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btnExitMaintenanceLayout.setVerticalGroup(
            btnExitMaintenanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnExitMaintenanceLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel53)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout optionsLayout = new javax.swing.GroupLayout(options);
        options.setLayout(optionsLayout);
        optionsLayout.setHorizontalGroup(
            optionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(optionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCollect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReplenish, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDisplaystats, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExitMaintenance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        optionsLayout.setVerticalGroup(
            optionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionsLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btnStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCollect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReplenish, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDisplaystats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExitMaintenance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(216, Short.MAX_VALUE))
        );

        maintenancePanelRVM.add(options);
        options.setBounds(0, 110, 306, 660);

        m0.setBackground(new java.awt.Color(41, 41, 41));

        javax.swing.GroupLayout m0Layout = new javax.swing.GroupLayout(m0);
        m0.setLayout(m0Layout);
        m0Layout.setHorizontalGroup(
            m0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1150, Short.MAX_VALUE)
        );
        m0Layout.setVerticalGroup(
            m0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 669, Short.MAX_VALUE)
        );

        mPanel.addTab("tab1", m0);

        m1.setBackground(new java.awt.Color(41, 41, 41));
        m1.setLayout(null);

        itemTable.setBackground(new java.awt.Color(204, 204, 204));
        itemTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        itemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Slot", "Name", "Price", "Quantity", "Calories"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        itemTable.setGridColor(new java.awt.Color(0, 0, 0));
        itemTable.setRowHeight(50);
        itemTable.setShowGrid(true);
        itemTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(itemTable);

        m1.add(jScrollPane2);
        jScrollPane2.setBounds(360, 50, 760, 560);

        jPanel28.setBackground(new java.awt.Color(41, 41, 41));

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        m1.add(jPanel28);
        jPanel28.setBounds(40, 10, 380, 40);

        tb1.setBackground(new java.awt.Color(27, 27, 27));
        tb1.setLayout(null);

        jLabel44.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Enter Slot To Update");
        tb1.add(jLabel44);
        jLabel44.setBounds(30, 100, 240, 32);

        slotNUM.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        
        slotNUM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                slotNUMKeyPressed(evt);
            }
        });
        tb1.add(slotNUM);
        slotNUM.setBounds(60, 180, 170, 50);

        jButton6.setBackground(new java.awt.Color(255, 163, 26));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Submit");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        
        tb1.add(jButton6);
        jButton6.setBounds(100, 310, 90, 40);

        tabStonks.addTab("tab1", tb1);

        tb2.setBackground(new java.awt.Color(27, 27, 27));
        tb2.setLayout(null);

        jLabel45.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("Stocking");
        tb2.add(jLabel45);
        jLabel45.setBounds(6, 6, 107, 32);

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 163, 26));
        jLabel47.setText("Enter Product Name: ");
        tb2.add(jLabel47);
        jLabel47.setBounds(20, 60, 230, 22);

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 163, 26));
        jLabel48.setText("Enter Calories:");
        tb2.add(jLabel48);
        jLabel48.setBounds(20, 150, 230, 22);

        tfPriceStocking.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tfPriceStocking.setForeground(new java.awt.Color(255, 163, 26));
        tfPriceStocking.setText("Enter Price:");
        tb2.add(tfPriceStocking);
        tfPriceStocking.setBounds(20, 240, 230, 22);

        
        tfQuantityStocking.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfQuantityStockingKeyPressed(evt);
            }
        });
        tb2.add(tfQuantityStocking);
        tfQuantityStocking.setBounds(20, 380, 200, 30);

        
        tb2.add(tfProductNameStocking);
        tfProductNameStocking.setBounds(20, 100, 200, 30);

        
        tfCaloriesStocking.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfCaloriesStockingKeyPressed(evt);
            }
        });
        tb2.add(tfCaloriesStocking);
        tfCaloriesStocking.setBounds(20, 190, 200, 30);

        
        tfPriceStocking2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfPriceStocking2KeyPressed(evt);
            }
        });
        tb2.add(tfPriceStocking2);
        tfPriceStocking2.setBounds(20, 280, 200, 30);

        jButton5.setBackground(new java.awt.Color(255, 163, 26));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Save");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        tb2.add(jButton5);
        jButton5.setBounds(160, 480, 100, 40);

        jButton8.setBackground(new java.awt.Color(255, 163, 26));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Back");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });
        tb2.add(jButton8);
        jButton8.setBounds(20, 480, 100, 40);

        maxQuantityDisplay1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        maxQuantityDisplay1.setForeground(new java.awt.Color(255, 163, 26));
        maxQuantityDisplay1.setText("Max Quantity is");
        tb2.add(maxQuantityDisplay1);
        maxQuantityDisplay1.setBounds(20, 340, 220, 22);

        tabStonks.addTab("tab2", tb2);

        tb3.setBackground(new java.awt.Color(27, 27, 27));
        tb3.setLayout(null);

        jLabel46.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("Re-stocking");
        tb3.add(jLabel46);
        jLabel46.setBounds(6, 6, 153, 32);

        maxQuantityDisplay.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        maxQuantityDisplay.setForeground(new java.awt.Color(255, 163, 26));
        maxQuantityDisplay.setText("Max Quantity is");
        tb3.add(maxQuantityDisplay);
        maxQuantityDisplay.setBounds(20, 190, 220, 22);

        
        tfAddStocks.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfAddStocksKeyPressed(evt);
            }
        });
        tb3.add(tfAddStocks);
        tfAddStocks.setBounds(40, 230, 200, 30);

        jButton7.setBackground(new java.awt.Color(255, 163, 26));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Save");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });
        tb3.add(jButton7);
        jButton7.setBounds(160, 480, 100, 40);

        jButton9.setBackground(new java.awt.Color(255, 163, 26));
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Back");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });
        tb3.add(jButton9);
        jButton9.setBounds(20, 480, 100, 40);

        jLabel56.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 163, 26));
        jLabel56.setText("Number of Stocks to Add? ");
        tb3.add(jLabel56);
        jLabel56.setBounds(20, 150, 260, 22);

        tabStonks.addTab("tab3", tb3);

        tb6.setBackground(new java.awt.Color(27, 27, 27));
        tb6.setLayout(null);

        jLabel55.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setText("<html>\nEnter Slot To Update <b>\n&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp &nbsp&nbsp&nbsp&nbsp &nbsp&nbsp    Price<b>\n<html>");
        tb6.add(jLabel55);
        jLabel55.setBounds(20, 100, 260, 60);

        slotNUM2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        
        slotNUM2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                slotNUM2KeyPressed(evt);
            }
        });
        tb6.add(slotNUM2);
        slotNUM2.setBounds(60, 180, 170, 50);

        jButton13.setBackground(new java.awt.Color(255, 163, 26));
        jButton13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setText("Submit");
        jButton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton13MouseClicked(evt);
            }
        });
        
        tb6.add(jButton13);
        jButton13.setBounds(100, 310, 90, 40);

        tabStonks.addTab("tab1", tb6);

        tb7.setBackground(new java.awt.Color(27, 27, 27));
        tb7.setLayout(null);

        tfUpdatePrice1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        
        
        tb7.add(tfUpdatePrice1);
        tfUpdatePrice1.setBounds(40, 230, 210, 40);

        jButton14.setBackground(new java.awt.Color(255, 163, 26));
        jButton14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setText("Save");
        jButton14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton14MouseClicked(evt);
            }
        });
        tb7.add(jButton14);
        jButton14.setBounds(160, 480, 100, 40);

        jButton15.setBackground(new java.awt.Color(255, 163, 26));
        jButton15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton15.setForeground(new java.awt.Color(255, 255, 255));
        jButton15.setText("Back");
        jButton15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton15MouseClicked(evt);
            }
        });
        tb7.add(jButton15);
        jButton15.setBounds(20, 480, 100, 40);

        maxQuantityDisplay3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        maxQuantityDisplay3.setForeground(new java.awt.Color(255, 163, 26));
        maxQuantityDisplay3.setText("New Price");
        tb7.add(maxQuantityDisplay3);
        maxQuantityDisplay3.setBounds(80, 160, 140, 29);

        tabStonks.addTab("tab2", tb7);

        m1.add(tabStonks);
        tabStonks.setBounds(40, 20, 290, 600);

        mPanel.addTab("tab2", m1);

        m2.setBackground(new java.awt.Color(41, 41, 41));
        m2.setLayout(null);

        jPanel29.setBackground(new java.awt.Color(27, 27, 27));

        currentMoney.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        currentMoney.setForeground(new java.awt.Color(255, 163, 26));
        currentMoney.setText("Current Money: ");

        jLabel58.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 163, 26));
        jLabel58.setText("Collect Money");

        tfCollectMoney.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jButton10.setBackground(new java.awt.Color(255, 163, 26));
        jButton10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton10.setForeground(new java.awt.Color(41, 41, 41));
        jButton10.setText("Collect");
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel29Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel29Layout.createSequentialGroup()
                        .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(214, 214, 214))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel29Layout.createSequentialGroup()
                        .addComponent(tfCollectMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(193, 193, 193))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel29Layout.createSequentialGroup()
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(currentMoney, javax.swing.GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE)
                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36))))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(currentMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tfCollectMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        m2.add(jPanel29);
        jPanel29.setBounds(180, 70, 730, 420);

        mPanel.addTab("tab3", m2);

        m3.setBackground(new java.awt.Color(41, 41, 41));
        m3.setLayout(null);

        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 163, 26));
        jLabel54.setText("Replenish Money");
        m3.add(jLabel54);
        jLabel54.setBounds(420, 20, 328, 73);

        jPanel30.setBackground(new java.awt.Color(27, 27, 27));
        jPanel30.setLayout(null);

        jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/10.png"))); // NOI18N
        jPanel30.add(jLabel57);
        jLabel57.setBounds(630, 30, 100, 108);

        jLabel59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/5.png"))); // NOI18N
        jPanel30.add(jLabel59);
        jLabel59.setBounds(360, 30, 108, 108);

        jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/20.png"))); // NOI18N
        jPanel30.add(jLabel61);
        jLabel61.setBounds(880, 30, 90, 100);

        jLabel63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/piso.png"))); // NOI18N
        jPanel30.add(jLabel63);
        jLabel63.setBounds(110, 30, 108, 108);

        hundred.setBackground(new java.awt.Color(255, 163, 26));
        hundred.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        hundred.setText("0");
        hundred.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hundredMouseClicked(evt);
            }
        });
        jPanel30.add(hundred);
        hundred.setBounds(840, 470, 90, 30);

        ones.setBackground(new java.awt.Color(255, 163, 26));
        ones.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ones.setText("0");
        ones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onesMouseClicked(evt);
            }
        });
        jPanel30.add(ones);
        ones.setBounds(110, 150, 90, 30);

        fives.setBackground(new java.awt.Color(255, 163, 26));
        fives.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        fives.setText("0");
        fives.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fivesMouseClicked(evt);
            }
        });
        jPanel30.add(fives);
        fives.setBounds(360, 150, 90, 30);

        tens.setBackground(new java.awt.Color(255, 163, 26));
        tens.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tens.setText("0");
        tens.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tensMouseClicked(evt);
            }
        });
        jPanel30.add(tens);
        tens.setBounds(630, 150, 90, 30);

        twenty.setBackground(new java.awt.Color(255, 163, 26));
        twenty.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        twenty.setText("0");
        twenty.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                twentyMouseClicked(evt);
            }
        });
        jPanel30.add(twenty);
        twenty.setBounds(880, 150, 90, 30);

        fifty.setBackground(new java.awt.Color(255, 163, 26));
        fifty.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        fifty.setText("0");
        fifty.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fiftyMouseClicked(evt);
            }
        });
        jPanel30.add(fifty);
        fifty.setBounds(260, 470, 90, 30);

        jLabel65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/50.png"))); // NOI18N
        jPanel30.add(jLabel65);
        jLabel65.setBounds(40, 240, 490, 200);

        jLabel66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/100.png"))); // NOI18N
        jPanel30.add(jLabel66);
        jLabel66.setBounds(570, 240, 490, 200);

        m3.add(jPanel30);
        jPanel30.setBounds(50, 100, 1070, 530);

        mPanel.addTab("tab3", m3);

        m4.setBackground(new java.awt.Color(41, 41, 41));
        m4.setLayout(null);

        summaryTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        summaryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Item", "Before", "After", "Sold"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        summaryTable.setGridColor(new java.awt.Color(51, 51, 51));
        summaryTable.setRowHeight(40);
        summaryTable.setShowGrid(true);
        jScrollPane1.setViewportView(summaryTable);
        if (summaryTable.getColumnModel().getColumnCount() > 0) {
            summaryTable.getColumnModel().getColumn(0).setResizable(false);
            summaryTable.getColumnModel().getColumn(1).setResizable(false);
            summaryTable.getColumnModel().getColumn(2).setResizable(false);
            summaryTable.getColumnModel().getColumn(3).setResizable(false);
        }

        m4.add(jScrollPane1);
        jScrollPane1.setBounds(160, 100, 800, 480);

        totalSales.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        totalSales.setForeground(new java.awt.Color(255, 163, 26));
        totalSales.setText("Total Sales: ");
        m4.add(totalSales);
        totalSales.setBounds(440, 590, 400, 29);

        mPanel.addTab("tab3", m4);

        m5.setBackground(new java.awt.Color(41, 41, 41));

        javax.swing.GroupLayout m5Layout = new javax.swing.GroupLayout(m5);
        m5.setLayout(m5Layout);
        m5Layout.setHorizontalGroup(
            m5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1150, Short.MAX_VALUE)
        );
        m5Layout.setVerticalGroup(
            m5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 669, Short.MAX_VALUE)
        );

        mPanel.addTab("tab3", m5);

        maintenancePanelRVM.add(mPanel);
        mPanel.setBounds(0, 70, 1150, 700);

        MainPanel.addTab("tab4", maintenancePanelRVM);

        beta1.setLayout(null);

        jPanel32.setBackground(new java.awt.Color(27, 27, 27));
        jPanel32.setPreferredSize(new java.awt.Dimension(699, 83));

        jPanel33.setBackground(new java.awt.Color(255, 163, 26));

        jPanel34.setPreferredSize(new java.awt.Dimension(140, 140));

        jPanel62.setBackground(new java.awt.Color(27, 27, 27));

        jLabel60.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(242, 242, 242));
        jLabel60.setText("<price>");

        jLabel67.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(242, 242, 242));
        jLabel67.setText("<Name>");

        jTextField2.setText("1");

        javax.swing.GroupLayout jPanel62Layout = new javax.swing.GroupLayout(jPanel62);
        jPanel62.setLayout(jPanel62Layout);
        jPanel62Layout.setHorizontalGroup(
            jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel62Layout.createSequentialGroup()
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel67)
                    .addComponent(jLabel60))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel62Layout.setVerticalGroup(
            jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel62Layout.createSequentialGroup()
                .addComponent(jLabel67)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel112.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/mystery.png"))); // NOI18N

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel112)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel34Layout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addComponent(jLabel112)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel62, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel35.setPreferredSize(new java.awt.Dimension(140, 140));

        jPanel63.setBackground(new java.awt.Color(27, 27, 27));

        jLabel68.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(242, 242, 242));
        jLabel68.setText("<Name>");

        jLabel69.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(242, 242, 242));
        jLabel69.setText("<price>");

        jTextField3.setText("2");

        javax.swing.GroupLayout jPanel63Layout = new javax.swing.GroupLayout(jPanel63);
        jPanel63.setLayout(jPanel63Layout);
        jPanel63Layout.setHorizontalGroup(
            jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel63Layout.createSequentialGroup()
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel68)
                    .addComponent(jLabel69))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel63Layout.setVerticalGroup(
            jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel63Layout.createSequentialGroup()
                .addComponent(jLabel68)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel69)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel115.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/mystery.png"))); // NOI18N

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel63, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel35Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel115)
                .addGap(40, 40, 40))
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel35Layout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addComponent(jLabel115)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel63, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel36.setPreferredSize(new java.awt.Dimension(140, 140));

        jPanel64.setBackground(new java.awt.Color(27, 27, 27));

        jLabel70.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(242, 242, 242));
        jLabel70.setText("<Name>");

        jLabel71.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(242, 242, 242));
        jLabel71.setText("<price>");

        jTextField4.setText("3");

        javax.swing.GroupLayout jPanel64Layout = new javax.swing.GroupLayout(jPanel64);
        jPanel64.setLayout(jPanel64Layout);
        jPanel64Layout.setHorizontalGroup(
            jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel64Layout.createSequentialGroup()
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel70)
                    .addComponent(jLabel71))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel64Layout.setVerticalGroup(
            jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel64Layout.createSequentialGroup()
                .addComponent(jLabel70)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel71)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/mystery.png"))); // NOI18N

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel64, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel36Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel25)
                .addGap(41, 41, 41))
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel36Layout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel64, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel37.setPreferredSize(new java.awt.Dimension(140, 140));

        jPanel76.setBackground(new java.awt.Color(27, 27, 27));

        jLabel85.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(242, 242, 242));
        jLabel85.setText("<Name>");

        jLabel86.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel86.setForeground(new java.awt.Color(242, 242, 242));
        jLabel86.setText("<price>");

        jTextField6.setText("4");


        javax.swing.GroupLayout jPanel76Layout = new javax.swing.GroupLayout(jPanel76);
        jPanel76.setLayout(jPanel76Layout);
        jPanel76Layout.setHorizontalGroup(
            jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel76Layout.createSequentialGroup()
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel85)
                    .addComponent(jLabel86))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel76Layout.setVerticalGroup(
            jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel76Layout.createSequentialGroup()
                .addComponent(jLabel85)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel86)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel113.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/mystery.png"))); // NOI18N

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel76, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel113)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel37Layout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addComponent(jLabel113)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel76, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel38.setPreferredSize(new java.awt.Dimension(140, 140));

        jPanel66.setBackground(new java.awt.Color(27, 27, 27));

        jLabel72.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(242, 242, 242));
        jLabel72.setText("<Name>");

        jLabel73.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(242, 242, 242));
        jLabel73.setText("<price>");

        jTextField5.setText("5");

        javax.swing.GroupLayout jPanel66Layout = new javax.swing.GroupLayout(jPanel66);
        jPanel66.setLayout(jPanel66Layout);
        jPanel66Layout.setHorizontalGroup(
            jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel66Layout.createSequentialGroup()
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel72)
                    .addComponent(jLabel73))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel66Layout.setVerticalGroup(
            jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel66Layout.createSequentialGroup()
                .addComponent(jLabel72)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel73)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel117.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/mystery.png"))); // NOI18N

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel66, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel38Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel117)
                .addGap(44, 44, 44))
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel38Layout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addComponent(jLabel117)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel66, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel39.setPreferredSize(new java.awt.Dimension(140, 140));

        jPanel70.setBackground(new java.awt.Color(27, 27, 27));

        jLabel74.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(242, 242, 242));
        jLabel74.setText("<Name>");

        jLabel75.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(242, 242, 242));
        jLabel75.setText("<price>");

        jTextField7.setText("6");

        javax.swing.GroupLayout jPanel70Layout = new javax.swing.GroupLayout(jPanel70);
        jPanel70.setLayout(jPanel70Layout);
        jPanel70Layout.setHorizontalGroup(
            jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel70Layout.createSequentialGroup()
                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel74)
                    .addComponent(jLabel75))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel70Layout.setVerticalGroup(
            jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel70Layout.createSequentialGroup()
                .addComponent(jLabel74)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel75)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel114.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/mystery.png"))); // NOI18N

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel70, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel39Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel114)
                .addGap(36, 36, 36))
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel39Layout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addComponent(jLabel114)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel70, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel40.setPreferredSize(new java.awt.Dimension(140, 140));

        jPanel71.setBackground(new java.awt.Color(27, 27, 27));

        jLabel76.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(242, 242, 242));
        jLabel76.setText("<Name>");

        jLabel77.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(242, 242, 242));
        jLabel77.setText("<price>");

        jTextField8.setText("7");

        javax.swing.GroupLayout jPanel71Layout = new javax.swing.GroupLayout(jPanel71);
        jPanel71.setLayout(jPanel71Layout);
        jPanel71Layout.setHorizontalGroup(
            jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel71Layout.createSequentialGroup()
                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel76)
                    .addComponent(jLabel77))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel71Layout.setVerticalGroup(
            jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel71Layout.createSequentialGroup()
                .addComponent(jLabel76)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel77)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel119.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/mystery.png"))); // NOI18N

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel71, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel40Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel119)
                .addGap(42, 42, 42))
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel40Layout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addComponent(jLabel119)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel71, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel41.setPreferredSize(new java.awt.Dimension(140, 140));

        jPanel72.setBackground(new java.awt.Color(27, 27, 27));

        jLabel78.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(242, 242, 242));
        jLabel78.setText("<Name>");

        jLabel79.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(242, 242, 242));
        jLabel79.setText("<price>");

        jTextField9.setText("8");
 

        javax.swing.GroupLayout jPanel72Layout = new javax.swing.GroupLayout(jPanel72);
        jPanel72.setLayout(jPanel72Layout);
        jPanel72Layout.setHorizontalGroup(
            jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel72Layout.createSequentialGroup()
                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel78)
                    .addComponent(jLabel79))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel72Layout.setVerticalGroup(
            jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel72Layout.createSequentialGroup()
                .addComponent(jLabel78)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel79)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel116.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/mystery.png"))); // NOI18N

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel72, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel41Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel116)
                .addGap(41, 41, 41))
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel41Layout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addComponent(jLabel116)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel72, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel42.setPreferredSize(new java.awt.Dimension(140, 140));

        jPanel73.setBackground(new java.awt.Color(27, 27, 27));

        jLabel80.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(242, 242, 242));
        jLabel80.setText("<Name>");

        jLabel81.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(242, 242, 242));
        jLabel81.setText("<price>");

        jTextField11.setText("11");
 

        javax.swing.GroupLayout jPanel73Layout = new javax.swing.GroupLayout(jPanel73);
        jPanel73.setLayout(jPanel73Layout);
        jPanel73Layout.setHorizontalGroup(
            jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel73Layout.createSequentialGroup()
                .addGroup(jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel73Layout.createSequentialGroup()
                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel81))
                    .addGroup(jPanel73Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel80)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel73Layout.setVerticalGroup(
            jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel73Layout.createSequentialGroup()
                .addComponent(jLabel80)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel81)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel120.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/mystery.png"))); // NOI18N

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel73, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel42Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel120)
                .addGap(44, 44, 44))
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel42Layout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addComponent(jLabel120)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel73, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel43.setPreferredSize(new java.awt.Dimension(140, 140));

        jPanel74.setBackground(new java.awt.Color(27, 27, 27));

        jLabel82.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(242, 242, 242));
        jLabel82.setText("<Name>");

        jLabel83.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(242, 242, 242));
        jLabel83.setText("<price>");

        jTextField12.setText("10");


        javax.swing.GroupLayout jPanel74Layout = new javax.swing.GroupLayout(jPanel74);
        jPanel74.setLayout(jPanel74Layout);
        jPanel74Layout.setHorizontalGroup(
            jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel74Layout.createSequentialGroup()
                .addGroup(jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel74Layout.createSequentialGroup()
                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel83))
                    .addComponent(jLabel82))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel74Layout.setVerticalGroup(
            jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel74Layout.createSequentialGroup()
                .addComponent(jLabel82)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel83)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel121.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/mystery.png"))); // NOI18N

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel74, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel43Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel121)
                .addGap(44, 44, 44))
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel43Layout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addComponent(jLabel121)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel74, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel44.setPreferredSize(new java.awt.Dimension(140, 140));

        jPanel75.setBackground(new java.awt.Color(27, 27, 27));

        jLabel84.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(242, 242, 242));
        jLabel84.setText("<Name>");

        jLabel87.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel87.setForeground(new java.awt.Color(242, 242, 242));
        jLabel87.setText("<price>");

        jTextField10.setText("9");


        javax.swing.GroupLayout jPanel75Layout = new javax.swing.GroupLayout(jPanel75);
        jPanel75.setLayout(jPanel75Layout);
        jPanel75Layout.setHorizontalGroup(
            jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel75Layout.createSequentialGroup()
                .addGroup(jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel84)
                    .addGroup(jPanel75Layout.createSequentialGroup()
                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel87)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel75Layout.setVerticalGroup(
            jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel75Layout.createSequentialGroup()
                .addComponent(jLabel84)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel87)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel118.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/mystery.png"))); // NOI18N

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel75, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel118)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel44Layout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addComponent(jLabel118)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel75, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel41, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel33Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel44, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jPanel43, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jPanel42, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138))
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel41, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel43, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel42, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel44, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jPanel45.setBackground(new java.awt.Color(255, 163, 26));

        SVM_Espresso.setLayout(null);

        jButton59.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton59MouseClicked(evt);
            }
        });
        SVM_Espresso.add(jButton59);
        jButton59.setBounds(30, 90, 130, 30);

        jTextField30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField30.setText("Espresso");
        SVM_Espresso.add(jTextField30);
        jTextField30.setBounds(60, 10, 78, 23);

        jTextField31.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField31.setText("Click Button");
        SVM_Espresso.add(jTextField31);
        jTextField31.setBounds(47, 50, 100, 21);

        jButton11.setText("2");
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton11MouseClicked(evt);
            }
        });

        jButton12.setText("1");
        jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton12MouseClicked(evt);
            }
        });

        jButton16.setText("3");
        jButton16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton16MouseClicked(evt);
            }
        });

        jButton17.setText("4");
        jButton17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton17MouseClicked(evt);
            }
        });


        jButton18.setText("5");
        jButton18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton18MouseClicked(evt);
            }
        });


        jButton19.setText("6");
        jButton19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton19MouseClicked(evt);
            }
        });

        jButton20.setText("7");
        jButton20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton20MouseClicked(evt);
            }
        });

        jButton21.setText("8");
        jButton21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton21MouseClicked(evt);
            }
        });

        jButton22.setText("9");
        jButton22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton22MouseClicked(evt);
            }
        });

        jButton23.setText("10");
        jButton23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton23MouseClicked(evt);
            }
        });

        jButton24.setText("11");
        jButton24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton24MouseClicked(evt);
            }
        });

        jButton25.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton25.setText("Insert Currency");
        jButton25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton25MouseClicked(evt);
            }
        });

        betaTotalMoney.setText("<Total Money>");


        jButton31.setText("Personalized Coffee!");
        jButton31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton31MouseClicked(evt);
            }
        });

        jButton41.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton41.setText("Exit");
        jButton41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton41MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel46Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel46Layout.createSequentialGroup()
                        .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel46Layout.createSequentialGroup()
                        .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel46Layout.createSequentialGroup()
                                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel46Layout.createSequentialGroup()
                                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel46Layout.createSequentialGroup()
                                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(21, 21, 21))))
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel46Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(betaTotalMoney))
                    .addGroup(jPanel46Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(betaTotalMoney)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jButton41)
                .addContainerGap())
        );

        defaulttab.setLayout(null);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane4.setViewportView(jTextArea1);

        defaulttab.add(jScrollPane4);
        jScrollPane4.setBounds(10, 20, 180, 200);

        SVM_Personalized.setBackground(new java.awt.Color(255, 255, 255));
        SVM_Personalized.setLayout(null);

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1.setText("Type of Milk");
        SVM_Personalized.add(jTextField1);
        jTextField1.setBounds(50, 6, 101, 23);

        jTextField24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField24.setText("Choose 1");
        SVM_Personalized.add(jTextField24);
        jTextField24.setBounds(56, 35, 69, 21);

        jButton48.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton48MouseClicked(evt);
            }
        });
        SVM_Personalized.add(jButton48);
        jButton48.setBounds(20, 70, 150, 20);

        jButton49.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton49MouseClicked(evt);
            }
        });

        SVM_Personalized.add(jButton49);
        jButton49.setBounds(20, 100, 150, 20);

        jButton50.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton50MouseClicked(evt);
            }
        });
        SVM_Personalized.add(jButton50);
        jButton50.setBounds(20, 130, 150, 20);

        jButton51.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton51MouseClicked(evt);
            }
        });
        SVM_Personalized.add(jButton51);
        jButton51.setBounds(20, 160, 150, 20);

        SVM_Personalized1.setBackground(new java.awt.Color(255, 255, 255));
        SVM_Personalized1.setLayout(null);

        jTextField25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField25.setText("Type of Syrup");
        SVM_Personalized1.add(jTextField25);
        jTextField25.setBounds(27, 10, 140, 23);

        jTextField26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField26.setText("Choose 1");
        SVM_Personalized1.add(jTextField26);
        jTextField26.setBounds(56, 35, 69, 21);

        jButton52.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton52MouseClicked(evt);
            }
        });
        SVM_Personalized1.add(jButton52);
        jButton52.setBounds(42, 70, 110, 20);

        jButton53.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton53MouseClicked(evt);
            }
        });

        SVM_Personalized1.add(jButton53);
        jButton53.setBounds(40, 100, 110, 20);

        jButton54.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton54MouseClicked(evt);
            }
        });
        SVM_Personalized1.add(jButton54);
        jButton54.setBounds(40, 140, 110, 20);

        SVM_Personalized2.setBackground(new java.awt.Color(255, 255, 255));
        SVM_Personalized2.setLayout(null);

        jTextField27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField27.setText("Type of Toppings");
        SVM_Personalized2.add(jTextField27);
        jTextField27.setBounds(27, 10, 140, 23);

        jTextField28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField28.setText("Choose 1");
        SVM_Personalized2.add(jTextField28);
        jTextField28.setBounds(56, 35, 69, 21);

        jButton55.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton55MouseClicked(evt);
            }
        });
        SVM_Personalized2.add(jButton55);
        jButton55.setBounds(40, 60, 100, 30);

        jButton56.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton56MouseClicked(evt);
            }
        });

        SVM_Personalized2.add(jButton56);
        jButton56.setBounds(40, 100, 100, 30);

        jButton57.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton57MouseClicked(evt);
            }
        });
        SVM_Personalized2.add(jButton57);
        jButton57.setBounds(40, 140, 100, 30);

        jTextField29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField29.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButton58.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton58.setText("Click If Done!");
        jButton58.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton58MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel45Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(defaulttab, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField29)))
                    .addGroup(jPanel45Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jButton58)))
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel45Layout.createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addComponent(SVM_Personalized, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(43, Short.MAX_VALUE)))
            .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel45Layout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(SVM_Personalized1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(42, Short.MAX_VALUE)))
            .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel45Layout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(SVM_Personalized2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(43, Short.MAX_VALUE)))
            .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel45Layout.createSequentialGroup()
                    .addContainerGap(25, Short.MAX_VALUE)
                    .addComponent(SVM_Espresso, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(41, Short.MAX_VALUE)))
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanel46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton58)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(defaulttab, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel45Layout.createSequentialGroup()
                    .addContainerGap(491, Short.MAX_VALUE)
                    .addComponent(SVM_Personalized, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel45Layout.createSequentialGroup()
                    .addContainerGap(492, Short.MAX_VALUE)
                    .addComponent(SVM_Personalized1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel45Layout.createSequentialGroup()
                    .addContainerGap(493, Short.MAX_VALUE)
                    .addComponent(SVM_Personalized2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel45Layout.createSequentialGroup()
                    .addContainerGap(491, Short.MAX_VALUE)
                    .addComponent(SVM_Espresso, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        jPanel47.setBackground(new java.awt.Color(128, 128, 128));

        javax.swing.GroupLayout jPanel47Layout = new javax.swing.GroupLayout(jPanel47);
        jPanel47.setLayout(jPanel47Layout);
        jPanel47Layout.setHorizontalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 629, Short.MAX_VALUE)
        );
        jPanel47Layout.setVerticalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 71, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel32Layout.createSequentialGroup()
                        .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel32Layout.createSequentialGroup()
                        .addComponent(jPanel47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)))
                .addComponent(jPanel45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(510, 510, 510))
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jPanel47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        beta1.add(jPanel32);
        jPanel32.setBounds(0, 0, 1220, 800);

        MainPanel.addTab("tab5", beta1);

        beta2.setBackground(new java.awt.Color(27, 27, 27));

        jPanel49.setBackground(new java.awt.Color(255, 163, 26));

        jPanel79.setPreferredSize(new java.awt.Dimension(140, 140));

        jPanel80.setBackground(new java.awt.Color(27, 27, 27));

        jLabel89.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel89.setForeground(new java.awt.Color(242, 242, 242));
        jLabel89.setText("<price>");

        jLabel90.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel90.setForeground(new java.awt.Color(242, 242, 242));
        jLabel90.setText("<Name>");

        jTextField13.setText("1");
 

        javax.swing.GroupLayout jPanel80Layout = new javax.swing.GroupLayout(jPanel80);
        jPanel80.setLayout(jPanel80Layout);
        jPanel80Layout.setHorizontalGroup(
            jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel80Layout.createSequentialGroup()
                .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel90)
                    .addComponent(jLabel89))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel80Layout.setVerticalGroup(
            jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel80Layout.createSequentialGroup()
                .addComponent(jLabel90)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel89)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel123.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/mystery.png"))); // NOI18N

        javax.swing.GroupLayout jPanel79Layout = new javax.swing.GroupLayout(jPanel79);
        jPanel79.setLayout(jPanel79Layout);
        jPanel79Layout.setHorizontalGroup(
            jPanel79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel80, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel79Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel123)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel79Layout.setVerticalGroup(
            jPanel79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel79Layout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addComponent(jLabel123)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel80, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel81.setPreferredSize(new java.awt.Dimension(140, 140));

        jPanel82.setBackground(new java.awt.Color(27, 27, 27));

        jLabel91.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel91.setForeground(new java.awt.Color(242, 242, 242));
        jLabel91.setText("<Name>");

        jLabel92.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel92.setForeground(new java.awt.Color(242, 242, 242));
        jLabel92.setText("<price>");

        jTextField14.setText("2");
   

        javax.swing.GroupLayout jPanel82Layout = new javax.swing.GroupLayout(jPanel82);
        jPanel82.setLayout(jPanel82Layout);
        jPanel82Layout.setHorizontalGroup(
            jPanel82Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel82Layout.createSequentialGroup()
                .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel82Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel91)
                    .addComponent(jLabel92))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel82Layout.setVerticalGroup(
            jPanel82Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel82Layout.createSequentialGroup()
                .addComponent(jLabel91)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel82Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel92)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel124.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/mystery.png"))); // NOI18N

        javax.swing.GroupLayout jPanel81Layout = new javax.swing.GroupLayout(jPanel81);
        jPanel81.setLayout(jPanel81Layout);
        jPanel81Layout.setHorizontalGroup(
            jPanel81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel82, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel81Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel124)
                .addGap(41, 41, 41))
        );
        jPanel81Layout.setVerticalGroup(
            jPanel81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel81Layout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addComponent(jLabel124)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel82, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel83.setPreferredSize(new java.awt.Dimension(140, 140));

        jPanel84.setBackground(new java.awt.Color(27, 27, 27));

        jLabel93.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel93.setForeground(new java.awt.Color(242, 242, 242));
        jLabel93.setText("<Name>");

        jLabel94.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel94.setForeground(new java.awt.Color(242, 242, 242));
        jLabel94.setText("<price>");

        jTextField15.setText("3");
    

        javax.swing.GroupLayout jPanel84Layout = new javax.swing.GroupLayout(jPanel84);
        jPanel84.setLayout(jPanel84Layout);
        jPanel84Layout.setHorizontalGroup(
            jPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel84Layout.createSequentialGroup()
                .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel93)
                    .addComponent(jLabel94))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel84Layout.setVerticalGroup(
            jPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel84Layout.createSequentialGroup()
                .addComponent(jLabel93)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel94)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel125.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/mystery.png"))); // NOI18N

        javax.swing.GroupLayout jPanel83Layout = new javax.swing.GroupLayout(jPanel83);
        jPanel83.setLayout(jPanel83Layout);
        jPanel83Layout.setHorizontalGroup(
            jPanel83Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel84, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel83Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel125)
                .addGap(44, 44, 44))
        );
        jPanel83Layout.setVerticalGroup(
            jPanel83Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel83Layout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addComponent(jLabel125)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel84, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel85.setPreferredSize(new java.awt.Dimension(140, 140));

        jPanel86.setBackground(new java.awt.Color(27, 27, 27));

        jLabel95.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel95.setForeground(new java.awt.Color(242, 242, 242));
        jLabel95.setText("<Name>");

        jLabel96.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel96.setForeground(new java.awt.Color(242, 242, 242));
        jLabel96.setText("<price>");

        jTextField17.setText("4");
  

        javax.swing.GroupLayout jPanel86Layout = new javax.swing.GroupLayout(jPanel86);
        jPanel86.setLayout(jPanel86Layout);
        jPanel86Layout.setHorizontalGroup(
            jPanel86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel86Layout.createSequentialGroup()
                .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel95)
                    .addComponent(jLabel96))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel86Layout.setVerticalGroup(
            jPanel86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel86Layout.createSequentialGroup()
                .addComponent(jLabel95)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel96)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        jLabel126.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/mystery.png"))); // NOI18N

        javax.swing.GroupLayout jPanel85Layout = new javax.swing.GroupLayout(jPanel85);
        jPanel85.setLayout(jPanel85Layout);
        jPanel85Layout.setHorizontalGroup(
            jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel86, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel85Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel126)
                .addGap(42, 42, 42))
        );
        jPanel85Layout.setVerticalGroup(
            jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel85Layout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addComponent(jLabel126)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel86, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel87.setPreferredSize(new java.awt.Dimension(140, 140));

        jPanel88.setBackground(new java.awt.Color(27, 27, 27));

        jLabel97.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel97.setForeground(new java.awt.Color(242, 242, 242));
        jLabel97.setText("<Name>");

        jLabel98.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel98.setForeground(new java.awt.Color(242, 242, 242));
        jLabel98.setText("<price>");

        jTextField16.setText("5");
   

        javax.swing.GroupLayout jPanel88Layout = new javax.swing.GroupLayout(jPanel88);
        jPanel88.setLayout(jPanel88Layout);
        jPanel88Layout.setHorizontalGroup(
            jPanel88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel88Layout.createSequentialGroup()
                .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel97)
                    .addComponent(jLabel98))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel88Layout.setVerticalGroup(
            jPanel88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel88Layout.createSequentialGroup()
                .addComponent(jLabel97)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel98)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel127.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/mystery.png"))); // NOI18N

        javax.swing.GroupLayout jPanel87Layout = new javax.swing.GroupLayout(jPanel87);
        jPanel87.setLayout(jPanel87Layout);
        jPanel87Layout.setHorizontalGroup(
            jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel88, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel87Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel127)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel87Layout.setVerticalGroup(
            jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel87Layout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addComponent(jLabel127)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel88, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel89.setPreferredSize(new java.awt.Dimension(140, 140));

        jPanel90.setBackground(new java.awt.Color(27, 27, 27));

        jLabel99.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel99.setForeground(new java.awt.Color(242, 242, 242));
        jLabel99.setText("<Name>");

        jLabel100.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel100.setForeground(new java.awt.Color(242, 242, 242));
        jLabel100.setText("<price>");

        jTextField18.setText("6");
  

        javax.swing.GroupLayout jPanel90Layout = new javax.swing.GroupLayout(jPanel90);
        jPanel90.setLayout(jPanel90Layout);
        jPanel90Layout.setHorizontalGroup(
            jPanel90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel90Layout.createSequentialGroup()
                .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel99)
                    .addComponent(jLabel100))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel90Layout.setVerticalGroup(
            jPanel90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel90Layout.createSequentialGroup()
                .addComponent(jLabel99)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel100)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel129.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/mystery.png"))); // NOI18N

        javax.swing.GroupLayout jPanel89Layout = new javax.swing.GroupLayout(jPanel89);
        jPanel89.setLayout(jPanel89Layout);
        jPanel89Layout.setHorizontalGroup(
            jPanel89Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel90, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel89Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel129)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel89Layout.setVerticalGroup(
            jPanel89Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel89Layout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addComponent(jLabel129)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel90, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel91.setPreferredSize(new java.awt.Dimension(140, 140));

        jPanel92.setBackground(new java.awt.Color(27, 27, 27));

        jLabel101.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel101.setForeground(new java.awt.Color(242, 242, 242));
        jLabel101.setText("<Name>");

        jLabel102.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel102.setForeground(new java.awt.Color(242, 242, 242));
        jLabel102.setText("<price>");

        jTextField20.setText("7");
    

        javax.swing.GroupLayout jPanel92Layout = new javax.swing.GroupLayout(jPanel92);
        jPanel92.setLayout(jPanel92Layout);
        jPanel92Layout.setHorizontalGroup(
            jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel92Layout.createSequentialGroup()
                .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel101)
                    .addComponent(jLabel102))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel92Layout.setVerticalGroup(
            jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel92Layout.createSequentialGroup()
                .addComponent(jLabel101)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel102)
                    .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        jLabel122.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/mystery.png"))); // NOI18N

        javax.swing.GroupLayout jPanel91Layout = new javax.swing.GroupLayout(jPanel91);
        jPanel91.setLayout(jPanel91Layout);
        jPanel91Layout.setHorizontalGroup(
            jPanel91Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel92, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel91Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel122)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel91Layout.setVerticalGroup(
            jPanel91Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel91Layout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addComponent(jLabel122)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel92, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel93.setPreferredSize(new java.awt.Dimension(140, 140));

        jPanel94.setBackground(new java.awt.Color(27, 27, 27));

        jLabel103.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel103.setForeground(new java.awt.Color(242, 242, 242));
        jLabel103.setText("<Name>");

        jLabel104.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel104.setForeground(new java.awt.Color(242, 242, 242));
        jLabel104.setText("<price>");

        jTextField19.setText("8");
  

        javax.swing.GroupLayout jPanel94Layout = new javax.swing.GroupLayout(jPanel94);
        jPanel94.setLayout(jPanel94Layout);
        jPanel94Layout.setHorizontalGroup(
            jPanel94Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel94Layout.createSequentialGroup()
                .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel94Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel103)
                    .addComponent(jLabel104))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel94Layout.setVerticalGroup(
            jPanel94Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel94Layout.createSequentialGroup()
                .addComponent(jLabel103)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel94Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel104)
                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel128.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/mystery.png"))); // NOI18N

        javax.swing.GroupLayout jPanel93Layout = new javax.swing.GroupLayout(jPanel93);
        jPanel93.setLayout(jPanel93Layout);
        jPanel93Layout.setHorizontalGroup(
            jPanel93Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel94, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel93Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel128)
                .addGap(44, 44, 44))
        );
        jPanel93Layout.setVerticalGroup(
            jPanel93Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel93Layout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addComponent(jLabel128)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel94, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel95.setPreferredSize(new java.awt.Dimension(140, 140));

        jPanel96.setBackground(new java.awt.Color(27, 27, 27));

        jLabel105.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel105.setForeground(new java.awt.Color(242, 242, 242));
        jLabel105.setText("<Name>");

        jLabel106.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel106.setForeground(new java.awt.Color(242, 242, 242));
        jLabel106.setText("<price>");

        jTextField21.setText("9");

        javax.swing.GroupLayout jPanel96Layout = new javax.swing.GroupLayout(jPanel96);
        jPanel96.setLayout(jPanel96Layout);
        jPanel96Layout.setHorizontalGroup(
            jPanel96Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel96Layout.createSequentialGroup()
                .addGroup(jPanel96Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel96Layout.createSequentialGroup()
                        .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel106))
                    .addGroup(jPanel96Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel105)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel96Layout.setVerticalGroup(
            jPanel96Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel96Layout.createSequentialGroup()
                .addComponent(jLabel105)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel96Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel106)
                    .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel131.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/mystery.png"))); // NOI18N

        javax.swing.GroupLayout jPanel95Layout = new javax.swing.GroupLayout(jPanel95);
        jPanel95.setLayout(jPanel95Layout);
        jPanel95Layout.setHorizontalGroup(
            jPanel95Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel96, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel95Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel131)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel95Layout.setVerticalGroup(
            jPanel95Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel95Layout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addComponent(jLabel131)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel96, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel97.setPreferredSize(new java.awt.Dimension(140, 140));

        jPanel98.setBackground(new java.awt.Color(27, 27, 27));

        jLabel107.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel107.setForeground(new java.awt.Color(242, 242, 242));
        jLabel107.setText("<Name>");

        jLabel108.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel108.setForeground(new java.awt.Color(242, 242, 242));
        jLabel108.setText("<price>");

        jTextField22.setText("10");


        javax.swing.GroupLayout jPanel98Layout = new javax.swing.GroupLayout(jPanel98);
        jPanel98.setLayout(jPanel98Layout);
        jPanel98Layout.setHorizontalGroup(
            jPanel98Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel98Layout.createSequentialGroup()
                .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel98Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel107)
                    .addComponent(jLabel108))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel98Layout.setVerticalGroup(
            jPanel98Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel98Layout.createSequentialGroup()
                .addComponent(jLabel107)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel98Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel108)
                    .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel132.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/mystery.png"))); // NOI18N

        javax.swing.GroupLayout jPanel97Layout = new javax.swing.GroupLayout(jPanel97);
        jPanel97.setLayout(jPanel97Layout);
        jPanel97Layout.setHorizontalGroup(
            jPanel97Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel98, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel97Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel132)
                .addGap(43, 43, 43))
        );
        jPanel97Layout.setVerticalGroup(
            jPanel97Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel97Layout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addComponent(jLabel132)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel98, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel99.setPreferredSize(new java.awt.Dimension(140, 140));

        jPanel100.setBackground(new java.awt.Color(27, 27, 27));

        jLabel109.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel109.setForeground(new java.awt.Color(242, 242, 242));
        jLabel109.setText("<Name>");

        jLabel110.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel110.setForeground(new java.awt.Color(242, 242, 242));
        jLabel110.setText("<price>");

        jTextField23.setText("11");


        javax.swing.GroupLayout jPanel100Layout = new javax.swing.GroupLayout(jPanel100);
        jPanel100.setLayout(jPanel100Layout);
        jPanel100Layout.setHorizontalGroup(
            jPanel100Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel100Layout.createSequentialGroup()
                .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel100Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel109)
                    .addComponent(jLabel110))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel100Layout.setVerticalGroup(
            jPanel100Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel100Layout.createSequentialGroup()
                .addComponent(jLabel109)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel100Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel110)
                    .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel130.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/mystery.png"))); // NOI18N

        javax.swing.GroupLayout jPanel99Layout = new javax.swing.GroupLayout(jPanel99);
        jPanel99.setLayout(jPanel99Layout);
        jPanel99Layout.setHorizontalGroup(
            jPanel99Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel100, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel99Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel130)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel99Layout.setVerticalGroup(
            jPanel99Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel99Layout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addComponent(jLabel130)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel100, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel49Layout = new javax.swing.GroupLayout(jPanel49);
        jPanel49.setLayout(jPanel49Layout);
        jPanel49Layout.setHorizontalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel49Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel79, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel87, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel81, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel89, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel49Layout.createSequentialGroup()
                        .addComponent(jPanel83, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jPanel85, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel49Layout.createSequentialGroup()
                        .addComponent(jPanel91, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel93, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel49Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel95, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jPanel97, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jPanel99, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135))
        );
        jPanel49Layout.setVerticalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel49Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel85, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel83, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel81, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel79, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel87, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel89, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel91, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel93, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel97, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel99, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel95, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(92, Short.MAX_VALUE))
        );

        jPanel58.setBackground(new java.awt.Color(255, 163, 26));

        jButton26.setText("2");

        jButton27.setText("1");

        jButton28.setText("3");

        jButton29.setText("4");

        jButton30.setText("5");

        jButton32.setText("6");

        jButton33.setText("7");

        jButton34.setText("8");

        jButton35.setText("9");

        jButton36.setText("10");

        jButton37.setText("11");

        jButton38.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton38.setText("Insert Currency");

        betaTotalMoney1.setText("<Total Money>");

        jButton39.setText("Personalized Coffee!");

        javax.swing.GroupLayout jPanel59Layout = new javax.swing.GroupLayout(jPanel59);
        jPanel59.setLayout(jPanel59Layout);
        jPanel59Layout.setHorizontalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel59Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel59Layout.createSequentialGroup()
                        .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel59Layout.createSequentialGroup()
                        .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel59Layout.createSequentialGroup()
                                    .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel59Layout.createSequentialGroup()
                                    .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel59Layout.createSequentialGroup()
                                    .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(21, 21, 21))))
            .addGroup(jPanel59Layout.createSequentialGroup()
                .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel59Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel59Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(betaTotalMoney1)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel59Layout.setVerticalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel59Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jButton38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(betaTotalMoney1)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jLabel88.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel88.setText("Insert Money");

        jButton40.setText("P10");
        jButton40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton40MouseClicked(evt);
            }
        });

        jButton42.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton42.setText("Click Done!");
        jButton42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton42MouseClicked(evt);
            }
        });

        jButton43.setText("P1");
        jButton43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton43MouseClicked(evt);
            }
        });

        jButton44.setText("P5");
        jButton44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton44MouseClicked(evt);
            }
        });

        jButton45.setText("P20");
        jButton45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton45MouseClicked(evt);
            }
        });

        jButton46.setText("P50");
        jButton46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton46MouseClicked(evt);
            }
        });

        jButton47.setText("P100");
        jButton47.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton47MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel58Layout = new javax.swing.GroupLayout(jPanel58);
        jPanel58.setLayout(jPanel58Layout);
        jPanel58Layout.setHorizontalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel58Layout.createSequentialGroup()
                .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel58Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel58Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jPanel59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel58Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel88))
                    .addGroup(jPanel58Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel58Layout.createSequentialGroup()
                                .addComponent(jButton45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton47))
                            .addGroup(jPanel58Layout.createSequentialGroup()
                                .addComponent(jButton43)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(22, 22, 22))
        );
        jPanel58Layout.setVerticalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel58Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanel59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel88)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton47, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton42)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel60.setBackground(new java.awt.Color(128, 128, 128));

        javax.swing.GroupLayout jPanel60Layout = new javax.swing.GroupLayout(jPanel60);
        jPanel60.setLayout(jPanel60Layout);
        jPanel60Layout.setHorizontalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 629, Short.MAX_VALUE)
        );
        jPanel60Layout.setVerticalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 71, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout beta2Layout = new javax.swing.GroupLayout(beta2);
        beta2.setLayout(beta2Layout);
        beta2Layout.setHorizontalGroup(
            beta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(beta2Layout.createSequentialGroup()
                .addGroup(beta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(beta2Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jPanel60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(beta2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jPanel49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        beta2Layout.setVerticalGroup(
            beta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(beta2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(beta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        MainPanel.addTab("tab6", beta2);

        beta3.setBackground(new java.awt.Color(27, 27, 27));

        jPanel50.setBackground(new java.awt.Color(255, 163, 26));

        tableRVM.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Slot", "Name", "Price", "Calories", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableRVM.setGridColor(new java.awt.Color(51, 51, 51));
        tableRVM.setRowHeight(50);
        tableRVM.setSelectionBackground(new java.awt.Color(102, 102, 102));
        tableRVM.setShowGrid(true);

        jScrollPane3.setViewportView(tableRVM);
        if (tableRVM.getColumnModel().getColumnCount() > 0) {
            tableRVM.getColumnModel().getColumn(0).setResizable(false);
            tableRVM.getColumnModel().getColumn(1).setResizable(false);
            tableRVM.getColumnModel().getColumn(2).setResizable(false);
            tableRVM.getColumnModel().getColumn(3).setResizable(false);
            tableRVM.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout jPanel50Layout = new javax.swing.GroupLayout(jPanel50);
        jPanel50.setLayout(jPanel50Layout);
        jPanel50Layout.setHorizontalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel50Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel50Layout.setVerticalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel50Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel67.setBackground(new java.awt.Color(128, 128, 128));

        javax.swing.GroupLayout jPanel67Layout = new javax.swing.GroupLayout(jPanel67);
        jPanel67.setLayout(jPanel67Layout);
        jPanel67Layout.setHorizontalGroup(
            jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 629, Short.MAX_VALUE)
        );
        jPanel67Layout.setVerticalGroup(
            jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 71, Short.MAX_VALUE)
        );

        jPanel48.setBackground(new java.awt.Color(255, 163, 26));

        jButton68.setText("2");
        jButton68.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton68MouseClicked(evt);
            }
        });


        jButton69.setText("1");
        jButton69.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton69MouseClicked(evt);
            }
        });


        jButton70.setText("3");
        jButton70.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton70MouseClicked(evt);
            }
        });


        jButton71.setText("4");
        jButton71.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton71MouseClicked(evt);
            }
        });


        jButton72.setText("5");
        jButton72.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton72MouseClicked(evt);
            }
        });


        jButton73.setText("6");
        jButton73.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton73MouseClicked(evt);
            }
        });


        jButton74.setText("7");
        jButton74.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton74MouseClicked(evt);
            }
        });


        jButton75.setText("8");
        jButton75.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton75MouseClicked(evt);
            }
        });


        jButton76.setText("9");
        jButton76.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton76MouseClicked(evt);
            }
        });
 

        jButton77.setText("10");
        jButton77.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton77MouseClicked(evt);
            }
        });


        jButton78.setText("11");
        jButton78.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton78MouseClicked(evt);
            }
        });


        jButton79.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton79.setText("Insert Currency");
        jButton79.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton79MouseClicked(evt);
            }
        });
 

        betaTotalMoney3.setText("<Total Money>");

        jButton81.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton81.setText("Exit");
        jButton81.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton81MouseClicked(evt);
            }
        });


        Text.setColumns(20);
        Text.setRows(5);
        jScrollPane5.setViewportView(Text);

        javax.swing.GroupLayout jPanel51Layout = new javax.swing.GroupLayout(jPanel51);
        jPanel51.setLayout(jPanel51Layout);
        jPanel51Layout.setHorizontalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel51Layout.createSequentialGroup()
                .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel51Layout.createSequentialGroup()
                        .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel51Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel51Layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(betaTotalMoney3))
                                    .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButton81, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton79, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel51Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel51Layout.createSequentialGroup()
                                            .addComponent(jButton74, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jButton75, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jButton76, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel51Layout.createSequentialGroup()
                                            .addComponent(jButton71, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jButton72, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jButton73, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel51Layout.createSequentialGroup()
                                            .addComponent(jButton69, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jButton68, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jButton70, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel51Layout.createSequentialGroup()
                                        .addComponent(jButton77, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton78, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(25, 25, 25)))))
                        .addGap(0, 34, Short.MAX_VALUE))
                    .addGroup(jPanel51Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel51Layout.setVerticalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel51Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton68, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton69, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton70, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton72, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton71, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton73, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton75, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton74, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton76, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton77, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton78, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton79)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(betaTotalMoney3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton81)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton60.setText("P1");
        jButton60.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton60MouseClicked(evt);
            }
        });

        jButton61.setText("P5");
        jButton61.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton61MouseClicked(evt);
            }
        });


        jButton62.setText("P10");
        jButton62.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton62MouseClicked(evt);
            }
        });


        jButton63.setText("P100");
        jButton63.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton63MouseClicked(evt);
            }
        });


        jButton64.setText("P50");
        jButton64.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton64MouseClicked(evt);
            }
        });


        jButton65.setText("P20");
        jButton65.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton65MouseClicked(evt);
            }
        });

        jButton66.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton66.setText("Click Done!");
        jButton66.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton66MouseClicked(evt);
            }
        });
        

        jLabel111.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel111.setText("Insert Money");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton66, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel13Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel13Layout.createSequentialGroup()
                            .addGap(64, 64, 64)
                            .addComponent(jLabel111))
                        .addGroup(jPanel13Layout.createSequentialGroup()
                            .addComponent(jButton65, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton64, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton63))
                        .addGroup(jPanel13Layout.createSequentialGroup()
                            .addComponent(jButton60)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton61, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addContainerGap()))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(162, Short.MAX_VALUE)
                .addComponent(jButton66)
                .addContainerGap())
            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel13Layout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addComponent(jLabel111)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton61, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton62, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton60, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton64, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton63, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton65, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(38, Short.MAX_VALUE)))
        );

        Regular_Check.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Regular_Check.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Regular_Done.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Regular_Done.setText("Click If Done!");
        Regular_Done.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Regular_DoneMouseClicked(evt);
            }
        });
        

        javax.swing.GroupLayout jPanel48Layout = new javax.swing.GroupLayout(jPanel48);
        jPanel48.setLayout(jPanel48Layout);
        jPanel48Layout.setHorizontalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addGroup(jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel48Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Regular_Check)
                            .addComponent(jPanel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel48Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(Regular_Done)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel48Layout.setVerticalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Regular_Check, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Regular_Done)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout beta3Layout = new javax.swing.GroupLayout(beta3);
        beta3.setLayout(beta3Layout);
        beta3Layout.setHorizontalGroup(
            beta3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(beta3Layout.createSequentialGroup()
                .addGroup(beta3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(beta3Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jPanel67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(beta3Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jPanel50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jPanel48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        beta3Layout.setVerticalGroup(
            beta3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(beta3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(beta3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel48, javax.swing.GroupLayout.PREFERRED_SIZE, 690, Short.MAX_VALUE)
                    .addComponent(jPanel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        MainPanel.addTab("tab6", beta3);

        getContentPane().add(MainPanel);
        MainPanel.setBounds(0, -34, 1163, 830);

        setBounds(0, 0, 1143, 799);
    }// </editor-fold>//GEN-END:initComponents

    public void setMoneyButtons() {
        if(regularVM != null){
            ones.setText(Integer.toString(regularVM.getMoneyBox().getnOnes()));
            fives.setText(Integer.toString(regularVM.getMoneyBox().getnFives()));
            tens.setText(Integer.toString(regularVM.getMoneyBox().getnTens()));
            twenty.setText(Integer.toString(regularVM.getMoneyBox().getnTwenties()));
            fifty.setText(Integer.toString(regularVM.getMoneyBox().getnFifties()));
            hundred.setText(Integer.toString(regularVM.getMoneyBox().getnHundreds()));
        }
        else {
            ones.setText(Integer.toString(specialVM.getMoneyBox().getnOnes()));
            fives.setText(Integer.toString(specialVM.getMoneyBox().getnFives()));
            tens.setText(Integer.toString(specialVM.getMoneyBox().getnTens()));
            twenty.setText(Integer.toString(specialVM.getMoneyBox().getnTwenties()));
            fifty.setText(Integer.toString(specialVM.getMoneyBox().getnFifties()));
            hundred.setText(Integer.toString(specialVM.getMoneyBox().getnHundreds()));
        }
        
    }    
    
    public JLabel getMaxQuantityDisplay() {
        return maxQuantityDisplay;
    }
    
   public boolean isConvertable(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    private void exitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitButtonMouseClicked

    private void createButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createButtonMouseClicked
        MainPanel.setSelectedIndex(1);
        regularVM = null;
        specialVM = null;
        jButton59.setText("");
        jButton48.setText("");
        jButton49.setText("");
        jButton50.setText("");
        jButton51.setText("");
        jButton52.setText("");
        jButton53.setText("");
        jButton54.setText("");
        jButton55.setText("");
        jButton56.setText("");
        jButton57.setText("");
    }//GEN-LAST:event_createButtonMouseClicked

    private void betaButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_betaButtonMouseClicked
        if(regularVM != null || specialVM != null)
            MainPanel.setSelectedIndex(2);
        else
            JOptionPane.showMessageDialog(this, "Please Create a Vending Machine First", "ERROR!", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_betaButtonMouseClicked

    private void createExitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createExitButtonMouseClicked
        MainPanel.setSelectedIndex(0);
    }//GEN-LAST:event_createExitButtonMouseClicked

    


    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        
        optionsTabs.setSelectedIndex(1);
        displaySite.setSelectedIndex(1);
    }//GEN-LAST:event_jPanel2MouseClicked

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
        
        optionsTabs.setSelectedIndex(0);
        displaySite.setSelectedIndex(0);
    }//GEN-LAST:event_jPanel7MouseClicked

    private void jPanel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseClicked
        displaySite.setSelectedIndex(4);
    }//GEN-LAST:event_jPanel9MouseClicked

    private void jPanel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseClicked
        displaySite.setSelectedIndex(3);
    }//GEN-LAST:event_jPanel10MouseClicked

    private void jPanel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseClicked
        displaySite.setSelectedIndex(2);
    }//GEN-LAST:event_jPanel11MouseClicked




    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int N = -1;
        int M = -1;
        
        if(!tfRow.getText().isEmpty() && !tfCol.getText().isEmpty()) {
            N = Integer.parseInt(tfRow.getText());
            M = Integer.parseInt(tfCol.getText());
        }
        
        if(N == -1|| M == -1) {
            JOptionPane.showMessageDialog(this, "Please Enter All Fields", "Try Again!", JOptionPane.ERROR_MESSAGE);
        }
        else if(N < 11 || N > 20 || M < 10 || M > 15) {
            JOptionPane.showMessageDialog(this, "Please Enter Valid Dimensions", "Try Again!", JOptionPane.ERROR_MESSAGE);
        }
        else {
            //creates a regularVM
            regularVM = new RegularVM(N, M);
            specialVM = null;
            DefaultTableModel model = (DefaultTableModel) itemTable.getModel();
            
            while(model.getRowCount() != 0) {
                model.removeRow(0);
            }
            
            for(int i = 0; i < N; i++) {
                model.addRow(new Object[]{null});
                itemTable.setValueAt(i + 1, i, 0);
                itemTable.setValueAt("No Item", i, 1);
                
            }
            
            maxQuantityDisplay.setText("Max Quantity is " + M);
            maxQuantityDisplay1.setText("Max Quantity is " + M);
            JOptionPane.showMessageDialog(null, "Succesfully Created Regular Vending Machine");
            optionsTabs.setSelectedIndex(0);
            displaySite.setSelectedIndex(0);
           
        }
        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void tfRowKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfRowKeyPressed
         char c = evt.getKeyChar();
        
        if(Character.isLetter(c)) {
            tfRow.setEditable(false);
        }
        else {
            tfRow.setEditable(true);
        }
           
    }//GEN-LAST:event_tfRowKeyPressed

    private void tfColKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfColKeyPressed
        char c = evt.getKeyChar();
        
        if(Character.isLetter(c)) {
            tfCol.setEditable(false);
        }
        else {
            tfCol.setEditable(true);
        }
    }//GEN-LAST:event_tfColKeyPressed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        //creates a regularVM
        regularVM = new RegularVM();
        specialVM = null;
        JOptionPane.showMessageDialog(null, "Succesfully Created Regular Vending Machine");
        maxQuantityDisplay.setText("Max Quantity is " + 10);
        maxQuantityDisplay1.setText("Max Quantity is " + 10);
        
        DefaultTableModel model = (DefaultTableModel) itemTable.getModel();
        
        while(model.getRowCount() != 0) {
            model.removeRow(0);
        }
        
        for(int i = 0; i < 11; i++) {
            model.addRow(new Object[]{0});
            itemTable.setValueAt("No Item", i, 1);
            itemTable.setValueAt(i + 1, i, 0);
        }
        
        optionsTabs.setSelectedIndex(0);
        displaySite.setSelectedIndex(0);
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ItemLoader loader = new ItemLoader();
        regularVM = new RegularVM();
        specialVM = null;
        maxQuantityDisplay.setText("Max Quantity is " + 10);
        maxQuantityDisplay1.setText("Max Quantity is " + 10);
        
        loader.loadCoffeeItems(regularVM.getSlotClass());
        regularVM.getSummaryReceipt().setStartingInventory(regularVM.getSlotClass());
        DefaultTableModel model = (DefaultTableModel) itemTable.getModel();
        
        
        while(model.getRowCount() != 0) {
            model.removeRow(0);
        }
       
        
        for(int i = 0; i < 11; i++) {
            model.addRow(new Object[] {null});
            itemTable.setValueAt(i + 1, i, 0);
            itemTable.setValueAt(regularVM.getItemName(i), i, 1);
            itemTable.setValueAt(regularVM.getItemPrice(i), i, 2);
            itemTable.setValueAt(regularVM.getItemQuantity(WIDTH), i, 3);
            itemTable.setValueAt(regularVM.getSlots(i).getItem().getdCalories(), i, 4);
        }
        regularVM.getSummaryReceipt().setStartingInventory(regularVM.getSlotClass());
        JOptionPane.showMessageDialog(null, "Succesfully Loaded Regular Cafe Vending Machine");
        optionsTabs.setSelectedIndex(0);
        displaySite.setSelectedIndex(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        optionsTabs.setSelectedIndex(2);
        displaySite.setSelectedIndex(0);
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jPanel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel16MouseClicked
        milk.setVisible(true);
        displaySite.setSelectedIndex(6);
        con.setVisible(false);
        topping.setVisible(false);
        syrup.setVisible(false);
        specialVM = new SpecialVM();
        count = 0;
    }//GEN-LAST:event_jPanel16MouseClicked

    private void jPanel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel17MouseClicked
        displaySite.setSelectedIndex(7);
    }//GEN-LAST:event_jPanel17MouseClicked

    private void jPanel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel18MouseClicked
        
        optionsTabs.setSelectedIndex(0);
        displaySite.setSelectedIndex(0);
    }//GEN-LAST:event_jPanel18MouseClicked



    private void tfCol1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCol1KeyPressed
        
         char c = evt.getKeyChar();
        
        if(Character.isLetter(c)) {
            tfCol1.setEditable(false);
        }
        else {
            tfCol1.setEditable(true);
        }
    }//GEN-LAST:event_tfCol1KeyPressed



    private void tfRow1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfRow1KeyPressed
        
         char c = evt.getKeyChar();
        
        if(Character.isLetter(c)) {
            tfRow1.setEditable(false);
        }
        else {
            tfRow1.setEditable(true);
        }
    }//GEN-LAST:event_tfRow1KeyPressed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        
        ItemLoader loader = new ItemLoader();
        specialVM = new SpecialVM();
        regularVM = null;
        maxQuantityDisplay.setText("Max Quantity is " + 10);
        maxQuantityDisplay1.setText("Max Quantity is " + 10);
        
        
        
        //load ingredients
        loader.loadCoffeeItems(specialVM.getSlotClass());
        specialVM.getSummaryReceipt().setStartingInventory(specialVM.getSlotClass());
        DefaultTableModel model = (DefaultTableModel) itemTable.getModel();
        
        
        while(model.getRowCount() != 0) {
            model.removeRow(0);
        }
       
        
        for(int i = 0; i < 11; i++) {
            model.addRow(new Object[] {null});
            itemTable.setValueAt(i + 1, i, 0);
            itemTable.setValueAt(specialVM.getItemName(i), i, 1);
            itemTable.setValueAt(specialVM.getItemPrice(i), i, 2);
            itemTable.setValueAt(specialVM.getItemQuantity(WIDTH), i, 3);
            itemTable.setValueAt(specialVM.getSlots(i).getItem().getdCalories(), i, 4);
        }
        specialVM.getSummaryReceipt().setStartingInventory(specialVM.getSlotClass());
        //generate message
        JOptionPane.showMessageDialog(null, "Succesfully Loaded Special Cafe Vending Machine");
        optionsTabs.setSelectedIndex(0);
        displaySite.setSelectedIndex(0);
        
        jLabel90.setText(specialVM.getItemName(0));
        jLabel89.setText("P" + Integer.toString(specialVM.getSlots(0).getnPrice()));
        
        jLabel91.setText(specialVM.getItemName(1));
        jLabel92.setText("P" + Integer.toString(specialVM.getSlots(1).getnPrice()));
        
        jLabel93.setText(specialVM.getItemName(2));
        jLabel94.setText("P" + Integer.toString(specialVM.getSlots(2).getnPrice()));
        
        jLabel95.setText(specialVM.getItemName(3));
        jLabel96.setText("P" + Integer.toString(specialVM.getSlots(3).getnPrice()));
        
        jLabel97.setText(specialVM.getItemName(4));
        jLabel98.setText("P" + Integer.toString(specialVM.getSlots(4).getnPrice()));
        
        jLabel99.setText(specialVM.getItemName(5));
        jLabel100.setText("P" + Integer.toString(specialVM.getSlots(5).getnPrice()));
        
        jLabel101.setText(specialVM.getItemName(6));
        jLabel102.setText("P" + Integer.toString(specialVM.getSlots(6).getnPrice()));
        
        jLabel103.setText(specialVM.getItemName(7));
        jLabel104.setText("P" + Integer.toString(specialVM.getSlots(7).getnPrice()));
        
        jLabel105.setText(specialVM.getItemName(8));
        jLabel106.setText("P" + Integer.toString(specialVM.getSlots(8).getnPrice()));
        
        jLabel107.setText(specialVM.getItemName(9));
        jLabel108.setText("P" + Integer.toString(specialVM.getSlots(9).getnPrice()));
        
        jLabel109.setText(specialVM.getItemName(10));
        jLabel110.setText("P" + Integer.toString(specialVM.getSlots(10).getnPrice()));
        
        jLabel67.setText(specialVM.getItemName(0));
        jLabel60.setText("P" + Integer.toString(specialVM.getSlots(0).getnPrice()));
        
        jLabel68.setText(specialVM.getItemName(1));
        jLabel69.setText("P" + Integer.toString(specialVM.getSlots(1).getnPrice()));
        
        jLabel70.setText(specialVM.getItemName(2));
        jLabel71.setText("P" + Integer.toString(specialVM.getSlots(2).getnPrice()));
        
        jLabel85.setText(specialVM.getItemName(3));
        jLabel86.setText("P" + Integer.toString(specialVM.getSlots(3).getnPrice()));
        
        jLabel72.setText(specialVM.getItemName(4));
        jLabel73.setText("P" + Integer.toString(specialVM.getSlots(4).getnPrice()));
        
        jLabel74.setText(specialVM.getItemName(5));
        jLabel75.setText("P" + Integer.toString(specialVM.getSlots(5).getnPrice()));
        
        jLabel76.setText(specialVM.getItemName(6));
        jLabel77.setText("P" + Integer.toString(specialVM.getSlots(6).getnPrice()));
        
        jLabel78.setText(specialVM.getItemName(7));
        jLabel79.setText("P" + Integer.toString(specialVM.getSlots(7).getnPrice()));
        
        jLabel84.setText(specialVM.getItemName(8));
        jLabel87.setText("P" + Integer.toString(specialVM.getSlots(8).getnPrice()));
        
        jLabel82.setText(specialVM.getItemName(9));
        jLabel83.setText("P" + Integer.toString(specialVM.getSlots(9).getnPrice()));
        
        jLabel80.setText(specialVM.getItemName(10));
        jLabel81.setText("P" + Integer.toString(specialVM.getSlots(10).getnPrice()));
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        int N = -1;
        int M = -1;
        
        if(!tfRow1.getText().isEmpty() && !tfCol1.getText().isEmpty()) {
            N = Integer.parseInt(tfRow1.getText());
            M = Integer.parseInt(tfCol1.getText());
        }
        
        if(N == -1|| M == -1) {
            JOptionPane.showMessageDialog(this, "Please Enter All Fields", "Try Again!", JOptionPane.ERROR_MESSAGE);
        }
        else if(N < 11 || N > 20 || M < 10 || M > 15) {
            JOptionPane.showMessageDialog(this, "Please Enter Valid Dimensions", "Try Again!", JOptionPane.ERROR_MESSAGE);
        }
        else {
            //creates a SpecialrVM
            specialVM = new SpecialVM(N, M);
            regularVM = null;
            
            DefaultTableModel model = (DefaultTableModel) itemTable.getModel();
            
            while(model.getRowCount() != 0) {
                model.removeRow(0);
            }
            
            for(int i = 0; i < N; i++) {
                model.addRow(new Object[]{null});
                itemTable.setValueAt(i + 1, i, 0);
                itemTable.setValueAt("No Item", i, 1);
                
            }
            
            maxQuantityDisplay.setText("Max Quantity is " +  M);
            maxQuantityDisplay1.setText("Max Quantity is " + M);
            JOptionPane.showMessageDialog(null, "Succesfully Created Special Vending Machine");
            optionsTabs.setSelectedIndex(0);
            displaySite.setSelectedIndex(0);
           
        }
    }//GEN-LAST:event_jButton3MouseClicked

    private void jPanel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel27MouseClicked
        
        MainPanel.setSelectedIndex(0);
    }//GEN-LAST:event_jPanel27MouseClicked

    
    private void jPanel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel23MouseClicked
        
        if(specialVM != null) {
            MainPanel.setSelectedIndex(4);
            SVM_Espresso.setVisible(false);
            SVM_Personalized.setVisible(false);
            SVM_Personalized1.setVisible(false);
            SVM_Personalized2.setVisible(false);
            defaulttab.setVisible(false);
            jTextField29.setVisible(false);
            temp_slot_quantity = new int[specialVM.getnSlotCapacity()];
            jButton58.setVisible(false);
            if(specialVM.getSlots(0) != null) {
        jLabel90.setText(specialVM.getItemName(0));
        jLabel89.setText("P" + Integer.toString(specialVM.getSlots(0).getnPrice()));
        }
        else {
            jLabel90.setText("Unavailable");
            jLabel89.setText(" ");
        }
        if(specialVM.getSlots(1) != null) {
        jLabel91.setText(specialVM.getItemName(1));
        jLabel92.setText("P" + Integer.toString(specialVM.getSlots(1).getnPrice()));
        }
        else{
            jLabel91.setText("Unavailable");
            jLabel92.setText(" ");
        }
        
        if(specialVM.getSlots(2) != null) {
        jLabel93.setText(specialVM.getItemName(2));
        jLabel94.setText("P" + Integer.toString(specialVM.getSlots(2).getnPrice()));
        }
        else {
            jLabel93.setText("Unavailable");
            jLabel94.setText(" ");
        }
        
        if(specialVM.getSlots(3) != null) {
        jLabel95.setText(specialVM.getItemName(3));
        jLabel96.setText("P" + Integer.toString(specialVM.getSlots(3).getnPrice()));
        }
        else {
            jLabel95.setText("Unavailable");
            jLabel96.setText(" ");
        }
        
        if(specialVM.getSlots(4) != null) {
        jLabel97.setText(specialVM.getItemName(4));
        jLabel98.setText("P" + Integer.toString(specialVM.getSlots(4).getnPrice()));
        }
        else{
            jLabel97.setText("Unavailable");
            jLabel98.setText(" ");
        }
        
        if(specialVM.getSlots(5) != null) {
        jLabel99.setText(specialVM.getItemName(5));
        jLabel100.setText("P" + Integer.toString(specialVM.getSlots(5).getnPrice()));
        }
        else{
            jLabel99.setText("Unavailable");
            jLabel100.setText(" ");
        }
        
        if(specialVM.getSlots(6) != null) {
        jLabel101.setText(specialVM.getItemName(6));
        jLabel102.setText("P" + Integer.toString(specialVM.getSlots(6).getnPrice()));
        }
        else{
            jLabel101.setText("Unavailable");
            jLabel102.setText(" ");
        }
        
        if(specialVM.getSlots(7) != null) {
        jLabel103.setText(specialVM.getItemName(7));
        jLabel104.setText("P" + Integer.toString(specialVM.getSlots(7).getnPrice()));
        }
        else {
            jLabel103.setText("Unavailable");
            jLabel104.setText(" ");
        }
        
        if(specialVM.getSlots(8) != null) {
        jLabel105.setText(specialVM.getItemName(8));
        jLabel106.setText("P" + Integer.toString(specialVM.getSlots(8).getnPrice()));
        }
        else{
            jLabel105.setText("Unavailable");
            jLabel106.setText(" ");
        }
        
        if(specialVM.getSlots(9) != null) {
        jLabel107.setText(specialVM.getItemName(9));
        jLabel108.setText("P" + Integer.toString(specialVM.getSlots(9).getnPrice()));
        }
        else{
            jLabel107.setText("Unavailable");
            jLabel108.setText(" ");
        }
           
        if(specialVM.getSlots(10) != null) {
        jLabel109.setText(specialVM.getItemName(10));
        jLabel110.setText("P" + Integer.toString(specialVM.getSlots(10).getnPrice()));
        }
        else{
            jLabel109.setText("Unavailable");
            jLabel110.setText(" ");
        }
        
        
        
        if(specialVM.getSlots(0) != null) {
        jLabel67.setText(specialVM.getItemName(0));
        jLabel60.setText("P" + Integer.toString(specialVM.getSlots(0).getnPrice()));
        }
        else {
            jLabel67.setText("Unavailable");
            jLabel60.setText(" ");
        }
        
        if(specialVM.getSlots(1) != null) {
        jLabel68.setText(specialVM.getItemName(1));
        jLabel69.setText("P" + Integer.toString(specialVM.getSlots(1).getnPrice()));
        }
        else{
            jLabel68.setText("Unavailable");
            jLabel69.setText(" ");
        }
        
        if(specialVM.getSlots(2) != null) {
        jLabel70.setText(specialVM.getItemName(2));
        jLabel71.setText("P" + Integer.toString(specialVM.getSlots(2).getnPrice()));
        }
        else{
            jLabel70.setText("Unavailable");
            jLabel71.setText(" ");
        }
        
        if(specialVM.getSlots(3) != null) {
            jLabel85.setText(specialVM.getItemName(3));
            jLabel86.setText("P" + Integer.toString(specialVM.getSlots(3).getnPrice()));
        }
        else {
            jLabel85.setText("Unavailable");
            jLabel86.setText(" ");
        }
        
        if(specialVM.getSlots(4) != null) {     
        jLabel72.setText(specialVM.getItemName(4));
        jLabel73.setText("P" + Integer.toString(specialVM.getSlots(4).getnPrice()));
        }
        else {
            jLabel72.setText("Unavailable");
            jLabel73.setText(" ");
        }
        
        if(specialVM.getSlots(5) != null) {
        jLabel74.setText(specialVM.getItemName(5));
        jLabel75.setText("P" + Integer.toString(specialVM.getSlots(5).getnPrice()));
        }
        else {
            jLabel74.setText("Unavailable");
            jLabel75.setText(" ");
        }
        
        if(specialVM.getSlots(6) != null) {
        jLabel76.setText(specialVM.getItemName(6));
        jLabel77.setText("P" + Integer.toString(specialVM.getSlots(6).getnPrice()));
        }
        else {
            jLabel76.setText("Unavailable");
            jLabel77.setText(" ");
        }
        
            
        if(specialVM.getSlots(7) != null) {
        jLabel78.setText(specialVM.getItemName(7));
        jLabel79.setText("P" + Integer.toString(specialVM.getSlots(7).getnPrice()));
        }
        else{
         jLabel78.setText("Unavailable");
            jLabel79.setText(" ");   
        }
        
        if(specialVM.getSlots(8) != null) {
        jLabel84.setText(specialVM.getItemName(8));
        jLabel87.setText("P" + Integer.toString(specialVM.getSlots(8).getnPrice()));
        }
        else {
            jLabel84.setText("Unavailable");
            jLabel87.setText(" ");
        }
        
        if(specialVM.getSlots(9) != null) {
        jLabel82.setText(specialVM.getItemName(9));
        jLabel83.setText("P" + Integer.toString(specialVM.getSlots(9).getnPrice()));
        }
        else {
         jLabel82.setText("Unavailable");
            jLabel83.setText(" ");   
        }
        
        if(specialVM.getSlots(10) != null) {
        jLabel80.setText(specialVM.getItemName(10));
        jLabel81.setText("P" + Integer.toString(specialVM.getSlots(10).getnPrice()));
        }
        else {
            jLabel80.setText("Unavailable");
            jLabel81.setText(" ");
        }
        }
        else{
            MainPanel.setSelectedIndex(6);
            jPanel13.setVisible(false);
            Text.setVisible(false);
            Regular_Check.setVisible(false);
            Regular_Done.setVisible(false);
            temp_slot_quantity = new int[regularVM.getnSlotCapacity()];
            DefaultTableModel model = (DefaultTableModel) tableRVM.getModel();
            
            while(model.getRowCount() != 0) {
                model.removeRow(0);
            }
            
            for(int i = 0; i < regularVM.getnSlotCapacity(); i++) {
                model.addRow(new Object[]{null});
                tableRVM.setValueAt(i + 1, i, 0);
                if(regularVM.getSlots(i) != null) {
                    tableRVM.setValueAt(i + 1, i, 0);
                    tableRVM.setValueAt(regularVM.getItemName(i), i, 1);
                    tableRVM.setValueAt(regularVM.getItemPrice(i), i, 2);
                    tableRVM.setValueAt(regularVM.getSlots(i).getItem().getdCalories(), i, 3);
                    tableRVM.setValueAt(regularVM.getItemQuantity(i), i, 4);
                }
                else{
                    tableRVM.setValueAt("[No Item]", i, 1);
                    tableRVM.setValueAt(null, i, 2);
                    tableRVM.setValueAt(null, i, 3);
                    tableRVM.setValueAt(null, i, 4);
                }
                
                
            }
            
        }
        
    }//GEN-LAST:event_jPanel23MouseClicked

    private void jLabel41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel41MouseClicked
        
        if(options.isVisible())
            options.setVisible(false);
        else
            options.setVisible(true);
    }//GEN-LAST:event_jLabel41MouseClicked

    private void btnExitMaintenanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMaintenanceMouseClicked
        
        MainPanel.setSelectedIndex(2);
        mPanel.setSelectedIndex(0);
    }//GEN-LAST:event_btnExitMaintenanceMouseClicked

    private void jLabel43MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel43MouseClicked
        
        options.setVisible(false);
        mPanel.setSelectedIndex(1);
        tabStonks.setSelectedIndex(0);
    }//GEN-LAST:event_jLabel43MouseClicked

    private void slotNUMKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_slotNUMKeyPressed
        
        char c = evt.getKeyChar();

        if(Character.isLetter(c)) {
            slotNUM.setEditable(false);
        }
        else {
            slotNUM.setEditable(true);
        }
    }//GEN-LAST:event_slotNUMKeyPressed


    private void tfQuantityStockingKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfQuantityStockingKeyPressed
        
        char c = evt.getKeyChar();

        if(Character.isLetter(c)) {
            tfQuantityStocking.setEditable(false);
        }
        else {
            tfQuantityStocking.setEditable(true);
        }
    }//GEN-LAST:event_tfQuantityStockingKeyPressed


    private void tfCaloriesStockingKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCaloriesStockingKeyPressed
        

        char c = evt.getKeyChar();

        if(Character.isLetter(c)) {
            tfCaloriesStocking.setEditable(false);
        }
        else {
            tfCaloriesStocking.setEditable(true);
        }
    }//GEN-LAST:event_tfCaloriesStockingKeyPressed

    private void tfPriceStocking2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPriceStocking2KeyPressed
        
        char c = evt.getKeyChar();

        if(Character.isLetter(c)) {
            tfPriceStocking2.setEditable(false);
        }
        else {
            tfPriceStocking2.setEditable(true);
        }
    }//GEN-LAST:event_tfPriceStocking2KeyPressed

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        
        
        if(!(tfProductNameStocking.getText().isEmpty() || tfCaloriesStocking.getText().isEmpty() ||
           tfQuantityStocking.getText().isEmpty() || tfPriceStocking2.getText().isEmpty())) {
            String name = tfProductNameStocking.getText();
            float calories = Float.valueOf(tfCaloriesStocking.getText());
            int price = 0;
            int quantity = 0;
            int slot = Integer.valueOf(slotNUM.getText()) - 1;

            boolean valid = true;

            
            if(regularVM != null) {
                for(int i = 0; i < regularVM.getnSlotCapacity(); i++) {
                    if(regularVM.getSlots(i) != null)
                        if(regularVM.getItemName(i).equalsIgnoreCase(name))
                            valid = false;
                }

                 if(isConvertable(tfQuantityStocking.getText()) && isConvertable(tfPriceStocking2.getText())) {
                    quantity = Integer.valueOf(tfQuantityStocking.getText());
                    price = Integer.valueOf(tfPriceStocking2.getText());
                }
                 else {
                     valid = false;
                 }

                if(!(quantity > 0 && quantity <= regularVM.getnItemCapacity()))
                    valid = false;


                if(valid) {
                    Item item = new Item(name, calories);
                    regularVM.stocking(Integer.valueOf(slotNUM.getText()) - 1, item, quantity, price);

                    DefaultTableModel model = (DefaultTableModel) itemTable.getModel();
                    model.addRow(new Object[] {null});

                    itemTable.setValueAt(slot + 1, slot , 0);
                    itemTable.setValueAt(regularVM.getItemName(slot), slot, 1);
                    itemTable.setValueAt(regularVM.getItemPrice(slot ), slot, 2);
                    itemTable.setValueAt(regularVM.getItemQuantity(slot), slot, 3);
                    itemTable.setValueAt(regularVM.getSlots(slot).getItem().getdCalories(), slot, 4);
                    JOptionPane.showMessageDialog(null, "Succesful Stocking");
                    regularVM.getSummaryReceipt().setStartingInventory(regularVM.getSlotClass());
                    tabStonks.setSelectedIndex(0);
                }
                else {
                    JOptionPane.showMessageDialog(this, "Invalid Input", "Try Again!", JOptionPane.ERROR_MESSAGE);
                }
            }
            else {
                for(int i = 0; i < specialVM.getnSlotCapacity(); i++) {
                    if(specialVM.getSlots(i) != null)
                        if(specialVM.getItemName(i).equalsIgnoreCase(name))
                            valid = false;
                }

                 if(isConvertable(tfQuantityStocking.getText()) && isConvertable(tfPriceStocking2.getText())) {
                    quantity = Integer.valueOf(tfQuantityStocking.getText());
                    price = Integer.valueOf(tfPriceStocking2.getText());
                }
                 else {
                     valid = false;
                 }

                if(!(quantity > 0 && quantity <= specialVM.getnItemCapacity()))
                    valid = false;


                if(valid) {
                    Item item = new Item(name, calories);
                    specialVM.stocking(Integer.valueOf(slotNUM.getText()) - 1, item, quantity, price);

                    DefaultTableModel model = (DefaultTableModel) itemTable.getModel();
                    model.addRow(new Object[] {null});

                    itemTable.setValueAt(slot + 1, slot , 0);
                    itemTable.setValueAt(specialVM.getItemName(slot), slot, 1);
                    itemTable.setValueAt(specialVM.getItemPrice(slot ), slot, 2);
                    itemTable.setValueAt(specialVM.getItemQuantity(slot), slot, 3);
                    itemTable.setValueAt(specialVM.getSlots(slot).getItem().getdCalories(), slot, 4);
                    JOptionPane.showMessageDialog(null, "Succesful Stocking");
                    specialVM.getSummaryReceipt().setStartingInventory(specialVM.getSlotClass());
                    tabStonks.setSelectedIndex(0);
                }
                else {
                    JOptionPane.showMessageDialog(this, "Invalid Input", "Try Again!", JOptionPane.ERROR_MESSAGE);
                }  
            } 
        }
        else {
            JOptionPane.showMessageDialog(this, "Please Enter All Fields", "Try Again!", JOptionPane.ERROR_MESSAGE);
        }
        

    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        
        tabStonks.setSelectedIndex(0);
    }//GEN-LAST:event_jButton8MouseClicked

    private void tfAddStocksKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfAddStocksKeyPressed
        
        char c = evt.getKeyChar();

        if(Character.isLetter(c)) {
            tfAddStocks.setEditable(false);
        }
        else {
            tfAddStocks.setEditable(true);
        }
    }//GEN-LAST:event_tfAddStocksKeyPressed

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        
        int slot = Integer.valueOf(slotNUM.getText()) - 1;
        int amount;
        
        if(isConvertable(tfAddStocks.getText()) && !tfAddStocks.getText().isEmpty()) {
            amount = Integer.valueOf(tfAddStocks.getText());
            
            if(regularVM != null) {
                if(regularVM.ReStock(amount, slot)) {
                    JOptionPane.showMessageDialog(null, "Succesful REStocking");
                    itemTable.setValueAt(regularVM.getItemQuantity(slot), slot, 3);
                    regularVM.getSummaryReceipt().setStartingInventory(regularVM.getSlotClass());
                    regularVM.getSummaryReceipt().setStartingInventory(regularVM.getSlotClass());
                    tabStonks.setSelectedIndex(0);
                }
                else {
                    JOptionPane.showMessageDialog(this, "Invalid Amount!!", "Try Again!", JOptionPane.ERROR_MESSAGE);
                }
            }
            else {
                if(specialVM.ReStock(amount, slot)) {
                    JOptionPane.showMessageDialog(null, "Succesful REStocking");
                    itemTable.setValueAt(specialVM.getItemQuantity(slot), slot, 3);
                    specialVM.getSummaryReceipt().setStartingInventory(specialVM.getSlotClass());
                    specialVM.getSummaryReceipt().setStartingInventory(specialVM.getSlotClass());
                    tabStonks.setSelectedIndex(0);
                }
                else {
                    JOptionPane.showMessageDialog(this, "Invalid Amount!!", "Try Again!", JOptionPane.ERROR_MESSAGE);
                }
            }
            
                
        }
        else {
            JOptionPane.showMessageDialog(this, "Invalid!!", "Try Again!", JOptionPane.ERROR_MESSAGE);
        }
            
        
    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        
        tabStonks.setSelectedIndex(0);
    }//GEN-LAST:event_jButton9MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        
        int nValid = 1;
        int nTemp;

        if(!slotNUM.getText().isEmpty() && isConvertable(slotNUM.getText())) {

            nTemp = Integer.valueOf(slotNUM.getText());
            nTemp--;
           
            
            if(regularVM != null) {
                if(nTemp >= 0 && nTemp < regularVM.getnSlotCapacity()) {
                    if(regularVM.getSlots(nTemp) == null) {
                        tabStonks.setSelectedIndex(1);
                    }
                    else {
                        tabStonks.setSelectedIndex(2);
                    }
                }
                else
                    nValid = 0;
            }else {
                if(nTemp >= 0 && nTemp < specialVM.getnSlotCapacity()) {
                    if(specialVM.getSlots(nTemp) == null) {
                        tabStonks.setSelectedIndex(1);
                    }
                    else {
                        tabStonks.setSelectedIndex(2);
                    }
                }
                else
                    nValid = 0;
            }
        }
        else
            nValid = 0;

        if(nValid == 0) {
            JOptionPane.showMessageDialog(this, "Invalid Inputs", "Try Again!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton6MouseClicked

    private void jLabel49MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel49MouseClicked
        
        options.setVisible(false);
         mPanel.setSelectedIndex(1);
         tabStonks.setSelectedIndex(3);
    }//GEN-LAST:event_jLabel49MouseClicked


    private void slotNUM2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_slotNUM2KeyPressed
        
         char c = evt.getKeyChar();

        if(Character.isLetter(c)) {
            slotNUM2.setEditable(false);
        }
        else {
            slotNUM2.setEditable(true);
        }
    }//GEN-LAST:event_slotNUM2KeyPressed

    private void jButton13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MouseClicked
        
        int nValid = 1;
        int nTemp;
        
        
        if(!slotNUM2.getText().isEmpty() && isConvertable(slotNUM2.getText())) {

            nTemp = Integer.valueOf(slotNUM2.getText());
            nTemp--;

            if(regularVM != null){
                if(nTemp >= 0 && nTemp < regularVM.getnSlotCapacity() && regularVM.getSlots(nTemp) != null) {
                tabStonks.setSelectedIndex(4);
                }
                else
                    nValid = 0;
            }
            else {
                if(nTemp >= 0 && nTemp < specialVM.getnSlotCapacity() && specialVM.getSlots(nTemp) != null) {
                tabStonks.setSelectedIndex(4);
                }
                else
                    nValid = 0;
            }


        }
        else
            nValid = 0;

        if(nValid == 0) {
            JOptionPane.showMessageDialog(this, "Invalid Inputs", "Try Again!", JOptionPane.ERROR_MESSAGE);
        }
       
       
    }//GEN-LAST:event_jButton13MouseClicked

    private void jButton14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton14MouseClicked
        
        
        int slot = Integer.valueOf(slotNUM2.getText()) - 1;
        
        if(isConvertable(tfUpdatePrice1.getText()) && !tfUpdatePrice1.getText().isEmpty()) {
            if(regularVM != null) {
                regularVM.updatePrice(slot, Integer.valueOf(tfUpdatePrice1.getText()));
                itemTable.setValueAt(regularVM.getItemPrice(slot), slot, 2);
                tabStonks.setSelectedIndex(3);
                regularVM.getSummaryReceipt().setStartingInventory(regularVM.getSlotClass());
                JOptionPane.showMessageDialog(null, "Succesfully Updated Price");   
            }
            else{
                specialVM.updatePrice(slot, Integer.valueOf(tfUpdatePrice1.getText()));
                itemTable.setValueAt(specialVM.getItemPrice(slot), slot, 2);
                tabStonks.setSelectedIndex(3);
                specialVM.getSummaryReceipt().setStartingInventory(specialVM.getSlotClass());
                JOptionPane.showMessageDialog(null, "Succesfully Updated Price");   
            }
               
            
        }
        else {
            JOptionPane.showMessageDialog(this, "Invalid!!", "Try Again!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton14MouseClicked

    private void jButton15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton15MouseClicked
        
        tabStonks.setSelectedIndex(3);
    }//GEN-LAST:event_jButton15MouseClicked

    private void jLabel50MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel50MouseClicked
        
        if(regularVM != null) {
            currentMoney.setText("Current Money: " + regularVM.getTotalMoney() +" pesos");
        }
        else{
            currentMoney.setText("Current Money: " + specialVM.getTotalMoney() +" pesos");
        }
        
        options.setVisible(false);
        mPanel.setSelectedIndex(2);
    }//GEN-LAST:event_jLabel50MouseClicked

    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked
        
        int collect = 0;
        
        if(!tfCollectMoney.getText().isEmpty() && isConvertable(tfCollectMoney.getText())) {
           
            ChangeBox temp;
            
            if(regularVM != null) {
                temp  = new ChangeBox(regularVM.getMoneyBox().getnOnes(), regularVM.getMoneyBox().getnFives(), regularVM.getMoneyBox().getnTens(),
                                        regularVM.getMoneyBox().getnTwenties(), regularVM.getMoneyBox().getnFifties(), regularVM.getMoneyBox().getnHundreds());
                
            }
            else{
                temp = new ChangeBox(specialVM.getMoneyBox().getnOnes(), specialVM.getMoneyBox().getnFives(), specialVM.getMoneyBox().getnTens(),
                                        specialVM.getMoneyBox().getnTwenties(), specialVM.getMoneyBox().getnFifties(), specialVM.getMoneyBox().getnHundreds());
            }
            
            collect = Integer.valueOf(tfCollectMoney.getText());
            
            if(regularVM != null) {
                if(collect >= 0) {
                    int change = regularVM.getChangeforCustomer(collect, 0);

                    if(change == -1) {
                        JOptionPane.showMessageDialog(this, "Not Enough Money...", "Try Again!", JOptionPane.ERROR_MESSAGE);
                        

                        regularVM.getMoneyBox().setnOnes(temp.getnOnes());
                        regularVM.getMoneyBox().setnFives(temp.getnFives());
                        regularVM.getMoneyBox().setnTens(temp.getnTens());
                        regularVM.getMoneyBox().setnTwenties(temp.getnTwenties());
                        regularVM.getMoneyBox().setnFifties(temp.getnFifties());
                        regularVM.getMoneyBox().setnHundreds(temp.getnHundreds());
                        
                        
                        
                    }
                    else if(change == collect) {
                        JOptionPane.showMessageDialog(null, "Successfully Collected " + change);
                        currentMoney.setText("Current Money: " + regularVM.getTotalMoney());
                    } 
                    else{
                        JOptionPane.showMessageDialog(this, "Insufficient Denomination...", "Try Again!", JOptionPane.ERROR_MESSAGE);

                        regularVM.getMoneyBox().setnOnes(temp.getnOnes());
                        regularVM.getMoneyBox().setnFives(temp.getnFives());
                        regularVM.getMoneyBox().setnTens(temp.getnTens());
                        regularVM.getMoneyBox().setnTwenties(temp.getnTwenties());
                        regularVM.getMoneyBox().setnFifties(temp.getnFifties());
                        regularVM.getMoneyBox().setnHundreds(temp.getnHundreds());
                        
                     
                    }             
                }
                else{
                    JOptionPane.showMessageDialog(this, "Can't be Negative", "Try Again!", JOptionPane.ERROR_MESSAGE);
                }
            }
            else {
                if(collect >= 0) {
                    int change = specialVM.getChangeforCustomer(collect, 0);

                    if(change == -1) {
                        JOptionPane.showMessageDialog(this, "Not Enough Money...", "Try Again!", JOptionPane.ERROR_MESSAGE);
                        specialVM.getMoneyBox().setnOnes(temp.getnOnes());
                        specialVM.getMoneyBox().setnFives(temp.getnFives());
                        specialVM.getMoneyBox().setnTens(temp.getnTens());
                        specialVM.getMoneyBox().setnTwenties(temp.getnTwenties());
                        specialVM.getMoneyBox().setnFifties(temp.getnFifties());
                        specialVM.getMoneyBox().setnHundreds(temp.getnHundreds());
                    }
                    else if(change == collect) {
                        JOptionPane.showMessageDialog(null, "Successfully Collected " + change);
                        currentMoney.setText("Current Money: " + specialVM.getTotalMoney());
                    } 
                    else{
                        JOptionPane.showMessageDialog(this, "Insufficient Denomination...", "Try Again!", JOptionPane.ERROR_MESSAGE);
                        specialVM.getMoneyBox().setnOnes(temp.getnOnes());
                        specialVM.getMoneyBox().setnFives(temp.getnFives());
                        specialVM.getMoneyBox().setnTens(temp.getnTens());
                        specialVM.getMoneyBox().setnTwenties(temp.getnTwenties());
                        specialVM.getMoneyBox().setnFifties(temp.getnFifties());
                        specialVM.getMoneyBox().setnHundreds(temp.getnHundreds());
                    }             
                }
                else{   
                    JOptionPane.showMessageDialog(this, "Can't be Negative", "Try Again!", JOptionPane.ERROR_MESSAGE);
                }
            }
            
        }
        else {
            JOptionPane.showMessageDialog(this, "Invalid Inputs", "Try Again!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton10MouseClicked

    
    private void jLabel51MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel51MouseClicked
        
        options.setVisible(false);
        setMoneyButtons();
        mPanel.setSelectedIndex(3);
        
    }//GEN-LAST:event_jLabel51MouseClicked

    private void onesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onesMouseClicked
        
        if(regularVM != null) {
            int nOnes = regularVM.getMoneyBox().getnOnes();
            nOnes++;

            ones.setText(Integer.toString(nOnes));

            regularVM.replenishChange(1, 0, 0,0, 0, 0);
        }
        else {
            int nOnes = specialVM.getMoneyBox().getnOnes();
            nOnes++;

            ones.setText(Integer.toString(nOnes));

            specialVM.replenishChange(1, 0, 0,0, 0, 0);
        }
            
        
    }//GEN-LAST:event_onesMouseClicked

    private void fivesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fivesMouseClicked
        if(regularVM != null) {
            int nFives = regularVM.getMoneyBox().getnFives();
            nFives++;

            fives.setText(Integer.toString(nFives));

             regularVM.replenishChange(0, 1, 0,0, 0, 0);
        }
        else {
            int nFives = specialVM.getMoneyBox().getnFives();
            nFives++;

            fives.setText(Integer.toString(nFives));

            specialVM.replenishChange(0, 1, 0,0, 0, 0);
        }
        
        
    }//GEN-LAST:event_fivesMouseClicked

    private void tensMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tensMouseClicked
        

         if(regularVM != null) {
            int nTens = regularVM.getMoneyBox().getnTens();
            nTens++;

            tens.setText(Integer.toString(nTens));

             regularVM.replenishChange(0, 0, 1,0, 0, 0);
        }
        else {
            int nTens = specialVM.getMoneyBox().getnTens();
            nTens++;

            tens.setText(Integer.toString(nTens));

            specialVM.replenishChange(0, 0, 1,0, 0, 0);
        }
    }//GEN-LAST:event_tensMouseClicked

    private void twentyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twentyMouseClicked
        
         if(regularVM != null) {
            int nTwenty = regularVM.getMoneyBox().getnTwenties();
            nTwenty++;

            twenty.setText(Integer.toString(nTwenty));

            regularVM.replenishChange(0, 0, 0,1, 0, 0);
        }
        else {
            int nTwenty = specialVM.getMoneyBox().getnTwenties();
            nTwenty++;

            twenty.setText(Integer.toString(nTwenty));

            specialVM.replenishChange(0, 0, 0,1, 0, 0);
        }
    }//GEN-LAST:event_twentyMouseClicked

    private void fiftyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fiftyMouseClicked
         if(regularVM != null) {
            int nfifty = regularVM.getMoneyBox().getnFifties();
            nfifty++;

            fifty.setText(Integer.toString(nfifty));

             regularVM.replenishChange(0, 0, 0,0, 1, 0);
        }
        else {
            int nfifty = specialVM.getMoneyBox().getnFifties();
            nfifty++;

            fifty.setText(Integer.toString(nfifty));

            specialVM.replenishChange(0, 0, 0,0, 1, 0);
        }
        
        
    }//GEN-LAST:event_fiftyMouseClicked

    private void hundredMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hundredMouseClicked
        if(regularVM != null) {
            int nHundred = regularVM.getMoneyBox().getnHundreds();
            nHundred++;

            hundred.setText(Integer.toString(nHundred));

            regularVM.replenishChange(0, 0, 0,0, 0, 1);
        }
        else {
            int nHundred = specialVM.getMoneyBox().getnHundreds();
            nHundred++;

            hundred.setText(Integer.toString(nHundred));

            specialVM.replenishChange(0, 0, 0,0, 0, 1);
        }
    }//GEN-LAST:event_hundredMouseClicked

    private void jLabel52MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel52MouseClicked
        
        options.setVisible(false);
        mPanel.setSelectedIndex(4);
        boolean valid = false;
        
        DefaultTableModel model = (DefaultTableModel) summaryTable.getModel();
            
        while(model.getRowCount() != 0) {
            model.removeRow(0);
        }
        
        int sold = 0;
        int tempCount = 0;
        
        Slot[] tempInventory;
        Slot[] tempEndInventory;
        
        if(regularVM != null) {
            tempInventory = regularVM.getSummaryReceipt().getStartingInventory();
            tempEndInventory = regularVM.getSummaryReceipt().getEndingInventory();
        }
        else {
            tempInventory = specialVM.getSummaryReceipt().getStartingInventory();
            tempEndInventory = specialVM.getSummaryReceipt().getEndingInventory();
        }

        for(int i = 0; i < tempInventory.length; i++) {
            if(tempInventory[i] != null) {
                model.addRow(new Object[]{null});
                summaryTable.setValueAt(tempInventory[i].getItem().getsName(), tempCount, 0);
                summaryTable.setValueAt(tempInventory[i].getnQuantity(), tempCount, 1);
                summaryTable.setValueAt(tempEndInventory[i].getnQuantity(), tempCount, 2);
                sold = tempInventory[i].getnQuantity() - tempEndInventory[i].getnQuantity();
                summaryTable.setValueAt(sold, tempCount, 3);
                tempCount++;
                valid = true;
            }  
        }
        
        if(regularVM != null) {
            totalSales.setText("Total Sales: " + regularVM.getSummaryReceipt().getSales() + " php");
        }
        else {
            totalSales.setText("Total Sales: " + specialVM.getSummaryReceipt().getSales() + " php");
        }
        
        
        if(!valid) {
            model.addRow(new Object[]{null});
            summaryTable.setValueAt("[No Item Stocked]", 0, 0);
        }
        
        
        
    }//GEN-LAST:event_jLabel52MouseClicked

    private void jPanel24MouseClicked(java.awt.event.MouseEvent evt) {                                      
        MainPanel.setSelectedIndex(3);
    }                                       

 

    private void jButton25MouseClicked(java.awt.event.MouseEvent evt) {                                           
        MainPanel.setSelectedIndex(5);
    }                                      


    private void jButton41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton41MouseClicked
        
        MainPanel.setSelectedIndex(2);
        currency = 0;
        
        betaTotalMoney1.setText("P" + Integer.toString(currency));
        betaTotalMoney.setText("P" + Integer.toString(currency));
        SVM_Personalized.setVisible(false);
        nValid = 0;
        saveEspresso = -1; //saves the slot index
        saveMilk = -1; //saves the slot index
        saveSyrup = -1; //saves the slot index
        saveTopping = -1; //saves the slot index
        
    }//GEN-LAST:event_jButton41MouseClicked

    private void jButton42MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton42MouseClicked
        
        MainPanel.setSelectedIndex(4);
        amount = currency;
        initialMoney = currency;
    }//GEN-LAST:event_jButton42MouseClicked

    private void jButton43MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton43MouseClicked
        
        currency += 1;
        betaTotalMoney.setText("P" + Integer.toString(currency));
        betaTotalMoney1.setText("P" + Integer.toString(currency));
        
        if(regularVM != null) {
            int nOnes = regularVM.getMoneyBox().getnOnes();
            nOnes++;

            ones.setText(Integer.toString(nOnes));

             regularVM.replenishChange(1, 0, 0,0, 0, 0);
        }
        else {
            int nOnes = specialVM.getMoneyBox().getnOnes();
            nOnes++;

            ones.setText(Integer.toString(nOnes));

            specialVM.replenishChange(1, 0, 0,0, 0, 0);
        }
    }//GEN-LAST:event_jButton43MouseClicked

    private void jButton44MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton44MouseClicked
        
        currency += 5;
        betaTotalMoney.setText("P" + Integer.toString(currency));
        betaTotalMoney1.setText("P" + Integer.toString(currency));
        if(regularVM != null) {
            int nFives = regularVM.getMoneyBox().getnFives();
            nFives++;

            fives.setText(Integer.toString(nFives));

             regularVM.replenishChange(0, 1, 0,0, 0, 0);
        }
        else {
            int nFives = specialVM.getMoneyBox().getnFives();
            nFives++;

            fives.setText(Integer.toString(nFives));

            specialVM.replenishChange(0, 1, 0,0, 0, 0);
        }
    }//GEN-LAST:event_jButton44MouseClicked


    private void jButton40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton40MouseClicked
        currency += 10;
        betaTotalMoney.setText("P" + Integer.toString(currency));
        betaTotalMoney1.setText("P" + Integer.toString(currency));
        if(regularVM != null) {
            int nTens = regularVM.getMoneyBox().getnTens();
            nTens++;

            tens.setText(Integer.toString(nTens));

             regularVM.replenishChange(0, 0, 1,0, 0, 0);
        }
        else {
            int nTens = specialVM.getMoneyBox().getnTens();
            nTens++;

            tens.setText(Integer.toString(nTens));

            specialVM.replenishChange(0, 0, 1,0, 0, 0);
        }
    }//GEN-LAST:event_jButton40MouseClicked

    private void jButton45MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton45MouseClicked
        
        currency += 20;
        betaTotalMoney.setText("P" + Integer.toString(currency));
        betaTotalMoney1.setText("P" + Integer.toString(currency));
        if(regularVM != null) {
            int nTwenties = regularVM.getMoneyBox().getnTwenties();
           nTwenties++;

           twenty.setText(Integer.toString(nTwenties));

             regularVM.replenishChange(0, 0, 0,1, 0, 0);
        }
        else {
            int nTwenties = specialVM.getMoneyBox().getnTwenties();
            nTwenties++;

            twenty.setText(Integer.toString(nTwenties));

            specialVM.replenishChange(0, 0, 0,1, 0, 0);
        }
    }//GEN-LAST:event_jButton45MouseClicked

    private void jButton46MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton46MouseClicked
        
        currency += 50;
        betaTotalMoney.setText("P" + Integer.toString(currency));
        betaTotalMoney1.setText("P" + Integer.toString(currency));
        if(regularVM != null) {
            int nFifties = regularVM.getMoneyBox().getnFifties();
            nFifties++;

            fifty.setText(Integer.toString(nFifties));

             regularVM.replenishChange(0, 0, 0,0, 1, 0);
        }
        else {
            int nFifties = specialVM.getMoneyBox().getnFifties();
            nFifties++;

            fifty.setText(Integer.toString(nFifties));

            specialVM.replenishChange(0, 0, 0,0, 1, 0);
        }
    }//GEN-LAST:event_jButton46MouseClicked

    private void jButton47MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton47MouseClicked
        
        currency += 100;
        betaTotalMoney.setText("P" + Integer.toString(currency));
        betaTotalMoney1.setText("P" + Integer.toString(currency));
        if(regularVM != null) {
            int nHundreds = regularVM.getMoneyBox().getnHundreds();
            nHundreds++;

            hundred.setText(Integer.toString(nHundreds));

             regularVM.replenishChange(0, 0, 0,0, 0, 1);
        }
        else {
            int nHundreds = specialVM.getMoneyBox().getnHundreds();
            nHundreds++;

            hundred.setText(Integer.toString(nHundreds));

            specialVM.replenishChange(0, 0, 0,0, 0, 1);
        }
    }//GEN-LAST:event_jButton47MouseClicked

    private void jButton79MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton79MouseClicked
        
        jPanel13.setVisible(true);
    }//GEN-LAST:event_jButton79MouseClicked

    private void jButton81MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton81MouseClicked
        
        MainPanel.setSelectedIndex(2);
        currency = 0;
        betaTotalMoney3.setText("P" + Integer.toString(currency));
    }//GEN-LAST:event_jButton81MouseClicked

    private void jButton31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton31MouseClicked
        
        int check = 0;
        if(specialVM != null) {
             for(int i = 0; i < specialVM.nSlotCapacity; i++) {
               if(specialVM.getSlots(i) != null){ 
                   if (specialVM.getSlots(i).getItem().getsName().equalsIgnoreCase("Espresso")) {
                       if(specialVM.getSlots(i).getnQuantity() > 0) {
                           check = 1;
                       }
                   }
               }
           }
         } 
        if(currency >= 105 && check != 0) {
            jTextField29.setVisible(false);
            jButton41.setVisible(false);
            jButton59.setVisible(true);
         defaulttab.setVisible(false);
         SVM_Espresso.setVisible(true);
         SVM_Personalized.setVisible(false);
         SVM_Personalized1.setVisible(false);
         SVM_Personalized2.setVisible(false);
         totalcal = 0;
         if(specialVM != null) {
             for(int i = 0; i < specialVM.nSlotCapacity; i++) {
               if(specialVM.getSlots(i) != null){ 
                   if (specialVM.getSlots(i).getItem().getsName().equalsIgnoreCase("Espresso")) {
                       if(specialVM.getSlots(i).getnPrice() <= amount && specialVM.getSlots(i).getnQuantity() > 0) {
                           if(jButton59.getText().equalsIgnoreCase("")) {
                             jButton59.setText(specialVM.getSlots(i).getItem().getsName());  
                           }

                       }
                   }
               }
           }
         } 
        }
        
        
                
    }//GEN-LAST:event_jButton31MouseClicked

    private void jButton48MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton48MouseClicked
        
        for(int i = 0; i < specialVM.nSlotCapacity; i++) {
            if(specialVM.getSlots(i) != null){
                if (specialVM.getSlots(i).getItem().getsName().equalsIgnoreCase(jButton48.getText())){
                    amount -= specialVM.getSlots(i).getnPrice();
                    saveMilk = i;
                    totalcal += specialVM.getSlots(i).getItem().getdCalories();
                }
            }
        }
        betaTotalMoney.setText(Integer.toString(amount));
        
        for(int i = 0; i < specialVM.nSlotCapacity; i++) {
              if(specialVM.getSlots(i) != null){ 
                  if (specialVM.getSlots(i).getItem().getsName().equalsIgnoreCase("Strawberry_Syrup") || specialVM.getSlots(i).getItem().getsName().equalsIgnoreCase("Chocolate_Syrup") 
                          || specialVM.getSlots(i).getItem().getsName().equalsIgnoreCase("Caramel_Syrup")) {
                      if(specialVM.getSlots(i).getnPrice() <= amount && specialVM.getSlots(i).getnQuantity() > 0) {
                          if(jButton52.getText().equalsIgnoreCase("")) {
                            jButton52.setText(specialVM.getSlots(i).getItem().getsName());  
                          }
                          else {
                              if(jButton53.getText().equalsIgnoreCase("")) {
                                  jButton53.setText(specialVM.getSlots(i).getItem().getsName());  
                              }
                              else {
                                  if(jButton54.getText().equalsIgnoreCase("")) {
                                      jButton54.setText(specialVM.getSlots(i).getItem().getsName());  
                                   }
                              }

                          }

                      }
                  }
              }
          } 
        SVM_Personalized1.setVisible(true);
SVM_Personalized.setVisible(false);
    }//GEN-LAST:event_jButton48MouseClicked

    private void jButton49MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton49MouseClicked
        
        for(int i = 0; i < specialVM.nSlotCapacity; i++) {
            if(specialVM.getSlots(i) != null){
                if (specialVM.getSlots(i).getItem().getsName().equalsIgnoreCase(jButton49.getText())){
                    amount -= specialVM.getSlots(i).getnPrice();
                    saveMilk = i;
                    totalcal += specialVM.getSlots(i).getItem().getdCalories();
                }
            }
        }
        betaTotalMoney.setText(Integer.toString(amount));
        for(int i = 0; i < specialVM.nSlotCapacity; i++) {
              if(specialVM.getSlots(i) != null){ 
                  if (specialVM.getSlots(i).getItem().getsName().equalsIgnoreCase("Strawberry_Syrup") || specialVM.getSlots(i).getItem().getsName().equalsIgnoreCase("Chocolate_Syrup") 
                          || specialVM.getSlots(i).getItem().getsName().equalsIgnoreCase("Caramel_Syrup")) {
                      if(specialVM.getSlots(i).getnPrice() <= amount && specialVM.getSlots(i).getnQuantity() > 0) {
                          if(jButton52.getText().equalsIgnoreCase("")) {
                            jButton52.setText(specialVM.getSlots(i).getItem().getsName());  
                          }
                          else {
                              if(jButton53.getText().equalsIgnoreCase("")) {
                                  jButton53.setText(specialVM.getSlots(i).getItem().getsName());  
                              }
                              else {
                                  if(jButton54.getText().equalsIgnoreCase("")) {
                                      jButton54.setText(specialVM.getSlots(i).getItem().getsName());  
                                   }
                              }

                          }

                      }
                  }
              }
          } 
        SVM_Personalized1.setVisible(true);
 SVM_Personalized.setVisible(false);
    }//GEN-LAST:event_jButton49MouseClicked

    private void jButton50MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton50MouseClicked
        
        for(int i = 0; i < specialVM.nSlotCapacity; i++) {
            if(specialVM.getSlots(i) != null){
                if (specialVM.getSlots(i).getItem().getsName().equalsIgnoreCase(jButton50.getText())){
                    amount -= specialVM.getSlots(i).getnPrice();
                    saveMilk = i;
                    totalcal += specialVM.getSlots(i).getItem().getdCalories();
                }
            }
        }
        betaTotalMoney.setText(Integer.toString(amount));
        for(int i = 0; i < specialVM.nSlotCapacity; i++) {
              if(specialVM.getSlots(i) != null){ 
                  if (specialVM.getSlots(i).getItem().getsName().equalsIgnoreCase("Strawberry_Syrup") || specialVM.getSlots(i).getItem().getsName().equalsIgnoreCase("Chocolate_Syrup") 
                          || specialVM.getSlots(i).getItem().getsName().equalsIgnoreCase("Caramel_Syrup")) {
                      if(specialVM.getSlots(i).getnPrice() <= amount && specialVM.getSlots(i).getnQuantity() > 0) {
                          if(jButton52.getText().equalsIgnoreCase("")) {
                            jButton52.setText(specialVM.getSlots(i).getItem().getsName());  
                          }
                          else {
                              if(jButton53.getText().equalsIgnoreCase("")) {
                                  jButton53.setText(specialVM.getSlots(i).getItem().getsName());  
                              }
                              else {
                                  if(jButton54.getText().equalsIgnoreCase("")) {
                                      jButton54.setText(specialVM.getSlots(i).getItem().getsName());  
                                   }
                              }

                          }

                      }
                  }
              }
          } 
        SVM_Personalized1.setVisible(true);
SVM_Personalized.setVisible(false);
    }//GEN-LAST:event_jButton50MouseClicked

    private void jButton51MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton51MouseClicked
        
        for(int i = 0; i < specialVM.nSlotCapacity; i++) {
            if(specialVM.getSlots(i) != null){
                if (specialVM.getSlots(i).getItem().getsName().equalsIgnoreCase(jButton51.getText())){
                    amount -= specialVM.getSlots(i).getnPrice();
                    saveMilk = i;
                    totalcal += specialVM.getSlots(i).getItem().getdCalories();
                }
            }
        }
        betaTotalMoney.setText(Integer.toString(amount));
        for(int i = 0; i < specialVM.nSlotCapacity; i++) {
              if(specialVM.getSlots(i) != null){ 
                  if (specialVM.getSlots(i).getItem().getsName().equalsIgnoreCase("Strawberry_Syrup") || specialVM.getSlots(i).getItem().getsName().equalsIgnoreCase("Chocolate_Syrup") 
                          || specialVM.getSlots(i).getItem().getsName().equalsIgnoreCase("Caramel_Syrup")) {
                      if(specialVM.getSlots(i).getnPrice() <= amount && specialVM.getSlots(i).getnQuantity() > 0) {
                          if(jButton52.getText().equalsIgnoreCase("")) {
                            jButton52.setText(specialVM.getSlots(i).getItem().getsName());  
                          }
                          else {
                              if(jButton53.getText().equalsIgnoreCase("")) {
                                  jButton53.setText(specialVM.getSlots(i).getItem().getsName());  
                              }
                              else {
                                  if(jButton54.getText().equalsIgnoreCase("")) {
                                      jButton54.setText(specialVM.getSlots(i).getItem().getsName());  
                                   }
                              }

                          }

                      }
                  }
              }
          } 
        SVM_Personalized1.setVisible(true);
SVM_Personalized.setVisible(false);
    }//GEN-LAST:event_jButton51MouseClicked


    private void jButton52MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton52MouseClicked
        
      
        for(int i = 0; i < specialVM.nSlotCapacity; i++) {
            if(specialVM.getSlots(i) != null){
                if (specialVM.getSlots(i).getItem().getsName().equalsIgnoreCase(jButton52.getText())){
                    amount -= specialVM.getSlots(i).getnPrice();
                    saveSyrup = i;
                    totalcal += specialVM.getSlots(i).getItem().getdCalories();
                }
            }
        }
        betaTotalMoney.setText(Integer.toString(amount));
        for(int i = 0; i < specialVM.nSlotCapacity; i++) {
              if(specialVM.getSlots(i) != null){ 
                  if (specialVM.getSlots(i).getItem().getsName().equalsIgnoreCase("Oreo") || specialVM.getSlots(i).getItem().getsName().equalsIgnoreCase("Icecream") 
                          || specialVM.getSlots(i).getItem().getsName().equalsIgnoreCase("Chocolate")) {
                      if(specialVM.getSlots(i).getnPrice() <= amount && specialVM.getSlots(i).getnQuantity() > 0) {
                          if(jButton55.getText().equalsIgnoreCase("")) {
                            jButton55.setText(specialVM.getSlots(i).getItem().getsName());  
                          }
                          else {
                              if(jButton56.getText().equalsIgnoreCase("")) {
                                  jButton56.setText(specialVM.getSlots(i).getItem().getsName());  
                              }
                              else {
                                  if(jButton57.getText().equalsIgnoreCase("")) {
                                      jButton57.setText(specialVM.getSlots(i).getItem().getsName());  
                                   }
                              }

                          }

                      }
                  }
              }
          } 
        SVM_Personalized2.setVisible(true);
SVM_Personalized1.setVisible(false);
    }//GEN-LAST:event_jButton52MouseClicked

    private void jButton53MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton53MouseClicked
        
        for(int i = 0; i < specialVM.nSlotCapacity; i++) {
            if(specialVM.getSlots(i) != null){
                if (specialVM.getSlots(i).getItem().getsName().equalsIgnoreCase(jButton53.getText())){
                    amount -= specialVM.getSlots(i).getnPrice();
                    saveSyrup = i;
                    totalcal += specialVM.getSlots(i).getItem().getdCalories();
                }
            }
        }
        betaTotalMoney.setText(Integer.toString(amount));
        for(int i = 0; i < specialVM.nSlotCapacity; i++) {
              if(specialVM.getSlots(i) != null){ 
                  if (specialVM.getSlots(i).getItem().getsName().equalsIgnoreCase("Oreo") || specialVM.getSlots(i).getItem().getsName().equalsIgnoreCase("Icecream") 
                          || specialVM.getSlots(i).getItem().getsName().equalsIgnoreCase("Chocolate")) {
                      if(specialVM.getSlots(i).getnPrice() <= amount && specialVM.getSlots(i).getnQuantity() > 0) {
                          if(jButton55.getText().equalsIgnoreCase("")) {
                            jButton55.setText(specialVM.getSlots(i).getItem().getsName());  
                          }
                          else {
                              if(jButton56.getText().equalsIgnoreCase("")) {
                                  jButton56.setText(specialVM.getSlots(i).getItem().getsName());  
                              }
                              else {
                                  if(jButton57.getText().equalsIgnoreCase("")) {
                                      jButton57.setText(specialVM.getSlots(i).getItem().getsName());  
                                   }
                              }

                          }

                      }
                  }
              }
          } 
   SVM_Personalized2.setVisible(true);
SVM_Personalized1.setVisible(false);
    }//GEN-LAST:event_jButton53MouseClicked

    private void jButton54MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton54MouseClicked
        
        for(int i = 0; i < specialVM.nSlotCapacity; i++) {
            if(specialVM.getSlots(i) != null){
                if (specialVM.getSlots(i).getItem().getsName().equalsIgnoreCase(jButton54.getText())){
                    amount -= specialVM.getSlots(i).getnPrice();
                    saveSyrup = i;
                    totalcal += specialVM.getSlots(i).getItem().getdCalories();
                }
            }
        }
        betaTotalMoney.setText(Integer.toString(amount));
        for(int i = 0; i < specialVM.nSlotCapacity; i++) {
              if(specialVM.getSlots(i) != null){ 
                  if (specialVM.getSlots(i).getItem().getsName().equalsIgnoreCase("Oreo") || specialVM.getSlots(i).getItem().getsName().equalsIgnoreCase("Icecream") 
                          || specialVM.getSlots(i).getItem().getsName().equalsIgnoreCase("Chocolate")) {
                      if(specialVM.getSlots(i).getnPrice() <= amount && specialVM.getSlots(i).getnQuantity() > 0) {
                          if(jButton55.getText().equalsIgnoreCase("")) {
                            jButton55.setText(specialVM.getSlots(i).getItem().getsName());  
                          }
                          else {
                              if(jButton56.getText().equalsIgnoreCase("")) {
                                  jButton56.setText(specialVM.getSlots(i).getItem().getsName());  
                              }
                              else {
                                  if(jButton57.getText().equalsIgnoreCase("")) {
                                      jButton57.setText(specialVM.getSlots(i).getItem().getsName());  
                                   }
                              }

                          }

                      }
                  }
              }
          } 
  SVM_Personalized2.setVisible(true);
SVM_Personalized1.setVisible(false);
    }//GEN-LAST:event_jButton54MouseClicked


    private void jButton55MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton55MouseClicked
        
        for(int i = 0; i < specialVM.nSlotCapacity; i++) {
            if(specialVM.getSlots(i) != null){
                if (specialVM.getSlots(i).getItem().getsName().equalsIgnoreCase(jButton55.getText())){
                    currency -= specialVM.getSlots(i).getnPrice();
                    amount -= specialVM.getSlots(i).getnPrice();
                    saveTopping = i;
                    totalcal += specialVM.getSlots(i).getItem().getdCalories();
                }
            }
        }
      betaTotalMoney.setText(Integer.toString(amount));
        if(saveEspresso != -1) {
        nValid = specialVM.Dispense((saveEspresso), currency);
        currency = nValid;
        temp_slot_quantity[saveEspresso] += 1;  //used to bring back quantity if needed
        }

        if(saveMilk != -1) {
        nValid = specialVM.Dispense((saveMilk), currency);  
        currency = nValid;
        temp_slot_quantity[saveMilk] += 1;  //used to bring back quantity if needed
        }

        if(saveSyrup != -1) {
        nValid = specialVM.Dispense((saveSyrup), currency);  
        currency= nValid;
        temp_slot_quantity[saveSyrup] += 1;  //used to bring back quantity if needed
        }

        if(saveTopping != -1) {
        specialVM.Dispense((saveTopping), currency); 
        currency = nValid;
        temp_slot_quantity[saveTopping] += 1;  //used to bring back quantity if needed 
        }
        
        betaTotalMoney.setText(Integer.toString(amount));
        SVM_Personalized2.setVisible(false);
        jButton58.setVisible(true);
        
    }//GEN-LAST:event_jButton55MouseClicked

    private void jButton56MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton56MouseClicked
        
        for(int i = 0; i < specialVM.nSlotCapacity; i++) {
            if(specialVM.getSlots(i) != null){
                if (specialVM.getSlots(i).getItem().getsName().equalsIgnoreCase(jButton56.getText())){
                    currency -= specialVM.getSlots(i).getnPrice();
                    amount -= specialVM.getSlots(i).getnPrice();
                     saveTopping = i;
                     totalcal += specialVM.getSlots(i).getItem().getdCalories();
                }
            }
        }
        betaTotalMoney.setText(Integer.toString(amount));
        if(saveEspresso != -1) {
        nValid = specialVM.Dispense((saveEspresso), currency);
        currency = nValid;
        temp_slot_quantity[saveEspresso] += 1;  //used to bring back quantity if needed
        }

        if(saveMilk != -1) {
        nValid = specialVM.Dispense((saveMilk), currency);  
        currency = nValid;
        temp_slot_quantity[saveMilk] += 1;  //used to bring back quantity if needed
        }

        if(saveSyrup != -1) {
        nValid = specialVM.Dispense((saveSyrup), currency);  
        currency= nValid;
        temp_slot_quantity[saveSyrup] += 1;  //used to bring back quantity if needed
        }

        if(saveTopping != -1) {
        specialVM.Dispense((saveTopping), currency); 
        currency = nValid;
        temp_slot_quantity[saveTopping] += 1;  //used to bring back quantity if needed 
        }

        SVM_Personalized2.setVisible(false);
        jButton58.setVisible(true);
        
    }//GEN-LAST:event_jButton56MouseClicked

    private void jButton57MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton57MouseClicked
        
        for(int i = 0; i < specialVM.nSlotCapacity; i++) {
            if(specialVM.getSlots(i) != null){
                if (specialVM.getSlots(i).getItem().getsName().equalsIgnoreCase(jButton57.getText())){
                    currency -= specialVM.getSlots(i).getnPrice();
                    amount -= specialVM.getSlots(i).getnPrice();
                     saveTopping = i;
                     totalcal += specialVM.getSlots(i).getItem().getdCalories();
                }
            }
        }
        betaTotalMoney.setText(Integer.toString(amount));
        if(saveEspresso != -1) {
        nValid = specialVM.Dispense((saveEspresso), currency);
        currency = nValid;
        temp_slot_quantity[saveEspresso] += 1;  //used to bring back quantity if needed
        }

        if(saveMilk != -1) {
        nValid = specialVM.Dispense((saveMilk), currency);  
        currency = nValid;
        temp_slot_quantity[saveMilk] += 1;  //used to bring back quantity if needed
        }

        if(saveSyrup != -1) {
        nValid = specialVM.Dispense((saveSyrup), currency);  
        currency= nValid;
        temp_slot_quantity[saveSyrup] += 1;  //used to bring back quantity if needed
        }

        if(saveTopping != -1) {
        specialVM.Dispense((saveTopping), currency); 
        currency = nValid;
        temp_slot_quantity[saveTopping] += 1;  //used to bring back quantity if needed 
        }
        

        SVM_Personalized2.setVisible(false);
        jButton58.setVisible(true);
        
    }//GEN-LAST:event_jButton57MouseClicked


    private void jButton69MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton69MouseClicked
        
        Regular_Done.setVisible(true);
        if(regularVM.getSlots(0) == null){
                Regular_Check.setVisible(true);
                Regular_Check.setCaretColor(Color.red);
                Regular_Check.setText("Invalid Input...");
        }
        else{
            nValid = regularVM.Dispense((0), currency);

            switch (nValid) {
                case -1 -> {
                   Regular_Check.setVisible(true);
                        Regular_Check.setCaretColor(Color.red);
                        Regular_Check.setText("SOLD OUT!");
                }
                case -2 -> {
                   Regular_Check.setVisible(true);
                        Regular_Check.setCaretColor(Color.red);
                        Regular_Check.setText("Insufficient Balance");
                }
                case -3 -> {
                    Regular_Check.setVisible(true);
                        Regular_Check.setCaretColor(Color.red);
                        Regular_Check.setText("Invalid Choice...");
                }
                default -> {
                    Regular_Check.setVisible(true);
                        Regular_Check.setCaretColor(Color.blue);
                        Regular_Check.setText("Bought!");
                    currency = nValid;
                    temp_slot_quantity[0] += 1;  //used to bring back quantity if needed
                    betaTotalMoney3.setText("P" + Integer.toString(currency));
                }
            }
        }
    }//GEN-LAST:event_jButton69MouseClicked

    private void jButton12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MouseClicked
        
        jButton58.setVisible(true);
        if(specialVM.getSlots(0) == null || specialVM.getSlots(0).getItem().getsName().equalsIgnoreCase("Strawberry_Syrup") 
                            || specialVM.getSlots(0).getItem().getsName().equalsIgnoreCase("Caramel_Syrup")
                            || specialVM.getSlots(0).getItem().getsName().equalsIgnoreCase("Chocolate_Syrup")){
                        jTextField29.setVisible(true);
                        jTextField29.setCaretColor(Color.red);
                        jTextField29.setText("Invalid Input...");
                    }
                    else{
                        nValid = specialVM.Dispense((0), currency);

                        switch (nValid) {
                            case -1 -> {
                                jTextField29.setVisible(true);
                                    jTextField29.setCaretColor(Color.red);
                                    jTextField29.setText("SOLD OUT!");
                            }
                            case -2 -> {
                                jTextField29.setVisible(true);
                                    jTextField29.setCaretColor(Color.red);
                                    jTextField29.setText("Insufficient Balance");
                            }
                            case -3 -> {
                                jTextField29.setVisible(true);
                                    jTextField29.setCaretColor(Color.red);
                                    jTextField29.setText("Invalid Choice...");
                            }
                            default -> {
                                jTextField29.setVisible(true);
                                    jTextField29.setCaretColor(Color.blue);
                                    jTextField29.setText(specialVM.getSlots(0).getItem().getsName() + " added to cart");
                                currency = nValid;
                                temp_slot_quantity[0] += 1;  //used to bring back quantity if needed
                                betaTotalMoney.setText("P" + Integer.toString(currency));
                            }
                        }
                    }
    }//GEN-LAST:event_jButton12MouseClicked

    private void jButton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseClicked
        
        jButton58.setVisible(true);
        if(specialVM.getSlots(1) == null || specialVM.getSlots(1).getItem().getsName().equalsIgnoreCase("Strawberry_Syrup") 
                            || specialVM.getSlots(1).getItem().getsName().equalsIgnoreCase("Caramel_Syrup")
                            || specialVM.getSlots(1).getItem().getsName().equalsIgnoreCase("Chocolate_Syrup")){
                        jTextField29.setVisible(true);
                        jTextField29.setCaretColor(Color.red);
                        jTextField29.setText("Invalid Input...");
                    }
                    else{
                        nValid = specialVM.Dispense((1), currency);

                        switch (nValid) {
                            case -1 -> {
                                jTextField29.setVisible(true);
                                    jTextField29.setCaretColor(Color.red);
                                    jTextField29.setText("SOLD OUT!");
                            }
                            case -2 -> {
                                jTextField29.setVisible(true);
                                    jTextField29.setCaretColor(Color.red);
                                    jTextField29.setText("Insufficient Balance");
                            }
                            case -3 -> {
                                jTextField29.setVisible(true);
                                    jTextField29.setCaretColor(Color.red);
                                    jTextField29.setText("Invalid Choice...");
                            }
                            default -> {
                                jTextField29.setVisible(true);
                                    jTextField29.setCaretColor(Color.blue);
                                    jTextField29.setText(specialVM.getSlots(1).getItem().getsName() + " added to cart");
                                currency = nValid;
                                temp_slot_quantity[1] += 1;  //used to bring back quantity if needed
                                betaTotalMoney.setText("P" + Integer.toString(currency));
                            }
                        }
                    }
    }//GEN-LAST:event_jButton11MouseClicked

    private void jButton16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton16MouseClicked
        
        jButton58.setVisible(true);
        if(specialVM.getSlots(2) == null || specialVM.getSlots(2).getItem().getsName().equalsIgnoreCase("Strawberry_Syrup") 
                            || specialVM.getSlots(2).getItem().getsName().equalsIgnoreCase("Caramel_Syrup")
                            || specialVM.getSlots(2).getItem().getsName().equalsIgnoreCase("Chocolate_Syrup")){
                        jTextField29.setVisible(true);
                        jTextField29.setCaretColor(Color.red);
                        jTextField29.setText("Invalid Input...");
                    }
                    else{
                        nValid = specialVM.Dispense((2), currency);

                        switch (nValid) {
                            case -1 -> {
                                jTextField29.setVisible(true);
                                    jTextField29.setCaretColor(Color.red);
                                    jTextField29.setText("SOLD OUT!");
                            }
                            case -2 -> {
                                jTextField29.setVisible(true);
                                    jTextField29.setCaretColor(Color.red);
                                    jTextField29.setText("Insufficient Balance");
                            }
                            case -3 -> {
                                jTextField29.setVisible(true);
                                    jTextField29.setCaretColor(Color.red);
                                    jTextField29.setText("Invalid Choice...");
                            }
                            default -> {
                                jTextField29.setVisible(true);
                                    jTextField29.setCaretColor(Color.blue);
                                    jTextField29.setText(specialVM.getSlots(2).getItem().getsName() + " added to cart");
                                currency = nValid;
                                temp_slot_quantity[2] += 1;  //used to bring back quantity if needed
                                betaTotalMoney.setText("P" + Integer.toString(currency));
                            }
                        }
                    }
    }//GEN-LAST:event_jButton16MouseClicked

    private void jButton17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton17MouseClicked
        
        jButton58.setVisible(true);
        if(specialVM.getSlots(3) == null || specialVM.getSlots(3).getItem().getsName().equalsIgnoreCase("Strawberry_Syrup") 
                            || specialVM.getSlots(3).getItem().getsName().equalsIgnoreCase("Caramel_Syrup")
                            || specialVM.getSlots(3).getItem().getsName().equalsIgnoreCase("Chocolate_Syrup")){
                        jTextField29.setVisible(true);
                        jTextField29.setCaretColor(Color.red);
                        jTextField29.setText("Invalid Input...");
                    }
                    else{
                        nValid = specialVM.Dispense((3), currency);

                        switch (nValid) {
                            case -1 -> {
                                jTextField29.setVisible(true);
                                    jTextField29.setCaretColor(Color.red);
                                    jTextField29.setText("SOLD OUT!");
                            }
                            case -2 -> {
                                jTextField29.setVisible(true);
                                    jTextField29.setCaretColor(Color.red);
                                    jTextField29.setText("Insufficient Balance");
                            }
                            case -3 -> {
                                jTextField29.setVisible(true);
                                    jTextField29.setCaretColor(Color.red);
                                    jTextField29.setText("Invalid Choice...");
                            }
                            default -> {
                                jTextField29.setVisible(true);
                                    jTextField29.setCaretColor(Color.blue);
                                    jTextField29.setText(specialVM.getSlots(3).getItem().getsName() + " added to cart");
                                currency = nValid;
                                temp_slot_quantity[3] += 1;  //used to bring back quantity if needed
                                betaTotalMoney.setText("P" + Integer.toString(currency));
                            }
                        }
                    }
    }//GEN-LAST:event_jButton17MouseClicked

    private void jButton18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton18MouseClicked
        
        jButton58.setVisible(true);
        if(specialVM.getSlots(4) == null || specialVM.getSlots(4).getItem().getsName().equalsIgnoreCase("Strawberry_Syrup") 
                            || specialVM.getSlots(4).getItem().getsName().equalsIgnoreCase("Caramel_Syrup")
                            || specialVM.getSlots(4).getItem().getsName().equalsIgnoreCase("Chocolate_Syrup")){
                        jTextField29.setVisible(true);
                        jTextField29.setCaretColor(Color.red);
                        jTextField29.setText("Invalid Input...");
                    }
                    else{
                        nValid = specialVM.Dispense((4), currency);

                        switch (nValid) {
                            case -1 -> {
                                jTextField29.setVisible(true);
                                    jTextField29.setCaretColor(Color.red);
                                    jTextField29.setText("SOLD OUT!");
                            }
                            case -2 -> {
                                jTextField29.setVisible(true);
                                    jTextField29.setCaretColor(Color.red);
                                    jTextField29.setText("Insufficient Balance");
                            }
                            case -3 -> {
                                jTextField29.setVisible(true);
                                    jTextField29.setCaretColor(Color.red);
                                    jTextField29.setText("Invalid Choice...");
                            }
                            default -> {
                                jTextField29.setVisible(true);
                                    jTextField29.setCaretColor(Color.blue);
                                    jTextField29.setText(specialVM.getSlots(4).getItem().getsName() + " added to cart");
                                currency = nValid;
                                temp_slot_quantity[4] += 1;  //used to bring back quantity if needed
                                betaTotalMoney.setText("P" + Integer.toString(currency));
                            }
                        }
                    }
    }//GEN-LAST:event_jButton18MouseClicked

    private void jButton19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton19MouseClicked
        
        jButton58.setVisible(true);
        if(specialVM.getSlots(5) == null || specialVM.getSlots(5).getItem().getsName().equalsIgnoreCase("Strawberry_Syrup") 
                            || specialVM.getSlots(5).getItem().getsName().equalsIgnoreCase("Caramel_Syrup")
                            || specialVM.getSlots(5).getItem().getsName().equalsIgnoreCase("Chocolate_Syrup")){
                        jTextField29.setVisible(true);
                        jTextField29.setCaretColor(Color.red);
                        jTextField29.setText("Invalid Input...");
                    }
                    else{
                        nValid = specialVM.Dispense((5), currency);

                        switch (nValid) {
                            case -1 -> {
                                jTextField29.setVisible(true);
                                    jTextField29.setCaretColor(Color.red);
                                    jTextField29.setText("SOLD OUT!");
                            }
                            case -2 -> {
                                jTextField29.setVisible(true);
                                    jTextField29.setCaretColor(Color.red);
                                    jTextField29.setText("Insufficient Balance");
                            }
                            case -3 -> {
                                jTextField29.setVisible(true);
                                    jTextField29.setCaretColor(Color.red);
                                    jTextField29.setText("Invalid Choice...");
                            }
                            default -> {
                                jTextField29.setVisible(true);
                                    jTextField29.setCaretColor(Color.blue);
                                    jTextField29.setText(specialVM.getSlots(5).getItem().getsName() + " added to cart");
                                currency = nValid;
                                temp_slot_quantity[5] += 1;  //used to bring back quantity if needed
                                betaTotalMoney.setText("P" + Integer.toString(currency));
                            }
                        }
                    }
    }//GEN-LAST:event_jButton19MouseClicked

    private void jButton20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton20MouseClicked
        
        jButton58.setVisible(true);
        if(specialVM.getSlots(6) == null || specialVM.getSlots(6).getItem().getsName().equalsIgnoreCase("Strawberry_Syrup") 
                            || specialVM.getSlots(6).getItem().getsName().equalsIgnoreCase("Caramel_Syrup")
                            || specialVM.getSlots(6).getItem().getsName().equalsIgnoreCase("Chocolate_Syrup")){
                        jTextField29.setVisible(true);
                        jTextField29.setCaretColor(Color.red);
                        jTextField29.setText("Invalid Input...");
                    }
                    else{
                        nValid = specialVM.Dispense((6), currency);

                        switch (nValid) {
                            case -1 -> {
                                jTextField29.setVisible(true);
                                    jTextField29.setCaretColor(Color.red);
                                    jTextField29.setText("SOLD OUT!");
                            }
                            case -2 -> {
                                jTextField29.setVisible(true);
                                    jTextField29.setCaretColor(Color.red);
                                    jTextField29.setText("Insufficient Balance");
                            }
                            case -3 -> {
                                jTextField29.setVisible(true);
                                    jTextField29.setCaretColor(Color.red);
                                    jTextField29.setText("Invalid Choice...");
                            }
                            default -> {
                                jTextField29.setVisible(true);
                                    jTextField29.setCaretColor(Color.blue);
                                    jTextField29.setText(specialVM.getSlots(6).getItem().getsName() + " added to cart");
                                currency = nValid;
                                temp_slot_quantity[6] += 1;  //used to bring back quantity if needed
                                betaTotalMoney.setText("P" + Integer.toString(currency));
                            }
                        }
                    }
    }//GEN-LAST:event_jButton20MouseClicked

    private void jButton21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton21MouseClicked
        
        jButton58.setVisible(true);
        if(specialVM.getSlots(7) == null || specialVM.getSlots(7).getItem().getsName().equalsIgnoreCase("Strawberry_Syrup") 
                            || specialVM.getSlots(7).getItem().getsName().equalsIgnoreCase("Caramel_Syrup")
                            || specialVM.getSlots(7).getItem().getsName().equalsIgnoreCase("Chocolate_Syrup")){
                        jTextField29.setVisible(true);
                        jTextField29.setCaretColor(Color.red);
                        jTextField29.setText("Invalid Input...");
                    }
                    else{
                        nValid = specialVM.Dispense((7), currency);

                        switch (nValid) {
                            case -1 -> {
                                jTextField29.setVisible(true);
                                    jTextField29.setCaretColor(Color.red);
                                    jTextField29.setText("SOLD OUT!");
                            }
                            case -2 -> {
                                jTextField29.setVisible(true);
                                    jTextField29.setCaretColor(Color.red);
                                    jTextField29.setText("Insufficient Balance");
                            }
                            case -3 -> {
                                jTextField29.setVisible(true);
                                    jTextField29.setCaretColor(Color.red);
                                    jTextField29.setText("Invalid Choice...");
                            }
                            default -> {
                                jTextField29.setVisible(true);
                                    jTextField29.setCaretColor(Color.blue);
                                    jTextField29.setText(specialVM.getSlots(7).getItem().getsName() + " added to cart");
                                currency = nValid;
                                temp_slot_quantity[7] += 1;  //used to bring back quantity if needed
                                betaTotalMoney.setText("P" + Integer.toString(currency));
                            }
                        }
                    }
    }//GEN-LAST:event_jButton21MouseClicked

    private void jButton22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton22MouseClicked
        
        jButton58.setVisible(true);
        if(specialVM.getSlots(8) == null || specialVM.getSlots(8).getItem().getsName().equalsIgnoreCase("Strawberry_Syrup") 
                            || specialVM.getSlots(8).getItem().getsName().equalsIgnoreCase("Caramel_Syrup")
                            || specialVM.getSlots(8).getItem().getsName().equalsIgnoreCase("Chocolate_Syrup")){
                        jTextField29.setVisible(true);
                        jTextField29.setCaretColor(Color.red);
                        jTextField29.setText("Invalid Input...");
                    }
                    else{
                        nValid = specialVM.Dispense((8), currency);

                        switch (nValid) {
                            case -1 -> {
                                jTextField29.setVisible(true);
                                    jTextField29.setCaretColor(Color.red);
                                    jTextField29.setText("SOLD OUT!");
                            }
                            case -2 -> {
                                jTextField29.setVisible(true);
                                    jTextField29.setCaretColor(Color.red);
                                    jTextField29.setText("Insufficient Balance");
                            }
                            case -3 -> {
                                jTextField29.setVisible(true);
                                    jTextField29.setCaretColor(Color.red);
                                    jTextField29.setText("Invalid Choice...");
                            }
                            default -> {
                                jTextField29.setVisible(true);
                                    jTextField29.setCaretColor(Color.blue);
                                    jTextField29.setText(specialVM.getSlots(8).getItem().getsName() + " added to cart");
                                currency = nValid;
                                temp_slot_quantity[8] += 1;  //used to bring back quantity if needed
                                betaTotalMoney.setText("P" + Integer.toString(currency));
                            }
                        }
                    }
    }//GEN-LAST:event_jButton22MouseClicked

    private void jButton23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton23MouseClicked
        
        jButton58.setVisible(true);
        if(specialVM.getSlots(9) == null || specialVM.getSlots(9).getItem().getsName().equalsIgnoreCase("Strawberry_Syrup") 
                            || specialVM.getSlots(9).getItem().getsName().equalsIgnoreCase("Caramel_Syrup")
                            || specialVM.getSlots(9).getItem().getsName().equalsIgnoreCase("Chocolate_Syrup")){
                        jTextField29.setVisible(true);
                        jTextField29.setCaretColor(Color.red);
                        jTextField29.setText("Invalid Input...");
                    }
                    else{
                        nValid = specialVM.Dispense((9), currency);

                        switch (nValid) {
                            case -1 -> {
                                jTextField29.setVisible(true);
                                    jTextField29.setCaretColor(Color.red);
                                    jTextField29.setText("SOLD OUT!");
                            }
                            case -2 -> {
                                jTextField29.setVisible(true);
                                    jTextField29.setCaretColor(Color.red);
                                    jTextField29.setText("Insufficient Balance");
                            }
                            case -3 -> {
                                jTextField29.setVisible(true);
                                    jTextField29.setCaretColor(Color.red);
                                    jTextField29.setText("Invalid Choice...");
                            }
                            default -> {
                                jTextField29.setVisible(true);
                                    jTextField29.setCaretColor(Color.blue);
                                    jTextField29.setText(specialVM.getSlots(9).getItem().getsName() + " added to cart");
                                currency = nValid;
                                temp_slot_quantity[9] += 1;  //used to bring back quantity if needed
                                betaTotalMoney.setText("P" + Integer.toString(currency));
                            }
                        }
                    }
    }//GEN-LAST:event_jButton23MouseClicked

    private void jButton24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton24MouseClicked
        
        jButton58.setVisible(true);
        if(specialVM.getSlots(10) == null || specialVM.getSlots(10).getItem().getsName().equalsIgnoreCase("Strawberry_Syrup") 
                            || specialVM.getSlots(10).getItem().getsName().equalsIgnoreCase("Caramel_Syrup")
                            || specialVM.getSlots(10).getItem().getsName().equalsIgnoreCase("Chocolate_Syrup")){
                        jTextField29.setVisible(true);
                        jTextField29.setCaretColor(Color.red);
                        jTextField29.setText("Invalid Input...");
                    }
                    else{
                        nValid = specialVM.Dispense((10), currency);

                        switch (nValid) {
                            case -1 -> {
                                jTextField29.setVisible(true);
                                    jTextField29.setCaretColor(Color.red);
                                    jTextField29.setText("SOLD OUT!");
                            }
                            case -2 -> {
                                jTextField29.setVisible(true);
                                    jTextField29.setCaretColor(Color.red);
                                    jTextField29.setText("Insufficient Balance");
                            }
                            case -3 -> {
                                jTextField29.setVisible(true);
                                    jTextField29.setCaretColor(Color.red);
                                    jTextField29.setText("Invalid Choice...");
                            }
                            default -> {
                                jTextField29.setVisible(true);
                                    jTextField29.setCaretColor(Color.blue);
                                    jTextField29.setText(specialVM.getSlots(10).getItem().getsName() + " added to cart");
                                currency = nValid;
                                temp_slot_quantity[10] += 1;  //used to bring back quantity if needed
                                betaTotalMoney.setText("P" + Integer.toString(currency));   
                            }
                        }
                    }
    }//GEN-LAST:event_jButton24MouseClicked


    private void jButton58MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton58MouseClicked
        
        jButton41.setVisible(true);
        jButton58.setVisible(false);
        defaulttab.setVisible(true);
        if (currency != 0) {
                            //calls the change getter 
                            int tempchange = specialVM.getChangeforCustomer(initialMoney, (initialMoney - currency));

                            if(tempchange == currency) {
                                jTextArea1.setText("Here is your Change: P" + tempchange + "\n");
                                specialVM.getSummaryReceipt().AppendSales(initialMoney - tempchange);
                                if(saveEspresso != -1) {
                                    jTextArea1.append("\nTotal Calories: " + Double.toString(totalcal));
                                    jTextArea1.append("\nPulling a fresh shot of Espresso...");
                                }
                                if(saveMilk != -1) {
                                    jTextArea1.append("\nAdding " + specialVM.getSlots(saveMilk).getItem().getsName() + "...");
                                }
                                if(saveSyrup != -1) {
                                   jTextArea1.append("\nPouring " + specialVM.getSlots(saveSyrup).getItem().getsName() + "..."); 
                                }
                            
                                if(saveTopping != -1) {
                                    jTextArea1.append("\nTopping with " + specialVM.getSlots(saveTopping).getItem().getsName() + "...");
                                }
                                
                                specialVM.getSummaryReceipt().setEndingInventory(specialVM.getSlotClass());
                                for(int i = 0; i < specialVM.getnSlotCapacity(); i++) {
                                    if(specialVM.getSlots(i) != null)
                                    {
                                        itemTable.setValueAt(specialVM.getItemQuantity(i), i, 3);
                                    }
                                }
                                
                                
                            }
                            else {
                                jTextArea1.setText("Initial Deposit = " + initialMoney);
                                jTextArea1.append("\nVending Machine Currently don't have enough CHANGE (T_T)");
                                jTextArea1.append("\nWe will extract back your money! Sorry ('_')");
                                jTextArea1.append("\nExtracting back initial deposit... ");
                                specialVM.getChangeforCustomer(initialMoney, tempchange);

                            // This is used if ever the Vending Machine does have change
                            // If no change, the decremented quantity of a certain item will be incremented
                                for(int j = 0; j < specialVM.getnSlotCapacity(); j++) {

                                    if(specialVM.getSlots(j) != null)
                                        specialVM.getSlots(j).setnQuantity(specialVM.getSlots(j).getnQuantity() + temp_slot_quantity[j]);
                                }
                            }
                            
                        }
                        else {
                         jTextArea1.setText("Here is your Change: P0");
                          specialVM.getSummaryReceipt().AppendSales(initialMoney - currency);
                          if(saveEspresso != -1) {
                            jTextArea1.append("\nTotal Calories: " + Double.toString(totalcal));
                            jTextArea1.append("\nPulling a fresh shot of Espresso...");
                          }
                          if(saveMilk != -1) {
                            jTextArea1.append("\nAdding " + specialVM.getSlots(saveMilk).getItem().getsName() + "...");
                          }
                          
                          if(saveSyrup != -1) {
                            jTextArea1.append("\nPouring " + specialVM.getSlots(saveSyrup).getItem().getsName() + "...");
                          }
                            
                            if(saveTopping != -1) {
                                jTextArea1.append("\nTopping with " + specialVM.getSlots(saveTopping).getItem().getsName() + "...");
                            }
                          specialVM.getSummaryReceipt().setEndingInventory(specialVM.getSlotClass());
                          
                                
                                        
                        for(int i = 0; i < specialVM.getnSlotCapacity(); i++) {
                            if(specialVM.getSlots(i) != null)
                            {
                                itemTable.setValueAt(specialVM.getItemQuantity(i), i, 3);
                            }
                        }
                        }
        currency = 0;
        amount = 0;
        initialMoney = 0;
    }//GEN-LAST:event_jButton58MouseClicked

    private void jButton59MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton59MouseClicked
        
        for(int i = 0; i < specialVM.nSlotCapacity; i++) {
            if(specialVM.getSlots(i) != null){
                if (specialVM.getSlots(i).getItem().getsName().equalsIgnoreCase(jButton59.getText())){
                    amount -= specialVM.getSlots(i).getnPrice();
                    saveEspresso = i;
                    totalcal += specialVM.getSlots(i).getItem().getdCalories();
                }
            }
        }
        betaTotalMoney.setText(Integer.toString(amount));
        
        for(int i = 0; i < specialVM.nSlotCapacity; i++) {
              if(specialVM.getSlots(i) != null){ 
                  if (specialVM.getSlots(i).getItem().getsName().equalsIgnoreCase("Almond_Milk") || specialVM.getSlots(i).getItem().getsName().equalsIgnoreCase("Normal_Milk") 
                          || specialVM.getSlots(i).getItem().getsName().equalsIgnoreCase("Soy_Milk") || specialVM.getSlots(i).getItem().getsName().equalsIgnoreCase("Oat_Milk")) {
                      if(specialVM.getSlots(i).getnPrice() <= amount && specialVM.getSlots(i).getnQuantity() > 0) {
                          if(jButton48.getText().equalsIgnoreCase("")) {
                            jButton48.setText(specialVM.getSlots(i).getItem().getsName());  
                          }
                          else {
                              if(jButton49.getText().equalsIgnoreCase("")) {
                                  jButton49.setText(specialVM.getSlots(i).getItem().getsName());  
                              }
                              else {
                                  if(jButton50.getText().equalsIgnoreCase("")) {
                                      jButton50.setText(specialVM.getSlots(i).getItem().getsName());  
                                   }
                                  else {
                                      if(jButton51.getText().equalsIgnoreCase("")) {
                                          jButton51.setText(specialVM.getSlots(i).getItem().getsName());  
                                      }
                                  }
                              }

                          }

                      }
                  }
              }
          }
        
        
        SVM_Espresso.setVisible(false);
        SVM_Personalized.setVisible(true);
    }//GEN-LAST:event_jButton59MouseClicked

    private void jButton60MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton60MouseClicked
        
        currency += 1;
        betaTotalMoney3.setText("P" + Integer.toString(currency));
        
        if(regularVM != null) {
            int nOnes = regularVM.getMoneyBox().getnOnes();
            nOnes++;

            ones.setText(Integer.toString(nOnes));

             regularVM.replenishChange(1, 0, 0,0, 0, 0);
        }
        else {
            int nOnes = specialVM.getMoneyBox().getnOnes();
            nOnes++;

            ones.setText(Integer.toString(nOnes));

            specialVM.replenishChange(1, 0, 0,0, 0, 0);
        }
    }//GEN-LAST:event_jButton60MouseClicked

    private void jButton61MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton61MouseClicked
        
        currency += 5;
        betaTotalMoney3.setText("P" + Integer.toString(currency));
        if(regularVM != null) {
            int nFives = regularVM.getMoneyBox().getnFives();
            nFives++;

            fives.setText(Integer.toString(nFives));

             regularVM.replenishChange(0, 1, 0,0, 0, 0);
        }
        else {
            int nFives = specialVM.getMoneyBox().getnFives();
            nFives++;

            fives.setText(Integer.toString(nFives));

            specialVM.replenishChange(0, 1, 0,0, 0, 0);
        }
    }//GEN-LAST:event_jButton61MouseClicked

    private void jButton62MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton62MouseClicked
        
        currency += 10;
        betaTotalMoney3.setText("P" + Integer.toString(currency));

        if(regularVM != null) {
            int nTens = regularVM.getMoneyBox().getnTens();
            nTens++;

            tens.setText(Integer.toString(nTens));

             regularVM.replenishChange(0, 0, 1,0, 0, 0);
        }
        else {
            int nTens = specialVM.getMoneyBox().getnTens();
            nTens++;

            tens.setText(Integer.toString(nTens));

            specialVM.replenishChange(0, 0, 1,0, 0, 0);
        }
    }//GEN-LAST:event_jButton62MouseClicked

    private void jButton63MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton63MouseClicked
        
        currency += 100;
        betaTotalMoney3.setText("P" + Integer.toString(currency));

        if(regularVM != null) {
            int nHundreds = regularVM.getMoneyBox().getnHundreds();
            nHundreds++;

            hundred.setText(Integer.toString(nHundreds));

             regularVM.replenishChange(0, 0, 0,0, 0, 1);
        }
        else {
            int nHundreds = specialVM.getMoneyBox().getnHundreds();
            nHundreds++;

            hundred.setText(Integer.toString(nHundreds));

            specialVM.replenishChange(0, 0, 0,0, 0, 1);
        }
    }//GEN-LAST:event_jButton63MouseClicked

    private void jButton64MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton64MouseClicked
        
        currency += 50;
        betaTotalMoney3.setText("P" + Integer.toString(currency));

        if(regularVM != null) {
            int nFifties = regularVM.getMoneyBox().getnFifties();
            nFifties++;

            fifty.setText(Integer.toString(nFifties));

             regularVM.replenishChange(0, 0, 0,0, 1, 0);
        }
        else {
            int nFifties = specialVM.getMoneyBox().getnFifties();
            nFifties++;

            fifty.setText(Integer.toString(nFifties));

            specialVM.replenishChange(0, 0, 0,0, 1, 0);
        }
    }//GEN-LAST:event_jButton64MouseClicked

    private void jButton65MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton65MouseClicked
        
        currency += 20;
        betaTotalMoney3.setText("P" + Integer.toString(currency));

        if(regularVM != null) {
            int nTwenties = regularVM.getMoneyBox().getnTwenties();
           nTwenties++;

           twenty.setText(Integer.toString(nTwenties));

             regularVM.replenishChange(0, 0, 0,1, 0, 0);
        }
        else {
            int nTwenties = specialVM.getMoneyBox().getnTwenties();
            nTwenties++;

            twenty.setText(Integer.toString(nTwenties));

            specialVM.replenishChange(0, 0, 0,1, 0, 0);
        }
    }//GEN-LAST:event_jButton65MouseClicked

    private void jButton66MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton66MouseClicked
        
        jButton81.setVisible(false);
        jPanel13.setVisible(false);
        Regular_Check.setVisible(true);
        Regular_Done.setVisible(true);
        amount = currency;
        initialMoney = currency;
    }//GEN-LAST:event_jButton66MouseClicked

    private void Regular_DoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Regular_DoneMouseClicked
        
        Text.setVisible(true);
        jButton81.setVisible(true);
        Regular_Done.setVisible(false);
        if (currency != 0) {
                            //calls the change getter 
                            int tempchange = regularVM.getChangeforCustomer(initialMoney, (initialMoney - currency));

                            if(tempchange == currency) {
                                Regular_Check.setText("Here is your Change: P" + tempchange + "\n");
                                regularVM.getSummaryReceipt().AppendSales(initialMoney - tempchange);

                                
                                regularVM.getSummaryReceipt().setEndingInventory(regularVM.getSlotClass());
                                
                                for(int i = 0; i < regularVM.getnSlotCapacity(); i++) {
                                    if(regularVM.getSlots(i) != null) {
                                        itemTable.setValueAt(regularVM.getItemQuantity(i), i, 3);
                                        tableRVM.setValueAt(regularVM.getItemQuantity(i), i, 4);
                                    }
                                        
                                }
                                
                            }
                            else {
                               Text.setText("Initial Deposit = " + initialMoney);
                                Text.append("\nVending Machine Currently don't have enough CHANGE (T_T)");
                                Text.append("\nWe will extract back your money! Sorry ('_')");
                                Text.append("\nExtracting back initial deposit... ");

                                regularVM.getChangeforCustomer(initialMoney, tempchange);

                            // This is used if ever the Vending Machine does have change
                            // If no change, the decremented quantity of a certain item will be incremented
                                for(int j = 0; j < regularVM.getnSlotCapacity(); j++) {

                                    if(regularVM.getSlots(j) != null)
                                        regularVM.getSlots(j).setnQuantity(regularVM.getSlots(j).getnQuantity() + temp_slot_quantity[j]);
                                }
                            }
                            
                            
                            
                        }
                        else {
                         Regular_Check.setText("Here is your Change: P0");
                          regularVM.getSummaryReceipt().AppendSales(initialMoney - currency);
                          
                        Text.setText("Done!\n");
                          Text.append("\nPress Exit ");
                          Text.append("\nTo Dispense");
                          
                          regularVM.getSummaryReceipt().setEndingInventory(regularVM.getSlotClass());
                                
                            for(int i = 0; i < regularVM.getnSlotCapacity(); i++) {
                                if(regularVM.getSlots(i) != null) {
                                    tableRVM.setValueAt(regularVM.getItemQuantity(i), i, 4);
                                    itemTable.setValueAt(regularVM.getItemQuantity(i), i, 3);
                                }
                                    
                                
                            }
                        }
        currency = 0;
        amount = 0;
        initialMoney = 0;
        
    }//GEN-LAST:event_Regular_DoneMouseClicked

    private void jButton68MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton68MouseClicked
        
        Regular_Done.setVisible(true);
        if(regularVM.getSlots(1) == null){
                Regular_Check.setVisible(true);
                Regular_Check.setCaretColor(Color.red);
                Regular_Check.setText("Invalid Input...");
        }
        else{
            nValid = regularVM.Dispense((1), currency);

            switch (nValid) {
                case -1 -> {
                   Regular_Check.setVisible(true);
                        Regular_Check.setCaretColor(Color.red);
                        Regular_Check.setText("SOLD OUT!");
                }
                case -2 -> {
                   Regular_Check.setVisible(true);
                        Regular_Check.setCaretColor(Color.red);
                        Regular_Check.setText("Insufficient Balance");
                }
                case -3 -> {
                    Regular_Check.setVisible(true);
                        Regular_Check.setCaretColor(Color.red);
                        Regular_Check.setText("Invalid Choice...");
                }
                default -> {
                    Regular_Check.setVisible(true);
                        Regular_Check.setCaretColor(Color.blue);
                        Regular_Check.setText("Bought!");
                    currency = nValid;
                    temp_slot_quantity[1] += 1;  //used to bring back quantity if needed
                    betaTotalMoney3.setText("P" + Integer.toString(currency));
                }
            }
        }
    }//GEN-LAST:event_jButton68MouseClicked

    private void jButton70MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton70MouseClicked
        
        Regular_Done.setVisible(true);
        if(regularVM.getSlots(2) == null){
                Regular_Check.setVisible(true);
                Regular_Check.setCaretColor(Color.red);
                Regular_Check.setText("Invalid Input...");
        }
        else{
            nValid = regularVM.Dispense((2), currency);

            switch (nValid) {
                case -1 -> {
                   Regular_Check.setVisible(true);
                        Regular_Check.setCaretColor(Color.red);
                        Regular_Check.setText("SOLD OUT!");
                }
                case -2 -> {
                   Regular_Check.setVisible(true);
                        Regular_Check.setCaretColor(Color.red);
                        Regular_Check.setText("Insufficient Balance");
                }
                case -3 -> {
                    Regular_Check.setVisible(true);
                        Regular_Check.setCaretColor(Color.red);
                        Regular_Check.setText("Invalid Choice...");
                }
                default -> {
                    Regular_Check.setVisible(true);
                        Regular_Check.setCaretColor(Color.blue);
                        Regular_Check.setText("Bought!");
                    currency = nValid;
                    temp_slot_quantity[2] += 1;  //used to bring back quantity if needed
                    betaTotalMoney3.setText("P" + Integer.toString(currency));
                }
            }
        }
    }//GEN-LAST:event_jButton70MouseClicked

    private void jButton71MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton71MouseClicked
        
        Regular_Done.setVisible(true);
        if(regularVM.getSlots(3) == null){
                Regular_Check.setVisible(true);
                Regular_Check.setCaretColor(Color.red);
                Regular_Check.setText("Invalid Input...");
        }
        else{
            nValid = regularVM.Dispense((3), currency);

            switch (nValid) {
                case -1 -> {
                   Regular_Check.setVisible(true);
                        Regular_Check.setCaretColor(Color.red);
                        Regular_Check.setText("SOLD OUT!");
                }
                case -2 -> {
                   Regular_Check.setVisible(true);
                        Regular_Check.setCaretColor(Color.red);
                        Regular_Check.setText("Insufficient Balance");
                }
                case -3 -> {
                    Regular_Check.setVisible(true);
                        Regular_Check.setCaretColor(Color.red);
                        Regular_Check.setText("Invalid Choice...");
                }
                default -> {
                    Regular_Check.setVisible(true);
                        Regular_Check.setCaretColor(Color.blue);
                        Regular_Check.setText("Bought!");
                    currency = nValid;
                    temp_slot_quantity[3] += 1;  //used to bring back quantity if needed
                    betaTotalMoney3.setText("P" + Integer.toString(currency));
                }
            }
        }
    }//GEN-LAST:event_jButton71MouseClicked

    private void jButton72MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton72MouseClicked
        
        Regular_Done.setVisible(true);
        if(regularVM.getSlots(4) == null){
                Regular_Check.setVisible(true);
                Regular_Check.setCaretColor(Color.red);
                Regular_Check.setText("Invalid Input...");
        }
        else{
            nValid = regularVM.Dispense((4), currency);

            switch (nValid) {
                case -1 -> {
                   Regular_Check.setVisible(true);
                        Regular_Check.setCaretColor(Color.red);
                        Regular_Check.setText("SOLD OUT!");
                }
                case -2 -> {
                   Regular_Check.setVisible(true);
                        Regular_Check.setCaretColor(Color.red);
                        Regular_Check.setText("Insufficient Balance");
                }
                case -3 -> {
                    Regular_Check.setVisible(true);
                        Regular_Check.setCaretColor(Color.red);
                        Regular_Check.setText("Invalid Choice...");
                }
                default -> {
                    Regular_Check.setVisible(true);
                        Regular_Check.setCaretColor(Color.blue);
                        Regular_Check.setText("Bought!");
                    currency = nValid;
                    temp_slot_quantity[4] += 1;  //used to bring back quantity if needed
                    betaTotalMoney3.setText("P" + Integer.toString(currency));
                }
            }
        }
    }//GEN-LAST:event_jButton72MouseClicked

    private void jButton73MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton73MouseClicked
        
        Regular_Done.setVisible(true);
        if(regularVM.getSlots(5) == null){
                Regular_Check.setVisible(true);
                Regular_Check.setCaretColor(Color.red);
                Regular_Check.setText("Invalid Input...");
        }
        else{
            nValid = regularVM.Dispense((5), currency);

            switch (nValid) {
                case -1 -> {
                   Regular_Check.setVisible(true);
                        Regular_Check.setCaretColor(Color.red);
                        Regular_Check.setText("SOLD OUT!");
                }
                case -2 -> {
                   Regular_Check.setVisible(true);
                        Regular_Check.setCaretColor(Color.red);
                        Regular_Check.setText("Insufficient Balance");
                }
                case -3 -> {
                    Regular_Check.setVisible(true);
                        Regular_Check.setCaretColor(Color.red);
                        Regular_Check.setText("Invalid Choice...");
                }
                default -> {
                    Regular_Check.setVisible(true);
                        Regular_Check.setCaretColor(Color.blue);
                        Regular_Check.setText("Bought!");
                    currency = nValid;
                    temp_slot_quantity[5] += 1;  //used to bring back quantity if needed
                    betaTotalMoney3.setText("P" + Integer.toString(currency));
                }
            }
        }
    }//GEN-LAST:event_jButton73MouseClicked

    private void jButton74MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton74MouseClicked
        
        Regular_Done.setVisible(true);
        if(regularVM.getSlots(6) == null){
            Regular_Check.setVisible(true);
            Regular_Check.setCaretColor(Color.red);
            Regular_Check.setText("Invalid Input...");
        }
        else{
            nValid = regularVM.Dispense((6), currency);

            switch (nValid) {
                case -1 -> {
                    Regular_Check.setVisible(true);
                    Regular_Check.setCaretColor(Color.red);
                    Regular_Check.setText("SOLD OUT!");
                }
                case -2 -> {
                    Regular_Check.setVisible(true);
                    Regular_Check.setCaretColor(Color.red);
                    Regular_Check.setText("Insufficient Balance");
                }
                case -3 -> {
                    Regular_Check.setVisible(true);
                    Regular_Check.setCaretColor(Color.red);
                    Regular_Check.setText("Invalid Choice...");
                }
                default -> {
                    Regular_Check.setVisible(true);
                    Regular_Check.setCaretColor(Color.blue);
                    Regular_Check.setText("Bought!");
                    currency = nValid;
                    temp_slot_quantity[6] += 1;  //used to bring back quantity if needed
                    betaTotalMoney3.setText("P" + Integer.toString(currency));
                }
            }
        }
    }//GEN-LAST:event_jButton74MouseClicked

    private void jButton75MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton75MouseClicked
        
        Regular_Done.setVisible(true);
        if(regularVM.getSlots(7) == null){
                Regular_Check.setVisible(true);
                Regular_Check.setCaretColor(Color.red);
                Regular_Check.setText("Invalid Input...");
        }
        else{
            nValid = regularVM.Dispense((7), currency);

            switch (nValid) {
                case -1 -> {
                   Regular_Check.setVisible(true);
                        Regular_Check.setCaretColor(Color.red);
                        Regular_Check.setText("SOLD OUT!");
                }
                case -2 -> {
                   Regular_Check.setVisible(true);
                        Regular_Check.setCaretColor(Color.red);
                        Regular_Check.setText("Insufficient Balance");
                }
                case -3 -> {
                    Regular_Check.setVisible(true);
                        Regular_Check.setCaretColor(Color.red);
                        Regular_Check.setText("Invalid Choice...");
                }
                default -> {
                    Regular_Check.setVisible(true);
                        Regular_Check.setCaretColor(Color.blue);
                        Regular_Check.setText("Bought!");
                    currency = nValid;
                    temp_slot_quantity[7] += 1;  //used to bring back quantity if needed
                    betaTotalMoney3.setText("P" + Integer.toString(currency));
                }
            }
        }
    }//GEN-LAST:event_jButton75MouseClicked

    private void jButton76MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton76MouseClicked
        
        Regular_Done.setVisible(true);
        if(regularVM.getSlots(8) == null){
                Regular_Check.setVisible(true);
                Regular_Check.setCaretColor(Color.red);
                Regular_Check.setText("Invalid Input...");
        }
        else{
            nValid = regularVM.Dispense((8), currency);

            switch (nValid) {
                case -1 -> {
                   Regular_Check.setVisible(true);
                        Regular_Check.setCaretColor(Color.red);
                        Regular_Check.setText("SOLD OUT!");
                }
                case -2 -> {
                   Regular_Check.setVisible(true);
                        Regular_Check.setCaretColor(Color.red);
                        Regular_Check.setText("Insufficient Balance");
                }
                case -3 -> {
                    Regular_Check.setVisible(true);
                        Regular_Check.setCaretColor(Color.red);
                        Regular_Check.setText("Invalid Choice...");
                }
                default -> {
                    Regular_Check.setVisible(true);
                        Regular_Check.setCaretColor(Color.blue);
                        Regular_Check.setText("Bought!");
                    currency = nValid;
                    temp_slot_quantity[8] += 1;  //used to bring back quantity if needed
                    betaTotalMoney3.setText("P" + Integer.toString(currency));
                }
            }
        }
    }//GEN-LAST:event_jButton76MouseClicked

    private void jButton78MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton78MouseClicked
        
        Regular_Done.setVisible(true);
        if(regularVM.getSlots(10) == null){
                Regular_Check.setVisible(true);
                Regular_Check.setCaretColor(Color.red);
                Regular_Check.setText("Invalid Input...");
        }
        else{
            nValid = regularVM.Dispense((10), currency);

            switch (nValid) {
                case -1 -> {
                   Regular_Check.setVisible(true);
                        Regular_Check.setCaretColor(Color.red);
                        Regular_Check.setText("SOLD OUT!");
                }
                case -2 -> {
                   Regular_Check.setVisible(true);
                        Regular_Check.setCaretColor(Color.red);
                        Regular_Check.setText("Insufficient Balance");
                }
                case -3 -> {
                    Regular_Check.setVisible(true);
                        Regular_Check.setCaretColor(Color.red);
                        Regular_Check.setText("Invalid Choice...");
                }
                default -> {
                    Regular_Check.setVisible(true);
                        Regular_Check.setCaretColor(Color.blue);
                        Regular_Check.setText("Bought!");
                    currency = nValid;
                    temp_slot_quantity[10] += 1;  //used to bring back quantity if needed
                    betaTotalMoney3.setText("P" + Integer.toString(currency));
                }
            }
        }
    }//GEN-LAST:event_jButton78MouseClicked

    private void jButton77MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton77MouseClicked
        
        Regular_Done.setVisible(true);
        if(regularVM.getSlots(9) == null){
                Regular_Check.setVisible(true);
                Regular_Check.setCaretColor(Color.red);
                Regular_Check.setText("Invalid Input...");
        }
        else{
            nValid = regularVM.Dispense((9), currency);

            switch (nValid) {
                case -1 -> {
                   Regular_Check.setVisible(true);
                        Regular_Check.setCaretColor(Color.red);
                        Regular_Check.setText("SOLD OUT!");
                }
                case -2 -> {
                   Regular_Check.setVisible(true);
                        Regular_Check.setCaretColor(Color.red);
                        Regular_Check.setText("Insufficient Balance");
                }
                case -3 -> {
                    Regular_Check.setVisible(true);
                        Regular_Check.setCaretColor(Color.red);
                        Regular_Check.setText("Invalid Choice...");
                }
                default -> {
                    Regular_Check.setVisible(true);
                        Regular_Check.setCaretColor(Color.blue);
                        Regular_Check.setText("Bought!");
                    currency = nValid;
                    temp_slot_quantity[9] += 1;  //used to bring back quantity if needed
                    betaTotalMoney3.setText("P" + Integer.toString(currency));
                }
            }
        }
    }//GEN-LAST:event_jButton77MouseClicked

    private void normalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_normalMouseClicked
        
        if(count < 4) {
            specialVM.stocking(count, new Item("Normal_Milk", 42), 10, 40);
            count++;
            add.setText("Added: Normal Milk!");
            if(count > 0) {
                con.setVisible(true);
            }
        }
        else {
            add.setText("You've added enough...");
        }
    }//GEN-LAST:event_normalMouseClicked

    private void soyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_soyMouseClicked
        
        if(count < 4) {
            specialVM.stocking(count, new Item("Soy_Milk", 54), 10, 30);
            count++;
            add.setText("Added: Soy Milk!");
            if(count > 0) {
                con.setVisible(true);
            }
        }
        else {
            add.setText("You've added enough...");
        }
    }//GEN-LAST:event_soyMouseClicked

    private void oatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oatMouseClicked
        
        if(count < 4) {
            specialVM.stocking(count, new Item("Oat_Milk", 120), 10, 50);
            count++;
            add.setText("Added: Oat Milk!");
            if(count > 0) {
                con.setVisible(true);
            }
        }
        else {
            add.setText("You've added enough...");
        }
    }//GEN-LAST:event_oatMouseClicked

    private void almondMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_almondMouseClicked
        
        if(count < 4) {
            specialVM.stocking(count, new Item("Almond_Milk", 40), 10, 55);
            count++;
            add.setText("Added: Almond Milk!");
            if(count > 0) {
                con.setVisible(true);
            }
        }
        else {
            add.setText("You've added enough...");
        }
        
        
    }//GEN-LAST:event_almondMouseClicked

    private void icecreamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icecreamMouseClicked
        
        if(count < 7) {
            specialVM.stocking(count, new Item("Icecream", 137), 10, 30);
            count++;
            add1.setText("Added: Icecream!");
            if(count > 4) {
                con.setVisible(true);
            }
        }
        else {
            add1.setText("You've added enough...");
        }
    }//GEN-LAST:event_icecreamMouseClicked

    private void chocolateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chocolateMouseClicked
        
        if(count < 7) {
            specialVM.stocking(count, new Item("Chocolate", 155), 10, 15);
            count++;
            add1.setText("Added: Chocolate!");
            if(count > 4) {
                con.setVisible(true);
            }
        }
        else {
            add1.setText("You've added enough...");
        }
    }//GEN-LAST:event_chocolateMouseClicked

    private void oreoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oreoMouseClicked
        
        if(count < 7) {
            specialVM.stocking(count, new Item("Oreo", 160), 10, 15);
            count++;
            add1.setText("Added: Oreo!");
            if(count > 4) {
                con.setVisible(true);
            }
        }
        else {
            add1.setText("You've added enough...");
        }
    }//GEN-LAST:event_oreoMouseClicked

    private void conMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_conMouseClicked
        
        milk.setVisible(false);
        topping.setVisible(true);
    }//GEN-LAST:event_conMouseClicked

    private void con1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_con1MouseClicked
        
        topping.setVisible(false);
        syrup.setVisible(true);
        specialVM.getSummaryReceipt().setStartingInventory(specialVM.getSlotClass());
        specialVM.stocking(count, new Item("Espresso", 5), 10, 50);
        count++;
    }//GEN-LAST:event_con1MouseClicked

    private void caramelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_caramelMouseClicked
        
        if(count < 11) {
            specialVM.stocking(count, new Item("Caramel_Syrup", 110), 10, 10);
            count++;
            add2.setText("Added: Caramel!");
            if(count > 7) {
                con.setVisible(true);
            }
        }
        else {
            add2.setText("You've added enough...");
        }
    }//GEN-LAST:event_caramelMouseClicked

    private void chocolate1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chocolate1MouseClicked
        
        if(count < 11) {
            specialVM.stocking(count, new Item("Chocolate_Syrup", 93), 10, 10);
            count++;
            add2.setText("Added: Chocolate!");
            if(count > 7) {
                con.setVisible(true);
            }
        }
        else {
            add2.setText("You've added enough...");
        }
    }//GEN-LAST:event_chocolate1MouseClicked

    private void strawberryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_strawberryMouseClicked
        
        
        if(count < 11) {
            specialVM.stocking(count, new Item("Strawberry_Syrup", 93), 10, 10);
            count++;
            add2.setText("Added: Strawberry!");
            if(count > 7) {
                con.setVisible(true);
            }
        }
        else {
            add2.setText("You've added enough...");
        }
    }//GEN-LAST:event_strawberryMouseClicked

    private void con2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_con2MouseClicked
        
        syrup.setVisible(false);
        specialVM.getSummaryReceipt().setStartingInventory(specialVM.getSlotClass());
        DefaultTableModel model = (DefaultTableModel) itemTable.getModel();
        
        
        while(model.getRowCount() != 0) {
            model.removeRow(0);
        }
       
        
        for(int i = 0; i < 11; i++) {
            model.addRow(new Object[] {null});
            if(specialVM.getSlots(i) != null) {
               itemTable.setValueAt(i + 1, i, 0);
                itemTable.setValueAt(specialVM.getItemName(i), i, 1);
                itemTable.setValueAt(specialVM.getItemPrice(i), i, 2);
                itemTable.setValueAt(specialVM.getItemQuantity(WIDTH), i, 3);
                itemTable.setValueAt(specialVM.getSlots(i).getItem().getdCalories(), i, 4); 
            }
            else {
                itemTable.setValueAt(i + 1, i, 0);
                itemTable.setValueAt("No Item", i, 1);
                itemTable.setValueAt("null", i, 2);
                itemTable.setValueAt("null", i, 3);
                itemTable.setValueAt("null", i, 4); 
            }
            
        }
        specialVM.getSummaryReceipt().setStartingInventory(specialVM.getSlotClass());
        JOptionPane.showMessageDialog(null, "Succesfully Loaded Special Cafe Vending Machine");
        
        
        
        optionsTabs.setSelectedIndex(0);
        displaySite.setSelectedIndex(0);
        
    }//GEN-LAST:event_con2MouseClicked
           

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane MainPanel;
    private javax.swing.JTextField Regular_Check;
    private javax.swing.JButton Regular_Done;
    private javax.swing.JPanel SVM_Espresso;
    private javax.swing.JPanel SVM_Personalized;
    private javax.swing.JPanel SVM_Personalized1;
    private javax.swing.JPanel SVM_Personalized2;
    private javax.swing.JTextArea Text;
    private javax.swing.JTextField add;
    private javax.swing.JTextField add1;
    private javax.swing.JTextField add2;
    private javax.swing.JButton almond;
    private javax.swing.JLabel betaTotalMoney;
    private javax.swing.JLabel betaTotalMoney1;
    private javax.swing.JLabel betaTotalMoney3;
    private javax.swing.JButton chocolate;
    private javax.swing.JButton con;
    private javax.swing.JButton con1;
    private javax.swing.JLabel currentMoney;
    private javax.swing.JPanel defaulttab;
    private javax.swing.JTabbedPane displaySite;
    private javax.swing.JButton fifty;
    private javax.swing.JButton fives;
    private javax.swing.JButton hundred;
    private javax.swing.JButton icecream;
    private javax.swing.JPanel indx7;
    private javax.swing.JPanel indx8;
    private javax.swing.JTable itemTable;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton51;
    private javax.swing.JButton jButton52;
    private javax.swing.JButton jButton53;
    private javax.swing.JButton jButton54;
    private javax.swing.JButton jButton55;
    private javax.swing.JButton jButton56;
    private javax.swing.JButton jButton57;
    private javax.swing.JButton jButton58;
    private javax.swing.JButton jButton59;
    private javax.swing.JButton jButton60;
    private javax.swing.JButton jButton61;
    private javax.swing.JButton jButton62;
    private javax.swing.JButton jButton63;
    private javax.swing.JButton jButton64;
    private javax.swing.JButton jButton65;
    private javax.swing.JButton jButton66;
    private javax.swing.JButton jButton68;
    private javax.swing.JButton jButton69;
    private javax.swing.JButton jButton70;
    private javax.swing.JButton jButton71;
    private javax.swing.JButton jButton72;
    private javax.swing.JButton jButton73;
    private javax.swing.JButton jButton74;
    private javax.swing.JButton jButton75;
    private javax.swing.JButton jButton76;
    private javax.swing.JButton jButton77;
    private javax.swing.JButton jButton78;
    private javax.swing.JButton jButton79;
    private javax.swing.JButton jButton81;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel58;
    private javax.swing.JPanel jPanel59;
    private javax.swing.JPanel jPanel60;
    private javax.swing.JPanel jPanel71;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTabbedPane mPanel;
    private javax.swing.JPanel maintenancePanelRVM;
    private javax.swing.JLabel maxQuantityDisplay;
    private javax.swing.JLabel maxQuantityDisplay1;
    private javax.swing.JPanel milk;
    private javax.swing.JButton normal;
    private javax.swing.JButton oat;
    private javax.swing.JButton ones;
    private javax.swing.JPanel options;
    private javax.swing.JTabbedPane optionsTabs;
    private javax.swing.JButton oreo;
    private java.awt.TextField slotNUM;
    private java.awt.TextField slotNUM2;
    private javax.swing.JButton soy;
    private javax.swing.JTable summaryTable;
    private javax.swing.JPanel syrup;
    private javax.swing.JTabbedPane tabStonks;
    private javax.swing.JTable tableRVM;
    private javax.swing.JPanel tb7;
    private javax.swing.JButton tens;
    private javax.swing.JTextField tfAddStocks;
    private javax.swing.JTextField tfCaloriesStocking;
    private javax.swing.JTextField tfCol;
    private javax.swing.JTextField tfCol1;
    private javax.swing.JTextField tfCollectMoney;
    private javax.swing.JTextField tfPriceStocking2;
    private javax.swing.JTextField tfProductNameStocking;
    private javax.swing.JTextField tfQuantityStocking;
    private javax.swing.JTextField tfRow;
    private javax.swing.JTextField tfRow1;
    private javax.swing.JTextField tfUpdatePrice1;
    private javax.swing.JPanel topping;
    private javax.swing.JLabel totalSales;
    private javax.swing.JButton twenty;
    // End of variables declaration//GEN-END:variables
    private int currency = 0;
    private int amount = currency;
    private int initialMoney = currency;
    private int[] temp_slot_quantity;
    private int nValid = 0;
    private int saveEspresso = -1; //saves the slot index
    private int saveMilk = -1; //saves the slot index
    private int saveSyrup = -1; //saves the slot index
    private int saveTopping = -1; //saves the slot index
    private int count = 0;
    private double totalcal = 0;
}
