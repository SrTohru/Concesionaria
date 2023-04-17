package org.itson.concesionaria.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.rmi.server.ObjID;
import java.text.SimpleDateFormat;
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

    public void test(Persona persona) throws FileNotFoundException, JRException {
   
        JRBeanCollectionDataSource items = new JRBeanCollectionDataSource(verificarPersonaPorRFC(persona));

        Map<String, Object> params = new HashMap<String, Object>();

        params.put("CollectionBeanParam", items);

        InputStream input = new FileInputStream(new File(url));

        JasperDesign desing = JRXmlLoader.load(input);

        JasperReport report = JasperCompileManager.compileReport(desing);

        JasperPrint print = JasperFillManager.fillReport(report, params, new JREmptyDataSource());

        JasperViewer.viewReport(print, false);
    }


    public List<Reportes> verificarPersonaPorRFC(Persona persona) {
       
        TypedQuery<Tramite> query = em.getEntityManager().createQuery(
                "SELECT t  FROM Tramite t WHERE t.idPersona = :persona AND t.estadoTramite = :estadoTramite", Tramite.class);
        
        query.setParameter("persona", persona);
        query.setParameter("estadoTramite", estadosTramite.Finalizado);
        
        List<Reportes> list = new ArrayList<Reportes>();
        
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");


            for (int i = 0; i < query.getResultList().size(); i++) {
                
                String fechaString = sdf.format( query.getResultList().get(i).getFechaTramite().getTime());
                
                Reportes rep = new Reportes(query.getResultList().get(i).getTipoTramite() + "",
                        encriptador.desencriptar(query.getResultList().get(i).getIdPersona().getNombres()) + " " + encriptador.desencriptar(query.getResultList().get(i).getIdPersona().getApellidoPaterno()) + " " + encriptador.desencriptar(query.getResultList().get(i).getIdPersona().getApellidoPaterno()),
                        query.getResultList().get(i).getCosto() + "",
                        fechaString);
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
