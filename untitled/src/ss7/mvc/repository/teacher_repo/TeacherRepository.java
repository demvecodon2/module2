package ss7.mvc.repository.teacher_repo;

import ss7.mvc.model.Teacher;
import ss7.mvc.util.ReadAndWrite;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TeacherRepository implements ITeacherRepository {

    private static final String CSV_FILE_TEACHER = "src/ss7/mvc/data/teacher.csv";

    @Override
    public List<Teacher> findAll() {
        List<String> stringList = ReadAndWrite.readFileCSVToListString(CSV_FILE_TEACHER);
        List<Teacher> teacherList = new ArrayList<>();
        for (String string : stringList) {
            String[] stringArray = string.split(",");
            if (stringArray.length == 6) {
                try {
                    int id = Integer.parseInt(stringArray[0]);
                    LocalDate localDate = LocalDate.parse(stringArray[2]);
                    Teacher teacher = new Teacher(id, stringArray[1], localDate, stringArray[3], stringArray[4], stringArray[5]);
                    teacherList.add(teacher);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }


        }

        return teacherList;
    }

    @Override
    public void add(Teacher teacher) {
        List<String> stringList = new ArrayList<>();
        stringList.add(teacher.toCsvString());
        ReadAndWrite.writeFileCSVToListString(CSV_FILE_TEACHER, stringList);


    }

    @Override
    public boolean exists(int id) {
       List<Teacher> teacherList = findAll();

               return teacherList.stream().anyMatch(teacher -> teacher.getId() == id);
           }


    @Override
    public void update(int id, Teacher updatedTeacher) {
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < stringList.size(); i++) {
            if (stringList.get(i).equals(updatedTeacher.toCsvString())) {
                stringList.set(i, updatedTeacher.toCsvString());
            }
        }
        List<Teacher> teacherList = new ArrayList<>();
        for (int i = 0; i < stringList.size(); i++) {
            stringList.set(i, stringList.get(i).replace(updatedTeacher.toCsvString(), ""));
        }
        stringList.add(updatedTeacher.toCsvString());



    }
    @Override
    public void delete(int id) {
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < stringList.size(); i++) {
            if (stringList.get(i).equals(id)) {
                teacherList.remove(i);
            }
        }
        List<Teacher> teacherList = new ArrayList<>();
        for (Teacher teacher : teacherList) {
            stringList.add(teacher.toCsvString());
        }
        ReadAndWrite.writeFileCSVToListString(CSV_FILE_TEACHER, stringList);
    }
    @Override
    public Teacher findById(int id) {
        List<Teacher> teacherList = findAll();

        return teacherList.stream().filter(teacher -> teacher.getId() == id).findFirst().orElse(null);

    }



}
