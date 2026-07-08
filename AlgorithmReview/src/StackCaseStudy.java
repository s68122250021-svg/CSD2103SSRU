import java.util.Stack;

public class StackCaseStudy {
    public static void main(String [] args) {
        Stack<String> commandstack = new Stack<>();

        commandstack.push("Type Data");
        commandstack.push("Type Structure");
        commandstack.push("Delete Structure");
        commandstack.push("Type Algorithm");
        commandstack.push("Type Java");

        System.out.println("คำสั่งทั้งหมดใน Stack (ล่างขึ้นบน):");
        for (String cmd : commandstack) {
            System.out.println(" " + cmd);
        }

        System.out.println("\nกำลัง Undo 2 ครั้ง...");
        for (int i = 0; i < 2; i++) {
            if (!commandstack.isEmpty()) {
                String undone = commandstack.pop();
                System.out.println("Undo: " + undone);
            }
        }

        System.out.println("\nสถานะของ Stack หลังจาก Undo:");
        for (String cmd : commandstack) {
            System.out.println(" " + cmd);
        }

        System.out.println("\nStack ใช้หลักการ LIFO โดย:");
        System.out.println("คำสั่งที่เพิ่มเข้าไปล่าสุดจะถูก Undo ก่อนเสมอ");
        System.out.println("เหมือนกับการกด Ctrl+Z ที่ยกเลิกการกระทำล่าสุดก่อน");
    }
}
