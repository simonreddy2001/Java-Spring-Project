package no.noroff.SpringClassDemo.models;

public class CustomResponse {
    private String message;

    public CustomResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
