package TeamBuilder.doplnky;

import TeamBuilder.miniDatabase.JobsAndEmploysLists;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ClickerHandler implements KeyListener {

    VisibilityManager vm;
    JobsAndEmploysLists jobsAndEmploysLists;

    public ClickerHandler(VisibilityManager visibilityManager, JobsAndEmploysLists jobsAndEmploysListsManagment) {
        vm = visibilityManager;
        jobsAndEmploysLists = jobsAndEmploysListsManagment;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_ENTER){

            jobsAndEmploysLists.text = vm.ui.jobsTextArea.getText();
            jobsAndEmploysLists.createJobs();
            vm.ui.jobsNumber++;
            vm.ui.jobNumberPanel.setText(String.valueOf(vm.ui.jobsNumber));
            vm.ui.mainTextArea.setText(String.valueOf(jobsAndEmploysLists.jobPositions));
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
