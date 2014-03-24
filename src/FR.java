
public class FR {
	
	static int rec(int n)
	//Me base en el programa que hicimos en clase de la funcion recursiva
	{
			if(n==0)
		{
				return 0;
			}
				if(n==1)
			{
				return 1;
		}
		return rec(n-1)*rec(n-2)+n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(rec (6));
	}

}
