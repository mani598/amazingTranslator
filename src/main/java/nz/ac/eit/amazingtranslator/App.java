package nz.ac.eit.amazingtranslator;

import java.util.Hashtable;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{

    private static Hashtable<Integer, String> frenchTranslations= new Hashtable<>();
    private static Hashtable<Integer, String> germanTranslations= new Hashtable<>();

    private static void setupTranslations() {
        frenchTranslations.put(1, "un");
        frenchTranslations.put(2, "deux");
        frenchTranslations.put(3, "trois");
        frenchTranslations.put(4, "quatre");
        frenchTranslations.put(5, "cinq");
        frenchTranslations.put(6, "six");
        frenchTranslations.put(7, "sept");
        frenchTranslations.put(8, "huit");
        frenchTranslations.put(9, "neuf");
        frenchTranslations.put(10, "dix");
        frenchTranslations.put(11, "onze");
        frenchTranslations.put(12, "douze");
        frenchTranslations.put(13, "treize");
        frenchTranslations.put(14, "quatorze");
        frenchTranslations.put(15, "quinze");
        frenchTranslations.put(16, "seize");
        frenchTranslations.put(17, "dix-sept");
        frenchTranslations.put(18, "dix-huit");
        frenchTranslations.put(19, "dix-neuf");
        frenchTranslations.put(20, "vingt");
        frenchTranslations.put(21, "vingt et un");
        frenchTranslations.put(22, "vingt-deux");
        frenchTranslations.put(23, "vingt-trois");
        frenchTranslations.put(24, "vingt-quatre");
        frenchTranslations.put(25, "vingt-cinq");
        frenchTranslations.put(26, "vingt-six");
        frenchTranslations.put(27, "vingt-sept");
        frenchTranslations.put(28, "vingt-huit");
        frenchTranslations.put(29, "vingt-neuf");
        frenchTranslations.put(30, "trente");

        germanTranslations.put(1,"eins");
        germanTranslations.put(2,"zwei");
        germanTranslations.put(3,"drei");
        germanTranslations.put(4,"vier");
        germanTranslations.put(5,"fünf");
        germanTranslations.put(6,"sechs");
        germanTranslations.put(7,"sieben");
        germanTranslations.put(8,"acht");
        germanTranslations.put(9,"neun");
        germanTranslations.put(10,"zehn");
        germanTranslations.put(11,"elf");
        germanTranslations.put(12,"zwölf");
        germanTranslations.put(13,"dreizehn");
        germanTranslations.put(14,"vierzehn");
        germanTranslations.put(15,"fünfzehn");
        germanTranslations.put(16,"sechzehn");
        germanTranslations.put(17,"siebzehn");
        germanTranslations.put(18,"achtzehn");
        germanTranslations.put(19,"neunzehn");
        germanTranslations.put(20,"zwanzig");
        germanTranslations.put(21,"einundzwanzig");
        germanTranslations.put(22,"zweiundzwanzig");
        germanTranslations.put(23,"dreiundzwanzig");
        germanTranslations.put(24,"vierundzwanzig");
        germanTranslations.put(25,"fünfundzwanzig");
        germanTranslations.put(26,"sechsundzwanzig");
        germanTranslations.put(27,"siebenundzwanzig");
        germanTranslations.put(28,"achtundzwanzig");
        germanTranslations.put(29,"neunundzwanzig");
        germanTranslations.put(30,"dreiβig");
    }


    public static void main( String[] args )
    {

        setupTranslations();

        System.out.println("Please enter a number to translate");
        Scanner scan = new Scanner(System.in);
        String numberAsString= scan.nextLine();
        int numberToTranslate = Integer.parseInt(numberAsString);
        String translated=null;
        System.out.println("What is the language (french/ german)");
        String language=scan.nextLine();
        if (language.equals("french")){
            translated=frenchTranslations.get(numberToTranslate);
        } else if (language.equals("german")){
            translated=germanTranslations.get(numberToTranslate);
        }
        System.out.println("The translated number is "+translated);
    }
}
