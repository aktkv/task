package Third;

import java.util.ArrayList;
import java.util.List;

public class NoteBook extends NoteComponent {
    private List<NoteComponent> notes;

    public NoteBook() {
        notes = new ArrayList<>();
    }

    public void display() {
        for (NoteComponent component : notes) {
            component.display();
        }
    }

    public void add(NoteComponent component) {
        notes.add(component);
    }

    public void remove(NoteComponent component) {
        notes.remove(component);
    }

    public NoteComponent getChild(int index) {
        return notes.get(index);
    }
}
