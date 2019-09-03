package nz.ac.eit.amazingtranslator;

import java.util.Hashtable;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{


    public static void main( String[] args )
    {

        System.out.println("Please enter a number to translate");
        Scanner scan = new Scanner(System.in);
        String numberAsString= scan.nextLine();
        int numberToTranslate = Integer.parseInt(numberAsString);
        System.out.println("What is the language (french/ german)");
        String language=scan.nextLine();
        Converter converter= new Converter();
        converter.setupTranslations();
        String translated=converter.convert(numberToTranslate, language);

    }
}
