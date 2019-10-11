package testeWebServiceArcGis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.geom.LinearRing;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Polygon;
import com.vividsolutions.jts.util.GeometricShapeFactory;

import javafx.application.Application;
import javafx.stage.Stage;
import model.DominioFraturado;
import model.Fraturado;

public class TesteFraturado extends Application {

	public static void main(String[] args) {

		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {


		Gson gson = new Gson();  
		
		BufferedReader br = new BufferedReader(
			     new FileReader("C:\\Users\\fabricio.barrozo\\eclipse-workspace\\testeWebServiceArcGisFraturado\\src\\main\\resources\\json\\fraturado.json"));  
			 
				Fraturado fraturado = gson.fromJson(br, Fraturado.class);  
				
				//System.out.println("displayFieldName " + fraturado.displayFieldName);
				
				//System.out.println("fieldAliases " + fraturado.fieldAliases);
				
				//System.out.println("geometryType " + fraturado.geometryType);
				
				//System.out.println("spatialReference " + fraturado.spatialReference.getLatestWkid());
				
				//System.out.println("spatialReference " + fraturado.fields.get(0).getAlias());
				
				//System.out.println("features siz " + fraturado.features.size());
				
				/*
				for (int i = 0;i<fraturado.features.size();i++) {
					
					System.out.println("  id " + fraturado.features.get(i).attributes.OBJECTID);
					System.out.println(" ------- UH NOME " + fraturado.features.get(i).attributes.uh_nome);
					System.out.println("  ---------------CODIGO " + fraturado.features.get(i).attributes.Cod_plan);
					
					System.out.println("  ---------------CODIGO " + fraturado.features.get(i).attributes.bacia_nome);
					
					System.out.println("  ---------------CODIGO " + fraturado.features.get(i).attributes.Sistema);
					
					
				}
				*/
				/*
				
				System.out.println(" LENGTH " + fraturado.features.get(1).geometry.rings[0].length);
				
				System.out.println("[0][0][0] features 1 .geometry " + fraturado.features.get(1).geometry.rings[0][0][0]);
				System.out.println("[0][0][1] features 1 .geometry " + fraturado.features.get(1).geometry.rings[0][0][1]);
				
				
				System.out.println("[0][1][0] features 1 .geometry " + fraturado.features.get(1).geometry.rings[0][1][0]);
				System.out.println("[0][1][1] features 1 .geometry " + fraturado.features.get(1).geometry.rings[0][1][1]);
				
				System.out.println("-----------------------------");
				
				
				System.out.println("  id " + fraturado.features.get(1).attributes.OBJECTID);
				System.out.println("  UH NOME " + fraturado.features.get(1).attributes.uh_nome);
				System.out.println("  CODIGO " + fraturado.features.get(1).attributes.Cod_plan);
				
				
				
				
				System.out.println(" LENGTH " + fraturado.features.get(1).geometry.rings[1].length);
				
				
				
				System.out.println("[1][0][0] features 1 .geometry " + fraturado.features.get(1).geometry.rings[1][0][0]);
				System.out.println("[1][0][1] features 1 .geometry " + fraturado.features.get(1).geometry.rings[1][0][1]);
				
				*/
				
				/*
				StringBuilder s = new StringBuilder();
				
				for (int i=1;i<125;i++) {
					s.append(i + ",");
				}
			
				System.out.println(s);*/
				
				System.out.println("quantidade de coordenadas " + fraturado.features.get(0).geometry.rings[0].length);
				
				System.out.println("  id " + fraturado.features.get(0).attributes.OBJECTID);
				System.out.println(" ------- UH NOME " + fraturado.features.get(0).attributes.uh_nome);
				System.out.println("  ---------------CODIGO " + fraturado.features.get(0).attributes.Cod_plan);
				
				System.out.println("  ---------------CODIGO " + fraturado.features.get(0).attributes.bacia_nome);
				
				System.out.println("  ---------------CODIGO " + fraturado.features.get(0).attributes.Sistema);
			
				DominioFraturado dom = new DominioFraturado();
				
				GeometricShapeFactory gsf = new GeometricShapeFactory();
				 // gsf.setSize(100);
				// gsf.setNumPoints(385);
				  
				  for (int i = 0;i<fraturado.features.get(0).geometry.rings[0].length;i++) {
					  
					  //	System.out.println(fraturado.features.get(0).geometry.rings[0][i][1]);
					  
					  	gsf.setBase(new Coordinate(Double.parseDouble(fraturado.features.get(0).geometry.rings[0][i][1]),Double.parseDouble( fraturado.features.get(0).geometry.rings[0][i][1])));
				  }
				  
				  
				  System.out.println(gsf);
				
				  //gsf.setRotation(0.5);
				  Polygon rect = gsf.createRectangle();
				
			
				
				dom.Shape = rect;
				Coordinate[] coordinates = new Coordinate[385];
				
				
				GeometryFactory factory = new GeometryFactory();
			
				  	
				  	 for (int i = 0;i<fraturado.features.get(0).geometry.rings[0].length;i++) {
				  		coordinates [i] = (new Coordinate(Double.parseDouble(fraturado.features.get(0).geometry.rings[0][i][0]),Double.parseDouble( fraturado.features.get(0).geometry.rings[0][i][1])));
				  	 
				  	// System.out.println( i + " coord " + fraturado.features.get(0).geometry.rings[0][i][0] + ", " + fraturado.features.get(0).geometry.rings[0][i][1]);
				  	 }
				  	
				LinearRing lr=factory.createLinearRing(coordinates);
				Polygon polygon=factory.createPolygon(lr,new LinearRing[]{});
						
				GeometryFactory geoFac;
				
				Point p;

				geoFac = new GeometryFactory();

				// -15.6513955,-47.6847262
				
				p = geoFac.createPoint(new Coordinate(
						Double.parseDouble("-47.6847262"),
						Double.parseDouble("-15.6513955")
						));

				p.setSRID(4674);

				dom.Shape = polygon;

					if (p.intersects(dom.Shape)) {

						//cbBaciaHidrografica.setValue(String.valueOf(b.getBaciaNome()));
						
						System.out.println("true");

					}

				} // fim loop bacias hidrograficas
			
			

}
