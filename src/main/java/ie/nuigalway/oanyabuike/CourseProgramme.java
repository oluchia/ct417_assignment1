package ie.nuigalway.oanyabuike;

import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class CourseProgramme
{
    private String courseName;
    private List<Module> moduleList;
    private List<Student> studentList;
    private DateTime startDate;
    private DateTime endDate;

    public CourseProgramme(String courseName, List<Module> moduleList, List<Student> studentList) {
        this.courseName = courseName;
        this.moduleList = moduleList;
        this.studentList = studentList;

    }

    public String getCourseName() {

        return courseName;
    }

    public void setCourseName(String courseName) {

        this.courseName = courseName;
    }

    public List<Module> getModuleList() {

        return moduleList;
    }

    public void setModuleList(List<Module> moduleList) {

        this.moduleList = moduleList;
    }

    public List<Student> getStudentList() {

        return studentList;
    }

    public void setStudentList(List<Student> studentList) {

        this.studentList = studentList;
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "CourseProgramme{" +
                "courseName='" + courseName + '\'' +
                ", moduleList=" + moduleList +
                ", studentList=" + studentList +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
