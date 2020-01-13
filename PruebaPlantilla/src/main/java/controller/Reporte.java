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
import com.itextpdf.text.List;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.ZapfDingbatsList;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.ServletContext;

/**
 *
 * @author roberto.alferesusam
 */
@Named("reporteController")
@SessionScoped
public class Reporte implements Serializable {

    public void reporte() {
        try {

            // Creacion del documento con los margenes
            Document document = new Document(PageSize.A4, 35, 30, 50, 50);
            try {
               //String path= new File(".").;
               //String File_name=path+"/reporte.pdf";
                // El archivo pdf que vamos a generar
                FileOutputStream fileOutputStream = new FileOutputStream("reporte.pdf");
                System.out.println();
                System.out.println(fileOutputStream);

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

                // Creacion de una tabla
                PdfPTable table = new PdfPTable(1);

                // Agregar la tabla al documento
                document.add(table);

                // Cargar otra imagen
                // Agregar la imagen
                // Creacion del parrafo
                Paragraph paragraph = new Paragraph();

                // Agregar un titulo con su respectiva fuente
                paragraph.add(new Phrase("Características:", fontTitulos));

                // Agregar saltos de linea
                paragraph.add(new Phrase(Chunk.NEWLINE));
                paragraph.add(new Phrase(Chunk.NEWLINE));

                // Agregar contenido con su respectiva fuente
                paragraph
                        .add(new Phrase(
                                "El sensor de la X-E1 presenta el mismo excelente rendimiento que el X-Trans CMOS "
                                + "de 16 megapíxeles del modelo superior de la serie X, la X-Pro1. Gracias la matriz "
                                + "de filtro de color con disposición aleatoria de los píxeles, desarrollada originalmente"
                                + " por Fujifilm, el sensor X-Trans CMOS elimina la necesidad del filtro óptico de paso bajo"
                                + " que se utiliza en los sistemas convencionales para inhibir el muaré a expensas de la"
                                + " resolución. Esta matriz innovadora permite al sensor X-Trans CMOS captar la luz sin filtrar"
                                + " del objetivo y obtener una resolución sin precedentes. La exclusiva disposición aleatoria de"
                                + " la matriz de filtro de color resulta asimismo muy eficaz para mejorar la separación de ruido"
                                + " en la fotografía de alta sensibilidad. Otra ventaja del gran sensor APS-C es la capacidad"
                                + " para crear un hermoso efecto “bokeh”, el estético efecto desenfocado que se crea al disparar"
                                + " con poca profundidad de campo.",
                                fontContenido));

                paragraph.add(new Phrase(Chunk.NEWLINE));
                paragraph.add(new Phrase(Chunk.NEWLINE));
                paragraph.add(new Phrase(Chunk.NEWLINE));
                paragraph.add(new Phrase("Otras Caracaterísticas:", fontTitulos));

                // Agregar el parrafo al documento
                document.add(paragraph);

                // La lista final
                List listaFinal = new List(List.UNORDERED);
                ListItem listItem = new ListItem();
                List list = new List();

                // Crear sangria en la lista
                list.setListSymbol(new Chunk("   "));
                ListItem itemNuevo = new ListItem("   ");

                // ZapfDingbatsListm, lista con simbolos
                List listSymbol = new ZapfDingbatsList(51);

                // Agregar contenido a la lista
                listSymbol
                        .add(new ListItem(
                                "Sensor CMOS X-Trans – Consigue una calidad de imagen superior",
                                fontContenido));
                listSymbol
                        .add(new ListItem(
                                "Visor electrónico OLED de 2,36 pulgadas de alta resolución y luminosidad",
                                fontContenido));
                listSymbol.add(new ListItem("Diseño y accesorios", fontContenido));
                listSymbol.add(new ListItem("Rápida respuesta", fontContenido));

                itemNuevo.add(listSymbol);
                list.add(itemNuevo);
                listItem.add(list);

                // Agregar todo a la lista final
                listaFinal.add(listItem);

                // Agregar la lista
                document.add(listaFinal);
                paragraph = new Paragraph();
                paragraph.add(new Phrase(Chunk.NEWLINE));
                paragraph.add(new Phrase(Chunk.NEWLINE));
                document.add(paragraph);

                // Crear tabla nueva con dos posiciones
                table = new PdfPTable(2);
                float[] longitudes = {5.0f, 5.0f};

                // Establecer posiciones de celdas
                table.setWidths(longitudes);

                // Agregar la tabla al documento
                document.add(table);

                // Cerrar el documento
                document.close();

                // Abrir el archivo
                File file = new File("reporte.pdf");
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

    public static void main(String[] args) {
        Reporte pdf = new Reporte();
        pdf.reporte();
    }
}
