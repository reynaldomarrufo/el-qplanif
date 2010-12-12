package view;

import javax.swing.*;
import java.awt.*;
import java.awt.Container;
import java.awt.Dimension;

public class PruebaValidator extends JFrame{

        //para el campo nombre
        private JLabel lblAlertNombre;
        private JLabel lblNombre;
        private JTextFieldValidator txtNombre;

        //para validar la fecha

    private JLabel lblAlertFecha;
    private JLabel lblFecha;
    private JTextFieldValidator txtFecha;

    //para validar correo
    private JLabel lblAlertCorreo;
    private JLabel lblCorreo;
    private JTextFieldValidator txtCorreo;

    //para validar formato moneda
    private JLabel lblAlertMoneda;
    private JLabel lblMoneda;
    private JTextFieldValidator txtMoneda;

    //el boton que se encarga de las validaciones
    private JButtonValidator btnAceptar;
    //el area donde se mostraran los mensjaes
    private JTextArea areaError;

    public PruebaValidator() {
        super("Uso Validador by Robert");
        this.setPreferredSize(new Dimension(250,300));
        this.setVisible(true);
                this.setLayout(null);

                btnAceptar = new JButtonValidator();
                btnAceptar.setBounds(100,240,100,20);
                btnAceptar.setText("Aceptar");
                //indicamos que este boton validara
                //4 campos..
                btnAceptar.setITotalValidaciones(4);

        areaError = new JTextArea();
                areaError.setBounds(0,0,300,100);
        this.add(areaError,null);
        this.add(btnAceptar,null);

                //agregando elemenotos al frame

                lblAlertNombre = new JLabel();
                lblAlertNombre.setBounds(10,120,20,20);
                this.add(lblAlertNombre);

                lblNombre = new JLabel("Nombre:");
                lblNombre.setBounds(30,120,60,20);
                this.add(lblNombre);

                txtNombre = new JTextFieldValidator();
                txtNombre.setBounds(100,120,100,20);
                //Estableciando las propiedades necesarias
                //para validar el campo nombre
                //le decimos que este campo es requerido
                txtNombre.setEsRequerido(true);
                //decimos donde aparecera el mensaje
                //de error en caso de ser invalido este campo
                txtNombre.setTxtErrorArea(areaError);
                //le decimos donde pondremos su iconito de error
        txtNombre.setLblError(lblAlertNombre);
        //le decimos como nombrará a este campo
        txtNombre.setEtiquetaCampo("nombre");
                this.add(txtNombre);

                lblAlertFecha = new JLabel();
                lblAlertFecha.setBounds(10,150,20,20);
                this.add(lblAlertFecha);

                lblFecha = new JLabel("Fecha:");
                lblFecha.setBounds(30,150,60,20);
                this.add(lblFecha);

                txtFecha = new JTextFieldValidator();
                txtFecha.setBounds(100,150,100,20);
                //Le indicamos que queremos que valida
                //una fecha
                txtFecha.setFormatoRequerido(txtFecha.IFECHA);
                //decimos donde aparecera el mensaje
                //de error en caso de ser invalido este campo
                txtFecha.setTxtErrorArea(areaError);
                //le decimos donde pondremos su iconito de error
        txtFecha.setLblError(lblAlertFecha);
        //le decimos como nombrará a este campo
        txtFecha.setEtiquetaCampo("fecha");
                this.add(txtFecha);

                lblAlertCorreo = new JLabel();
                lblAlertCorreo.setBounds(10,180,20,20);
                this.add(lblAlertCorreo);

                lblCorreo = new JLabel("Correo:");
                lblCorreo.setBounds(30,180,60,20);
                this.add(lblCorreo);

                txtCorreo = new JTextFieldValidator();
                txtCorreo.setBounds(100,180,100,20);
                //Le indicamos que queremos que valida
                //en este caso un correo
                txtCorreo.setFormatoRequerido(txtFecha.IEMAIL);
                //decimos donde aparecera el mensaje
                //de error en caso de ser invalido este campo
                txtCorreo.setTxtErrorArea(areaError);
                //le decimos donde pondremos su iconito de error
        txtCorreo.setLblError(lblAlertCorreo);
        //le decimos como nombrará a este campo
        txtCorreo.setEtiquetaCampo("correo");
                this.add(txtCorreo);

                lblAlertMoneda = new JLabel();
                lblAlertMoneda.setBounds(10,210,20,20);
                this.add(lblAlertMoneda);

                lblMoneda = new JLabel("Moneda:");
                lblMoneda.setBounds(30,210,60,20);
                this.add(lblMoneda);

                txtMoneda = new JTextFieldValidator();
                txtMoneda.setBounds(100,210,100,20);
                //Le indicamos que queremos que valida
                //en este caso valide pesos $000.00
                txtMoneda.setFormatoRequerido(txtFecha.IMONEDA);
                //decimos donde aparecera el mensaje
                //de error en caso de ser invalido este campo
                txtMoneda.setTxtErrorArea(areaError);
                //le decimos donde pondremos su iconito de error
        txtMoneda.setLblError(lblAlertMoneda);
        //le decimos como nombrará a este campo
        txtMoneda.setEtiquetaCampo("moneda");
                this.add(txtMoneda);

        //le indicamos el boton que validara los campos
        txtNombre.setBtnTriggerComponent(btnAceptar);
        txtFecha.setBtnTriggerComponent(btnAceptar);
        txtCorreo.setBtnTriggerComponent(btnAceptar);
        txtMoneda.setBtnTriggerComponent(btnAceptar);

        this.pack();
    }

    public static void main(String args[]){
        new PruebaValidator();
    }
}

