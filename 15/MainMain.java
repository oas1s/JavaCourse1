import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainMain {
    public static void main(String[] args) throws Exception {
        InputStreamReader in =
                new InputStreamReader(new FileInputStream("laptops.csv"));
        String s = "";
        int nextChar;
        while ((nextChar = in.read()) != -1) {
            s += (char) nextChar;
        }
        System.out.println(s);
        String[] strings = s.split("\\r\\n");
        List<Laptop> list = new ArrayList<>();
        for (String ss: strings){
            String[] sss = ss.split(",");
            list.add(new Laptop(sss[1],sss[2],Double.parseDouble(sss[3]),null));
        }
        System.out.println(list.stream().collect(Collectors.groupingBy(Laptop::getCpuName))
                .entrySet().stream().max(Comparator.comparingInt(x -> x.getValue().size()))
                .get().getKey());
    }


    static class Laptop{
        String company;
        String typeName;
        Double inches;
        String cpuName;


        public Laptop(String company, String typeName, Double inches, String cpuName) {
            this.company = company;
            this.typeName = typeName;
            this.inches = inches;
            this.cpuName = cpuName;
        }

        public String getCompany() {
            return company;
        }

        public void setCompany(String company) {
            this.company = company;
        }

        public String getTypeName() {
            return typeName;
        }

        public void setTypeName(String typeName) {
            this.typeName = typeName;
        }

        public Double getInches() {
            return inches;
        }

        public void setInches(Double inches) {
            this.inches = inches;
        }

        public String getCpuName() {
            return cpuName;
        }

        public void setCpuName(String cpuName) {
            this.cpuName = cpuName;
        }
    }
}
