package Momento;

public class Main {
    public static void main(String[] args) {
        Document doc = new Document();
        VersionControl versionControl = new VersionControl();

        doc.setContent("Version 1");
        System.out.println("Initial Content: " + doc.getContent());
        versionControl.save(doc);

        doc.setContent("Version 2");
        System.out.println("Modified Content: " + doc.getContent());
        versionControl.save(doc);


        versionControl.undo(doc);
        System.out.println("After undo: " + doc.getContent());

        versionControl.undo(doc);
        System.out.println("After undo: " + doc.getContent());
    }
}
