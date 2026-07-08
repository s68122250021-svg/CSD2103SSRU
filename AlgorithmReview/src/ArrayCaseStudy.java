public class ArrayCaseStudy {

    public static void main(String[] args) {
        int[] scores = {6, 8, 4, 9, 7, 5, 10, 3, 8, 2};
        int total = 0;
        int max = scores[0];
        int min = scores[0];
        int morethan7 = 0;

        for (int i = 0; i < scores.length; i++) {
            total += scores[i];

            if (scores[i] > max) {
                max = scores[i];
            }
            if (scores[i] < min) {
                min = scores[i];
            }
            if (scores[i] >= 7) {
                morethan7++;
            }
        }

        double avg = (double) total / scores.length;

        System.out.println("คะแนนรวมของนักศึกษาทั้งหมด: " + total);
        System.out.println("คะแนนเฉลี่ย: " + avg);
        System.out.println("คะแนนสูงสุด: " + max);
        System.out.println("คะแนนต่ำสุด: " + min);
        System.out.println("จำนวนนักศึกษาที่ได้คะแนนตั้งแต่ 7 คะแนนขึ้นไป: " + morethan7);
        System.out.println("จำนวนนักศึกษาที่ควรได้รับการทบทวนเพิ่มเติม:");
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < 5) {
                System.out.println("นักศึกษาที่ " + (i + 1) + " ได้คะแนน " + scores[i]);
            }
        }

    }
}