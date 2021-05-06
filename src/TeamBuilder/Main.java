package TeamBuilder;

import TeamBuilder.doplnky.ChoiceHandler;
import TeamBuilder.doplnky.UI;
import TeamBuilder.doplnky.VisibilityManager;

public class Main {

    UI ui = new UI();
    VisibilityManager vm = new VisibilityManager(ui);
    ChoiceHandler choiceHandler = new ChoiceHandler(vm);

    public static void main(String[] args) {

        new Main();
    }
    public Main(){
        ui.createUI(choiceHandler);
        vm.showTitleScreen();
    }
}

