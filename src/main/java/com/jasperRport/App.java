package com.jasperRport;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
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
import com.jasperRport.entities.LetoutInformationBuiltUpAreaTable;
import com.jasperRport.entities.LetoutInformationMainReportField;
import com.jasperRport.entities.LetoutInformationSurrenderLetoutTable;
import com.jasperRport.entities.LetoutInformationTenancyAllotmentDetailsTable;
import com.jasperRport.entities.PlotInformationMainReportFields;
import com.jasperRport.entities.PlotInformationSubReportZoneTable;
import com.jasperRport.entities.PlotInformationSubreportLetoutTable;
import com.jasperRport.entities.PlotInformationSubreportMergeLetoutTable;
import com.jasperRport.entities.PlotReportField;
import com.jasperRport.entities.Unit;
import com.jasperRport.entities.UnitInformation;
import com.jasperRport.entities.UnitInformationListOfEstate;
import com.jasperRport.entities.UnitReportField;
import com.jasperRport.entities.WayLeave;
import com.jasperRport.entities.WayleaveInformationDocumentTable;
import com.jasperRport.entities.WayleaveInformationMainReportFields;
import com.jasperRport.entities.WayleaveInformationZoneTable;

import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
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
//            List<Object[]> results = session.createSQLQuery(
//            		"select u.unit_id, d.div_name , u.unit_desc, u.status, r.remark\r\n"
//            		+ "from unit u \r\n"
//            		+ "left join unit_rmk r on u.unit_id = r.unit_id \r\n"
//            		+ "left join Division d on u.div_id = d.div_id \r\n"
//            		+ "order by u.unit_id"
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
//            List<Object []> results = session.createSQLQuery(
//            		"select estate_code, estate_name, unit_id, status, remarks " +
//            		"from Estate " +
//            		"order by estate_code"
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
//			List<Object []> results = session.createSQLQuery(
//	                 "select p.plot_code,p.unit_id , p.plot_id , p.rr_no , p.street_no , p.main_structure_name ,p.mcgm_allotted_no , p.mcgm_ward_name , p.\"location\" , p.area , p.status , p.customer_code ,\r\n"
//	                 + "p.from_date , p.to_date ,d.div_name ,e.estate_name \r\n"
//	                 + "from plot p \r\n"
//	                 + "LEFT JOIN division d on p.div_id  = d.div_id \r\n"
//	                 + "LEFT JOIN estate e on p.estate_id  = e.estate_id "
//	         ).list();
//            
//         // mapping 
//            List<PlotReportField> plotReportFields = new ArrayList<>();
//            
//            for (Object[] row : results) {
//				
//            	PlotReportField plotReportField = new PlotReportField();
//            	
//            	plotReportField.setPlot_code((String) row[0]);
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
//            List<Object []> results = session.createSQLQuery(
//            		"Select w.origin_estate_id, w.terminating_estate_id, w.wyl_code, w.wyl_type_id, w.status, "
//            		+ "w.unit_id, w.wyl_date, w.draw_number, w.tr_no, w.tr_year "
//            		+ "from WayLeave w "
//            		).list();
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
//            	wayLeave.setWyl_date((Date) row[6]);
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
//            List<Object[]> results = session.createSQLQuery("SELECT l.plot_id, l.let_out_name, l.letout_category_id, l.layout_type_id, l.prev_cust_code, l.status, l.remarks, l.let_out_no,\r\n"
//            		+ "l.cess_building, l.cess_building_no, l.allotment_status, l.from_date, l.to_date, l.sor, l.is_mbpt_prop, l.building_name, l.land_area, l.dept_id, l.struct_type_id, l.amount,\r\n"
//            		+ "l.is_higher_fee_applicable, l.percent_home_occupant, l.letout_from_date, l.prev_letout_id, l.area, l.year_of_constr, l.home_occupation, l.non_home_occupation, l.billable_area, l.surrender_status \r\n"
//            		+ "FROM let_out l"
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
//				letOut.setFrom_date((Date) row[11]);
//				letOut.setTo_date((Date) row[12]);
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
//				letOut.setLetout_from_date((Date) row[22]);
//				letOut.setPrev_letout_id((Date) row[22]);
//				letOut.setArea((String) row[23]);
//				letOut.setYear_of_constr((String) row[24]);
//				letOut.setHome_occupation((String) row[25]);
////				letOut.setNonHomeOccupation((String) row[26]);
//				if("null".equals((BigInteger) row[26])) {
//					letOut.setNon_home_occupation(null);
//            	} 
//				letOut.setBillable_area((BigInteger) row[27]);
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
//			List<Object[]> result = session.createSQLQuery("select e.estate_code, e.estate_name, e.estate_desc, e.update_timestamp, e.status,\r\n"
//					+ "u.unit_code, au.\"name\", d.div_name, er.remark \r\n"
//					+ "from estate e  \r\n"
//					+ "left join admin_users au on e.admin_id = au.admin_id\r\n"
//					+ "left join unit u on e.unit_id = u.unit_id \r\n"
//					+ "left join division d on u.div_id = d.div_id\r\n"
//					+ "left join estate_rmk er on e.estate_id = er.estate_id\r\n"
//					+ "where e.estate_id = 1").list();
//			
//			// getting only required fields from db and map it to EstateInformation_PlotsList
//			List<Object[]> result_1= session.createSQLQuery("select p.rr_no, p.plot_code, p.customer_code, p.plot_desc, p.status from plot p \r\n"
//					+ "left join estate e on p.estate_id = e.estate_id \r\n"
//					+ "where p.estate_id = 1;").list();
//			
//			// mapping
//			
//			//Fields mapping
//			List<EstateInformation> estateInformationFields = new ArrayList<>();
//			
//			for (Object[] row : result) {
//				
//				EstateInformation estateInformation = new EstateInformation();
//				
//				estateInformation.setEstate_code((String)row[0]);
//				estateInformation.setEstate_name((String)row[1]);
//				estateInformation.setEstate_desc((String)row[2]);
//				estateInformation.setUpdate_timestamp(row[3].toString());
////				estateInformation.setStatus((String)row[4]);
//				if ("A".equals((String) row[4])) {
//					estateInformation.setStatus("Approved");
//				} else if ("RG".equals((String) row[4])) {
//					estateInformation.setStatus("Registered");
//				} else if ("RT".equals((String) row[4])) {
//					estateInformation.setStatus("Return");
//				} else {
//					estateInformation.setStatus("Verified");
//				}
//				estateInformation.setUnit_code((String)row[5]);
//				estateInformation.setName((String)row[6]);
//				estateInformation.setDiv_name((String)row[7]);
//				estateInformation.setRemark((String)row[8]);
//				estateInformation.setCustodian("Estate Division");
//				
//				estateInformationFields.add(estateInformation);
//			}
//			
//			//table fields mapping
//			List<EstateInformationListOfPlots> estateInformationListOfPlotsFields = new ArrayList<>();
//			
//			for (Object[] row : result_1) {
//				
//				EstateInformationListOfPlots estateInformationListOfPlots = new EstateInformationListOfPlots();
//				
//				estateInformationListOfPlots.setRr_no((String)row[0]);
//				estateInformationListOfPlots.setPlot_code((String)row[1]);
//				estateInformationListOfPlots.setCustomer_code((String)row[2]);
//				estateInformationListOfPlots.setPlot_desc((String)row[3]);
////				estateInformationListOfPlots.setStatus((String)row[4]);
//				if ("A".equals((String) row[4])) {
//					estateInformationListOfPlots.setStatus("Approved");
//				} else if ("RG".equals((String) row[4])) {
//					estateInformationListOfPlots.setStatus("Registered");
//				} else if ("RT".equals((String) row[4])) {
//					estateInformationListOfPlots.setStatus("Return");
//				} else {
//					estateInformationListOfPlots.setStatus("Verified");
//				}
//				
//				estateInformationListOfPlotsFields.add(estateInformationListOfPlots);
//			}
//			
//			System.out.println("=====Fields Data=====");
//			for (EstateInformation estateInformation : estateInformationFields) {
//				System.out.println(estateInformation);
//			}
//			System.out.println("=====Table Data=====");
//			for (EstateInformationListOfPlots estateInformationListOfPlots : estateInformationListOfPlotsFields) {
//				System.out.println(estateInformationListOfPlots);
//			}
//			
//			// jrxml file 
//			InputStream inputStream = App.class.getResourceAsStream("/EstateInformation.jrxml");
//			if(inputStream == null) {
//				System.out.println("Report template not found");
//			}
//			
//			// compiling jasper report
//			JasperReport jasperReport = JasperCompileManager.compileReport(inputStream);
//			
//			// Creating a JRBeanCollectionDataSource for records
//			JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(estateInformationFields);
//			
//			// Creating a JRBeanCollectionDataSource for table records
//			JRBeanCollectionDataSource dataSource1 = new JRBeanCollectionDataSource(estateInformationListOfPlotsFields);
//
//			// parameters maping
//			Map<String, Object> parameters = new HashMap<>();
//			parameters.put("EstateInformation_PlotsList", dataSource1);
//			
//			// Filling the report with data
//			JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
//			
//			// Exporting the report to PDF
//			String outputFile = "F:\\C-DAC Mumbai Internship\\8th week\\Generated_Reports\\EstateInformation.pdf";
//			
//			JRPdfExporter exporter = new JRPdfExporter();
//			exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
//			exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, outputFile);
//			
//			exporter.exportReport();
//			
//			System.out.println("\nReport Generated Successfully at "+outputFile);
			
