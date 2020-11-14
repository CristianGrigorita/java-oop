package Library;

// They both have names and number of pages.
// Novels have type (like mystery, sf, etc.) while albums have paper quality.
public class Novel extends Book{
    private String type;
    private String[] novels;

    public Novel(String name, int pages, String type){
        super(name, pages);
        this.type = type;
    }

    @Override
    public String toString() {
        return "Novel{" +
                "name: " + getName() + '\'' +
                "pages: " + getPages() + '\'' +
                "type: " + type + '\'' +
                "}";
    }

    public String getType() {
        return type;
    }


}
