package numOrdenDescendente;

import java.util.Scanner;

public class NumOrdenDescendente 
{
	
	public static void main(String[] args)
	{
		int aux;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el primer número (total 3): ");
		int num1 = sc.nextInt();
		System.out.print("Introduce el segundo número (total 3): ");
		int num2 = sc.nextInt();
		System.out.print("Introduce el tercer número (total 3): ");
		int num3 = sc.nextInt();
		sc.close();
		if(num1 >= num2 && num1 >= num3) // NUM1 ES EL MAYOR
		{
			if(num3 >= num2) // NUM1 NUM3 NUM2
			{
				aux = num2;
				num2 = num3;
				num3 = aux;
			}
		}
		else if(num2 >= num1 && num2 >= num3) // NUM2 ES EL MAYOR
		{
			aux = num2;
			num2 = num1;
			num1 = aux;
			if(num3 >= num2) // NUM2 > NUM3 > NUM1 
			{
				aux = num3;
				num3 = num2;
				num2 = aux;
			}
		}
		else if(num3 >= num1 && num3 >= num2) // NUM3 ES EL MAYOR
		{
			aux = num3;
			num3 = num1;
			num1 = aux;
			if(num3 >= num2) // NUM3 > NUM1 > NUM2
			{
				aux = num3;
				num3 = num2;
				num2 = aux;
			}
		}
		System.out.println(num1 + " " + num2 + " " + num3);
	}
}
