package Visitor;


class Student implements Element {
 private final String name;
 private final int progressPercentage;

 public Student(String name, int progressPercentage) {
     this.name = name;
     this.progressPercentage = progressPercentage;
 }

 public String getName() {
     return name;
 }

 public int getProgressPercentage() {
     return progressPercentage;
 }

 @Override
 public void accept(ReportVisitor visitor) {
     visitor.visitStudent(this);
 }
}

