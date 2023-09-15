package model;

import java.math.BigDecimal;
import java.math.BigInteger;
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

	private void calculateVariables(double initialPression, double initialVolume, double maxVolume, double finalTemp) {

		//First cycle data
		v1= initialVolume;
		p1= initialPression;
		t1= (p1*v1)/r;

		//Fourth cycle data
		t4= finalTemp;
		v4=(Math.pow((t1/t4),(1/(gamma-1)))*v1);
		p4=(r*t4)/(v4);

		//Third cycle data
		v3=maxVolume;
		t3=t4;
		p3=(r*t3)/(v3);

		//Second cycle data
		t2=t1;
		v2=(Math.pow((t3/t2),(1/(gamma-1)))*v3);
		p2=(r*t2)/(v2);
	}

	public String  valueFormatValues(String[] dataValues) {
		String message="Existe un error al ingresar los datos en los siguientes campos: ";
		boolean comprovateError=false;

		for (int i = 0; i < dataValues.length; i++) {
			if ( notIsNumber(dataValues[i])) {
				message+=createMessageError(1, slotSelector(i+1));
				comprovateError=true;}
			else {
				if(comparatorMaxnumber(dataValues[i])) {
					message+=createMessageError(2, slotSelector(i+1));
					comprovateError=true;}
			}
		} 
//		if(!comprovateError) {
//			for (int i = 0; i < dataValues.length; i++) {
//				if(comparatorMaxnumber(dataValues[i])) {
//					message+=createMessageError(2, slotSelector(i+1));
//					comprovateError=true;}
//			}
//		}
//		

		if(comprovateError) {
			return message;
		}else {
			return null;
		}

	}

	public String createMessageError(int errorNum, String Space) {
		String message;
		if(errorNum==1) {
			message="\n-En el campo "+Space+" hay valores no numericos";
		}else {
			message="\n-En el campo "+Space+" execede el limite numerico soportado (2,147,483,648)";
		}
		return message;
	}

	public boolean notIsNumber(String text) {
		boolean comprovator=false;
		int countPoint=0;
		for (int i = 0; i < text.length(); i++) {
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
			return "presion inicial";
		}else if(num==2) {
			return "volumen inicial";
		}else if(num==3) {
			return "volumen maximo";
		}else {
			return "temperatura final";
		}
	}




}
