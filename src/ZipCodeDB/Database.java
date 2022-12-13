package ZipCodeDB;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Database implements LatLngInterface {
 /*
 store all the data
  */

    private ArrayList<Zipcode> codes;

    public Database() {
        // allocate the array list
        this.codes = new ArrayList<>();
        this.load_zips();
    }

    // fill the zipcode array list with real data
    private void load_zips(){

        URL url = null; // null is the nothing value
        Scanner s = null;


        try {
            url = new URL("http://10.60.15.25/~ehar/cs219/zips.txt"); // create the URL object for the path
            s = new Scanner(url.openConnection().getInputStream());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // read line by line

        while (s.hasNextLine()){
            String line = s.nextLine();
            String [] parts = line.split(",");

            Zipcode z = new Zipcode(
                    parts[1].substring(1, parts[1].length() -1),
                    parts[2].substring(1, parts[2].length() -1) ,
                    parts[3].substring(1, parts[3].length() -1),
                    Double.parseDouble(parts[4]),
                    Double.parseDouble(parts[5]),
                    Integer.parseInt(parts[6]));
            // codes isn't a regular array, it's an array list which is dynamic
            codes.add(z); // put z at the end of the array list

            // now we have code that grabs data, calls it z, and adds it to codes
        }
        // here we can sort by the zipcode
        Collections.sort(this.codes);
    } // load_zips

    // write a function to search for data by a zipcode
    // public, so we can call it out of the class
    // we should return a reference to the object itself
    public Zipcode findByZip1(String code){
        // go through the built array (codes)
        for (int i = 0; i < this.codes.size(); i++){
            if (code.equals(this.codes.get(i).getCode()))
                // this means we found it or something
                return this.codes.get(i);
        }
        // if we get down here we didn't find it
        return null;
    }
    public Zipcode findByZip(String code){
        // go through the built array (codes)
        for (Zipcode zipcode : this.codes) {
            if (code.equals(zipcode.getCode()))
                // this means we found it or something
                return zipcode;
        }
        // if we get down here we didn't find it
        return null;
    }

    public Zipcode getNorthern(){

        Zipcode maxlat = this.codes.get(0);

        for (Zipcode code : this.codes){
            if(this.codes.get(0).getLat() < code.getLat()){
                maxlat = code;
            }
        }
        return maxlat;
    }
    // Binary search for the zipcodes
    private Zipcode binary_search(String target, int low, int high) {

        if (low > high)
            return null;

        int mid = (low + high) / 2;

        if (this.codes.get(mid).getCode().equals(target))
            return this.codes.get(mid);
        else if (this.codes.get(mid).getCode().compareTo(target) < 0) // this means aos[mid] is less than target
            return(binary_search(target,mid + 1, high)); // mid plus one is now the next low
        else
            return(binary_search(target, low, mid - 1)); // mid minus one is now the next high

    }

    // this provides a simple interface for the b- search function
    public Zipcode search(String code) {
        // return binary_search(code, 0, codes.size() - 1);
        int pos = Collections.binarySearch(this.codes, new Zipcode(code, "", "", 0, 0, 0));

        if (pos != -1)
            return this.codes.get(pos);
        else
            return null;
    }

    // return the zipcode info with the norther most latitude
    


}
