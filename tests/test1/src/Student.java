public class Student {
    private String _firstName;
    private String _lastName;
    private long _id;
    private int _learningYear;
    public Student(String firstName,String lastName, long id, int learningYear){
        _firstName = firstName;
        _lastName = lastName;
        _id = id;
        _learningYear = learningYear;
    }
    public Student(Student other)
    {
        _firstName = other._firstName;
        _lastName = other._lastName;
        _id = other._id;
        _learningYear = other._learningYear;
    }
    public boolean overYear1()
    {
        return (_learningYear > 1 && _learningYear < 4);
    }

}
