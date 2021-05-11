package abstrak;
/* @author Irsyad */
public class AmbilKaryawan extends TableKaryawan{
    
    public static void main(String[] args) {
        AmbilKaryawan karyawan = new AmbilKaryawan();
        System.out.println(karyawan.dbSelect());
        System.out.println(karyawan.dbDelete("12345"));
        System.out.println(karyawan.dbUpdate("nama", "HENDRA", "12345"));
    }

    @Override
    public String dbSelect() {
        return "SELECT * FROM " + TableKaryawan.TBLNAME;
    }

    @Override
    public String dbDelete(String id) {
        return "DELETE FROM " + TableKaryawan.TBLNAME + " " + 
                "WHERE id = '" + id + "'";
    }

    @Override
    public String dbUpdate(String field, String value, String id) {
        return "UPDATE " + TableKaryawan.TBLNAME + " " + 
                "SET " + field + " = '" + value + "' " +
                "WHERE id = '" + id + "'";
    }
    
}
