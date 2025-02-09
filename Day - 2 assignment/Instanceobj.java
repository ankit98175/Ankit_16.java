public class Instanceobj{
    public static void main(String[] args) {
        try {
            // Creating an obj of the outer class NewInstanceObj
            Instanceobj outerClass = new Instanceobj();
            Class<?> c = Class.forName("Instanceobj$Student");


            Student s = (Student) c.getDeclaredConstructor(Instanceobj.class).newInstance(outerClass);

            
            s.name = "Ankit";
            s.roll_no = 16;

           
            System.out.println("Student Details: ");
            s.display();

        } 
        catch (Exception e)
         {
            e.printStackTrace();
        }
    }
    class Student
     {
        String name;
        int roll_no;

        //methodd
        void display() {
            System.out.println("Name: " + name);
            System.out.println("RollNo: " + roll_no);
        }
    }
}



