package TeamBuilder.doplnky;

import TeamBuilder.miniDatabase.Jobs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChoiceHandler implements ActionListener {

    VisibilityManager vm;
    Jobs jobs;

    public ChoiceHandler(VisibilityManager visibilityManager, Jobs jobsManagment) {
        vm = visibilityManager;
        jobs = jobsManagment;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String choice = e.getActionCommand();

        switch (choice){
            case "start" :
                vm.showWorkScreen();
                break;
            case "ch1" :
                vm.showJobsScreen();
                break;
            case "ch2" :
                break;
            case "ch3" :
                break;
            case "ch4" :
                vm.showTitleScreen();
                break;
            case "createJobs" :
                vm.creatorJobs();
                break;
            case "createTeam" :
                break;
            case "takeJob" :
                jobs.text = vm.ui.jobsTextArea.getText();
                jobs.createJobs();
                vm.ui.jobsNumber++;
                vm.ui.jobNumberPanel.setText(String.valueOf(vm.ui.jobsNumber));
                vm.ui.mainTextArea.setText(String.valueOf(jobs.jobPositions));
                break;

        }
    }
}
