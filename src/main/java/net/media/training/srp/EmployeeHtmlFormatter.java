package solid.live.srp;

public class EmployeeHtmlFormatter {
    private Employee employee;

    public Formatter(Employee employee) {
        this.employee = employee;
    }

    public String toHtml() {
        String str = "<div>" +
                "<h1>Employee Info</h1>" +
                "<div id='emp" + this.employee.empId + "'>" +
                "<span>" + this.employee.name + "</span>" +
                "<div class='left'>" +
                "<span>Leave Left :</span>" +
                "<span>Annual Salary:</span>" +
                "<span>Manager:</span>" +
                "<span>Reimbursable Leave:</span>" +
                "</div>";

        str += "<div class='right'><span>" + (this.employee.totalLeaveAllowed - this.employee.leaveTaken) + "</span>";
        str += "<span>" + Math.round(this.employee.monthlySalary * 12) + "</span>";

        if (this.employee.manager != null) str += "<span>" + this.employee.manager + "</span>";
        else str += "<span>None</span>";

        str += "<span>" + employee.getTotalleaveLeftPreviously() + "</span>";

        return str + "</div> </div>";

    }
}
