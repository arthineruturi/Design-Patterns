package Visitor;

//Concrete element: Assessment
class Assessment implements Element {
 private final String title;
 private final int score;

 public Assessment(String title, int score) {
     this.title = title;
     this.score = score;
 }

 public String getTitle() {
     return title;
 }

 public int getScore() {
     return score;
 }

 @Override
 public void accept(ReportVisitor visitor) {
     visitor.visitAssessment(this);
 }
}
