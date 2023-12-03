
import java.util.HashMap;
        import java.util.Map;

public class AffectationHashMap {
    private Map<Employee, Department> employeeDepartmentMap;

    public AffectationHashMap() {
        employeeDepartmentMap = new HashMap<>();
    }

    public void ajouterEmployeDepartement(Employee employee, Department department) {
        employeeDepartmentMap.put(employee, department);
    }

    public void afficherEmployesEtDepartements() {
        for (Map.Entry<Employee, Department> entry : employeeDepartmentMap.entrySet()) {
            System.out.println("Employee: " + entry.getKey() + " -> Department: " + entry.getValue());
        }
    }

    public void supprimerEmploye(Employee employee) {
        employeeDepartmentMap.remove(employee);
    }

    public void supprimerEmployeEtDepartement(Employee employee, Department department) {
        employeeDepartmentMap.entrySet().removeIf(entry ->
                entry.getKey().equals(employee) && entry.getValue().equals(department));
    }

    public void afficherEmployes() {
        for (Employee employee : employeeDepartmentMap.keySet()) {
            System.out.println("Employee: " + employee);
        }
    }

    public void afficherDepartements() {
        for (Department department : employeeDepartmentMap.values()) {
            System.out.println("Department: " + department);
        }
    }

    public boolean rechercherEmploye(Employee employee) {
        return employeeDepartmentMap.containsKey(employee);
    }

    public boolean rechercherDepartement(Department department) {
        return employeeDepartmentMap.containsValue(department);
    }

    public Map<Employee, Department> trierMap() {

        return employeeDepartmentMap;
    }
}
