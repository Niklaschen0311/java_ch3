package java_ch3;

public class p5 {
	public static void main(String[] args) {
		Car car1;
		car1 = new Car();
		car1.show();
		
		Car car2;
		car2 = new Car(1234,25.3);
		car2.show();
		Car.showsum();
	}
}

class Car
{
	public static int sum = 0;
	private int num;
	private double gas;
	
	public Car()
	{
		num = 0;
		gas = 0.0;
		sum ++;
		System.out.println("生產了車子");
	}
	public Car(int n,double g)
	{
		
		num = n;
		gas = g;
		sum++;
		System.out.println("生產了車號為["+num+"]，汽油量為["+gas+"]的車子");
	}
	void show()
	{
		System.out.println("車號:"+num);
		System.out.println("汽油量:"+gas);
	}
	/*void showcar() 
	{
		System.out.println("開始顯示車子資料:");
		this.show();
	}
	/*void setNum(int n)
	{
		num = n;
		System.out.println("將車號設定為:"+num);
	}*/
	/*void setGas(double g)
	{
		gas = g;
		System.out.println("將汽油設定為:"+gas);
	}*/
	/*void setNumGas(int n,double g)
	{
		if(g<0 && g>100)
		{
		num = n;
		gas = g;
		System.out.println("將車號設定為:"+num+"。汽油設定為:"+gas);
		}
		else
		{
			System.out.println("不是正確的汽油量");
			System.out.println("無法變更汽油量");
		}
	}  */
	/*int getnum()
	{
		System.out.println("調查車號中...");
		return num;
	}*/
	/*double getgas()

	{
		System.out.println("調查汽油中...");
		return gas;
	}*/
	public void setcar(int n) 
	{
		num = n;
		System.out.println("將車號設定為:"+num);
	}
	public void setcar(double g) 
	{
		gas = g;
		System.out.println("將汽油設定為:"+gas);
	}
	public void setcar(int n,double g)
	{
		if(g>0 && g<100)
		{
		num = n;
		gas = g;
		System.out.println("將車號設定為:"+num+"。汽油設定為:"+gas);
		}
		else
		{
			System.out.println("不是正確的汽油量");
			System.out.println("無法變更汽油量");
		}
	}
	public static void showsum()
	{
		System.out.print("車子總共有"+sum+"台");
	}
}
