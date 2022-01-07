//Packages entsprechen den Ordnern
package de.telekom.sea7;

//Ipmort von Classen
// automatisch import java.lang.String;

public class fakultaet {

    static void faculty(int zahl ) {
        var n = 1; // Zum hochzaehlen
        var m = 1; // Ergebnis (Fakultät)
        while ( n <= zahl ) {
            // ... 
            m = m * n;
            n = n + 1;
            // console.log(m);
            System.out.println(m);
        }
        System.out.println("So Jo, das wars");
    }



    public static void main (String[] args) {
        System.out.println("Hallo Jo, es geht los");
        int zahl=3;
        //if(args[0] != ""){
        if(args.length == 1){
            zahl=Integer.parseInt(args[0]);
        
        }
        faculty(zahl);
        //return m;
    } 
}