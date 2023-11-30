package structural_paterns.composite;

public class TesterDepartment implements Department{
    private Integer id;
    private String name;

    public TesterDepartment(Integer id, String name){
        this.id= id;
        this.name = name;
    }

    @Override
    public void printDepartmentName(){
        System.out.println(this.name);
    }

    @Override
    public String getName(){
        return this.name;
    }
}
