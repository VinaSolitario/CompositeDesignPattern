import java.util.*;

public class Department implements EducationalUnit {
    private String name;
    private List<EducationalUnit> components = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public void add(EducationalUnit unit) {
        components.add(unit);
    }

    public void remove(EducationalUnit unit) {
        components.remove(unit);
    }

    @Override
    public int getNumberOfStudents() {
        int count = 0;
        for (EducationalUnit unit : components) {
            count += unit.getNumberOfStudents();
        }
        return count;
    }

    @Override
    public double getBudget() {
        double total = 0;
        for (EducationalUnit unit : components) {
            total += unit.getBudget();
        }
        return total;
    }

    @Override
    public void displayDetails(String indent) {
        System.out.println(indent + "Department: " + name);
        for (EducationalUnit unit : components) {
            unit.displayDetails(indent + "  ");
        }
    }
}
