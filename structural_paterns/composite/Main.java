package structural_paterns.composite;

public class Main {
    public static void main(String[] args) {
        SoftwareDepartment softwareDepartment =
                new SoftwareDepartment(1,"Nguyen Van A");

        TesterDepartment testerDepartment =
                new TesterDepartment(2, "Tran B");
        softwareDepartment.addChild(testerDepartment);
        softwareDepartment.printDepartmentName();
    }
}
