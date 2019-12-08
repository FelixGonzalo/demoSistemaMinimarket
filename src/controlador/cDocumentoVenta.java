/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelo.dao.DocumentoVentaDao;
import modelo.entidad.DocumentoVenta;
import modelo.mDocumentoVenta;

/**
 *
 * @author Fekilo
 */
public class cDocumentoVenta {
    
    public static DefaultTableModel leer() {
        DocumentoVentaDao dao = new mDocumentoVenta();
        List<DocumentoVenta> lista = dao.leer();

        DefaultTableModel dt = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int fila, int columna) {
                return false;
            }
        };
        dt.addColumn("ID");
        dt.addColumn("Serie");
        dt.addColumn("Numero");
        dt.addColumn("Fecha");
        dt.addColumn("igv");
        dt.addColumn("DNI-RUC");
        dt.addColumn("Cliente");
        dt.addColumn("# Productos");
        dt.addColumn("subTotal");
        dt.addColumn("monto IGV");
        dt.addColumn("Total");

        for (DocumentoVenta obj : lista) {
            Object[] fila = new Object[11];
            fila[0] = obj.getIdDocumentoVenta();
            fila[1] = obj.getSerie();
            fila[2] = obj.getNumero();
            fila[3] = obj.getFecha();
            fila[4] = obj.getIgv();
            fila[5] = obj.getCliente().getIdClienteDniRuc();
            fila[6] = obj.getCliente().getNombres()+" "+obj.getCliente().getApellidos();
            fila[7] = obj.getCantidadProductos();
            fila[8] = obj.getSubtotal();
            fila[9] = obj.getMontoIGV();
            fila[10] = obj.getTotal();
            dt.addRow(fila);
        }
        return dt;
    }//ventas realizas
}
