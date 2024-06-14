package Visitor;


class Course implements Element {
 private final String name;

 public Course(String name) {
     this.name = name;
 }

 public String getName() {
     return name;
 }

 @Override
 public void accept(ReportVisitor visitor) {
     visitor.visitCourse(this);
 }
}
