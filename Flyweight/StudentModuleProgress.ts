import { LearningModule } from "./LearningModule";

export class StudentModuleProgress {
  private studentName: string;
  private learningModule: LearningModule;
  private progress: number;

  constructor(
    studentName: string,
    learningModule: LearningModule,
    progress: number = 0
  ) {
    this.studentName = studentName;
    this.learningModule = learningModule;
    this.progress = progress;
  }

  showModuleDetails(): void {
    console.log(`Student: ${this.studentName}`);
    console.log(`Subject: ${this.learningModule.getTitle()}`);
    console.log(`Module: ${this.learningModule.getContent()}`);
    console.log(`Progress: ${this.progress}%`);
  }

  updateProgress(progress: number): void {
    this.progress = progress;
  }
}
