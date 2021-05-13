package TeamBuilder;

import TeamBuilder.doplnky.ChoiceHandler;
import TeamBuilder.doplnky.UI;
import TeamBuilder.doplnky.VisibilityManager;
import TeamBuilder.miniDatabase.Jobs;

import java.time.LocalDate;

public class Main {
    LocalDate localDate = LocalDate.now();
    String day = localDate.getDayOfWeek().toString();
    String date = localDate.toString();

    UI ui = new UI(day,date);
    Jobs jobs = new Jobs();
    VisibilityManager vm = new VisibilityManager(ui);
    ChoiceHandler choiceHandler = new ChoiceHandler(vm, jobs);


    public static void main(String[] args) {


        new Main();
    }
    public Main(){
        ui.createUI(choiceHandler);
        vm.showTitleScreen();
    }
}

