package Visitor;


class PerformanceReportGenerator implements ReportVisitor {
 @Override
 public void visitCourse(Course course) {
     // Performance report generator doesn't need to visit courses
 }

 @Override
 public void visitStudent(Student student) {
     System.out.println("Generating performance report for student: " + student.getName());
 }

 @Override
 public void visitAssessment(Assessment assessment) {
     System.out.println("Generating performance report for assessment: " + assessment.getTitle() +
             ", Score: " + assessment.getScore());
 }
}
