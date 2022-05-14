package reporting;
public class ReportFormatter {

    String formattedOutput;
    
    public ReportFormatter(Object object, FormatType formatType){
        switch(formatType){
            case XML:
                formattedOutput = convertObjectToXML(object);
                break;
            case CSV:
                formattedOutput = convertObjectToCSV(object);
                break;
        }
    }
    
    private String convertObjectToXML(Object object){
        return "XML: <title>" + object.toString() + "</title>";
        //TODO
    }

    private String convertObjectToCSV(Object object){
        //TODO
        return "CSV: ,,," + object.toString() + ",,,,,";
    }
    
    protected String getFormattedValue(){
        return formattedOutput;
    }
    
}
