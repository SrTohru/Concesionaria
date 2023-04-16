package org.itson.concesionaria.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.rmi.server.ObjID;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.persistence.TypedQuery;
import javax.print.attribute.standard.Fidelity;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import org.itson.concesionaria.entitys.Auto;
import org.itson.concesionaria.entitys.Persona;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import org.itson.concesionaria.entitys.Reportes;
import org.itson.concesionaria.entitys.Tramite;
import org.itson.concesionaria.entitys.Vehiculo;

public class jasperReportCreator {

    eManager em = new eManager();

    String url = "C:\\Users\\PC\\JaspersoftWorkspace\\MyReports\\JasperReport.Jrxml";
    
    encriptador enc = new encriptador();
    
    public void test() throws FileNotFoundException, JRException {
        Persona persona = null;
        JRBeanCollectionDataSource items = new JRBeanCollectionDataSource(verificarPersonaPorRFC(persona));

        Map<String, Object> params = new HashMap<String, Object>();

        params.put("CollectionBeanParam", items);

        InputStream input = new FileInputStream(new File(url));

        JasperDesign desing = JRXmlLoader.load(input);

        JasperReport report = JasperCompileManager.compileReport(desing);

        JasperPrint print = JasperFillManager.fillReport(report, params, new JREmptyDataSource());

        JasperViewer.viewReport(print, false);
    }

    public void generarReporte() throws FileNotFoundException, JRException, IOException {
        String reportePath = "jasperReports/JasperReport.jrxml";
        String outputPath = "jasperReports/output";
        
        Persona persona = null;
        JRBeanCollectionDataSource items = new JRBeanCollectionDataSource(verificarPersonaPorRFC(persona));

        Map<String, Object> params = new HashMap<>();
        params.put("Param1", items);

        try (InputStream input = getClass().getClassLoader().getResourceAsStream(reportePath)) {
            JasperReport report = JasperCompileManager.compileReport(input);
            JasperPrint print = JasperFillManager.fillReport(report, params, new JREmptyDataSource());
            JasperViewer.viewReport(print, true);
        }
    }

    public List<Reportes> verificarPersonaPorRFC(Persona persona) {
        persona = em.getEntityManager().find(Persona.class, 6L);
        TypedQuery<Tramite> query = em.getEntityManager().createQuery(
                "SELECT t "
                + "FROM Tramite t", Tramite.class);


        List<Reportes> list = new ArrayList<Reportes>();

//    private String tipoTramite;
//    private String nombreCompleto;
//    private String costo;
//    private String fechaExpedicion;
        try {
                for (int i = 0; i < query.getResultList().size(); i++) {
            Reportes rep = new Reportes(query.getResultList().get(i).getTipoTramite() + "",
                    encriptador.desencriptar(query.getResultList().get(i).getIdPersona().getNombres()) + " " + encriptador.desencriptar(query.getResultList().get(i).getIdPersona().getApellidoPaterno()) + " " + encriptador.desencriptar(query.getResultList().get(i).getIdPersona().getApellidoPaterno()),
                    query.getResultList().get(i).getCosto() + "",
                    query.getResultList().get(i).getFechaTramite().toString() + "");
            System.out.println(rep);
            list.add(rep);
        }
        } catch (Exception e) {
        }

//        String consulta = "SELECT p FROM Vehiculo p";
//        TypedQuery<Vehiculo> query = em.getEntityManager().createQuery(consulta, Vehiculo.class);
//        List<Reportes> list = new ArrayList<Reportes>();
//
//        for (int i = 0; i < query.getResultList().size(); i++) {
//           Reportes rep =  new Reportes(query.getResultList().get(i).getSerie(),
//                    query.getResultList().get(i).getMarca(), 
//                    query.getResultList().get(i).getColor(), 
//                    query.getResultList().get(i).getModelo());
//            System.out.println(rep);
//            list.add(rep);
//        }
//
//        return list;
        return list;
    }
    

}
