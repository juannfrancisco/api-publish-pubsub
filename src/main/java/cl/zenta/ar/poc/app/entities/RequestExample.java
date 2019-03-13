package cl.zenta.ar.poc.app.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RequestExample {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
