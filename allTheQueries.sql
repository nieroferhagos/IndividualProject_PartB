--- A list of all the students ---
SELECT * FROM privateschool.students;

--- A list of all the trainers ---
SELECT * FROM privateschool.trainers;

--- A list of all the assignments ---
SELECT * FROM privateschool.assignments;

--- A list of all the courses ---
SELECT* FROM privateschool.courses;

--- A list of all the students per course ---
SELECT StLastName, DateOfBirth, CourseTitle, Stream, Type, StartDate, EndDate FROM students
INNER JOIN studentspercourse ON students.Student_ID=studentspercourse.Student
INNER JOIN courses ON courses.Course_ID=studentspercourse.StCourse
ORDER BY StPerCourse_ID;

--- A list of all the trainers per course ---
SELECT TrFirstName, TrLastName, Subject, CourseTitle, Type, StartDate, EndDate FROM trainers
INNER JOIN trainerspercourse ON trainers.Trainer_ID=trainerspercourse.Trainer
INNER JOIN courses ON courses.Course_ID=trainerspercourse.TrCourse
ORDER BY TrPerCourse_ID;

--- A list of all the assignments per course ---
SELECT AssTitle, Description, CourseTitle, Stream, Type FROM assignments
INNER JOIN assignmentspercourse ON assignments.Assignment_ID=assignmentspercourse.Assignment
INNER JOIN courses ON courses.Course_ID=assignmentspercourse.AssCourse
ORDER BY AssPerCourse_ID;

--- A list of all the assignments per course per student ---
SELECT StFirstName, StLastName, CourseTitle, Stream, Type, AssTitle, OralMark, WrittenMark, SubDateTime FROM students
INNER JOIN studentsubmission ON students.Student_ID=studentsubmission.StudentSub
INNER JOIN assignments ON assignments.Assignment_ID=studentsubmission.AssSub
INNER JOIN studentspercourse ON students.Student_ID=studentspercourse.Student
INNER JOIN courses ON courses.Course_ID=studentspercourse.StCourse
ORDER BY StudSub_ID;

--- A list of students that belong to more than one courses ---
SELECT Student_ID, StFirstName, StLastName FROM students
INNER JOIN studentspercourse ON Student_ID=Student
GROUP BY Student_ID
HAVING COUNT(Student)>1;