
package Hospital_Management;
import java.util.Calendar;
import java.util.Scanner;


public class Hospital_Management_Project {
    String sid, sname, desg, sex;
    int salary;
    int phoneNumber;

    void new_staff() {
        Scanner input = new Scanner(System.in);
        System.out.print("tell id:-");
        sid = input.nextLine();
        System.out.print("say name:-");
        sname = input.nextLine();
        System.out.print("what is the desigination:-");
        desg = input.nextLine();
        System.out.print("say sex:-");
        sex = input.nextLine();
        System.out.print("tell salary:-");
        salary = input.nextInt();

    }

    void staff_info() {
        System.out.println(sid + "\t" + sname + "\t" + sex + "\t" + salary + "\t");
    }
}

class doctor {

    String did, dname, specilist, appoint, doc_qual;
    int droom;

    void new_doctor() {
        Scanner input = new Scanner(System.in);
        System.out.print("tell your id:-");
        did = input.nextLine();
        System.out.print("what is the name:-");
        dname = input.nextLine();
        System.out.print("what is the specilization:-");
        specilist = input.nextLine();
        System.out.print("what is the work time:-");
        appoint = input.nextLine();
        System.out.print("say your qualification:-");
        doc_qual = input.nextLine();
        System.out.print("what is the room no.:-");
        droom = input.nextInt();
    }

    void doctor_info() {
        System.out.println(did + "\t" + dname + "  \t" + specilist + "     \t" + appoint + "    \t" + doc_qual + "       \t" + droom);
    }
}

class patient {

    String pid, pname, disease, sex, admit_status,Treatingdoctor;
    int age;
    int phoneNumber;
   

    void new_patient() {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the id:-");
        pid = input.nextLine();
        System.out.print("enter the name:-");
        pname = input.nextLine();
        System.out.print("what is the disease:-");
        disease = input.nextLine();
        System.out.print("what is the sex:-");
        sex = input.nextLine();
        System.out.print("give your admit_status:-");
        admit_status = input.nextLine();
        System.out.print("tell your age:-");
        age = input.nextInt();
        System.out.println("give your Phone number:");
        phoneNumber = input.nextInt();
        System.out.println(" Treating doctor name:");
        Treatingdoctor = input.nextLine();
    }

    void patient_info() {
        System.out.println(pid + "\t" + pname + " \t" + disease + "\t" + sex + "\t" + admit_status + "\t"+ age + "\t" + phoneNumber+"\t" +Treatingdoctor );
    }
}

class medicine {

    String med_name, med_comp, exp_date;
    int med_cost, count;

    void new_medi() {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the name:-");
        med_name = input.nextLine();
        System.out.print("tell your comp:-");
        med_comp = input.nextLine();
        System.out.print("what is the exp_date:-");
        exp_date = input.nextLine();
        System.out.print("what is the cost:-");
        med_cost = input.nextInt();
        System.out.print("tell the no of unit:-");
        count = input.nextInt();
    }

    void find_medi() {
        System.out.println(med_name + "  \t" + med_comp + "    \t" + exp_date + "     \t" + med_cost);
    }
}

class lab {

    String fecility;
    int lab_cost;

    void new_feci() {
        Scanner input = new Scanner(System.in);
        System.out.print("which fecility:-");
        fecility = input.nextLine();
        System.out.print("how many cost:-");
        lab_cost = input.nextInt();
    }

    void feci_list() {
        System.out.println(fecility + "\t\t" + lab_cost);
    }
}

class fecility {

    String fec_name;
    String fac_roomnumber;

    void add_feci() {
        Scanner input = new Scanner(System.in);
        System.out.print("which fecility:-");
        fec_name = input.nextLine();
        System.out.print("room number:-");
        fac_roomnumber = input.nextLine();  
    }

    void show_feci() {
        System.out.println(fec_name);
        System.out.println(fac_roomnumber);
    }
}

class HospitalManagement {

