import java.io.*;
import java.util.*;
/**
 * Parent class for all of MacDonald's pets
 * 
 * @author (jacques) 
 * @version 4/23/2013
 * @editor Nikhil Paranjape
 */
public class Animal
{
    private String creature;
    private String noise;
    private static int farmguess, lakeguess, jparkguess;
    public static void Main() throws IOException{
        Scanner scan = new Scanner(new File("animals2.txt"));
        Random rand = new Random();
        farmguess = rand.nextInt(3) + 1;
        lakeguess = rand.nextInt(3) + 1;
        jparkguess = rand.nextInt(2) + 1;
        //Farmanimal
        String loc = scan.next();
        String animal = scan.next();
        String sound = scan.next();
        //farmanimal2
        String loc2 = scan.next();
        String animal2 = scan.next();
        String sound2 = scan.next();
        //farmainmal3
        String loc3 = scan.next();
        String animal3 = scan.next();
        String sound3 = scan.next();
        //lakeanimal
        String LLoc = scan.next();
        String LAnimal = scan.next();
        String LSound = scan.next();
        //lakeanimal2
        String LLoc2 = scan.next();
        String LAnimal2 = scan.next();
        String LSound2 = scan.next();
        //lakeanimal3
        String LLoc3 = scan.next();
        String LAnimal3 = scan.next();
        String LSound3 = scan.next();
        //Jurrasic Park
        String JParkLoc = scan.next();
        String JParkAnimal = scan.next();
        String JParkSound = scan.next();

        try{
            Thread.sleep(1000);
            System.out.println("Retrieving song.");
            Thread.sleep(1000);
            System.out.println('\f');
            System.out.println("Retrieving song..");
            Thread.sleep(1000);
            System.out.println('\f');
            System.out.println("Retrieving song...");
            Thread.sleep(1000);
            System.out.println('\f');

            if(farmguess == 1){
                FarmAnimal farm = new FarmAnimal(animal, sound, loc, "E I E I O");
                System.out.println(farm);
            }
            else if(farmguess == 2){
                FarmAnimal farm = new FarmAnimal(animal2, sound2, loc2, "E I E I O");
                System.out.println(farm);
            }
            else if(farmguess == 3){
                FarmAnimal farm = new FarmAnimal(animal3, sound3, loc3, "E I E I O");
                System.out.println(farm);
            }

            if(lakeguess == 1){
                LakeAnimal lake = new LakeAnimal(LAnimal, LSound, LLoc, "Glub Glub Glub Glub Glub");
                Thread.sleep(24000);
                System.out.println(lake);
            }
            else if(lakeguess == 2){
                LakeAnimal lake = new LakeAnimal(LAnimal2, LSound2, LLoc2, "Glub Glub Glub Glub Glub");
                Thread.sleep(24000);
                System.out.println(lake);
            }
            else if(lakeguess == 3){
                LakeAnimal lake = new LakeAnimal(LAnimal3, LSound3, LLoc3, "Glub Glub Glub Glub Glub");
                Thread.sleep(24000);
                System.out.println(lake);
            }
            //TREX
            if(jparkguess == 1 || jparkguess == 2){
                JParkAnimal jpark = new JParkAnimal(JParkAnimal, JParkSound, JParkLoc, "Ow-ie! Run A-way!");
                Thread.sleep(24000);
                System.out.println(jpark);
            }
        }
        catch(Exception e){
            System.out.println("Not Good");
        }
    }
}