package src.Items;

public class Note extends Item{
    private String message;
    private String wish;

    public Note(String message, String wish) {
        super(true, "note");
        this.message = message;
        this.wish = wish;
    }
    
    public String consume() {
        return message;
    }

    //getters
    public String getMessage() {
        return message;
    }

    public String getWish() {
        return wish;
    }

    //setters
    public void setMessage(String message) {
        this.message = message;
    }
        
    public void setWish(String wish) {
        this.wish = wish;
    }
}
