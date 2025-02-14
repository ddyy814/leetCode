/**
 * (551) Student Attendance Record I
 * You are given a string representing an attendance record for a student. The record only contains the following three
 * characters:
 * 1. 'A': Absent
 * 2. 'L': Late
 * 3. 'P': Present
 *
 * A student could be rewarded if his attendance record doesn't contain more than one 'A'(absent) or more than two
 * continuous 'L'(late).
 * You need to return whether the student could be rewarded according to his attendance record.
 *
 * Example 1:
 * Input: "PPALLP"
 * Output: True
 *
 * Example 2:
 * Input:"PPALLL"
 * Output: false
 *
 *
 * Time complexity:
 * Space complexity:
 *
 * Easy level
 * 
 */
public class Student_Attendance_Record_I {
    public boolean checkRecord(String s){
        int A = 0, L = 0;
        for(char c : s.toCharArray()){
            if(c == 'A'){
                A++;
                L = 0;
            }else if(c == 'L'){
                L++;
            }else{
                L = 0;
            }
            if(A > 1 || L > 2)
                return false;
        }
        return true;
    }
}
