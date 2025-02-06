class Census
{
	public static void main(String [] arg){
		long currPopulation = 312032486;
		final long totalSec = (365 * 24 * 60 * 60);
		long birth = (totalSec / 7)*5;
		long death = (totalSec /13)*5;
		long immigrate = (totalSec /45)*5;
		
		long newPop = currPopulation + birth - death + immigrate;
		System.out.println("current population : " +currPopulation);
		System.out.println("New population : "+newPop);
	}
}