package Visitor;


interface ReportVisitor {
 void visitCourse(Course course);
 void visitStudent(Student student);
 void visitAssessment(Assessment assessment);
}
