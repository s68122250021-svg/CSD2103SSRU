import java.util.LinkedList;
import java.util.Queue;

public class QueueCaseStudy {
    public static void main(String [] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("P001");
        queue.add("P002");
        queue.add("P003");
        queue.add("P004");
        queue.add("P005");

        System.out.println("คิวเริ่มต้น: " + queue);
        System.out.println("\nเรียกผู้ป่วยเข้ารับบริการ:");
        for (int i = 0; i < 2; i++) {
            if (!queue.isEmpty()) {
                String patient = queue.remove();
                System.out.println("เรียก: " + patient + " เข้ารับบริการแล้ว");
            }
        }

        queue.add("P006");
        queue.add("P007");
        System.out.println("\nเพิ่มผู้ป่วยใหม่ P006 และ P007 เข้าคิวแล้ว");
        System.out.println("\nผู้ป่วยคนถัดไป: " + queue.peek());
        System.out.println("จำนวนผู้ป่วยที่ยังรออยู่: " + queue.size() + " คน");
        System.out.println("\nสถานะของ Queue หลังจากดำเนินการทั้งหมด: " + queue);
        System.out.println("\nQueue ใช้หลักการ FIFO โดย:");
        System.out.println("ผู้ป่วยที่มาลงทะเบียนก่อนจะได้รับบริการก่อนเสมอ");
        System.out.println("เหมือนการต่อแถวในชีวิตจริงที่มาก่อนได้ก่อน");
    }
}
