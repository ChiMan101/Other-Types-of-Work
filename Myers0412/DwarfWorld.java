import java.util.Random;
public class DwarfWorld
{

    public static void main(String[] args)
    {
        String[] firstNames = {"Bhelemer", "Gimli", "Gloin", "Timmett",
                "Scotty", "Tyrion", "Thalgrum", "Ghuddad",
                "Thorin", "Fofana", "Yadaren", "Mussim" };
        String[] lastNames = {"Goldenbranch", "Anvilbuckle", "Warmrock", "Granitehead",
                "Oakenshield", "Hardgrip", "Thalgrum", "Ghuddad",
                "Gravelblade", "Boneshaper", "Bronzebeard", "Jadestone" };
        Dwarf[] dwarfVille = new Dwarf[20];
        int chance1;
        
        for(int i = 0; i < dwarfVille.length; i++)
        {
            Random rand1 = new Random();
            Random rand2 = new Random();
            Random rand3 = new Random();
            int firstnamepos = rand1.nextInt(firstNames.length);
            int lastnamepos = rand2.nextInt(lastNames.length);
            
            chance1 = rand3.nextInt(100) + 1;
            if(chance1 <= 40)
            {
                dwarfVille[i] = new SneakyDwarf(firstNames[firstnamepos], lastNames[lastnamepos]);
            }
            else
            {
                dwarfVille[i] = new OpenDwarf(firstNames[firstnamepos], lastNames[lastnamepos]);
            }
            
            //System.out.println(dwarfVille[i].myFirstName+ " "+dwarfVille[i].myLastName);
        }
        
        for(int months = 0; months < 12; months++)
        {
            for(int j = 0; j < dwarfVille.length; j++)
            {
                Random rand1 = new Random();
                Random rand2 = new Random();
                Random rand3 = new Random();
                int earnings;
                int stolenEarnings;
                int aleDrunk;
                stolenEarnings = rand1.nextInt(200)+1;
                earnings = rand2.nextInt(1000)+500;
                aleDrunk = rand3.nextInt(10)+1;
                
                if(dwarfVille[j] instanceof SneakyDwarf)
                {
                    int DwarfSilver = ((SneakyDwarf)dwarfVille[j]).getMySilver();
                    double DwarfAleDrunk = ((SneakyDwarf)dwarfVille[j]).getMyAle();
                    DwarfSilver = ((SneakyDwarf)dwarfVille[j]).stealSilver(stolenEarnings); 
                    ((SneakyDwarf)dwarfVille[j]).drinkAle(aleDrunk);
                    ((SneakyDwarf)dwarfVille[j]).setMySilver(DwarfSilver);
                }
                if(dwarfVille[j] instanceof OpenDwarf)
                {
                    ((OpenDwarf)dwarfVille[j]).work(earnings);
                    ((OpenDwarf)dwarfVille[j]).growOlder(j);
                }
            }
            
            
        }
        
        for(int i = 0; i < dwarfVille.length; i++)
        {
            System.out.println("Name: "+dwarfVille[i].myFirstName+" "+dwarfVille[i].myLastName);
            if(dwarfVille[i] instanceof SneakyDwarf)
            {
               System.out.println("Type: Sneaky Dwarf");
               System.out.println("Amount of Silver "+((SneakyDwarf)dwarfVille[i]).getMySilver());
               System.out.println("Ale Drunk "+((SneakyDwarf)dwarfVille[i]).getMyAle());
            }
            if(dwarfVille[i] instanceof OpenDwarf)
            {
               System.out.println("Type: Open Dwarf"); 
               System.out.println("Amount of Bronze: "+((OpenDwarf)dwarfVille[i]).myBronze);
               //System.out.println("Age: "+((OpenDwarf)dwarfVille[i]).myAge);
            }
            
            System.out.println("\n");
        }
    }

    
}
