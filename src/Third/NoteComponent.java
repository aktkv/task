package Third;

public abstract class NoteComponent {
    public void add(NoteComponent component) {
        throw new UnsupportedOperationException();
    }

    public void remove(NoteComponent component) {
        throw new UnsupportedOperationException();
    }

    public NoteComponent getChild(int index) {
        throw new UnsupportedOperationException();
    }
    public abstract void display();
}