    public static void main(String args[]) {
        String months[] = {
            "January",
            "February",
            "March",
            "April",
            "May",
            "June",
            "Juluy",
            "August",
            "September",
            "Octobar",
            "November",
            "December",};
        Calendar calendar = Calendar.getInstance();
        //System.out.println("--------------------------------------------------------------------------------");
        int count1 = 4, count2 = 4, count3 = 4, count4 = 4, count5 = 4, count6 = 4;
        System.out.println("\n--------------------------------------------------------------------------------");
        System.out.println("            *** Welcome to Hospital Management System Project LTD ***");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.print("Date: " + months[calendar.get(Calendar.MONTH)] + " " + calendar.get(Calendar.DATE) + " " + calendar.get(Calendar.YEAR));
        System.out.println("\t\t\t\t\tTime: " + calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND));
        doctor[] d = new doctor[52];
        patient[] p = new patient[1000];
        lab[] l = new lab[20];
        fecility[] f = new fecility[200];
        medicine[] m = new medicine[1000];
        Hospital_Management_Project[] s = new Hospital_Management_Project[1000];
        int no, pass;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter account no:");
        no = input.nextInt();
        System.out.println("Enter pass:");
        pass = input.nextInt();
        if (no == 12 && pass == 13) {
            
        }
        int i;
        for (i = 0; i < 25; i++) {
            d[i] = new doctor();
        }
        for (i = 0; i < 100; i++) {
            p[i] = new patient();
        }
        for (i = 0; i < 20; i++) {
            l[i] = new lab();
        }
        for (i = 0; i < 20; i++) {
            f[i] = new fecility();
        }
        for (i = 0; i < 100; i++) {
            m[i] = new medicine();
        }
        for (i = 0; i < 100; i++) {
            s[i] = new Hospital_Management_Project();
        }

        d[0].did = "21";
        d[0].dname = "Dr.sazzad";
        d[0].specilist = "Gynecologist";
        d[0].appoint = "5-12AM";
        d[0].doc_qual = "MBBS,MD";
        d[0].droom = 15;
        
        d[1].did = "33";
        d[1].dname = "Dr.amit roy";
        d[1].specilist = "chemist";
        d[1].appoint = "  \t10-13AM";
        d[1].doc_qual = "MBBS,MD";
        d[1].droom = 45;
        
        d[2].did = "30";
        d[2].dname = "Dr.Ria";
        d[2].specilist = "Surgeon";
        d[2].appoint = "  \t8-2AM";
        d[2].doc_qual = "MBBS,FCPS";
        d[2].droom =18;
        
        d[3].did = "33";
        d[3].dname = "Dr.Hasib";
        d[3].specilist = "Artho";
        d[3].appoint = "  \t10-4PM";
        d[3].doc_qual = "MBBS,MS";
        d[3].droom = 40;

        p[0].pid = "12";
        p[0].pname = "Salman";
        p[0].disease = "\tCancer";
        p[0].sex = "\tMale";
        p[0].admit_status = "\ty";
        p[0].age = 30;
        p[0].phoneNumber= 0123454;
        p[0].Treatingdoctor= "\tDr.Nusrat";
        
        p[1].pid = "13";
        p[1].pname = "Sumaiya";
        p[1].disease = "Cold";
        p[1].sex = "\tFemale";
        p[1].admit_status = "\ty";
        p[1].age = 23;
        p[1].phoneNumber= 0123;
        p[1].Treatingdoctor= "\tDr.Ria";
        System.out.println(" ");
        
        p[2].pid = "14";
        p[2].pname = "Ovi";
        p[2].disease = "\tMaleriya";
        p[2].sex = "Male";
        p[2].admit_status = "\ty";
        p[2].age = 45;
        p[2].phoneNumber= 0123457;
        p[2].Treatingdoctor= "\tDr.Ria";
        
        p[3].pid = "15";
        p[3].pname = "Rijvi";
        p[3].disease = "\tDiabetes";
        p[3].sex = "Male";
        p[3].admit_status = "\ty";
        p[3].age = 25;
        p[3].phoneNumber= 012345;
        p[3].Treatingdoctor= "\tDr.Nusrat";

        m[0].med_name = "Corex";
        m[0].med_comp = "Square";
        m[0].exp_date = "9-5-16";
        m[0].med_cost = 55;
        m[0].count = 8;
        
        m[1].med_name = "Nytra";
        m[1].med_comp = "B-pharma";
        m[1].exp_date = "4-4-15";
        m[1].med_cost = 500;
        m[1].count = 5;
        
