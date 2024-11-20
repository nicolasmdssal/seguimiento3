package principiosSolid.responsabilidadUnica;

public class MainReport {
    public static void main(String[] args) {
        Report report = new Report("Monthly Sales Report");
        ReportGenerator generator = new ReportGenerator();
        String content = generator.generateReport(report);

        ReportSaver saver = new ReportSaver();
        saver.saveToFile(content);
    }
}
