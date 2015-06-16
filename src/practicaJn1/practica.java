package practicaJn1;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.Date;

public class practica {
	
	static void p1(){
		System.out.println("Ingrese la hora");
		String hora3;
	
			Scanner tl=new Scanner (System.in);
			hora3=tl.next();
			String delims = "[:]";
			String[] tokens = hora3.split(delims);
			String hora, minuto, segundo;
			hora = tokens[0];
			minuto = tokens[1];
			segundo = tokens[2];
			
			int hora2 = Integer.parseInt(hora);
			int minuto2 = Integer.parseInt(minuto);
			int segundo2 = Integer.parseInt(segundo);
			
			if(hora2==00&&minuto2==59&&segundo2==59){
				hora="01"; minuto="00"; segundo="00";
				System.out.println(hora+":"+minuto+":"+segundo);}
			else if(hora2==01&&minuto2==59&&segundo2==59){
				hora="02"; minuto="00"; segundo="00";
				System.out.println(hora+":"+minuto+":"+segundo);}
			else if(hora2==02&&minuto2==59&&segundo2==59){
				hora="03"; minuto="00"; segundo="00";
				System.out.println(hora+":"+minuto+":"+segundo);}
			else if(hora2==03&&minuto2==59&&segundo2==59){
				hora="04"; minuto="00"; segundo="00";
				System.out.println(hora+":"+minuto+":"+segundo);}
			else if(hora2==04&&minuto2==59&&segundo2==59){
				hora="05"; minuto="00"; segundo="00";
				System.out.println(hora+":"+minuto+":"+segundo);}
			else if(hora2==05&&minuto2==59&&segundo2==59){
				hora="06"; minuto="00"; segundo="00";
				System.out.println(hora+":"+minuto+":"+segundo);}
			else if(hora2==06&&minuto2==59&&segundo2==59){
				hora="07"; minuto="00"; segundo="00";
				System.out.println(hora+":"+minuto+":"+segundo);}
			else if(hora2==07&&minuto2==59&&segundo2==59){
				hora="08"; minuto="00"; segundo="00";
				System.out.println(hora+":"+minuto+":"+segundo);}
			else if(hora2==8&&minuto2==59&&segundo2==59){
				hora="09"; minuto="00"; segundo="00";
				System.out.println(hora+":"+minuto+":"+segundo);}
			else if(hora2==9&&minuto2==59&&segundo2==59){
				hora="10"; minuto="00"; segundo="00";
				System.out.println(hora+":"+minuto+":"+segundo);}
			else if(hora2==10&&minuto2==59&&segundo2==59){
				hora="11"; minuto="00"; segundo="00";
				System.out.println(hora+":"+minuto+":"+segundo);}
			else if(hora2==11&&minuto2==59&&segundo2==59){
				hora="12"; minuto="00"; segundo="00";
				System.out.println(hora+":"+minuto+":"+segundo);}
			else if(hora2==12&&minuto2==59&&segundo2==59){
				hora="13"; minuto="00"; segundo="00";
				System.out.println(hora+":"+minuto+":"+segundo);}
			else if(hora2==13&&minuto2==59&&segundo2==59){
				hora="14"; minuto="00"; segundo="00";
				System.out.println(hora+":"+minuto+":"+segundo);}
			else if(hora2==14&&minuto2==59&&segundo2==59){
				hora="15"; minuto="00"; segundo="00";
				System.out.println(hora+":"+minuto+":"+segundo);}
			else if(hora2==15&&minuto2==59&&segundo2==59){
				hora="16"; minuto="00"; segundo="00";
				System.out.println(hora+":"+minuto+":"+segundo);}
			else if(hora2==16&&minuto2==59&&segundo2==59){
				hora="17"; minuto="00"; segundo="00";
				System.out.println(hora+":"+minuto+":"+segundo);}
			else if(hora2==17&&minuto2==59&&segundo2==59){
				hora="18"; minuto="00"; segundo="00";
				System.out.println(hora+":"+minuto+":"+segundo);}
			else if(hora2==18&&minuto2==59&&segundo2==59){
				hora="19"; minuto="00"; segundo="00";
				System.out.println(hora+":"+minuto+":"+segundo);}
			else if(hora2==19&&minuto2==59&&segundo2==59){
				hora="20"; minuto="00"; segundo="00";
				System.out.println(hora+":"+minuto+":"+segundo);}
			else if(hora2==20&&minuto2==59&&segundo2==59){
				hora="21"; minuto="00"; segundo="00";
				System.out.println(hora+":"+minuto+":"+segundo);}
			else if(hora2==21&&minuto2==59&&segundo2==59){
				hora="22"; minuto="00"; segundo="00";
				System.out.println(hora+":"+minuto+":"+segundo);}
			else if(hora2==22&&minuto2==59&&segundo2==59){
				hora="23"; minuto="00"; segundo="00";
				System.out.println(hora+":"+minuto+":"+segundo);}
			else if(hora2==23&&minuto2==59&&segundo2==59){
				hora="00"; minuto="00"; segundo="00";
				System.out.println(hora+":"+minuto+":"+segundo);}
			else if(segundo2<59){
				segundo2=segundo2+1;
				System.out.println(hora+":"+minuto+":"+segundo2);}
			else if(segundo2==59){
				minuto2=minuto2+1;
				segundo2=00;
				System.out.println(hora+":"+minuto2+":"+segundo2);
			}

					
					
			
	}
	