//			=====================================Plot Information=====================================
//			try {
//				
//				// Compiling both main report and subreports
//				JasperReport mainReport = JasperCompileManager.compileReport(new FileInputStream("src/main/resources/PlotsInformation.jrxml"));
//				JasperReport zonesTableSubReport = JasperCompileManager.compileReport(new FileInputStream("src/main/resources/PlotInformation_ZonesForPlotsTable.jrxml"));
//				JasperReport mergeLetoutSubreport = JasperCompileManager.compileReport(new FileInputStream("src/main/resources/PlotInformation_MergeLetouts.jrxml"));
//				JasperReport letoutSubreport = JasperCompileManager.compileReport(new FileInputStream("src/main/resources/PlotInformation_ListOfLetouts.jrxml"));
//				
//				if (zonesTableSubReport == null) {
//					System.out.println("Subreport Not found");
//				}
//				
//				String outputPath = "F:\\\\C-DAC Mumbai Internship\\\\8th week\\\\Generated_Reports\\\\PlotInformation.pdf";
//				
//				// Mapping compiled zone table subreport in main report
//				Map<String, Object> parameters = new HashMap<String, Object>();
//				parameters.put("Subreport_Path_Zone", zonesTableSubReport);
//				
//				// Mapping compiled merge letout table subreport in main report
////				parameters.put("Subreport_Path_MergeLetouts", mergeLetoutSubreport);
//				
//				// Mapping compiled letout table subreport in main report
//				parameters.put("Subreport_Path_ListOfLetouts", letoutSubreport);
//				
//				// Getting Main report fields form DB
//				List<Object[]> mainReportData = session.createSQLQuery("select d.div_name, u.unit_code, e.estate_name, p.plot_code,  \r\n"
//						+ "p.main_structure_name, p.area, p.street_no, p.mcgm_allotted_no,\r\n"
//						+ "mw.ward_name, p.\"location\", p.pincode, p.city_survey_no, p.city_survey_div, p.mbpt_road_connectivity,\r\n"
//						+ "p.from_date, p.plot_desc, p.owner_name , p.dept_name, p.schedule_north, p.schedule_south, p.schedule_east,\r\n"
//						+ "p.schedule_west, p.reservation, pd.plot_id, p.remarks, p.created_by_merge\r\n"
//						+ "from plot p \r\n"
//						+ "left join division d on p.div_id = d.div_id \r\n"
//						+ "left join unit u on p.unit_id = u.unit_id \r\n"
//						+ "left join estate e on p.estate_id = e.estate_id \r\n"
//						+ "left join m_wards mw on p.ward_id = mw.ward_id\r\n"
//						+ "left join plot_docs pd on p.plot_id = pd.plot_id\r\n"
//						+ "where p.plot_code = '311020077'").list(); 
//				
//				// putting fetched fields from db in entity class for main report
//				List<PlotInformationMainReportFields> plotInformationMainReportFieldsList = new ArrayList<>();
//				
//				for (Object[] row : mainReportData) {
//					
//					PlotInformationMainReportFields plotInformationMainReportFields = new PlotInformationMainReportFields();
//					
//					plotInformationMainReportFields.setDiv_name((String) row[0]);
//					plotInformationMainReportFields.setUnit_code((String) row[1]);
//					plotInformationMainReportFields.setEstate_name((String) row[2]);
//					plotInformationMainReportFields.setPlot_code((String) row[3]);
//					plotInformationMainReportFields.setMain_structure_name((String) row[4]);
//					plotInformationMainReportFields.setArea((BigDecimal) row[5]);
//					plotInformationMainReportFields.setStreet_no((String) row[6]);
//					plotInformationMainReportFields.setMcgm_allotted_no((String) row[7]);
//					plotInformationMainReportFields.setWard_name((String) row[8]);
//					plotInformationMainReportFields.setLocation((String) row[9]);
//					plotInformationMainReportFields.setPincode((BigDecimal) row[10]);
//					plotInformationMainReportFields.setCity_survey_no((String) row[11]);
//					plotInformationMainReportFields.setCity_survey_div((String) row[12]);
//					plotInformationMainReportFields.setMbpt_road_connectivity((Boolean) row[13]);
//					plotInformationMainReportFields.setFrom_date((String) row[14]);
//					plotInformationMainReportFields.setPlot_desc((String) row[15]);
//					plotInformationMainReportFields.setOwner_name((String) row[16]);
//					plotInformationMainReportFields.setDept_name((String) row[17]);
//					plotInformationMainReportFields.setSchedule_north((String) row[18]);
//					plotInformationMainReportFields.setSchedule_south((String) row[19]);
//					plotInformationMainReportFields.setSchedule_east((String) row[20]);
//					plotInformationMainReportFields.setSchedule_west((String) row[21]);
//					plotInformationMainReportFields.setReservation((String) row[22]);
//					plotInformationMainReportFields.setPlot_id((Integer) row[23]);
//					plotInformationMainReportFields.setRemarks((String) row[24]);
//					plotInformationMainReportFields.setCreated_by_merge((Boolean) row[25]);
//					plotInformationMainReportFields.setDocuments_attached("No");
//					
//					plotInformationMainReportFieldsList.add(plotInformationMainReportFields);
//				}
//				
//				System.out.println("====================Main Report Field====================");
//				for (PlotInformationMainReportFields plotInformationMainReportFields : plotInformationMainReportFieldsList) {
//					System.out.println(plotInformationMainReportFields);
//				}
//				
//				//==================================================================================
//				
//				JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(plotInformationMainReportFieldsList);
//				
//				// putting fetched fields from db in entity class for Zone table
//				List<Object[]> subReportZoneTable = session.createSQLQuery("select mz.zone_name, mzd.sub_zone_desc\r\n"
//						+ "from plot p \r\n"
//						+ "left join plot_zone_details pz on p.plot_id = pz.plot_id\r\n"
//						+ "left join m_zones mz on pz.zone_id = mz.zone_id\r\n"
//						+ "left join m_zones_details mzd on pz.zone_detail_id = mzd.zone_detail_id\r\n"
//						+ "where p.plot_code = '311020077'").list();
//				
//				// putting fetched fields from db in entity class for sub report zone table
//				List<PlotInformationSubReportZoneTable> informationSubReportZoneTableFields = new ArrayList<>();
//				
//				for (Object[] row : subReportZoneTable) {
//					
//					PlotInformationSubReportZoneTable informationSubReportZoneTable = new PlotInformationSubReportZoneTable();
//					
//					informationSubReportZoneTable.setZone_name((String) row[0]);
//					informationSubReportZoneTable.setSub_zone_desc((String) row[1]);
//					
//					informationSubReportZoneTableFields.add(informationSubReportZoneTable);
//				}
//				
//				System.out.println("====================SubReport Zone table Field====================");
//				for (PlotInformationSubReportZoneTable plotInformationSubReportZoneTable : informationSubReportZoneTableFields) {
//					System.out.println(plotInformationSubReportZoneTable);
//				}
//				
//				// Mapping fetched data in jasper
//				JRBeanCollectionDataSource subReportDataSource = new JRBeanCollectionDataSource(informationSubReportZoneTableFields);
//				parameters.put("ZonesForPlots", subReportDataSource);
//				
//				//==================================================================================
//				
//				// putting fetched fields from db in entity class for Merge letout table
//				List<Object[]> subReportMergeLetoutsTable = session.createSQLQuery("select let_out.let_out_id, let_out.let_out_name ,let_out.billable_area ,let_out.let_out_desc  \r\n"
//						+ "from plot , let_out \r\n"
//						+ "where plot.plot_id = let_out.let_out_id and plot.plot_code = '311020077'").list();
//				
//				// putting fetched fields from db in entity class for sub report Merge letout table
//				List<PlotInformationSubreportMergeLetoutTable> informationSubreportMergeLetoutTableFields = new ArrayList<>();
//				
//				for (Object[] row : subReportMergeLetoutsTable) {
//					
//					PlotInformationSubreportMergeLetoutTable informationSubreportMergeLetoutTable = new PlotInformationSubreportMergeLetoutTable();
//					
//					informationSubreportMergeLetoutTable.setLet_out_id((Integer) row[0]);
//					informationSubreportMergeLetoutTable.setLet_out_name((String) row[1]);
//					informationSubreportMergeLetoutTable.setBillable_area((String) row[2]);
//					informationSubreportMergeLetoutTable.setLet_out_desc((String) row[3]);
//					
//					informationSubreportMergeLetoutTableFields.add(informationSubreportMergeLetoutTable);
//				}
//				
//				// checking whether merge letout table is empty or not
//				System.out.println(informationSubreportMergeLetoutTableFields.isEmpty());
//				
//				if(informationSubreportMergeLetoutTableFields.isEmpty() == true) {
//					parameters.put("Merge_Letouts", "There is no merge letout.");
//				} else {
//					parameters.put("Subreport_Path_MergeLetouts", mergeLetoutSubreport);
//				}
//				
//				System.out.println("====================SubReport Merge Letout table Field====================");
//				for (PlotInformationSubreportMergeLetoutTable plotInformationSubreportMergeLetoutTable : informationSubreportMergeLetoutTableFields) {
//					System.out.println(plotInformationSubreportMergeLetoutTable);
//				}
//				
//				// Mapping fetched data in jasper
//				JRBeanCollectionDataSource mergeLetoutTable = new JRBeanCollectionDataSource(informationSubreportMergeLetoutTableFields);
//				parameters.put("MergeLetoutsTable", mergeLetoutTable);
//				
//				//==================================================================================
//				
//				List<Object[]> subReportLetoutTable = session.createSQLQuery("select lo.let_out_name, lo.let_out_desc, lo.layout_type_id,\r\n"
//						+ "lo.allotment_status, lo.status\r\n"
//						+ "from let_out lo\r\n"
//						+ "where lo.plot_id = 4797; ").list();
//				
//				// putting fetched fields from db in entity class for letout table
//				List<PlotInformationSubreportLetoutTable> informationSubreportLetoutTableFields = new ArrayList<>();
//				
//				for (Object[] row : subReportLetoutTable) {
//					
//					PlotInformationSubreportLetoutTable informationSubreportLetoutTable = new PlotInformationSubreportLetoutTable();
//					
//					informationSubreportLetoutTable.setLet_out_name((String)row[0]);
//					informationSubreportLetoutTable.setLet_out_desc((String)row[1]);
//					informationSubreportLetoutTable.setLayout_type_id((String)row[2]);
//					informationSubreportLetoutTable.setAllotment_status((String)row[3]);
////					informationSubreportLetoutTable.setStatus((String)row[4]);
//					if ("A".equals((String) row[4])) {
//						informationSubreportLetoutTable.setStatus("Approved");
//					} else if ("RG".equals((String) row[4])) {
//						informationSubreportLetoutTable.setStatus("Registered");
//					} else if ("RT".equals((String) row[4])) {
//						informationSubreportLetoutTable.setStatus("Return");
//					} else {
//						informationSubreportLetoutTable.setStatus("Verified");
//					}
//					
//					informationSubreportLetoutTableFields.add(informationSubreportLetoutTable);
//				}
//				
//				System.out.println("====================SubReport Letout table Field====================");
//				for (PlotInformationSubreportLetoutTable plotInformationSubreportLetoutTable : informationSubreportLetoutTableFields) {
//					System.out.println(plotInformationSubreportLetoutTable);
//				}
//				
//				JRBeanCollectionDataSource letoutTable = new JRBeanCollectionDataSource(informationSubreportLetoutTableFields);
//				parameters.put("LetoutsTable", letoutTable);
//				
//				// printing jasper report
//				JasperPrint report = JasperFillManager.fillReport(mainReport, parameters, dataSource);
//				JasperExportManager.exportReportToPdfFile(report, outputPath);
//				
//				System.out.println("\nReport Generated Successfully at "+outputPath);
//				
//			} catch (IOException e) {
//				System.out.println(e.getMessage());
//			}
			
