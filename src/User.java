public class User {
    private String name = "";
    private String livingArea="";


    public User(String name, String livingArea) {
        this.name = name;
        this.livingArea = livingArea;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getLivingArea() {
        return livingArea;
    }


    public void setLivingArea(String livingArea) {
        this.livingArea = livingArea;
    }

    
    

}
