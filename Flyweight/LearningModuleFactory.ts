import { LearningModule } from "./LearningModule";
import { ConcreteLearningModule } from "./ConcreteLearningModule";

export class LearningModuleFactory {
  private modules: { [key: number]: LearningModule } = {};

  getLearningModule(
    chapterNumber: number,
    title: string,
    content: string
  ): LearningModule {
    const key = chapterNumber;
    if (!(key in this.modules)) {
      this.modules[key] = new ConcreteLearningModule(title, content);
    }
    return this.modules[key];
  }
}
