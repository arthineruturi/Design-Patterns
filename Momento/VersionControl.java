package Momento;

import java.util.Stack;

public class VersionControl {
    private Stack<DocumentMemento> history = new Stack<>();

    public void save(Document doc) {
        history.push(doc.createMemento());
    }

    public void undo(Document doc) {
        if (!history.isEmpty()) {
        	
            doc.restore(history.pop());
        } else {
            System.out.println("No states to revert to.");
        }
    }
}
