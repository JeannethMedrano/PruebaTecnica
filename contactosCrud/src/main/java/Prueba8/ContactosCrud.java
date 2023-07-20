/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Prueba8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class ContactosCrud extends JFrame {

    private List<Contacto> contactos;

    private JList<Contacto> listaContactos;
    private DefaultListModel<Contacto> modelLista;

    private JTextField campoNombre;
    private JTextField campoTelefono;
    private JButton btnAgregar;
    private JButton btnEditar;
    private JButton btnEliminar;

    public ContactosCrud() {
        contactos = new ArrayList<>();
        modelLista = new DefaultListModel<>();
        listaContactos = new JList<>(modelLista);

        campoNombre = new JTextField(20);
        campoTelefono = new JTextField(15);
        btnAgregar = new JButton("Agregar");
        btnEditar = new JButton("Editar");
        btnEliminar = new JButton("Eliminar");

        btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarContacto();
            }
        });

        btnEditar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                editarContacto();
            }
        });

        btnEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eliminarContacto();
            }
        });

        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new FlowLayout());
        panelBotones.add(btnAgregar);
        panelBotones.add(btnEditar);
        panelBotones.add(btnEliminar);

        JPanel panelCampos = new JPanel();
        panelCampos.setLayout(new GridLayout(2, 2));
        panelCampos.add(new JLabel("Nombre:"));
        panelCampos.add(campoNombre);
        panelCampos.add(new JLabel("Teléfono:"));
        panelCampos.add(campoTelefono);

        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BorderLayout());
        panelPrincipal.add(new JScrollPane(listaContactos), BorderLayout.CENTER);
        panelPrincipal.add(panelCampos, BorderLayout.NORTH);
        panelPrincipal.add(panelBotones, BorderLayout.SOUTH);

        this.setTitle("Contactos");
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panelPrincipal);
        this.setVisible(true);
    }

    private void agregarContacto() {
        String nombre = campoNombre.getText();
        String telefono = campoTelefono.getText();
        if (!nombre.isEmpty() && !telefono.isEmpty()) {
            Contacto nuevoContacto = new Contacto(nombre, telefono);
            contactos.add(nuevoContacto);
            modelLista.addElement(nuevoContacto);
            limpiarCampos();
        }
    }

    private void editarContacto() {
        int indiceSeleccionado = listaContactos.getSelectedIndex();
        if (indiceSeleccionado != -1) {
            String nuevoNombre = campoNombre.getText();
            String nuevoTelefono = campoTelefono.getText();
            if (!nuevoNombre.isEmpty() && !nuevoTelefono.isEmpty()) {
                Contacto contactoEditado = new Contacto(nuevoNombre, nuevoTelefono);
                contactos.set(indiceSeleccionado, contactoEditado);
                modelLista.set(indiceSeleccionado, contactoEditado);
                limpiarCampos();
            }
        }
    }

    private void eliminarContacto() {
        int indiceSeleccionado = listaContactos.getSelectedIndex();
        if (indiceSeleccionado != -1) {
            contactos.remove(indiceSeleccionado);
            modelLista.remove(indiceSeleccionado);
            limpiarCampos();
        }
    }

    private void limpiarCampos() {
        campoNombre.setText("");
        campoTelefono.setText("");
        listaContactos.clearSelection();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ContactosCrud();
            }
        });
    }

    class Contacto {
        private String nombre;
        private String telefono;

        public Contacto(String nombre, String telefono) {
            this.nombre = nombre;
            this.telefono = telefono;
        }

        @Override
        public String toString() {
            return nombre + " - " + telefono;
        }
    }
}