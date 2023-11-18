package ThirdLab;

public class NoteAdapter implements Note {
    private Note note;
    private String phone;

    public NoteAdapter(Note note) {
        this.note = note;
        this.phone = "";
    }

    public void setPhoneContact(String timeStamp) {
        this.phone = timeStamp;
    }

    @Override
    public void create(String text) {
        note.create(text);
    }

    @Override
    public String getText() {
        return note.getText() + " " + phone;
    }
}
