package com.jasperRport;

import java.io.InputStream;
import java.math.BigDecimal;
import java.security.Timestamp;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jasperRport.entities.Division;
import com.jasperRport.entities.DivisionInformation;
import com.jasperRport.entities.DivisionInformationListOfPlots;
import com.jasperRport.entities.DivisionReportField;
import com.jasperRport.entities.EstateInformation;
import com.jasperRport.entities.EstateInformationListOfPlots;
import com.jasperRport.entities.EstateReportField;
import com.jasperRport.entities.LetOut;
import com.jasperRport.entities.PlotReportField;
import com.jasperRport.entities.Unit;
import com.jasperRport.entities.UnitInformation;
import com.jasperRport.entities.UnitInformationListOfEstate;
import com.jasperRport.entities.UnitReportField;
import com.jasperRport.entities.WayLeave;

import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.export.JRPdfExporter;

public class App {
	public static void main(String[] args) {
		Division div = new Division();

		try {
			Configuration cfg = new Configuration();
			cfg.configure("/com/jasperRport/config/hibernate.cfg.xml");

			SessionFactory sessionFactory = cfg.buildSessionFactory();
			Session session = sessionFactory.openSession();

//            =====================================Division=====================================
			// Fetching list of Divisions from database
//            List<Division> listOfDiv = session.createQuery("From Division", Division.class).list();
//            // Transforming Division objects to DivisionReportField objects
//            List<DivisionReportField> listOfDivField = new ArrayList<>();
//            
//         // Transforming Division objects to DivisionReportField objects
//            listOfDivField = listOfDiv.stream().map(division -> {
//            	DivisionReportField reportField = new DivisionReportField();
//            	reportField.setDiv_code(division.getDivCode());
//            	reportField.setDiv_name(division.getDivName());
//            	reportField.setDiv_desc(division.getDivDesc());
//            	String status = division.getStatus();
//            	if("A".equals((String) status)) {
//                    reportField.setStatus("Approved");
//                } else if ("RG".equals((String) status)) {
//                    reportField.setStatus("Registered");
//                }else if ("RT".equals((String) status)) {
//                    reportField.setStatus("Return");
//                }else {
//                    reportField.setStatus("Verified");
//                }
//            	return reportField;
//            }).collect(Collectors.toList());
//            
//            
//            // Printing list
//            int recordsCounts = listOfDiv.size();
//        	for(Division divs : listOfDiv) {
//        		System.out.println(divs);
//        	}
//        	
//        	System.out.println("Total Count of records : "+recordsCounts);
//        	
//        	System.out.println("\nList of Division Fields in Report : ");
//        	listOfDivField.forEach(System.out::println);
//        	
//        	// Loading the Jasper report template
//        	InputStream reportStream = App.class.getResourceAsStream("/listOfDivision.jrxml");
//        	
//        	if(reportStream == null) {
//        		throw new RuntimeException("Report Template does not found!!");
//        	}
//        	
//        	// Compiling the report
//        	JasperReport jasperReport = JasperCompileManager.compileReport(reportStream);
//        	
//        	// Create a JRBeanCollectionDataSource from the list of records
//        	JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(listOfDivField);
//        	
//        	// Create parameters maping
//        	Map<String, Object> parameters = new HashMap<>();
//        	parameters.put("custodian", "Estate Division");
//        	parameters.put("totalRecords", recordsCounts);
//        	
//        	// Filling the report with data
//        	JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
//        	
//        	// Exporting the report to PDF
//        	String outputFile = "F:\\\\C-DAC Mumbai Internship\\\\8th week\\\\Generated_Reports\\\\ListOfDivision.pdf";
//         	JRPdfExporter exporter = new JRPdfExporter();
//         	exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
//         	exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, outputFile);
//         	
//         	exporter.exportReport();
//         	System.out.println("Report Generated Successfully");

//            =====================================Unit=====================================

			// getting only required fields from db and map it to UnitReportField
//            List<Object[]> results = session.createQuery(
//            		"select u.unitId, d.divName, u.unitDesc, u.status, r.remark " +
//            		"from Unit u " +
//            		"left join UnitRemark r on u.unitId = r.unitId " +
//            		"left join Division d on u.divId = d.divId " +
//            		"order by u.unitId",
//            		Object[].class
//            ).list();
//            
//            // mapping 
//            List<UnitReportField> unitReportFields = new ArrayList<>();
//            
//            for(Object[] row : results) {
//            	
//            	Integer unitId = (Integer)row[0];
//            	String divName = (String)row[1];
//            	String unitDesc = (String)row[2];
//            	String status = (String)row[3];
//            	String remark = (String)row[4];
//            	
//            	UnitReportField reportField = new UnitReportField();
//            	
//            	reportField.setUnit_id(unitId != null ? unitId.toString() : null);
//            	reportField.setDiv_name((String)row[1]);
//            	reportField.setUnit_desc((String)row[2]);
//            	reportField.setCustodian("Estate Division");
//            	if("A".equals((String) row[3])) {
//            		reportField.setStatus("Approved");
//            	} else if ("RG".equals((String) row[3])) {
//					reportField.setStatus("Registered");
//				}else if ("RT".equals((String) row[3])) {
//					reportField.setStatus("Return");
//				}else {
//					reportField.setStatus("Verified");
//				}
//            	reportField.setRemarks((String)row[4]);
//            	
//            	//adding reportField to List<UnitReportField>
//            	unitReportFields.add(reportField);
//            }
//            
//            int totalRecords = unitReportFields.size();
//            
//            for (UnitReportField unitReportField : unitReportFields) {
//				System.out.println(unitReportField);
//			}
//            
//            System.out.println("Total records : "+totalRecords);
//            
//            // jrxml file
//            InputStream inputStream = App.class.getResourceAsStream("/listOfUnits.jrxml");
//            
//            if(inputStream == null) {
//            	throw new RuntimeException("Report Template does not found!!");
//            }
//            
//            // compiling jasper report
//            JasperReport jasperReport = JasperCompileManager.compileReport(inputStream);
//            
//         // Create a JRBeanCollectionDataSource from the list of records
//            JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(unitReportFields);
//            
//         // Create parameters maping
//            Map<String, Object> parameters = new HashMap<>();
//            parameters.put("total_records", totalRecords);
//            
//         // Filling the report with data
//            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
//            
//         // Exporting the report to PDF
//            String outputFile = "F:\\\\C-DAC Mumbai Internship\\\\8th week\\\\Generated_Reports\\\\ListOfUnits.pdf";
//            
//            JRPdfExporter exporter = new JRPdfExporter();
//            
//            exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
//            exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, outputFile);
//            
//            exporter.exportReport();
//            
//            System.out.println("\nReport Generated Successfully");

//            =====================================Estate=====================================
//         // getting only required fields from db and map it to EstateReportField
//            List<Object []> results = session.createQuery(
//            		"select estate_code, estate_name, unit_id, status, remarks " +
//            		"from Estate " +
//            		"order by estate_code",
//            		Object[].class
//            ).list();
//            
//         // mapping 
//            List<EstateReportField> estateReportFields = new ArrayList<>();
//            
//            for (Object[] row : results) {
//				
//            	EstateReportField estateReportField = new EstateReportField();
//            	
//            	String estateCode = (String) row[0];
//            	String estateName = (String) row[1];
//            	int unitId = (Integer) row[2];
//            	String status = (String) row[3];
//            	String custodian = "Estate Division";
//            	String remark = (String) row[4];
//            	
//            	estateReportField.setEstateCode(estateCode);
//            	estateReportField.setEstateName(estateName);
//            	estateReportField.setUnitId(unitId);
//            	
//            	if("A".equals(status)) {
//            		estateReportField.setStatus("Approved");
//            	} else if ("RG".equals(status)) {
//					estateReportField.setStatus("Registered");
//				} else if ("RT".equals(status)) {
//					estateReportField.setStatus("Return");
//				} else {
//					estateReportField.setStatus("Verified");
//				}
//            	estateReportField.setCustodian(custodian);
//            	estateReportField.setRemark(remark);
//            	
//            	//adding reportField to List<EstateReportField> 
//            	estateReportFields.add(estateReportField);	
//			}
//            
//            int totalRecords = estateReportFields.size();
//            
//            for (EstateReportField estateReportField : estateReportFields) {
//				System.out.println(estateReportField);
//			}
//            
//            System.out.println("Total Records : "+totalRecords);
//            
//            // jrxml file
//            InputStream inputStream = App.class.getResourceAsStream("/listOfEstate.jrxml");
//            
//            if (inputStream == null) {
//				throw new RuntimeException("Report Template does not found!!");
//			}
//            
//         // compiling jasper report
//            JasperReport jasperReport = JasperCompileManager.compileReport(inputStream); 
//            
//         // Create a JRBeanCollectionDataSource from the list of records
//            JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(estateReportFields);
//            
//         // Create parameters maping
//            Map<String, Object> parameters = new HashMap<>();
//            parameters.put("total_records", totalRecords);
//            
//         // Filling the report with data
//            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
//            
//         // Exporting the report to PDF
//            String outputFile = "F:\\C-DAC Mumbai Internship\\8th week\\Generated_Reports\\ListOfEstate.pdf";
//            
//            JRPdfExporter exporter = new JRPdfExporter();
//            exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
//            exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, outputFile);
//            
//            exporter.exportReport();
//            
//            System.out.println("\nReport Generated Successfully");

//            =====================================Plot=====================================
			// getting only required fields from db and map it to EstateReportField
//            List<Object []> results = session.createQuery(
//            		"select p.plotCode, p.unitId, p.plotId, p.rrNo, p.streetNo, p.mainStructureName, " +
//            			    "p.mcgmAllottedNo, p.mcgmWardName, p.location, p.area, p.status, p.customerCode, " +
//            			    "p.fromDate, p.toDate, d.divName, e.estate_name " +
//            			    "from Plot p " +
//            			    "LEFT JOIN Division d WITH p.divId = d.divId " +
//            			    "LEFT JOIN Estate e WITH p.estateId = e.estate_id",
//            		Object[].class
//            ).list();
//            
//         // mapping 
//            List<PlotReportField> plotReportFields = new ArrayList<>();
//            
//            for (Object[] row : results) {
//				
//            	PlotReportField plotReportField = new PlotReportField();
//            	
//            	plotReportField.setPlot_code((Integer) row[0]);
//                plotReportField.setUnit_id((Integer) row[1]); 
//                plotReportField.setPlot_id((Integer) row[2]);
//                plotReportField.setRr_no((String) row[3]);
//                plotReportField.setStreet_no((String) row[4]);
//                plotReportField.setMain_structure_name((String) row[5]);
//                plotReportField.setMcgm_allotted_no((String) row[6]);
//                plotReportField.setMcgm_ward_name((String) row[7]);
//                plotReportField.setLocation((String) row[8]);
//                plotReportField.setArea((BigDecimal) row[9]);
//                if("A".equals((String) row[10])) {
//            		plotReportField.setStatus("Approved");
//            	} else if ("RG".equals((String) row[3])) {
//            		plotReportField.setStatus("Registered");
//				}else if ("RT".equals((String) row[3])) {
//					plotReportField.setStatus("Return");
//				}else {
//					plotReportField.setStatus("Verified");
//				}
//                plotReportField.setCustomer_code((String) row[11]);
//                plotReportField.setFrom_date((Date) row[12]);
//                plotReportField.setTo_date((Date) row[13]);
//                plotReportField.setDiv_name((String) row[14]);
//                plotReportField.setEstate_name((String) row[15]);
//                plotReportField.setCustomer_name("");
//                
//              //adding reportField to List<PlotReportField>
//                plotReportFields.add(plotReportField);
//			}
//            
//            int totalRecords = plotReportFields.size();
//            
//            for (PlotReportField plotReportField : plotReportFields) {
//				System.out.println(plotReportField);
//			}
//            
//            System.out.println("Total Records : "+totalRecords);
//            
//            // jrxml file
//            InputStream inputStream = App.class.getResourceAsStream("/listOfPlots.jrxml");
//            
//            if (inputStream == null) {
//				throw new RuntimeException("Report Template does not found!!");
//			}
//            
//         // compiling jasper report
//            JasperReport jasperReport = JasperCompileManager.compileReport(inputStream); 
//            
//         // Create a JRBeanCollectionDataSource from the list of records
//            JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(plotReportFields);
//            
//         // Create parameters maping
//            Map<String, Object> parameters = new HashMap<>();
//            parameters.put("total_records", totalRecords);
//            
//         // Filling the report with data
//            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
//            
//         // Exporting the report to PDF
//            String outputFile = "F:\\C-DAC Mumbai Internship\\8th week\\Generated_Reports\\ListOfPlots.pdf";
//            
//            JRPdfExporter exporter = new JRPdfExporter();
//            exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
//            exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, outputFile);
//            
//            exporter.exportReport();
//            
//            System.out.println("\nReport Generated Successfully");

//            =====================================WayLeave=====================================
			// getting only required fields from db and map it to WayLeave
//            List<Object []> results = session.createQuery("Select w.origin_estate_id, w.terminating_estate_id, w.wyl_code, w.wyl_type_id, w.status, w.unit_id, w.wyl_date, w.draw_number, w.tr_no, w.tr_year from WayLeave w ",
//            		Object[].class).list();
//            
//            // mapping
//            List<WayLeave> wayLeaveFields = new ArrayList<>();
//            
//            for (Object[] row : results) {
//				
//            	WayLeave wayLeave = new WayLeave();
//            	
//            	wayLeave.setOrigin_estate_id((Integer)row[0]);
//            	wayLeave.setTerminating_estate_id((Integer) row[1]);
//            	wayLeave.setWyl_code((String) row[2]);
//            	wayLeave.setWyl_type_id((String) row[3]);
//            	wayLeave.setStatus((String) row[4]);
//            	if("A".equals((String) row[4])) {
//            		wayLeave.setStatus("Approved");
//            	} else if ("RG".equals((String) row[4])) {
//            		wayLeave.setStatus("Registered");
//				}else if ("RT".equals((String) row[4])) {
//					wayLeave.setStatus("Return");
//				}else {
//					wayLeave.setStatus("Verified");
//				}
//            	wayLeave.setUnit_id((String) row[5]);
//            	wayLeave.setWyl_date((String) row[6]);
//            	wayLeave.setDraw_number((String) row[7]);
//            	wayLeave.setTr_no((String) row[8]);
//            	wayLeave.setTr_year((String) row[9]);
//            	
//            	//adding reportField to List<WayLeave>
//            	wayLeaveFields.add(wayLeave);
//			}
//            
//            int totalRecords = wayLeaveFields.size();
//            
//            for (WayLeave wayLeave : wayLeaveFields) {
//				System.out.println(wayLeave);
//			}
//            System.out.println("Total Records : "+totalRecords);
//            
//            // jrxml file
//            InputStream inputStream = App.class.getResourceAsStream("/listOfWayleave.jrxml");
//            
//         // compiling jasper report
//            JasperReport jasperReport = JasperCompileManager.compileReport(inputStream);
//            
//         // Create a JRBeanCollectionDataSource from the list of records
//            JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(wayLeaveFields);
//            
//         // Create parameters maping
//            Map<String, Object> parameters = new HashMap<>();
//            parameters.put("total_records", totalRecords);
//            
//         // Filling the report with data
//            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
//         	
//         // Exporting the report to PDF
//            String outputFile = "F:\\C-DAC Mumbai Internship\\8th week\\Generated_Reports\\ListOfWayleave.pdf";
//            
//            JRPdfExporter exporter = new JRPdfExporter();
//            exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
//            exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, outputFile);
//            exporter.exportReport();
//            
//            System.out.println("\nReport Generated Successfully");

//            =====================================LetOut=====================================
			// getting only required fields from db and map it to LetOut
//            List<Object[]> results = session.createQuery("SELECT l.plot_id, l.let_out_name, l.letout_category_id, l.layout_type_id, l.prev_cust_code, l.status, l.remarks, l.let_out_no,"
//            		+ "l.cess_building, l.cess_building_no, l.allotment_status, l.from_date, l.to_date, l.sor, l.is_mbpt_prop, l.building_name, l.land_area, l.dept_id, l.struct_type_id, l.amount,"
//            		+ "l.is_higher_fee_applicable, l.percent_home_occupant, l.letout_from_date, l.prev_letout_id, l.area, l.year_of_constr, l.home_occupation, l.non_home_occupation, l.billable_area, l.surrender_status FROM LetOut l ",
//            		Object[].class
//            		).list();
//            
//         // mapping 
//            List<LetOut> letOutFields = new ArrayList<>();
//            
//            for (Object[] row : results) {
//            	
//				LetOut letOut = new LetOut();
//				
//				letOut.setPlot_id((Integer) row[0]);
//				letOut.setLet_out_name((String) row[1]);
//				letOut.setLetout_category_id((String) row[2]);
//				letOut.setLayout_type_id((String) row[3]);
//				letOut.setPrev_cust_code((String) row[4]);
////				letOut.setStatus((String) row[5]);
//				if("A".equals((String) row[5])) {
//					letOut.setStatus("Approved");
//            	} else if ("RG".equals((String) row[5])) {
//            		letOut.setStatus("Registered");
//				}else if ("RT".equals((String) row[5])) {
//					letOut.setStatus("Return");
//				}else {
//					letOut.setStatus("Verified");
//				}
//				letOut.setRemarks((String) row[6]);
//				letOut.setLet_out_no((String) row[7]);
//				letOut.setCess_building((Boolean) row[8]);
//				letOut.setCess_building_no((String) row[9]);
//				letOut.setAllotment_status((String) row[10]);
//				letOut.setFrom_date((String) row[11]);
//				letOut.setTo_date((String) row[12]);
//				letOut.setSor((String) row[13]);
//				letOut.setIs_mbpt_prop((Boolean) row[14]);
//				letOut.setBuilding_name((String) row[15]);
////				letOut.setLandArea((BigDecimal) row[16]);
//				if("null".equals((String) row[5])) {
//					letOut.setLand_area(null);
//            	} 
//				letOut.setDept_id((Integer) row[17]);
//				letOut.setStruct_type_id((Integer) row[18]);
////				letOut.setAmount((BigDecimal) row[19]);
//				if("null".equals((BigDecimal) row[19])) {
//					letOut.setAmount(null);
//            	} 
//				letOut.setIs_higher_fee_applicable((Boolean) row[20]);
//				letOut.setPercent_home_occupant((BigDecimal) row[21]);
//				letOut.setLetout_from_date((String) row[22]);
//				letOut.setPrev_letout_id((String) row[22]);
//				letOut.setArea((String) row[23]);
//				letOut.setYear_of_constr((String) row[24]);
//				letOut.setHome_occupation((String) row[25]);
////				letOut.setNonHomeOccupation((String) row[26]);
//				if("null".equals((String) row[26])) {
//					letOut.setNon_home_occupation(null);
//            	} 
//				letOut.setBillable_area((String) row[27]);
//				letOut.setSurrender_status((String) row[28]);
//				
//				//adding reportField to List<LetOut>
//				letOutFields.add(letOut);
//			}
//            
//            int totalRecords = letOutFields.size();
//            
//            for (LetOut letOut : letOutFields) {
//				System.out.println(letOut);
//			}
//            
//            System.out.println("Totals Records : "+totalRecords);
//            
//         // jrxml file
//            InputStream inputStream = App.class.getResourceAsStream("/listOfLetOut.jrxml");
//            
//         // compiling jasper report
//            JasperReport jasperReport = JasperCompileManager.compileReport(inputStream);
//            
//         // Create a JRBeanCollectionDataSource from the list of records
//            JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(letOutFields);
//            
//         // Create parameters maping
//            Map<String, Object> parameters = new HashMap<>();
//            parameters.put("total_records", totalRecords);
//            
//         // Filling the report with data
//            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
//            
//         // Exporting the report to PDF
//            String outputFile = "F:\\C-DAC Mumbai Internship\\8th week\\Generated_Reports\\ListOfLetOut.pdf";
//            
//            JRPdfExporter exporter = new JRPdfExporter();
//            exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
//            exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, outputFile);
//            exporter.exportReport();
//            
//            System.out.println("\nReport Generated Successfully ");

//            =====================================Division Information=====================================
			// getting only required fields from db and map it to Division_Information
//            List<Object[]> results_1 = session.createQuery("select d.divCode, d.divName, d.status, d.divDesc, d.updateTimestamp, dr.remark \r\n"
//            		+ "from Division d \r\n"
//            		+ "left join DivisionRemark_DB dr \r\n"
//            		+ "on d.divCode = dr.divCode\r\n"
//            		+ "where d.divCode = '1' ", 
//            		Object[].class).list();
//            
//         // getting only required fields from db and map it to Division_Information_table
//            List<Object[]> results_2 = session.createSQLQuery("select u.unit_code, u.mbpt_unit_id, u.unit_desc, u.status\r\n"
//            		+ "from unit u \r\n"
//            		+ "left join division d on u.div_id = d.div_id \r\n"
//            		+ "where d.div_code = '1'\r\n"
//            		+ "order by u.unit_code ;").list();
//            
//         // mapping detail fields
//            List<DivisionInformation> divisionInformationsFields = new ArrayList<>();
//            
//            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//            
//            for (Object[] row : results_1) {
//				
//            	DivisionInformation divisionInformation = new DivisionInformation();
//            	
//            	divisionInformation.setDiv_code((String) row[0]);
//            	divisionInformation.setDiv_name((String) row[1]);
//            	divisionInformation.setCustodian("Estate Division");
//            	if("A".equals((String) row[2])) {
//            		divisionInformation.setStatus("Approved");
//            	} else if ("RG".equals((String) row[2])) {
//            		divisionInformation.setStatus("Registered");
//				}else if ("RT".equals((String) row[2])) {
//					divisionInformation.setStatus("Return");
//				}else {
//					divisionInformation.setStatus("Verified");
//				}
//            	divisionInformation.setDiv_desc((String) row[3]);
//            	divisionInformation.setForward_to("Nodal Officer");
//            	// Converting Timestamp to String
//            	divisionInformation.setUpdate_timestamp(formatter.format((java.sql.Timestamp) row[4]));
//            	divisionInformation.setRemark((String) row[5]);
//            	
//            	divisionInformationsFields.add(divisionInformation);
//			}
//            
//         // mapping detail Table fields
//            List<DivisionInformationListOfPlots> divisionInformationListOfPlotsFields = new ArrayList<>();
//            
//            for (Object[] row : results_2) {
//				
//            	DivisionInformationListOfPlots divisionInformationListOfPlots = new DivisionInformationListOfPlots();
//            	
//            	divisionInformationListOfPlots.setUnit_code((String) row[0]);
//            	divisionInformationListOfPlots.setMbpt_unit_id((String) row[1]);
//            	divisionInformationListOfPlots.setUnit_desc((String) row[2]);
//            	divisionInformationListOfPlots.setStatus((String) row[2]);
//            	
//            	divisionInformationListOfPlotsFields.add(divisionInformationListOfPlots);
//			}
//            
//            System.out.println("Fields Data : ");
//            for (DivisionInformation divisionInformation : divisionInformationsFields) {
//				System.out.println(divisionInformation);
//			}
//            
//            System.out.println("Table Data : ");
//            for (DivisionInformationListOfPlots row : divisionInformationListOfPlotsFields) {
//				System.out.println(row);
//			}
//            
//         // jrxml file
//            InputStream inputStream = App.class.getResourceAsStream("/DivisionInformation.jrxml");
//            
//         // compiling jasper report
//            JasperReport jasperReport = JasperCompileManager.compileReport(inputStream);
//            
//         // Create a JRBeanCollectionDataSource from the list of records
//            JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(divisionInformationsFields);
//            
//         // Create a JRBeanCollectionDataSource from the list of records for table
//            JRBeanCollectionDataSource dataSource1 = new JRBeanCollectionDataSource(divisionInformationListOfPlotsFields);
//            
//         // dummy parameters maping
//            Map<String, Object> parameters = new HashMap<>();
//            parameters.put("DivisionInformation_ListOfUnits", dataSource1);
//            
//         // Filling the report with data
//            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport,parameters, dataSource);
//            
//         // Exporting the report to PDF
//          String outputFile = "F:\\C-DAC Mumbai Internship\\8th week\\Generated_Reports\\DivisionInformation.pdf";
//          
//          JRPdfExporter exporter = new JRPdfExporter();
//          exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
//          exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, outputFile);
//          
//          exporter.exportReport();
//          
//          System.out.println("\nReport Generated Successfully ");

//            ===================================== Unit Information=====================================
			// getting only required fields from db and map it to Unit Information
//			List<Object[]> results_1 = session.createQuery(
//					"select u.unitId, u.status, u.unitDesc, u.updateTimestamp, \r\n" + "r.remark, d.divName \r\n"
//							+ "from Unit u \r\n" + "left join Division d on u.divId = d.divId \r\n"
//							+ "left join UnitRemark r on u.unitId  = r.unitId\r\n" + "where u.unitId = 1",
//					Object[].class).list();
//			
//			// getting only required fields from db and map it to UnitInformation_ListOfEstate
//			List<Object[]> results_2 = session.createSQLQuery("select e.estate_code, e.estate_name, e.estate_desc, e.status from estate e \r\n"
//					+ "left join unit u on e.unit_id = u.unit_id \r\n"
//					+ "where u.unit_id = 1\r\n"
//					+ "order by estate_code").list();
//			
//
//			// mapping
//
//			List<UnitInformation> unitInformationsFields = new ArrayList<>();
//
//			for (Object[] row : results_1) {
//
//				UnitInformation unitInformation = new UnitInformation();
//
//				unitInformation.setUnit_id(row[0].toString());
////				unitInformation.setStatus(row[1].toString());
//				if ("A".equals((String) row[1])) {
//					unitInformation.setStatus("Approved");
//				} else if ("RG".equals((String) row[1])) {
//					unitInformation.setStatus("Registered");
//				} else if ("RT".equals((String) row[1])) {
//					unitInformation.setStatus("Return");
//				} else {
//					unitInformation.setStatus("Verified");
//				}
//				unitInformation.setUnit_desc(row[2].toString());
//				unitInformation.setUpdate_timestamp(row[3].toString());
//				unitInformation.setRemark(row[4].toString());
//				unitInformation.setDiv_name(row[5].toString());
//				unitInformation.setCustodian("Estate Division");
//				unitInformation.setAttached_document("No");
//				unitInformation.setForwardTo("Nodal Officer");
//
//				unitInformationsFields.add(unitInformation);
//			}
//			
//			// mapping detail Table fields
//			List<UnitInformationListOfEstate> unitInformationListOfEstates = new ArrayList<>();
//			
//			for (Object[] row : results_2) {
//				
//				UnitInformationListOfEstate unitInformationListOfEstate = new UnitInformationListOfEstate();
//				
//				unitInformationListOfEstate.setEstate_code((String) row[0]);
//				unitInformationListOfEstate.setEstate_name((String) row[1]);
//				unitInformationListOfEstate.setEstate_desc((String) row[2]);
////				unitInformationListOfEstate.setStatus((String) row[3]);
//				if ("A".equals((String) row[3])) {
//					unitInformationListOfEstate.setStatus("Approved");
//				} else if ("RG".equals((String) row[3])) {
//					unitInformationListOfEstate.setStatus("Registered");
//				} else if ("RT".equals((String) row[3])) {
//					unitInformationListOfEstate.setStatus("Return");
//				} else {
//					unitInformationListOfEstate.setStatus("Verified");
//				}
//				
//				unitInformationListOfEstates.add(unitInformationListOfEstate);
//			}
//			
//			System.out.println("=====Fields Data=====");
//			for (UnitInformation row : unitInformationsFields) {
//				System.out.println(row);
//			}
//			
//			System.out.println("=====Table Data=====");
//			for (UnitInformationListOfEstate unitInformationListOfEstate : unitInformationListOfEstates) {
//				System.out.println(unitInformationListOfEstate);
//			}
//			
//			// jrxml file
//			InputStream inputStream = App.class.getResourceAsStream("/UnitInformation.jrxml");
//
//			if (inputStream == null) {
//				System.out.println("Report template not found");
//			}
//
//			// compiling jasper report
//			JasperReport jasperReport = JasperCompileManager.compileReport(inputStream);
//
//			// Create a JRBeanCollectionDataSource for records
//			JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(unitInformationsFields);
//			
//			// Create a JRBeanCollectionDataSource for table
//			JRBeanCollectionDataSource dataSource1 = new JRBeanCollectionDataSource(unitInformationListOfEstates);
//
//			// parameters maping
//			Map<String, Object> parameters = new HashMap<>();
//			parameters.put("UnitInformation_ListOfEstate", dataSource1);
//
//			// Filling the report with data
//			JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
//
//			// Exporting the report to PDF
//			String outputFile = "F:\\C-DAC Mumbai Internship\\8th week\\Generated_Reports\\UnitInformation.pdf";
//
//			JRPdfExporter exporter = new JRPdfExporter();
//			exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
//			exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, outputFile);
//
//			exporter.exportReport();
//
//			System.out.println("\nReport Generated Successfully ");
			
//			=====================================Estate Information=====================================
			// getting only required fields from db and map it to Estate Information
			List<Object[]> result = session.createSQLQuery("select e.estate_code, e.estate_name, e.estate_desc, e.update_timestamp, e.status,\r\n"
					+ "u.unit_code, au.\"name\", d.div_name, er.remark \r\n"
					+ "from estate e  \r\n"
					+ "left join admin_users au on e.admin_id = au.admin_id\r\n"
					+ "left join unit u on e.unit_id = u.unit_id \r\n"
					+ "left join division d on u.div_id = d.div_id\r\n"
					+ "left join estate_rmk er on e.estate_id = er.estate_id\r\n"
					+ "where e.estate_id = 1").list();
			
			// getting only required fields from db and map it to EstateInformation_PlotsList
			List<Object[]> result_1= session.createSQLQuery("select p.rr_no, p.plot_code, p.customer_code, p.plot_desc, p.status from plot p \r\n"
					+ "left join estate e on p.estate_id = e.estate_id \r\n"
					+ "where p.estate_id = 1;").list();
			
			// mapping
			
			//Fields mapping
			List<EstateInformation> estateInformationFields = new ArrayList<>();
			
			for (Object[] row : result) {
				
				EstateInformation estateInformation = new EstateInformation();
				
				estateInformation.setEstate_code((String)row[0]);
				estateInformation.setEstate_name((String)row[1]);
				estateInformation.setEstate_desc((String)row[2]);
				estateInformation.setUpdate_timestamp(row[3].toString());
//				estateInformation.setStatus((String)row[4]);
				if ("A".equals((String) row[4])) {
					estateInformation.setStatus("Approved");
				} else if ("RG".equals((String) row[4])) {
					estateInformation.setStatus("Registered");
				} else if ("RT".equals((String) row[4])) {
					estateInformation.setStatus("Return");
				} else {
					estateInformation.setStatus("Verified");
				}
				estateInformation.setUnit_code((String)row[5]);
				estateInformation.setName((String)row[6]);
				estateInformation.setDiv_name((String)row[7]);
				estateInformation.setRemark((String)row[8]);
				estateInformation.setCustodian("Estate Division");
				
				estateInformationFields.add(estateInformation);
			}
			
			//table fields mapping
			List<EstateInformationListOfPlots> estateInformationListOfPlotsFields = new ArrayList<>();
			
			for (Object[] row : result_1) {
				
				EstateInformationListOfPlots estateInformationListOfPlots = new EstateInformationListOfPlots();
				
				estateInformationListOfPlots.setRr_no((String)row[0]);
				estateInformationListOfPlots.setPlot_code((String)row[1]);
				estateInformationListOfPlots.setCustomer_code((String)row[2]);
				estateInformationListOfPlots.setPlot_desc((String)row[3]);
//				estateInformationListOfPlots.setStatus((String)row[4]);
				if ("A".equals((String) row[4])) {
					estateInformationListOfPlots.setStatus("Approved");
				} else if ("RG".equals((String) row[4])) {
					estateInformationListOfPlots.setStatus("Registered");
				} else if ("RT".equals((String) row[4])) {
					estateInformationListOfPlots.setStatus("Return");
				} else {
					estateInformationListOfPlots.setStatus("Verified");
				}
				
				estateInformationListOfPlotsFields.add(estateInformationListOfPlots);
			}
			
			System.out.println("=====Fields Data=====");
			for (EstateInformation estateInformation : estateInformationFields) {
				System.out.println(estateInformation);
			}
			System.out.println("=====Table Data=====");
			for (EstateInformationListOfPlots estateInformationListOfPlots : estateInformationListOfPlotsFields) {
				System.out.println(estateInformationListOfPlots);
			}
			
			// jrxml file 
			InputStream inputStream = App.class.getResourceAsStream("/EstateInformation.jrxml");
			if(inputStream == null) {
				System.out.println("Report template not found");
			}
			
			// compiling jasper report
			JasperReport jasperReport = JasperCompileManager.compileReport(inputStream);
			
			// Creating a JRBeanCollectionDataSource for records
			JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(estateInformationFields);
			
			// Creating a JRBeanCollectionDataSource for table records
			JRBeanCollectionDataSource dataSource1 = new JRBeanCollectionDataSource(estateInformationListOfPlotsFields);

			// parameters maping
			Map<String, Object> parameters = new HashMap<>();
			parameters.put("EstateInformation_PlotsList", dataSource1);
			
			// Filling the report with data
			JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
			
			// Exporting the report to PDF
			String outputFile = "F:\\C-DAC Mumbai Internship\\8th week\\Generated_Reports\\EstateInformation.pdf";
			
			JRPdfExporter exporter = new JRPdfExporter();
			exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
			exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, outputFile);
			
			exporter.exportReport();
			
			System.out.println("\nReport Generated Successfully at "+outputFile);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
