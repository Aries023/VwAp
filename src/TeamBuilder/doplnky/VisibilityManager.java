package TeamBuilder.doplnky;

public class VisibilityManager {

    UI ui;

    public VisibilityManager(UI userInterface) {
        ui =userInterface;
    }

    public void showTitleScreen(){

        // Show Title Screen
        ui.titlePanel.setVisible(true);
        ui.startButtlonP.setVisible(true);

        // Hide Work Screen
        ui.statusPanel.setVisible(false);
        ui.mainTextPanel.setVisible(false);
        ui.choiceBP.setVisible(false);
        ui.jobsP.setVisible(false);
        ui.teamP.setVisible(false);
        ui.jobsTextAreaP.setVisible(false);
        ui.jobCButP.setVisible(false);
    }

    public void showWorkScreen(){
        ui.mainTextArea.setText("""
                Now choose whether you want to create jobs, employees or divide the team into jobs.
                \s
                And don't forget to make a smile on your workmates""");

        // Show Work Screen
        ui.statusPanel.setVisible(true);
        ui.mainTextPanel.setVisible(true);
        ui.choiceBP.setVisible(true);

        // Hide Title Screen
        ui.titlePanel.setVisible(false);
        ui.startButtlonP.setVisible(false);
        ui.jobsP.setVisible(false);
        ui.teamP.setVisible(false);
        ui.jobsTextAreaP.setVisible(false);
    }

    public void showJobsScreen(){
        ui.mainTextArea.setText("""
                Do you want to create your jobs or just edit them?
                \s
                choose wisely!""");

        // Show Jobs Screen
        ui.jobsP.setVisible(true);

        // Hide Work Screen
        ui.choiceBP.setVisible(false);
        ui.jobCButP.setVisible(false);

        ui.mainTextPanel.setBounds(100,100,600,250);
        ui.mainTextArea.setBounds(ui.mainTextPanel.getBounds());
    }

    public void creatorJobs(){

        ui.mainTextPanel.setBounds(90,400,585,250);
        ui.mainTextArea.setBounds(ui.mainTextPanel.getBounds());
        ui.mainTextArea.setText("""
                zadaj meno pozicie a klikni na tlacitko next
                \s
                az zadas poslednu poziciu a stlacis next, mozes zmacknut end""");

        // Show creatorJobs
        ui.jobsTextAreaP.setVisible(true);
        ui.jobCButP.setVisible(true);

        // Hide Jobs Screen
//        ui.mainTextPanel.setVisible(false);
        ui.choiceBP.setVisible(false);
        ui.titlePanel.setVisible(false);
        ui.startButtlonP.setVisible(false);
        ui.jobsP.setVisible(false);
        ui.teamP.setVisible(false);
    }
}