//			=====================================Letut Information=====================================
//			try {
//				
//				// Compiling both main report and subreports
//				JasperReport letoutMainReport = JasperCompileManager.compileReport(new FileInputStream("src/main/resources/LetoutInformation.jrxml"));
//				JasperReport builtUpAreaSubreport = JasperCompileManager.compileReport(new FileInputStream("src/main/resources/LetoutInformation_BuiltUpAreaTable.jrxml"));
//				JasperReport PreviousUpdatedLetoutAreaDetailsSubreport = JasperCompileManager.compileReport(new FileInputStream("src/main/resources/LetoutInformation_PreviousUpdatedLetoutAreaDetails.jrxml"));
//				JasperReport surrenderLetoutSubreport = JasperCompileManager.compileReport(new FileInputStream("src/main/resources/LetoutInformation_SurrenderLetout.jrxml"));
//				JasperReport tenancyAllotmentDetailsSubreport = JasperCompileManager.compileReport(new FileInputStream("src/main/resources/LetoutInformation_TenancyAllotmentDetailsTable.jrxml"));
//				
//				String outputPath = "F:\\\\C-DAC Mumbai Internship\\\\8th week\\\\Generated_Reports\\\\LetoutInformation.pdf";
//				
//				// Mapping compiled zone table subreport in main report
//				Map<String, Object> parameters = new HashMap<String, Object>();
//				
//				parameters.put("BuiltUpAreaTable_Path", builtUpAreaSubreport);
//				parameters.put("PreviousUpdatedLetoutAreaDetails_Path", PreviousUpdatedLetoutAreaDetailsSubreport);
//				parameters.put("SurrenderLetoutTable_Path", surrenderLetoutSubreport);
//				parameters.put("TenancyAllotmentDetailsTable_Path", tenancyAllotmentDetailsSubreport);
				
				// =========================Getting Main report fields form DB=========================
