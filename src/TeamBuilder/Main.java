package TeamBuilder;

import TeamBuilder.doplnky.ChoiceHandler;
import TeamBuilder.doplnky.ClickerHandler;
import TeamBuilder.doplnky.UI;
import TeamBuilder.doplnky.VisibilityManager;
import TeamBuilder.miniDatabase.JobsAndEmploysLists;

import java.time.LocalDate;

public class Main {
    // datum
    LocalDate localDate = LocalDate.now();
    String day = localDate.getDayOfWeek().toString();
    String date = localDate.toString();

    UI ui = new UI(day,date);
    JobsAndEmploysLists jobsAndEmploysLists = new JobsAndEmploysLists();
    VisibilityManager vm = new VisibilityManager(ui);
    ClickerHandler clickerHandler = new ClickerHandler(vm, jobsAndEmploysLists);
    ChoiceHandler choiceHandler = new ChoiceHandler(vm, jobsAndEmploysLists);


    public static void main(String[] args) {


        new Main();
    }
    public Main(){
        ui.createUI(choiceHandler, clickerHandler);
        vm.showTitleScreen();
    }
}

