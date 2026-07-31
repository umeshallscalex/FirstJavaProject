//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format("Hello and welcome to all allscalex warriers!"));

    Employee emp1=new Employee();
    emp1.setName("abc");
    emp1.setEmpno(1);
    Employee emp2=new Employee();
    emp2.setName("xyz");
    emp2.setEmpno(2);
    ArrayList<Employee> al=new ArrayList<>();
    al.add(emp1);
    al.add(emp2);
    for (Employee emp :al) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        IO.println(" Emp details "+emp);
    }
}
