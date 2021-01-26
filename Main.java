package EAF;

public class Main {

    public static void main(String[] args) {

        //For Assignment 1, I am hard-coding employee data
        Employee associate = new Associate("Brady", "Drew", "123-45-8764", "One Main St., Boston, MA 02110",
                "1/5/2021", "Business", "Associate", "dbrady@choate.com", "6589",
                "30", "30-8760");

        Employee partner = new Partner("Tom", "Smith", "123-45-8899", "One Maple St., Boston, MA 02110",
                "1/5/2021", "Litigation", "Partner", "tsmith@choate.com", "9730",
                "35", "35-9834");

        //Store the two objects in an array
        Employee[] employees = new Employee[2];
        employees[0] = associate;
        employees[1] = partner;

        for (Employee currentEmployee : employees) {
            System.out.print( "\n" +currentEmployee);
            //Polymorphism example
            //Each object in the array invokes a different getBillingRate
            System.out.println("Billing Rate: "+currentEmployee.getBillingRate());

            //Downcasting example
            //If the current employee object is a partner
            if (currentEmployee instanceof Partner){
                System.out.println("Partner Draw Account: "+((Partner)currentEmployee).getPartnerDrawAccount());
            }

        }


    }
}
