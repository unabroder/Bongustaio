/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.File;
import java.io.FileOutputStream;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;

import com.itextpdf.text.ListItem;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.ZapfDingbatsList;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import ejb.VentaFacadeLocal;
import entity.Venta;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.ejb.EJB;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author roberto.alferesusam
 */
@Named("reporteController")
@SessionScoped
public class Reporte implements Serializable {

    @EJB
    private VentaFacadeLocal ventaEJB;
    private Venta venta;
    private List<Venta> lsventa;

    public void reporte(List<Venta> lista2) {
        try {
            System.out.println("reporte de pdf ");
            // Creacion del documento con los margenes
            Document document = new Document(PageSize.A4, 35, 30, 50, 50);
            try {
                //String path= new File(".").;
                //String File_name=path+"/reporte.pdf";
                // El archivo pdf que vamos a generar
                Date fecha = new Date();

                SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

                FileOutputStream fileOutputStream = new FileOutputStream("C:/reportes/reporte_" + format.format(fecha) + ".pdf");

                // Obtener la instancia del PdfWriter
                PdfWriter.getInstance(document, fileOutputStream);

                // Abrir el documento
                document.open();

                // Crear las fuentes para el contenido y los titulos
                Font fontContenido = FontFactory.getFont(
                        FontFactory.TIMES_ROMAN.toString(), 11, Font.NORMAL,
                        BaseColor.DARK_GRAY);
                Font fontTitulos = FontFactory.getFont(
                        FontFactory.TIMES_BOLDITALIC, 11, Font.UNDERLINE,
                        BaseColor.RED);

                lsventa = lista2;

                Paragraph paragraph = new Paragraph();
//
                // Agregar un titulo con su respectiva fuente
                paragraph.add(new Phrase("Bitacora de ventas \n \n", fontTitulos));
                document.add(Chunk.NEWLINE);
                document.add(Chunk.NEWLINE);
                document.add(Chunk.NEWLINE);

                document.add(paragraph);
                PdfPTable table = new PdfPTable(7);
                table.addCell("ID");
                table.addCell("Nombre Empleado");
                table.addCell("Platillo");
                table.addCell("Complemento");
                table.addCell("Cantidad");
                table.addCell("Fecha");
                table.addCell("Total");

                Iterator iter = lsventa.listIterator();
                
                while (iter.hasNext()) {
                    System.out.println("while");
                    venta = (Venta) iter.next();
                    SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
                    table.addCell("" + venta.getIdventa());
                    table.addCell(venta.getIdempleado().getNombres()+" \n"+venta.getIdempleado().getApellidos());
                    table.addCell(venta.getIdplato_completo().getNombre());
                    table.addCell(venta.getIdcomplemento().getNombre());
                    table.addCell(formato.format(venta.getFecha()));
                    table.addCell("" + venta.getCantidad());
                    table.addCell("" + venta.getTotal());
                    
                }
                // Creacion de una tabla

                document.add(table);

                document.close();

                // Abrir el archivo
                File file = new File("C:/reportes/reporte_" + format.format(fecha) + ".pdf");
                System.out.println(file.getAbsolutePath());
            } catch (DocumentException | FileNotFoundException ex) {
                System.out.println("error " + ex.getMessage());
            }
            //return true;
            System.out.println("se creo el reporte");
        } catch (Exception e) {
            // return false;
        }

    }

//    public static void main(String[] args) {
//        Reporte pdf = new Reporte();
//        pdf.reporte();
//    }
}
