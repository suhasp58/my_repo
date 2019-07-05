import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;
import java.lang.*;
public class mac_address2{
        public static void main(String args[]) {
        try {
            //String s1;
                //Scanner sc = new Scanner(System.in);
                  //  System.out.println("Enter your Pc's Physical Address");
               //       s1 = sc.nextLine();
                String s2= "https://api.macaddress.io/v1?apiKey=at_YToYX6GrOvpPpLUjjnK5osW6ICjOD&output=json&search=";
                String k=s2+args[0];
            URL google = new URL(k);
            BufferedReader in = new BufferedReader(new InputStreamReader(google.openStream()));
            String inputLine;

            while ((inputLine = in.readLine()) != null) {
                // Process each line.
                System.out.println(inputLine);
            }
            in.close();

        } catch (MalformedURLException me) {
            System.out.println(me);

        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }
}
