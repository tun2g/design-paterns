package structural_paterns.composite;

import java.util.ArrayList;
import java.util.List;

public class SoftwareDepartment implements  Department{
    private Integer id;
    private String name;

    private List<Department> childDepartments;

    public SoftwareDepartment(Integer id, String name){
        this.name = name;
        this.id = id;
        this.childDepartments = new ArrayList<>();
    }

    @Override
    public void printDepartmentName(){
        System.out.println("Head " + this.name);
        childDepartments.forEach(Department::printDepartmentName);
    }

    @Override
    public String getName(){
        return this.name;
    }

    public void addChild(Department department){
        this.childDepartments.add(department);
    }

    public void remove(Department department){
        this.childDepartments.remove(department);
    }
}
