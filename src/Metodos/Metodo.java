package Metodos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

import Modelo.Cliente;

public class Metodo {

    // txt
    public void guardarTXT(Cliente cliente) {
        try {
            FileWriter fw;
            PrintWriter pw;
            fw = new FileWriter("C://Users//Joimar//Documents//crud//tripleaaa.txt", true);
            pw = new PrintWriter(fw);
            // BufferedWriter bw = new BufferedWriter(fw);
            // PrintWriter pw = new PrintWriter(bw);
            pw.print(cliente.getReferencia());
            pw.print("/" + cliente.getCedula());
            pw.print("/" + cliente.getNombres());
            pw.print("/" + cliente.getApellidos());
            pw.print("/" + cliente.getMunicipio());
            pw.print("/" + cliente.getBarrio());
            pw.print("/" + cliente.getSexo());
            pw.print("/" + cliente.getEstrato()+"\n");
            pw.close();
            JOptionPane.showMessageDialog(null, "archivo guardado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "archivo no  guardado");
        }
    }

}
