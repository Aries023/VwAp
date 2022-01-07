package TeamBuilder.miniDatabase;

import java.util.ArrayList;
import java.util.List;

public class JobsAndEmploysLists {

    public List <String> jobPositions = new ArrayList<>();
    public List <String> employees = new ArrayList<>();
    public List <Boolean> ownSkills = new ArrayList<>();
    public List < List <Boolean> > employeesPositions = new ArrayList<>();
    public String text;
    protected Boolean owned;

    public void createJobs (){
        jobPositions.add(text);
    }

    public void createEmployee(){
        employees.add(text);
    }

    protected void createownSkills(){
        ownSkills.add(owned);
    }


}