        m[2].med_name = "Brufa";
        m[2].med_comp = "ACI\t";
        m[2].exp_date = "12-7-17";
        m[2].med_cost = 50;
        m[2].count = 56;
        
        m[3].med_name = "Pride";
        m[3].med_comp = "DDF pvt";
        m[3].exp_date = "12-4-12";
        m[3].med_cost = 1100;
        m[3].count = 100;

        l[0].fecility = "X-ray     ";
        l[0].lab_cost = 800;
        l[1].fecility = "CT Scan   ";
        l[1].lab_cost = 1200;
        l[2].fecility = "OR Scan   ";
        l[2].lab_cost = 500;
        l[3].fecility = "Blood Bank";
        l[3].lab_cost = 50;

        f[0].fec_name = "Ambulance";
        f[1].fec_name = "Admit Facility ";
        f[2].fec_name = "Canteen";
        f[3].fec_name = "Emergency";
        
        f[0].fac_roomnumber = " icu 201";
        f[1].fac_roomnumber = "General ward 202";
        f[2].fac_roomnumber = "Child room 203";
        f[3].fac_roomnumber = "Emergency ward 204";

        s[0].sid = "22";
        s[0].sname = "Kamal";
        s[0].desg = "Worker";
        s[0].sex = "Male";
        s[0].salary = 5000;
        
        s[1].sid = "23";
        s[1].sname = "Jamal";
        s[1].desg = "Nurse";
        s[1].sex = "Female";
        s[1].salary = 2000;
        
        s[2].sid = "24";
        s[2].sname = "Raju";
        s[2].desg = "Worker";
        s[2].sex = "Male";
        s[2].salary = 5000;
        
