package com.company;

public class Main {
    private static final Integer SIZE = 5;

    public static void main(String[] args) {
        // write your code here


        Boss boss = new Boss("Boss", "Bossovich", 200.0);
        Developer developer = new Developer("Develop", "Developerovich", 99.7);
        QAEngineer qaEngineers = new QAEngineer("Engineers", "Engineers", 114.4);
        SysAdmin sysAdmin = new SysAdmin("System", "Admin", 87.6);
        TeamLeader teamLeader = new TeamLeader("Team", "Leader", 156.8);
        Checker checker = new Checker();
        Printer printer = new Printer();


        Firm firm = new Firm(SIZE);

        firm.add(boss, checker, printer);
        firm.add(developer, checker, printer);
        firm.add(qaEngineers, checker, printer);
        firm.add(sysAdmin, checker, printer);
        firm.add(teamLeader, checker, printer);

        firm.totalSalary(printer);
    }
}