//				List<Object[]> mainReportData = session.createSQLQuery("select d.div_name, u.unit_code, e.estate_name, p.rr_no, p.plot_code, \r\n"
//						+ "lst.struct_type, lt.layout_type, lo.let_out_no, lo.let_out_name , lo.area, lo.home_occupation,\r\n"
//						+ "lo.non_home_occupation, md.dept_name, lo.from_date, lo.billable_area, lo.status, au.\"name\", lo.let_out_desc,\r\n"
//						+ "lo.remarks\r\n"
//						+ "from let_out lo \r\n"
//						+ "left join plot p on lo.plot_id = p.plot_id \r\n"
//						+ "left join division d on p.div_id = d.div_id\r\n"
//						+ "left join unit u on p.unit_id = u.unit_id \r\n"
//						+ "left join estate e on p.estate_id = e.estate_id \r\n"
//						+ "left join m_layout_type lt on lo.layout_type_id = lt.layout_type_id\r\n"
//						+ "left join m_letout_structure_type lst on lo.struct_type_id = lst.struct_type_id\r\n"
//						+ "left join m_department md on lo.dept_id = md.dept_id\r\n"
//						+ "left join admin_users au on lo.admin_id = au.admin_id \r\n"
//						+ "where p.plot_code = '311020077';").list();
//				
//				// putting fetched fields from db in entity class for main report
//				List<LetoutInformationMainReportField> letoutInformationMainReportFields = new ArrayList<>();
//				
//				for (Object[] row : mainReportData) {
//					
//					LetoutInformationMainReportField letoutInformationMainReportField = new LetoutInformationMainReportField();
//					
//					letoutInformationMainReportField.setDiv_name((String) row[0]);
//					letoutInformationMainReportField.setUnit_code((String) row[1]);
//					letoutInformationMainReportField.setEstate_name((String) row[2]);
//					letoutInformationMainReportField.setRr_no((String) row[3]);
//					letoutInformationMainReportField.setPlot_code((String) row[4]);
//					letoutInformationMainReportField.setStruct_type((String) row[5]);
//					letoutInformationMainReportField.setLayout_type((String) row[6]);
//					letoutInformationMainReportField.setLet_out_no((String) row[7]);
//					letoutInformationMainReportField.setLet_out_name((String) row[8]);
//					letoutInformationMainReportField.setArea((String) row[9]);
//					letoutInformationMainReportField.setHome_occupation((Long) row[10]);
//					letoutInformationMainReportField.setNon_home_occupation((Long) row[11]);
//					letoutInformationMainReportField.setDept_name((String) row[12]);
//					letoutInformationMainReportField.setFrom_date((Date) row[13]);
//					letoutInformationMainReportField.setBillable_area((String) row[14]);
//					letoutInformationMainReportField.setStatus((String) row[15]);
//					letoutInformationMainReportField.setUserName((String) row[16]);
//					letoutInformationMainReportField.setLet_out_desc((String) row[17]);
//					letoutInformationMainReportField.setRemarks((String) row[18]);
//					letoutInformationMainReportField.setDocumentUploaded("No");
//					
//					// Mapping the parameters of LetoutInformation_PreviousUpdatedLetoutAreaDetails
//					parameters.put("Status", letoutInformationMainReportField.getStatus());
//					parameters.put("Forwardto", letoutInformationMainReportField.getUserName());
//					parameters.put("Remarks", letoutInformationMainReportField.getRemarks());
//					parameters.put("DocumentUploaded", letoutInformationMainReportField.getDocumentUploaded());
//					
//					letoutInformationMainReportFields.add(letoutInformationMainReportField);
//				}
//				
//				System.out.println("================================Main Report data================================");
//				for (LetoutInformationMainReportField letoutInformationMainReportField : letoutInformationMainReportFields) {
//					System.out.println(letoutInformationMainReportField);
//				}
//				
//				// =========================Getting Built up area report fields form DB=========================
//				List<Object[]> builtUpAreaReportData = session.createSQLQuery("select lba.built_up_area_commercial, lba.built_up_area_rec, lba.consumed_fsi, lba.from_date\r\n"
//						+ "from letout_b_area lba \r\n"
//						+ "left join let_out lo on lba.let_out_id = lo.let_out_id \r\n"
//						+ "where lo.let_out_id = 1960\r\n"
//						+ "order by lba.from_date ;").list();
//				
//				// putting fetched fields from db in entity class for subreport
//				List<LetoutInformationBuiltUpAreaTable> letoutInformationBuiltUpAreaFields = new ArrayList<>();
//				for (Object[] row : builtUpAreaReportData) {
//					
//					LetoutInformationBuiltUpAreaTable letoutInformationBuiltUpAreaField = new LetoutInformationBuiltUpAreaTable();
//					
//					letoutInformationBuiltUpAreaField.setBuilt_up_area_commercial((BigDecimal) row[0]);
//					letoutInformationBuiltUpAreaField.setBuilt_up_area_rec((BigDecimal) row[1]);
//					letoutInformationBuiltUpAreaField.setConsumed_fsi((BigDecimal) row[2]);
//					letoutInformationBuiltUpAreaField.setFrom_date((Date) row[3]);
//					
//					letoutInformationBuiltUpAreaFields.add(letoutInformationBuiltUpAreaField);
//				}
//				
//				System.out.println("================================Built up area data================================");
//				for (LetoutInformationBuiltUpAreaTable letoutInformationBuiltUpAreaField : letoutInformationBuiltUpAreaFields) {
//					System.out.println(letoutInformationBuiltUpAreaField);
//				}
//				
//				// =========================Getting Surrender Letout report fields form DB=========================
//				List<Object[]>  letoutReportData = session.createSQLQuery("select ltum.tenancy_id , ltum.letout_id, ltum.from_date , ltum.to_date , ltum.surrender_date, ltum.surrender_remark \r\n"
//						+ "from letout_tenancy_unit_mapping ltum \r\n"
//						+ "where ltum.letout_id = '1960';").list();
//				
//				// putting fetched fields from db in entity class for subreport
//				List<LetoutInformationSurrenderLetoutTable> letoutInformationSurrenderLetouts = new ArrayList<>();
//				
//				for (Object[] row : letoutReportData) {
//					
//					LetoutInformationSurrenderLetoutTable letoutInformationSurrenderLetout = new LetoutInformationSurrenderLetoutTable();
//					
//					letoutInformationSurrenderLetout.setTenancy_id((String) row[0]);
//					letoutInformationSurrenderLetout.setLetout_id((Integer)row[1]);
//					letoutInformationSurrenderLetout.setFrom_date((String) row[2]);
//					letoutInformationSurrenderLetout.setTo_date((String) row[3]);
//					letoutInformationSurrenderLetout.setSurrender_date((Date) row[4]);
//					letoutInformationSurrenderLetout.setSurrender_remark((String) row[5]);
//					
//					letoutInformationSurrenderLetouts.add(letoutInformationSurrenderLetout);
//				}
//				
//				System.out.println("================================Surrender Letout data================================");
//				for (LetoutInformationSurrenderLetoutTable letoutInformationSurrenderLetout : letoutInformationSurrenderLetouts) {
//					System.out.println(letoutInformationSurrenderLetout);
//				}
//				
//				// =========================Getting Tenancy Allotment Details report fields form DB=========================
//				List<Object[]>  tenancyAllotmentDetailsReportData = session.createSQLQuery("select rs.tenancy_id, rs.period_from, rs.period_to, rs.calculated_rent \r\n"
//						+ "from rent_slab rs \r\n"
//						+ "where rs.letout_id = '1960';").list();
//				
//				// putting fetched fields from db in entity class for subreport
//				List<LetoutInformationTenancyAllotmentDetailsTable> letoutInformationTenancyAllotmentDetailsTableFields = new ArrayList<>();
//				
//				for (Object[] row : tenancyAllotmentDetailsReportData) {
//					
//					LetoutInformationTenancyAllotmentDetailsTable letoutInformationTenancyAllotmentDetailsTableField = new LetoutInformationTenancyAllotmentDetailsTable();
//					
//					letoutInformationTenancyAllotmentDetailsTableField.setTenancy_id((String) row[0]);
//					letoutInformationTenancyAllotmentDetailsTableField.setPeriod_from((Date) row[1]);
//					letoutInformationTenancyAllotmentDetailsTableField.setPeriod_to((Date) row[2]);
//					letoutInformationTenancyAllotmentDetailsTableField.setCalculated_rent((BigDecimal) row[3]);
//					
//					letoutInformationTenancyAllotmentDetailsTableFields.add(letoutInformationTenancyAllotmentDetailsTableField);
//				}
//				
//				System.out.println("================================ Tenancy Allotment Details ================================");
//				for (LetoutInformationTenancyAllotmentDetailsTable letoutInformationTenancyAllotmentDetailsTable : letoutInformationTenancyAllotmentDetailsTableFields) {
//					System.out.println(letoutInformationTenancyAllotmentDetailsTable);
//				}
//				
//				// Main report datasource
//				JRBeanCollectionDataSource mainReportDataSource = new JRBeanCollectionDataSource(letoutInformationMainReportFields);
//				
//				// Parameter mapping of Built up area report datasource
//				JRBeanCollectionDataSource builtUpAreaDataSource = new JRBeanCollectionDataSource(letoutInformationBuiltUpAreaFields);
//				parameters.put("BuiltUpAreaTable", builtUpAreaDataSource);
//				
//				// Parameter mapping of Surrender Letout report datasource
//				JRBeanCollectionDataSource surrenderLetoutDataSource = new JRBeanCollectionDataSource(letoutInformationSurrenderLetouts);
//				parameters.put("SurrenderLetoutTable", surrenderLetoutDataSource);
//				
//				// Parameter mapping of Tenancy Allotment Details report datasource
//				JRBeanCollectionDataSource tenancyAllotmentDetailsDataSource = new JRBeanCollectionDataSource(letoutInformationTenancyAllotmentDetailsTableFields);
//				parameters.put("TenancyAllotmentTable", tenancyAllotmentDetailsDataSource);
//				
//				// printing jasper report
//				JasperPrint report = JasperFillManager.fillReport(letoutMainReport, parameters, mainReportDataSource);
//				JasperExportManager.exportReportToPdfFile(report, outputPath);
//				
//				System.out.println("\nReport Generated Successfully at "+outputPath);
//				
//			} catch (Exception e) {
//				System.out.println(e.getMessage());
//			}
			
