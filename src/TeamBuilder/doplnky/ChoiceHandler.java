package TeamBuilder.doplnky;

import TeamBuilder.miniDatabase.JobsAndEmploysLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChoiceHandler implements ActionListener {

    VisibilityManager vm;
    JobsAndEmploysLists jobsAndEmploysLists;

    public ChoiceHandler(VisibilityManager visibilityManager, JobsAndEmploysLists jobsAndEmploysListsManagment) {
        vm = visibilityManager;
        jobsAndEmploysLists = jobsAndEmploysListsManagment;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String choice = e.getActionCommand();

        switch (choice){
            case "start" :
                vm.showMenuScreen();
                break;
            case "ch1" :
                vm.showCreateScreen();
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
                vm.creatorEmploye();
                break;
            case "takeJob" :
                jobsAndEmploysLists.text = vm.ui.jobsTextArea.getText();
                jobsAndEmploysLists.createJobs();
                vm.ui.jobsNumber++;
                vm.ui.jobNumberPanel.setText(String.valueOf(vm.ui.jobsNumber));
                vm.ui.mainTextArea.setText(String.valueOf(jobsAndEmploysLists.jobPositions));
                break;
            case "takeEmploye" :
                jobsAndEmploysLists.text = vm.ui.jobsTextArea.getText();
                jobsAndEmploysLists.createEmployee();
                vm.ui.employeeNumber++;
                vm.ui.employeNumberPanel.setText(String.valueOf(vm.ui.employeeNumber));
                vm.ui.mainTextArea.setText(String.valueOf(jobsAndEmploysLists.jobPositions));
                break;

        }
    }
}
