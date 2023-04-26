package Vues;

import Controlers.CtrlArticle;
import Controlers.CtrlMagazine;
import Controlers.CtrlPigiste;
import Tools.ConnexionBDD;
import Tools.ModelJTable;

import javax.swing.*;
import java.awt.event.*;
import java.sql.SQLException;

public class FrmGestion extends JFrame {

    private JPanel rootPane;
    private JLabel lblTitre;
    private JLabel lblMagazine;
    private JTextField txtMontantMagazine;
    private JTextField txtNomPigiste;
    private JButton btnAjouter;
    private JLabel lblMontant;
    private JLabel lblPigiste;
    private JLabel lblAjouter;
    private JLabel lblTitreArticle;
    private JLabel lblChoixPigiste;
    private JLabel lblNbFeuillets;
    private JTextField txtTitreArticle;
    private JComboBox cboPigistes;
    private JSpinner spNbFeuillets;
    private JLabel lblArticle;
    private JTable tblTotauxPigistes;
    private JTable tblMagazines;
    private JTable tblArticles;

    ModelJTable mdl;
    CtrlMagazine ctrlMagazine;


    public FrmGestion() throws SQLException, ClassNotFoundException {
        this.setTitle("Gestion");
        this.setContentPane(rootPane);
        this.pack();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);

        ConnexionBDD maCnx = new ConnexionBDD();



        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                super.windowOpened(e);
                // A vous de jouer
                ctrlMagazine = new CtrlMagazine();
                mdl = new ModelJTable();
                mdl.loadDatasMagazines(ctrlMagazine.GetAllMagazines());
                tblMagazines.setModel(mdl);

            }
        });
        tblMagazines.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                // A vous de jouer



            }
        });
        tblArticles.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                // A vous de jouer

            }
        });
        btnAjouter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // A vous de jouer

            }
        });
    }
}
