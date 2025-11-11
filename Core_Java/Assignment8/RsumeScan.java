package Assignment8;

public class RsumeScan {
    abstract class JobRole { String title; JobRole(String t){title=t;} }
    class SoftwareEngineer extends JobRole { SoftwareEngineer(String t){super(t);} }
    class DataScientist extends JobRole { DataScientist(String t){super(t);} }

    class Resume<T extends JobRole> {
        private T role;
        Resume(T r){ this.role = r; }
        void process(){ System.out.println("Processing resume for " + role.title); }
    }

    class ResumeUtil {
        public static void handleResumes(List<? extends JobRole> roles) {
            for (JobRole r : roles) System.out.println("Screening: " + r.title);
        }
    }

}
