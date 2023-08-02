package InterfacesAbstract.epam.string_ex;

public class CutService extends BaseService{
    @Override
    public String change(String str) {
        return str.substring(3);
    }
}
