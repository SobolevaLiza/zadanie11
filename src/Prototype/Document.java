package Prototype;

public class Document implements CloneableDocument {
    private String content;

    public Document(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public Document makeCopy() {
        return new Document(this.content);
    }
}
