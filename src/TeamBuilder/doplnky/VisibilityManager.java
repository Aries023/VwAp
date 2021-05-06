package TeamBuilder.doplnky;

public class VisibilityManager {

    UI ui;

    public VisibilityManager(UI userInterface) {
        ui =userInterface;
    }

    public void showTitleScreen(){

        // Show Title Screen
        ui.titlePanel.setVisible(true);
        ui.startButtlonPanel.setVisible(true);

        // Hide Work Screen
        ui.statusPanel.setVisible(false);
        ui.mainTextPanel.setVisible(false);
        ui.choiceButtonPanel.setVisible(false);
    }

    public void showWorkScreen(){

        // Show Work Screen
        ui.statusPanel.setVisible(true);
        ui.mainTextPanel.setVisible(true);
        ui.choiceButtonPanel.setVisible(true);

        // Hide Title Screen
        ui.titlePanel.setVisible(false);
        ui.startButtlonPanel.setVisible(false);
    }
}
