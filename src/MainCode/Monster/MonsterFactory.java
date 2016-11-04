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
}
