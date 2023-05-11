package enums;

public enum BookCategories {

    Novel("PDF"),
    Biography("Hardbound"),
    TextBook("Softbound"),
    Fiction("EPUB");

    String format;

    BookCategories(String format){
        this.format = format;
    }

    public String getCover(){
        return format;
    }
}
