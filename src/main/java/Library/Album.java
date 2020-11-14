package Library;

public class Album extends Book{
    private String paper;

    public Album(String name, int pages, String paper){
        super(name, pages);
        this.paper = paper;
    }

    @Override
    public String toString(){
        return "Album{" +
                "name: " + getName() + '\'' +
                "pages: " + getPages() + '\'' +
                "type: " + paper + '\'' +
                "}";
    }

    public String getPaper()
    {
        return paper;
    }
}
