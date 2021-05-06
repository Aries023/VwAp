package TeamBuilder.doplnky;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChoiceHandler implements ActionListener {

    VisibilityManager vm;

    public ChoiceHandler(VisibilityManager visibilityManager) {
        vm = visibilityManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String choice = e.getActionCommand();

        switch (choice){
            case "start" :
                vm.showWorkScreen();
                break;
            case "ch1" :
                break;
            case "ch2" :
                break;
            case "ch3" :
                break;
            case "ch4" :
                vm.showTitleScreen();
                break;
        }
    }
}
