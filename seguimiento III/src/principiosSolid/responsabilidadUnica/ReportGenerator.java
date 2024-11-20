package principiosSolid.responsabilidadUnica;

public class ReportGenerator {
    public String generateReport(Report report) {
        return "Report Content: " + report.getContent();
    }
}
