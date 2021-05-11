package abstrak;
/* @author Irsyad */
public abstract class TableKaryawan {

    public static final String TBLNAME = "karyawan";
    
    public abstract String dbSelect();
    
    public abstract String dbDelete(String id);

    public abstract String dbUpdate(String field, String value, String id);
    
}
