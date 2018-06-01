package pl.sda.helloworld.notepad;

public class TextNote extends Note {

    public void setContent(String content) {
        this.content = content;
    }

    public String content;

    @Override
    public String toString() {
        return "TextNote{" +
                "content='" + content + '\'' +
                "} " + super.toString();
    }

    public TextNote(String createdDate, String title, int id, String content) {
        super(createdDate, title, id);
        this.content = content;
    }

    @Override
    void print() {
        super.print();
    }



}
