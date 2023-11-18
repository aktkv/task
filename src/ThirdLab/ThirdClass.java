package ThirdLab;

public class ThirdClass {
    public static void main(String[] args) {
        Note note = new NoteImpl();
        note.create("Иванов Василий");

        NoteAdapter adapter = new NoteAdapter(note);
        adapter.setPhoneContact("701231544770");

        System.out.println(adapter.getText());
    }
}
