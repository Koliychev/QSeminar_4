package ru.sberbank.data;

public class Tester extends TeamMember{

    public Tester (int id, String firstName, String secondName) {
        super(id, firstName, secondName);
    }

    public Task checkTask() {
        if (this.getCurrentTask() != null) {
            this.getCurrentTask().isTested = true;
        }
        return getCurrentTask();
    }
}
