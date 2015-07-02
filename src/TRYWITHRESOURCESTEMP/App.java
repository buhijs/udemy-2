/*

This package / class should be read / viewed after Reading files with filereader

In the 'reading files with filereader' class, there is a giant blob of code within the try / catch blocks, and
it's really tricky to read, and doesn't look that nice.

"Try with resources" is a feature that was introduced with Java 7. It aims to simplify the code within the 'reading
files with filereader class'

 */

package TRYWITHRESOURCESTEMP;

import java.io.*;

public class App {

    public static void main(String[] args) {

        //The first things to know if that BufferedReader implements AutoClosable (via a few other things + inheritance)
        //Any class that implements AutoClosable must have a close method + BufferedReader does indeed have one

        //When using the Java 7-introduced "try with resources" feature, the close method on BufferedReader is
        //automatically called, and we do not need to write br.close (as we did in the reading files with filereader
        //class).

        //So any class that implements Autoclosable (and therefore has a close method), will automatically execute that
        //close method at the end of the "try with resources"

        //The "try with resources" structure is as per the below:

        File file = new File("trywithresources.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            //This is what will be thrown if FileReader cannot find the file we are passing into it
            System.out.println("Can't find the file : " + file.toString());
        } catch (IOException e) {
            //NEED TO CHECK THE FOLLOWING IN MY OTHER NOTES - This is what will be thrown either if BufferedReader cannot
            //close the file, OR, if BufferedReader cannot
            //read the file (if it is corrupted for example). I'm going to print an error message for the latter
            System.out.println("Unable to read file : " + file.toString());
        }

        //So if you compare this code above to the blob of code in the reading files with filereader class, you will
        //see that this is much more readable + easier to maintain and understand :-)

        //I've also created another class here to illustrate that the close method will be called autoamtically on ANY
        //class that implements AutoClosable
    }
}