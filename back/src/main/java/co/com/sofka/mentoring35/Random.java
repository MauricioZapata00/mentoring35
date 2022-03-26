package co.com.sofka.mentoring35;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Random {

    @Id
    private String id;

    private String name;
    private String latitude;
    private String longitude;
    private String wrapper;

    public void setName(String name) {
        this.name = name;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public void setWrapper(String wrapper) {
        this.wrapper = wrapper;
    }

    public String getWrapper() {
        return wrapper;
    }

    //https://drive.google.com/drive/folders/1rhQEzOqXWaHk1yUDU32fFaaLdE2Imaco
}
