import LightTheme from "./LightTheme.js";
import DarkTheme from "./DarkTheme.js";
import BlueTheme from "./BlueTheme.js";
import ThemeDecorator from "./ThemeDecorator.js";

window.onload = () => {
  const themeSwitcher = document.querySelector("#themeSwitcher");
  let currentTheme;

  themeSwitcher.addEventListener("change", (event) => {
    const selectedTheme = event.target.value;

    switch (selectedTheme) {
      case "light":
        currentTheme = new LightTheme();
        break;
      case "dark":
        currentTheme = new DarkTheme();
        break;
      case "blue":
        currentTheme = new BlueTheme();
        break;
      default:
        currentTheme = new LightTheme();
    }

    const themeDecorator = new ThemeDecorator(currentTheme);
    themeDecorator.applyTheme();
  });
};
