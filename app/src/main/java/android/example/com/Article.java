package android.example.com;

public class Article {

    private String title;
    private String author;
    private String section;
    private String date;
    private String webUrl;

    //Constructor
    public Article(String localTitle, String localAuthor, String localSection, String localDate, String localWebUrl){
        title=localTitle;
        author=author;
        section=section;
        date=date;
        webUrl=webUrl;
    }

    //Getters
    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public String getSection(){
        return section;
    }

    public String getDate(){
        return date;
    }

    public String getUrl(){
        return webUrl;
    }
}
