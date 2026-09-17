package DataStructuresAndAlgorithms.Lab1;

public class Main {
    public static void main(String[] args){
        // created array object of Student class
        Student[] students = new Student[5];
        // set the values through the constructor
        students[0] = new Student(1,"John", 19);
        // TODO 1:  create other 4 object of student class and assign to the array Students
        students[1] = new Student(2, "Chekov", 11);
        students[2] = new Student(3, "Tilly", 9);
        students[3] = new Student(4, "Neelix", 10);
        students[4] = new Student(5, "Seth", 41);
        // TODO 2: Uncomment the method call once you have completed the mentioned tasks
        int IndexToDelete = 2;
        removeElement(IndexToDelete, students);

        AddElement(new Student(6, "Alison", 44), students);

        int IndexToUpdate = 3;
        updateElement(IndexToUpdate, students);
    }
    public static void removeElement(int IndexToDelete, Student[] originalArray){
        //TODO 3: create a new array with a length less than the existing one. For example, if your existing array is students, the new array's size will be students.length - 1
        Student[] removeStudents = new Student[originalArray.length - 1];
        int newPos = 0;
        //TODO 4 : use a ‘for loop’ to copy all elements from the existing array to the new array, except for the element at the index you want to remove
        for (int index = 0; index < originalArray.length; index++) {
            if (index != IndexToDelete) {
                removeStudents[newPos] = originalArray[index];
                newPos++;
            }
        }
        //TODO 5: if needed, add the new array back to your original array variable
        //TODO 6: call printArray method and pass "Remove" and new array.
        printArray("Remove", removeStudents);
    }
    public static void AddElement(Student newStudent,Student[] originalArray){
        //TODO 7: define a new array with a length of students.length + 1. This ensures there is space for the new element.
        Student[] newArray = new Student[originalArray.length + 1];
        // TODO 8: use a ‘for loop’ to copy all elements from the existing students array to the new array. Iterate over each element and assign it to the corresponding index in the new array.
        for (int index = 0; index < originalArray.length; index++){
            newArray[index] = originalArray[index];
        }
        // TODO 9: create a newStudent object and assign it to the last index of the new array, which is newArray[newArray.length - 1].
        newArray[newArray.length - 1] = newStudent;
        // TODO 10: place these three steps inside the addElement method in your class. printArray("Add",newArray);
        printArray("Add", newArray);
    }
    public static void updateElement(int indexToUpdate, Student[] originalArray){
        // TODO 11: locate the element you need to update. Use the element's index of the array.
        Student studentToUpdate = originalArray[indexToUpdate];
        //TODO 12: once you have the index, access the element and update its properties.
        studentToUpdate.setName("Bob");
        studentToUpdate.setAge(29);
        studentToUpdate.setRollNumber(7);
        // Use the ‘setter’ method in the Student class to change values like name, age, or ID.
        printArray("Update",originalArray);
    }
    public static void printArray(String message, Student[] students){
       /* TODO 13: include a print statement to indicate the current action being performed,
           such as ‘Removing student’, ‘Adding student’, or ‘Updating student’
        */
        System.out.println(message + " student");
        // TODO 14: use a ‘for loop’ to go through each element in the array.
        for (int index = 0; index < students.length; index++) {
            System.out.println(
                    "Roll Number:" + students[index].getRollNumber() +
                            ", Name: " + students[index].getName() +
                            ", Age: " + students[index].getAge()
            );
        }
        // TODO 15: within the loop, use the ‘getter’ method to fetch each student's details and print them using the student object.

    }
}
