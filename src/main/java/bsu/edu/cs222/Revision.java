package bsu.edu.cs222;

import java.util.Objects;

public class Revision {
    private final String editor;
    private final String timestamp;

    public Revision(String editor, String timestamp){
        this.editor = editor;
        this.timestamp = timestamp;
    }

    public String getEditor() {return editor;}
    public String getTimestamp() {return timestamp;}

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Revision other = (Revision)obj;
        return Objects.equals(this.editor, other.editor)
                && Objects.equals(this.timestamp, other.timestamp);
    }
}
