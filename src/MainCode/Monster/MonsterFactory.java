package MainCode.Monster;


import MainCode.RandomGenerator;

///-Josh
///Use my RandomGenerator class to make a random number 
///Make sure you create all monsters first
///Use my factory as a template
///
///
public class MonsterFactory implements monsterInterface
{
	static RandomGenerator rg = new RandomGenerator();
	static int randomNumber = rg.generate(100);

	//Put the if/else statements here after Monsters are made.

	public Monster manufactureMonster()
	{
		if(randomNumber <=20)	
		{
			return new AlienCommando();
			
		}
		else if (randomNumber <=10)
		{
		return new CyborgPirate();	
		}
		else if (randomNumber <=20)
		{
		return new CleaningUnit();	
		}
		else if (randomNumber <=35)
		{
		return new LittleGreenMan();	
		}
		else if (randomNumber <=45)
		{
		return new MaskedRobot();	
		}
		else if (randomNumber <=55)
		{
		return new ReturnCleaningUnit();	
		}
		else if (randomNumber <=65)
		{
		return new RoboChef();	
		}
		else if (randomNumber <=75)
		{
		return new RobotDoorman();
		}
		else if (randomNumber <=85)
		{
		return new SpaceKraken();
		}
		else if (randomNumber <=95)
		{
		return new TunnelingHorror();
		}
		else if (randomNumber <=100)
		{
		return new Zorexian();
		}
		else
			return null;
	}
	
	public static void main(String[] args)
	{
		Monster ranMonster = new Monster();
		MonsterFactory mF = new MonsterFactory();
		ranMonster = mF.manufactureMonster();
		System.out.println(ranMonster.toString());
	}
	@Override
	public void createMonster() {
		// TODO Auto-generated method stub
		
	}





}