        s[3].sid = "25";
        s[3].sname = "Rani";
        s[3].desg = "Nurse";
        s[3].sex = "Female";
        s[3].salary = 20000;

        
        int choice, j, c1, status = 1, s1 = 1, s2 = 1, s3 = 1, s4 = 1, s5 = 1, s6 = 1;
        while (status == 1) {
            System.out.println("\n                                    MAIN MENU");
            System.out.println("---------------------------------------------------------------------------------------------");
            System.out.println("1.Doctos     2.Patients     3.Medicines     4.Laboratories     5.Facilities     6.Staff ");
            System.out.println("---------------------------------------------------------------------------------------------");
            choice = input.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("                      **DOCTOR SECTION**");
                    System.out.println("--------------------------------------------------------------------------------");
                    s1 = 1;
                    while (s1 == 1) {
                        System.out.println("1.Add New Entry\n2.Existing Doctors List");
                        c1 = input.nextInt();
                        switch (c1) {
                            case 1: {
                                d[count1].new_doctor();
                                count1++;
                                break;
                            }
                            case 2: {
                                System.out.println("------------------------------------------------------------------------------------------");
                                System.out.println("id \t Name\t \t Specilist \t \tTiming \t \tQualification \t Room No.");
                                System.out.println("------------------------------------------------------------------------------------------"
                                        + "");
                                for (j = 0; j < count1; j++) {
                                    d[j].doctor_info();
                                }
                                break;
                            }
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s1 = input.nextInt();
                    }
                    break;
                }
                case 2: {
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("                     **PATIENT SECTION**");
                    System.out.println("--------------------------------------------------------------------------------");
                    s2 = 1;
                    while (s2 == 1) {
                        System.out.println("1.Add New Entry\n2.Existing Patients List");
                        c1 = input.nextInt();
                        switch (c1) {
                            case 1: {
                                p[count2].new_patient();
                                count2++;
                                break;
                            }
                            case 2: {
                                System.out.println("--------------------------------------------------------------------------------------------------");
                                System.out.println("id \t Name\t  \tDisease \tGender \t  Admit Status \tAge \tphoneNumber \tTreatingdoctor");
                                System.out.println("---------------------------------------------------------------------------------------------------");
                                for (j = 0; j < count2; j++) {
                                    p[j].patient_info();
                                }
                                break;
                            }
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s2 = input.nextInt();
                    }
                    break;
                }
                case 3: {
                    s3 = 1;
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("                     **MEDICINE SECTION**");
                    System.out.println("--------------------------------------------------------------------------------");
                    while (s3 == 1) {
                        System.out.println("1.Add New Entry\n2. Existing Medicines List");
                        c1 = input.nextInt();
                        switch (c1) {
                            case 1: {
                                m[count3].new_medi();
                                count3++;
                                break;
                            }
                            case 2: {
                                System.out.println("--------------------------------------------------------------------------------");
                                System.out.println("Name \t Company \t Expiry Date \t Cost");
                                System.out.println("--------------------------------------------------------------------------------");
                                for (j = 0; j < count3; j++) {
                                    m[j].find_medi();
                                }
                                break;
                            }
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s3 = input.nextInt();
                    }
                    break;
                }
                case 4: {
                    s4 = 1;
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("                    **LABORATORY SECTION**");
                    System.out.println("--------------------------------------------------------------------------------");
                    while (s4 == 1) {
                        System.out.println("1.Add New Entry \n2.Existing Laboratories List");
                        c1 = input.nextInt();
                        switch (c1) {
                            case 1: {
                                l[count4].new_feci();
                                count4++;
                                break;
                            }
                            case 2: {
                                System.out.println("--------------------------------------------------------------------------------");
                                System.out.println("Fecilities\t\t Cost");
                                System.out.println("--------------------------------------------------------------------------------");
                                for (j = 0; j < count4; j++) {
                                    l[j].feci_list();
                                }
                                break;
                            }
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s4 = input.nextInt();
                    }
                    break;
                }
                case 5: {
                    s5 = 1;
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("          **HOSPITAL FACILITY SECTION**");
                    System.out.println("--------------------------------------------------------------------------------");
                    while (s5 == 1) {
                        System.out.println("1.Add New Facility\n2.Existing Fecilities List");
                        c1 = input.nextInt();
                        switch (c1) {
                            case 1: {
                                f[count5].add_feci();
                                count5++;
                                break;
                            }
                            case 2: {
                                System.out.println("--------------------------------------------------------------------------------");
                                System.out.println("Hospital  Facility are:");
                                System.out.println("--------------------------------------------------------------------------------");
                                for (j = 0; j < count5; j++) {
                                    f[j].show_feci();
                                }
                                break;
                            }
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s5 = input.nextInt();
                    }
                    break;
                }
                case 6: {
                    s6 = 1;
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("                       **STAFF SECTION**");
                    System.out.println("--------------------------------------------------------------------------------");
                    while (s6 == 1) {
                        String a = "nurse", b = "worker", c = "security";
                        System.out.println("1.Add New Entry \n2.Existing Nurses List\n3.Existing Workers List \n4.Existing Security List");
                        c1 = input.nextInt();
                        switch (c1) {
                            case 1: {
                                s[count6].new_staff();
                                count6++;
                                break;
                            }
                            case 2: {
                                System.out.println("--------------------------------------------------------------------------------");
                                System.out.println("id \t Name \t Gender \t Salary");
                                System.out.println("--------------------------------------------------------------------------------");
                                for (j = 0; j < count6; j++) {
                                    if (a.equals(s[j].desg)) {
                                        s[j].staff_info();
                                    }
                                }
                                break;
                            }
                            case 3: {
                                System.out.println("--------------------------------------------------------------------------------");
                                System.out.println("id \t Name \t Gender \t Salary");
                                System.out.println("--------------------------------------------------------------------------------");
                                for (j = 0; j < count6; j++) {
                                    if (b.equals(s[j].desg)) {
                                        s[j].staff_info();
                                    }
                                }
                                break;
                            }
                            case 4: {
                                System.out.println("--------------------------------------------------------------------------------");
                                System.out.println("id \t Name \t Gender \t Salary");
                                System.out.println("--------------------------------------------------------------------------------");
                                for (j = 0; j < count6; j++) {
                                    if (c.equals(s[j].desg)) {
                                        s[j].staff_info();
                                    }
                                }
                                break;
                            }
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s6 = input.nextInt();
                    }
                    break;
                }
                default: {
                    System.out.println(" You Have Enter Wrong Choice!!!");
                }
            }
            System.out.println("\nReturn to MAIN MENU Press 1");
            status = input.nextInt();
        }
    }
}

    
