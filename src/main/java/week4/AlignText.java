package week4;

public class AlignText {

    public static void main(String[] args) {

        int[] classCode =  {2345, 2505,2560};
        String[] className = { "Java", "C#", "Web"};
        double[] averageClassSize = { 22.34233, 17.42323, 14.234234};

        String templateString = "%-10s%-10s%-10s\n";
        System.out.printf(templateString, "Code", "Name", "Average Size");

        String tabletemplateString = "%-10d%-10s%-10.2f\n";
        for (int c = 0; c < classCode.length; c++) {
            int code = classCode[c];
            String name = className[c];
            double averageClassSizes = averageClassSize[c];
            System.out.printf(tabletemplateString, code , name, averageClassSizes);
         //   System.out.println();
        }
    }
}
