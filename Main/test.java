package Main;
 import Student1.*;
 import java.util.*;
 import Course.*;
public class test {
    
    static List<Student>studentList=new ArrayList<>();
    
    public static void main(String[] args) 
    { 
        System.out.println("������������֣�");
        Scanner in0=new Scanner(System.in);
        String UserName=in0.nextLine();
        System.out.println("�𾴵ģ�"+UserName);
        System.out.println("!!!!!---------��ӭ����ѧ���ɼ�����ϵͳ---------!!!!!");
        List<Course>courses1=new ArrayList<>();
        Course c1=new Course("����", 61, 99, 78, 70, 98);
        Course c2=new Course("Java" , 66, 98, 87, 89, 88);
        Course c3=new Course("����", 93, 99, 58, 86, 86);
        courses1.add(c1);
        courses1.add(c2);
        courses1.add(c3);
        Student s1=new Student("С��","200301",20,courses1);
        s1.setCourses(courses1);
        studentList.add(s1);

        List<Course>courses2=new ArrayList<>();
        Course c4=new Course("����", 85, 96, 85, 96, 88);
        Course c5=new Course("Java", 86, 98, 30, 55, 68);
        Course c6=new Course("����", 85, 99, 95, 75, 90);
        courses2.add(c4);
        courses2.add(c5);
        courses2.add(c6);
        Student s2=new Student("С��","200211",22,courses2);
        s2.setCourses(courses2);
        studentList.add(s2);

        List<Course>courses3=new ArrayList<>();
        Course c7=new Course("����", 88, 99, 78, 74, 77);
        Course c8=new Course("Java", 89, 98, 65, 45, 66);
        Course c9=new Course("����", 95, 99, 78, 86, 80);
        courses3.add(c7);
        courses3.add(c8);
        courses3.add(c9);
        Student s3=new Student("С��","200213",18,courses3);
        s3.setCourses(courses3);
        studentList.add(s3);

        List<Course>courses4=new ArrayList<>();
        Course c10=new Course("����", 98, 99, 78, 76, 88);
        Course c11=new Course("Java", 85, 98, 30, 55, 96);
        Course c12=new Course("����", 58, 99, 88, 83, 89);
        courses4.add(c10);
        courses4.add(c11);
        courses4.add(c12);
        Student s4=new Student("С��","200212",18,courses4);
        s4.setCourses(courses4);
        studentList.add(s4);

        System.out.println("1,��ѯ�����Ŀ�����ɼ�");
        System.out.println("2,��ѯ����ѧ�����гɼ�");
        System.out.println("3,��ѯ�����Ŀ�����ɼ��ֲ�");
        System.out.println("4,�˳�ϵͳ");

        int flag=0;
        while(flag!=1)
        { 
            System.out.println("����������ѡ��Ĳ������(1/2/3/4):");
            Scanner in=new Scanner(System.in);
            int choice=in.nextInt();
            switch(choice){
            case 1:
            selectCourse();break;
            case 2:
            selectName();break;
            case 3:
            selectCourseGrade() ;break;
            case 4:
            System.out.println("�˳�ϵͳ�ɹ�������");
            flag=1;break;

        }
    }
       

    }
   public static void selectCourse()
    {       
           System.out.println("���п�Ŀ��:����/Java/����");
            System.out.println("������Ҫ��ѯ�Ŀ�Ŀ��");
            Scanner input=new Scanner(System.in);
            String courseName=input.nextLine();
            boolean temp = false;
            double sumGrade = 0;
            for (int i = 0; i < studentList.size(); i++) {
                for (int j = 0; j < studentList.get(i).getCourses().size(); j++) {
                    if (courseName.equals(studentList.get(i).getCourses().get(j).getCourseName())){
                        temp = true;
                        sumGrade += studentList.get(i).getCourses().get(j).getSumGrade();
                        System.out.println(studentList.get(i).getStuName()+"�������ǣ�"+studentList.get(i).getCourses().get(j).getSumGrade());
                    }
                }
            }
            if(!temp) {
                System.out.println("�ܱ�Ǹû���ҵ��ÿγ���Ϣ��");
            }else {
                System.out.println("����ѧ�����������ǣ�"+sumGrade);
            }
    }
    public static void selectName()
     {
        System.out.println("����ѧ���У�С��/С��/С��/С��");
        System.out.println("��������Ҫ��ѯ��ѧ��������");
        Scanner input=new Scanner(System.in);
        String name=input.nextLine();
        boolean temp = false;
        for (int i = 0; i < studentList.size(); i++) {
            if (name.equals(studentList.get(i).getStuName())){
                temp = true;
                System.out.println("������"+studentList.get(i).getStuName()+",ѧ�ţ�"+studentList.get(i).getStuID()+",���䣺"+studentList.get(i).getStuAge());
                System.out.println("��ѧ���ĳɼ��ǣ�");
                for (int j = 0; j < studentList.get(i).getCourses().size(); j++) {
                    System.out.println(studentList.get(i).getCourses().get(j).toString());
                }
            }
        }
        if (!temp){
            System.out.println("�ܱ�Ǹû���ҵ���ѧ����Ϣ��");
        }
    }
    public static void selectCourseGrade() 
    {System.out.println("\n���п�Ŀ�У�����/Java/����");
        System.out.println("��������Ҫ��ѯ�Ŀ�Ŀ��");
        Scanner input=new Scanner(System.in);
        String course=input.nextLine();
        int excellent = 0;
        int fine = 0;
        int qualified = 0;
        int disqualification = 0;
        for (int i = 0; i < studentList.size(); i++) {
            for (int j = 0; j < studentList.get(i).getCourses().size(); j++) {
                if (course.equals(studentList.get(i).getCourses().get(j).getCourseName()))
                { if (studentList.get(i).getCourses().get(j).getSumGrade()>=90 ){
                    excellent++;
                }else if (studentList.get(i).getCourses().get(j).getSumGrade()>=70){
                    fine++;
                }else if (studentList.get(i).getCourses().get(j).getSumGrade()>=60){
                    qualified++;
                }else if (studentList.get(i).getCourses().get(j).getSumGrade()>=0){
                    disqualification++; }
            } }}
        System.out.println("���㣺90-100�ֵ��У�"+excellent+"��");
        System.out.println("���ã�70-89�ֵ��У�"+fine+"��");
        System.out.println("�ϸ�60-69�ֵ��У�"+qualified+"��");
        System.out.println("���ϸ�0-59�ֵ��У�"+disqualification+"��");
    }


    
}
