package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Boss boss = new Boss("Boss", "Bossovich", "boss", 200.0, 3);
        //boss.outputMessage();
        Developer developer = new Developer("Develop", "Developerovich", "developer", 99.7, 1);
        QAEngineers qaEngineers = new QAEngineers("Engineers", "Engineers", "QAEngineers", 114.4, 2);
        SysAdmin sysAdmin = new SysAdmin("System", "Admin", "SysAdmin", 87.6, 3);
        TeamLeader teamLeader = new TeamLeader("Team", "Leader", "TeamLeader", 156.8, 2);

        AEmployee[] employees = new AEmployee[5];
        employees[0] = boss;
        employees[1] = developer;
        employees[2] = qaEngineers;
        employees[3] = sysAdmin;
        employees[4] = teamLeader;

        Firm firm = new Firm(employees);

        firm.totalSalary();


    }
}
