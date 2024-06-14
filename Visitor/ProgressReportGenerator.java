package Visitor;


class ProgressReportGenerator implements ReportVisitor {
 @Override
 public void visitCourse(Course course) {
     System.out.println("Generating progress report for course: " + course.getName());
 }

 @Override
 public void visitStudent(Student student) {
     System.out.println("Generating progress report for student: " + student.getName() +
             ", Progress: " + student.getProgressPercentage() + "%");
 }

 @Override
 public void visitAssessment(Assessment assessment) {
     // Progress report generator doesn't need to visit assessments
 }
}
