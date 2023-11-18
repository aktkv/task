package ThirdLab;

public class NoteImpl implements Note {
    private String text;

    @Override
    public void create(String text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return text;
    }
}
