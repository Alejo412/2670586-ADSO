
package utils;


public class Digimon {
    
    
 String id;
 String name;
 String href;
 String urlImg;

    public Digimon(String id, String name, String href, String urlImg) {
        this.id = id;
        this.name = name;
        this.href = href;
        this.urlImg = urlImg;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getHref() {
        return href;
    }

    public String getUrlImg() {
        return urlImg;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public void setUrlImg(String urlImg) {
        this.urlImg = urlImg;
    }
 
 
 
}
