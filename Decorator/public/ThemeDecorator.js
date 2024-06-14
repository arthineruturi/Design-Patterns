export default class ThemeDecorator {
  constructor(theme) {
    this.theme = theme;
  }

  applyTheme() {
    this.theme.applyTheme();
  }
}
