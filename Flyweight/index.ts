import { LearningModuleFactory } from "./LearningModuleFactory";
import { StudentModuleProgress } from "./StudentModuleProgress";

const factory = new LearningModuleFactory();

const chapter1 = factory.getLearningModule(1, "Maths", "Basic arithmetic");
const chapter2 = factory.getLearningModule(
  2,
  "Maths",
  "Introduction to Trigonometry"
);

const student1 = new StudentModuleProgress("Alice", chapter1);
const student2 = new StudentModuleProgress("Bob", chapter2);
const student3 = new StudentModuleProgress("Charlie", chapter1);

student1.updateProgress(50);
student2.updateProgress(75);
student3.updateProgress(100);

student1.showModuleDetails();
student3.showModuleDetails();
student2.showModuleDetails();
