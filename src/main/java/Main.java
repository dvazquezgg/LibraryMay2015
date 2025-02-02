/**
 *
 * • Certain books are classified as short term and can only be borrowed for 5 days. Other books
 * are classified as long term and can be borrowed for 30 days.
 * • Fines are charged at a rate of $1.50 for each day that a short term book is overdue.
 * • Fines are charged at a rate of 10 cents for each day that a long term book is overdue.
 * • If the overdue period exceeds 4 days for any short term loan book students are not allowed to
 * borrow any more books and their borrowing rights are suspended; this does not apply for long
 * term book loans.
 * • Students can borrow a total of 10 books.
 */

public class Main {

    public static void main(String[] args) {
        Student student = Question10d();
        System.out.println("Student ID: " + student.getStudentID());

        Loan loan = Question10f(student);
        System.out.println("Book ID: " + loan.getBookID());

        Student temp;
        Student[] borrowers = new Student[100000];
        temp = new Student(93001, "Jones");
        temp.addLoan(new Loan(210001,"The Sky"));
        borrowers[93001] = temp;
        temp = new Student(3012, "Zang");
        temp.addLoan(new Loan(210121, "The Animals"));
        borrowers[3012] = temp;
        borrowers[93001].addLoan(new Loan(210002, "The Spooks"));
        temp = new Student(93002, "Nguyen");
        temp.addLoan(new Loan(210011, "The Ocean"));
        borrowers[93002] = temp;
        System.out.println(borrowers[93001].getStudentName());
        System.out.println(borrowers[93001].getLoan(1).getBookTitle());
        System.out.println(borrowers[3012].getLoan(0).getBookTitle());
    }

    public static Student Question10d() {
        Student student = null;
        // Construct a statement to create a Student object
        // for a student with an ID of 93003 and a name of “Smith”.
        // TODO: Write code here
        return student;
    }

    public static Loan Question10f(Student ST) {
        Loan loan = null;
        // Construct the code needed to add a loan
        // with a book ID of 212000
        // and a book title of “The Stars” to a Student object, ST.
        // TODO: Write code here
        return loan;
    }

    public static void showDetails(){
        // The librarian requires a display of the student name,
        // the titles of the books and the dates that
        // they were borrowed, corresponding to a specific student ID.
        // TODO: Write code here
    }

    // Outline, using an OOP technique, how the total number of books on loan could be
    // displayed without processing the borrowers array.
}