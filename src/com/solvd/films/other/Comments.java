package com.solvd.films.other;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Comments {
    public void commentDrama(){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("commentsDrama.txt")))
        {
            String text = "+ one like";
            bw.write(text);
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        finally {System.out.println("thank you for your like");
    }
}
}