	static void p2(){
		System.out.println("Ingrese su fecha de nacimiento");
		Scanner sc = new Scanner(System.in);
		String fn;
		fn = sc.next();
		String dia3,mes3,año3;
		String delims = "[/]";
		String[] tokens = fn.split(delims);
		dia3=tokens[0];
		mes3=tokens[1];
		año3=tokens[2];
		int dia2 = Integer.parseInt(dia3);
		int mes2 = Integer.parseInt(mes3);
		int año2 = Integer.parseInt(año3);
		
		if (dia2<=16&&mes2>=6&&año2<=1997){
			System.out.println("Se puede inscribir");}
		else 
			System.out.println("no se puede inscribir");
	
	}
	
	static void p3(){
		Scanner sc = new Scanner(System.in);
		int peso;
		double altura;
		int imc;
		System.out.println("Ingrese su peso");
		peso = sc.nextInt();
		System.out.println("Ingrese su estatura");
		altura= sc.nextDouble();
		imc=(int) (peso/(altura*altura));
		System.out.println("Su IMC es: "+imc);
		if(imc>1 && imc<16)
			System.out.println("Infrapeso");
		if(imc>17 && imc<18)
			System.out.println("Bajo Peso");
		if(imc>18 && imc<25)
			System.out.println("Peso Normal");
		if(imc>25 && imc<30)
			System.out.println("Sobre Peso");
		if(imc>30 && imc<35)
			System.out.println("Sobre Peso Cronico");
		if(imc>35 && imc<40)
			System.out.println("Obesidad Pre-Morbida");
		if(imc>40)
			System.out.println("Obesidad Morbida");
	}

	static void p4(){
		System.out.println("Ingrese un numero");
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		if (n%2!=0){
			n=n+1;	
		}
		long cubo;
		for(int i=0;i<=5;i++){
			n=n+2;
			cubo=n*n*n;
			System.out.println(cubo);
		}
		
		
		
	}
	
	static void p5(){
		
	}
	
	static void p6(){

		double a,b,c,d;
		for (int i=1;i<=15;i++){
			a=((Math.pow(1.618034,i)));
			b=((Math.pow(-0.618034,i)));
			c=Math.sqrt(5);
			d=((a-b))/c;
			int sucesion;
			sucesion = (int) d;
			System.out.println(sucesion);
			} 
		}
	
	static void p10(){
		boolean n=true;
		String pregunta;
			for(int i=1;i<=1000;i++){
			System.out.print(" "+i);
			
			if (i==20||i==40||i==60||i==80||i==100||i==120||i==140||i==160||i==180||i==200||i==220||
					        i==240||i==260||i==280||i==300||i==320||i==340||i==360||i==380||i==400||
					i==520||i==540||i==560||i==580||i==600||i==620||i==640||i==660||i==680||i==700||
					i==720||i==740||i==760||i==780||i==800||i==820||i==840||i==860||i==880||i==900||
					i==920||i==940||i==960||i==980){
				System.out.print(" "+"\n"+"desea continuar?"+"     yes,no"+"\n");
				Scanner sc = new Scanner(System.in);
				pregunta = sc.next();

				if(pregunta.equals("yes")){
				n=true;}
				else if(pregunta.equals("no")){
				n=false;
				i=1001;}
			}
				}
			 
	}
	
	public static void main(String[] args) {
		p10();

	}

}
