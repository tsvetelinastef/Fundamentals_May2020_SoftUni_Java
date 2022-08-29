package ObjectClasses_Exercise;

public class ex2_Articles {

    // title - a String
    // content - a String
    // author - a String

    private String title;
    private String content;
    private String author;

    public ex2_Articles(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    // • Edit (new content) – change the old content with the new one
    //• ChangeAuthor (new author) – change the author
    //• Rename (new title) – change the title of the article
    //• override ToString – print the article in the following format:
    //"{title} - {content}:{author}

    public void edit(String newContent){
        this.content = newContent;
    }
}





