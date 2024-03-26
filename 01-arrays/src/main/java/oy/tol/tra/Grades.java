package oy.tol.tra;

/**
 * A simple array of student grades to be used in testing
 * misbehaving algorithm for reversing the array.
 */
public class Grades {

   private Integer[] grades = null;

   public Grades(Integer[] grades) {
      this.grades = new Integer[grades.length];
      for (int counter = 0; counter < grades.length; counter++) {
         this.grades[counter] = grades[counter];
      }
   }

   public void reverse() {
      // Reverse the internal Java Integer array using generic method from Algorithms class
      Algorithms.reverse(this.grades);
   }

   public void sort() {
      // Sort the internal Java Integer array in ascending order using generic method from Algorithms class
      Algorithms.sort(this.grades);
   }

   public Integer[] getArray() {
      return grades;
   }
}