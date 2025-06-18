package huong.example;

// Tạo interface
interface MessagePrinter {
    void print(String message);
}

// Cài đặt interface
class ConsolePrinter implements MessagePrinter {
    @Override
    public void print(String message) {
        System.out.println(message);
    }
}

// Report chỉ phụ thuộc vào interface
class Report {
    private final MessagePrinter printer;

    public Report(MessagePrinter printer) {
        this.printer = printer;
    }

    public void generate() {
        printer.print("Generating report...");
    }
}

// Sử dụng trong main
public class TightCouplingExample {
    public static void main(String[] args) {
        MessagePrinter printer = new ConsolePrinter();
        Report report = new Report(printer);
        report.generate();
    }
}