//			=====================================Wayleave Information=====================================
//			try {
//				
//				// Compiling both main report and subreports
//				JasperReport wayleaveMainReport = JasperCompileManager.compileReport(new FileInputStream("src/main/resources/WayleaveInformation.jrxml"));
//				JasperReport documentTableSubreport = JasperCompileManager.compileReport(new FileInputStream("src/main/resources/WayleaveInformation_DocumentTable.jrxml"));
//				
//				String outputPath = "F:\\\\C-DAC Mumbai Internship\\\\8th week\\\\Generated_Reports\\\\WayleaveInformation.pdf";
//				
//				// Mapping compiled zone table subreport in main report
//				Map<String, Object> parameters = new HashMap<String, Object>();
//				parameters.put("DocumentTableReport_Path", documentTableSubreport);
//				
//				// =========================Getting Main report fields form DB=========================
//				List<Object[]> mainReportData = session.createSQLQuery("select e.estate_name as origin_estate_name, t.estate_name as terminating_estate_name,\r\n"
//						+ "mwt.wyl_type, mwf.wyl_facility, mwit.wyl_instl_type, w.supervision_charge_amount, w.pipeline_length,\r\n"
//						+ "w.is_supervision_charge, w.wyl_desc, w.remarks, au.\"name\", w.is_min_guarantee \r\n"
//						+ "from estate e\r\n"
//						+ "left join \r\n"
//						+ "wayleave w on e.estate_id = w.origin_estate_id \r\n"
//						+ "left join \r\n"
//						+ "estate t on w.terminating_estate_id = t.estate_id \r\n"
//						+ "left join \r\n"
//						+ "m_wyl_type mwt on w.wyl_type_id = mwt.wyl_type_id \r\n"
//						+ "left join \r\n"
//						+ "m_wyl_facility mwf on w.wyl_facility_id = mwf.wyl_facility_id \r\n"
//						+ "left join \r\n"
//						+ "m_wyl_instl_type mwit on w.wyl_instl_type_id = mwit.wyl_instl_type_id \r\n"
//						+ "left join \r\n"
//						+ "admin_users au on w.admin_id = au.admin_id \r\n"
//						+ "where \r\n"
//						+ "w.wyl_code = '41304534002'\r\n"
//						+ "group by e.estate_name, t.estate_name, mwt.wyl_type, w.wyl_facility_id, w.supervision_charge_amount,\r\n"
//						+ "w.pipeline_length, w.is_supervision_charge, w.wyl_desc, w.remarks, au.\"name\",\r\n"
//						+ "mwf.wyl_facility, mwit.wyl_instl_type, w.is_min_guarantee\r\n"
//						+ "limit 1").list();
//				
//				// putting fetched fields from db in entity class for main report
//				List<WayleaveInformationMainReportFields> wayleaveInformationMainReportFields = new ArrayList<>();
//				
//				for (Object[] row : mainReportData) {
//					
//					WayleaveInformationMainReportFields wayleaveInformationMainReportField = new WayleaveInformationMainReportFields();
//					
//					wayleaveInformationMainReportField.setOrigin_estate_name((String) row[0]);
//					wayleaveInformationMainReportField.setTerminating_estate_name((String) row[1]);
//					wayleaveInformationMainReportField.setWyl_type((String)row[2]);
//					wayleaveInformationMainReportField.setWyl_facility((String)row[3]);
//					wayleaveInformationMainReportField.setWyl_instl_type((String)row[4]);
//					wayleaveInformationMainReportField.setSupervision_charge_amount((BigDecimal)row[5]);
//					wayleaveInformationMainReportField.setPipeline_length((BigDecimal)row[6]);
//					wayleaveInformationMainReportField.setIs_supervision_charge((Boolean)row[7]);
//					wayleaveInformationMainReportField.setWyl_desc((String)row[8]);
//					wayleaveInformationMainReportField.setRemarks((String)row[9]);
//					wayleaveInformationMainReportField.setName((String)row[10]);
//					wayleaveInformationMainReportField.setIs_min_guarantee((Boolean)row[11]);
//					
//					wayleaveInformationMainReportFields.add(wayleaveInformationMainReportField);
//				}
//				
//				System.out.println("================================Main Report data================================");
//				for (WayleaveInformationMainReportFields wayleaveInformationMainReportField : wayleaveInformationMainReportFields) {
//					System.out.println(wayleaveInformationMainReportField);
//				}
//				
//				// =========================Getting Way Leave Part Details table fields form DB=========================
//				List<Object[]> zoneTableData = session.createSQLQuery("select  mz.zone_name, mzd.sub_zone_desc, wpd.city_survey_no, mwit.wyl_instl_type, \r\n"
//						+ "wpd.diameter, mwmu.wyl_measure_unit, wpd.length, wpd.width, wpd.area \r\n"
//						+ "from wyl_part_dtls wpd \r\n"
//						+ "left  join\r\n"
//						+ "m_zones mz on wpd.zone_id = mz.zone_id \r\n"
//						+ "left join \r\n"
//						+ "m_zones_details mzd on wpd.zone_detail_id = mzd.zone_detail_id \r\n"
//						+ "left join  \r\n"
//						+ "m_wyl_instl_type mwit on wpd.wyl_instl_id  = mwit.wyl_instl_type_id\r\n"
//						+ "left join \r\n"
//						+ "m_wyl_measure_unit mwmu on mwmu.wyl_measure_unit_id = wpd.wyl_measure_unit_id \r\n"
//						+ "where wpd.wyl_id = '1105'").list();
//				
//				//Mapping
//				List<WayleaveInformationZoneTable> wayleaveInformationZoneTableFields = new ArrayList<>();
//				for (Object[] row : zoneTableData) {
//					
//					WayleaveInformationZoneTable wayleaveInformationZoneTable = new WayleaveInformationZoneTable();
//					
//					wayleaveInformationZoneTable.setZone_name((String)row[0]);
//					wayleaveInformationZoneTable.setSub_zone_desc((String)row[1]);
//					wayleaveInformationZoneTable.setCity_survey_no((String)row[2]);
//					wayleaveInformationZoneTable.setWyl_instl_type((String)row[3]);
//					wayleaveInformationZoneTable.setDiameter((BigDecimal)row[4]);
//					wayleaveInformationZoneTable.setWyl_measure_unit((String)row[5]);
//					wayleaveInformationZoneTable.setLength((BigDecimal)row[6]);
//					wayleaveInformationZoneTable.setWidth((BigDecimal)row[7]);
//					wayleaveInformationZoneTable.setArea((BigDecimal)row[8]);
//					
//					wayleaveInformationZoneTableFields.add(wayleaveInformationZoneTable);
//				}
//				
//				System.out.println("================================Zone table data================================");
//				for (WayleaveInformationZoneTable wayleaveInformationZoneTableField : wayleaveInformationZoneTableFields) {
//					System.out.println(wayleaveInformationZoneTableField);
//				}
//				
//				// =========================Getting Documents table fields form DB=========================
//				List<Object> documentTableData = session.createSQLQuery("select wd.doc_name\r\n"
//						+ "from wyl_docs wd \r\n"
//						+ "where wd.wyl_id = '1105';").list();
//				
//				List<WayleaveInformationDocumentTable> wayleaveInformationDocumentTableFields = new ArrayList<>();
//				
//				for (Object row : documentTableData) { // row is a single column, so it's not an array
//				    WayleaveInformationDocumentTable wayleaveInformationDocumentTable = new WayleaveInformationDocumentTable();
//				    wayleaveInformationDocumentTable.setDoc_name((String) row); // Cast directly to String
//				    wayleaveInformationDocumentTableFields.add(wayleaveInformationDocumentTable);
//				}
//
//				
//				System.out.println("================================Document Table data================================");
//				for (WayleaveInformationDocumentTable wayleaveInformationDocumentTableField : wayleaveInformationDocumentTableFields) {
//					System.out.println(wayleaveInformationDocumentTableField);
//				}
//				
//				// Main report datasource
//				JRBeanCollectionDataSource mainReportDataSource = new JRBeanCollectionDataSource(wayleaveInformationMainReportFields);
//				
//				// Main report Zone table
//				JRBeanCollectionDataSource zoneTableDataSource = new JRBeanCollectionDataSource(wayleaveInformationZoneTableFields);
//				parameters.put("ZoneTable", zoneTableDataSource);
//				
//				// Subreport Documents Table
//				JRBeanCollectionDataSource documentTableDataSource = new JRBeanCollectionDataSource(wayleaveInformationDocumentTableFields);
//				parameters.put("DocumentTable", documentTableDataSource);
//				
//				// Filling the report with datasource and parameters
//				JasperPrint mainReport = JasperFillManager.fillReport(wayleaveMainReport, parameters, mainReportDataSource);
//				JasperExportManager.exportReportToPdfFile(mainReport, outputPath);
//				
//				System.out.println("\nReport Generated Successfully at "+outputPath);
//				
//			} catch (Exception e) {
//				System.out.println(e.getMessage());
//			}
		
		} catch (Exception e) {
//			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
