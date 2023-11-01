package lk.ijse.carRental.utility;

import java.io.*;

/**
 * @author Sasindu Malshan
 * @project CarRental
 * @date 10/25/2023
 */

public class Photo {
    public static byte[] getImage( String url) throws IOException {
        File file=new File(url);
        InputStream stream =new FileInputStream(file);
        byte[] img=new byte[(int) file.length()];
        stream.read(img);
        return img;
    }
}
