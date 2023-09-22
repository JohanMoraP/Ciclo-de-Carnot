package model;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Logic {

	private final double r= 8.31446261815324;
	private final double gamma = 1.4;
	private ArrayList<double [] > coordenates;
	private double [] x1,y1;
	private double [] x2,y2;
	private double [] x3,y3;
	private double [] x4,y4;
	private double t1, t2, t3, t4;
	private double v1, v2, v3, v4;
	private double p1, p2, p3, p4;
	private double abIncrement, bcIncrement, cdIncrement, daIncrement, tempIncrement;


	public ArrayList<double []> coordenatesCalculator(double initialPression, double initialVolume, double maxVolume, double finalTemp){

		calculateVariables(initialPression, initialVolume, maxVolume, finalTemp);
		coordenates = new ArrayList<double []>();

		x1 = new double[100];
		y1 = new double[100];
		x2 = new double[100];
		y2 = new double[100];
		x3 = new double[100];
		y3 = new double[100];
		x4 = new double[100];
		y4 = new double[100];

		abIncrement=(v2-v1)*0.01;
		bcIncrement=(v3-v2)*0.01;
		cdIncrement=(v4-v3)*0.01;
		daIncrement=(v1-v4)*0.01;
		tempIncrement=(t1-t4)*0.01;

		for (int i = 0; i < 100; i++) {
			x1[i] = v1+(i*abIncrement);
			x2[i] = v2+(i*bcIncrement);
			x3[i] = v3+(i*cdIncrement);
			x4[i] = v4+(i*daIncrement);
			y1[i] = (r*t1)/x1[i];
			y2[i] = (r*(t2-(tempIncrement*i)))/x2[i];
			y3[i] = (r*t3)/x3[i];
			y4[i] = (r*(t4+(tempIncrement*i)))/x4[i];	
		}

		coordenates.add(x1);
		coordenates.add(y1);
		coordenates.add(x2);
		coordenates.add(y2);
		coordenates.add(x3);
		coordenates.add(y3);
		coordenates.add(x4);
		coordenates.add(y4);

		return coordenates;
	}

	private void calculateVariables(double initialvolume, double volumeB, double maxTemp, double minTemp) {

		//First cycle data
		v1= initialvolume;
		t1= maxTemp;
		p1=(r*t1)/(v1);

		//Second cycle data
		t2=maxTemp;
		v2=volumeB;
		p2=(r*t2)/(v2);

		//Third cycle data	
		t3=minTemp;	
		v3=(Math.pow((t2/t3),(1/(gamma-1)))*v2);
		p3=(r*t3)/(v3);

		//Fourth cycle data
		t4= minTemp;
		v4=(Math.pow((t1/t4),(1/(gamma-1)))*v1);
		p4=(r*t4)/(v4);
	}

	public String  valueFormatValues(String[] dataValues) {
		String message="Existe un error al ingresar los datos en los siguientes campos: ";
		boolean comprovateError=false;

		for (int i = 0; i < dataValues.length; i++) {
			if(dataValues[i] == null || dataValues[i].strip().length() == 0) {
				message+=createMessageError(0, slotSelector(i+1));
				comprovateError=true;
			}else if ( notIsNumber(dataValues[i].strip())) {
				message+=createMessageError(1, slotSelector(i+1));
				comprovateError=true;}
			else if(comparatorMaxnumber(dataValues[i].strip())){
				message+=createMessageError(2, slotSelector(i+1));
				comprovateError=true;
			}else if(Double.parseDouble(dataValues[i].strip()) == 0){
				message+=createMessageError(3, slotSelector(i+1));
				comprovateError=true;
			}
		} 
		if(comprovateError) {
			return message;
		}else {
			return null;
		}

	}

	public String createMessageError(int errorNum, String Space) {
		String message;
		return switch (errorNum){
		case 0 -> message="\n-El campo "+Space+" se encuentra vacio";
		case 1 -> message="\n-En el campo "+Space+" hay valores no numericos";
		case 2 -> message="\n-En el campo "+Space+" excede el limite numerico soportado (2,147,483,648)";
		default -> message="\n-El campo "+Space+" no puede llevar el número 0";
		};
	}

	public boolean notIsNumber(String text) {
		boolean comprovator=false;
		int countPoint=0;
		for (int i = 0; i < text.length(); i++) {
			if(text.charAt(i)=='.' && (i + 1) == text.length()) {
				return true;
			}
			if(text.charAt(i)=='.' && countPoint==0) {
				countPoint++;
			}
			else if ((text.charAt(i)=='.' && countPoint>0) || Character.isDigit(text.charAt(i))==false ) {
				return true;
			}}
		return comprovator;
	}





	public boolean comparatorMaxnumber(String text) {
		boolean comprovator=false;
		BigDecimal bigdec;
		bigdec = new BigDecimal(text);
		BigDecimal maxDecimal = BigDecimal.valueOf((double)(1000000000*100));

		if(bigdec.compareTo(maxDecimal) > 0) {
			comprovator=true;
		}
		return comprovator;
	}

	public String slotSelector(int num) {
		if(num==1) {
			return "volumen inicial";
		}else if(num==2) {
			return "volumen en B";
		}else if(num==3) {
			return "temperatura caliente";
		}else {
			return "temperatura fria";
		}
	}

	public ArrayList<ArrayList<Double>> getValues(){
		ArrayList<ArrayList<Double>> values = new ArrayList<ArrayList<Double>>();
		DecimalFormat formato = new DecimalFormat("#.####");
		ArrayList<Double> stage1 = new ArrayList<Double>();
		stage1.add(Double.parseDouble(formato.format(v1).replace(",", ".")));
		stage1.add(Double.parseDouble(formato.format(p1).replace(",", ".")));
		stage1.add(t1);
		ArrayList<Double> stage2 = new ArrayList<Double>();
		stage2.add(Double.parseDouble(formato.format(v2).replace(",", ".")));
		stage2.add(Double.parseDouble(formato.format(p2).replace(",", ".")));
		stage2.add(t2);
		ArrayList<Double> stage3 = new ArrayList<Double>();
		stage3.add(Double.parseDouble(formato.format(v3).replace(",", ".")));
		stage3.add(Double.parseDouble(formato.format(p3).replace(",", ".")));
		stage3.add(t3);
		ArrayList<Double> stage4 = new ArrayList<Double>();
		stage4.add(Double.parseDouble(formato.format(v4).replace(",", ".")));
		stage4.add(Double.parseDouble(formato.format(p4).replace(",", ".")));
		stage4.add(t4);

		values.add(stage1);
		values.add(stage2);
		values.add(stage3);
		values.add(stage4);

		return values;
	}


}
