package com.solvd.films.feature;

import com.solvd.films.menu.Menu;
import org.apache.log4j.Logger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.solvd.films.utils.Connector;
public class Cartoon extends Feature {


    //public Cartoon() {
    //    setName("Up");
    //    setReleaseYear(2009);
    //    setDurationMinutes(96);
    //    setProducer("Pit Docter");
    //}
    private final static Logger LOGGER = Logger.getLogger(Menu.class);
    //public Cartoon(String name, int release_year, int duration_minutes, String producer) {
    //}


    public Object infoCartoon() {
        //return ("Cartoon\n" + "Name: " + getName() + "\nRelease year: " + getReleaseYear() +" year" + "\nDuration minutes: " + getDurationMinutes() + " minutes" + "\nProducer: " + getProducer());
        String query = "Select * FROM feature where genre = 'cartoon' ";
        Connector connector = new Connector();
        connector.connect();
        try (PreparedStatement pst = connector.connect().prepareStatement(query)) {
            ResultSet resultSet = pst.executeQuery();
            while (resultSet.next()) {
                LOGGER.info(resultSet.getString("feature"));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }


}
