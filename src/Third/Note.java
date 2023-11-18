package Third;

public class Note extends NoteComponent {
    private String text;

    public Note(String text) {
        this.text = text;
    }

    public void display() {
        System.out.println(text);
    }

}
