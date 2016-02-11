import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Created by jbyrne on 28/01/2016.
 */
public class DataCenter {


 public static void main(String[] args) {

  printThis("Bob");
  printThis("John");

  //System.out.println("The word John has :" + countThis("John") + " chars!");
  String result = countThis("Bobby");
  System.out.println(result);

  System.out.println(countThis("gerald"));

  System.out.println("\n\n\n\n");

  Server bob = new Server(1, 10);

  Server john = new Server(2, 30);


  System.out.println(john.getCapacity());
  System.out.println(bob.getSlot());
  System.out.println(bob.getServerNumber());
  System.out.println(john.getServerNumber());








  System.out.println("\n\n\n\n");





  // The first line defines the players in the problem. (Grid, elements, pieces, sizes etc.)
  // Part of the first line, tells us how many lines apply to cirtain attributes.
  ArrayList < String > thePlayers = new ArrayList < String > ();
  int indexForNumberOfUnavailableSlots = 2; // Why the index? Why not the number?
  int indexForNumberOfServers = 4; // Keeps it scale able. We just need to read the problem
  // and specify the index of the first line that relates
  // to reading more lines of a type.
  ArrayList < String > firstCaveats = new ArrayList < String > ();
  ArrayList < String > secondCaveats = new ArrayList < String > ();

  try {
   BufferedReader br = new BufferedReader(new FileReader("input.txt"));
   String line;

   // We first need to read the first line and extract the details that tell us how to read in the rest of the file.
   if ((line = br.readLine()) != null) { //There is a first line!
    thePlayers = new ArrayList < String > (Arrays.asList(line.split("\\s+")));
   }
   int numberOfLines = Integer.parseInt(thePlayers.get(indexForNumberOfUnavailableSlots)) + Integer.parseInt(thePlayers.get(indexForNumberOfServers));
   System.out.println("There should be " + numberOfLines + " lines left to read!");

   for (int FirstGroup = 1; FirstGroup <= Integer.parseInt(thePlayers.get(indexForNumberOfUnavailableSlots)); FirstGroup++) {
    line = br.readLine();
    //hmmmmm, stuck here because I don't know how to allow for an unknown number of instances of this caveat.

    firstCaveats.add(line);
   }

   for (int secondGroup = 1; secondGroup <= Integer.parseInt(thePlayers.get(indexForNumberOfServers)); secondGroup++) {
    line = br.readLine();
    //hmmmmm, stuck here because I don't know how to allow for an unknown number of instances of this caveat.

    secondCaveats.add(line);
   }


   System.out.println("Are we at the EOF? :" + br.readLine());

   /*while ((line = br.readLine()) != null) {
       String[] bob = line.split("\\s+");
       System.out.println("Bob has " + bob.length + " elements!");
   }*/
  } catch (FileNotFoundException e) {
   e.printStackTrace();
  } catch (IOException e) {
   e.printStackTrace();
  }



  System.out.println(thePlayers.toString());
  System.out.println(firstCaveats.toString());
  System.out.println(secondCaveats.toString());




 }


 public static void printThis(String stuffToPrint) {
  System.out.println("The thing you wanted me to say was :" + stuffToPrint + "!");

 }

 public static String countThis(String stuffToCount) {
  return "The word " + stuffToCount + " has :" + stuffToCount.length() + " chars!";
 }

 public void readFile() {

 }

}