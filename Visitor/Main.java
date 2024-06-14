package Visitor;


public class Main {
 public static void main(String[] args) {
     Element[] elements = {
         new Course("Java Programming"),
         new Student("Arthi Sri", 75),
         new Assessment("Java Quiz", 80)
     };

     ReportVisitor progressReportGenerator = new ProgressReportGenerator();
     ReportVisitor performanceReportGenerator = new PerformanceReportGenerator();

     for (Element element : elements) {
         element.accept(progressReportGenerator);
         element.accept(performanceReportGenerator);
     }
 }
}
