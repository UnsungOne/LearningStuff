package pl.sda.helloworld.notepad;

public abstract class Note {

    private String createdDate;
    private String title;
    private int id;

    public Note(String createdDate, String title, int id) {
        this.createdDate = createdDate;
        this.title = title;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Note{" +
                "createdDate=" + createdDate +
                ", title='" + title + '\'' +
                ", id=" + id +
                '}';
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    void print(){;
    }
}
