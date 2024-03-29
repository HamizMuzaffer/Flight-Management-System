

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;


class detailsFrame extends JFrame {

    JLabel labelFrom, labelTo, labelDepartDate, labelReturnDate, labelTravelType, labelSpecialNeeds
            , labelCabinClass, labelSeatPreference, labelBaggageAllowance , labelAgeGroup , labelFlightType;
    JTextField txtFrom, txtTo;
    JComboBox<String> departDayComboBox, departMonthComboBox, departYearComboBox;
    JComboBox<String> returnDayComboBox, returnMonthComboBox, returnYearComboBox;
    JRadioButton internationalRadioButton, domesticRadioButton;
    ButtonGroup travelTypeButtonGroup;
    JTextArea txtSpecialNeeds;
    JButton openFormButton;
    JComboBox<String> cabinClassComboBox, baggageAllowanceComboBox, ageGroupComboBox;
    JRadioButton windowSeatRadioButton, aisleSeatRadioButton, middleSeatRadioButton;
    ButtonGroup seatPreferenceButtonGroup;
    JComboBox<String> flightTypeComboBox;
    JButton submitButton;
    

detailsFrame() {
        setTitle("Flight Details");
        setSize(600, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setBackground(new Color(0x0096FF));
        Container c = getContentPane();
        c.setLayout(null);
        

        
        labelFrom = new JLabel("Origin:");
        labelFrom.setBounds(50, 50, 80, 25);
        c.add(labelFrom);

        txtFrom = new JTextField(20);
        txtFrom.setBounds(90, 50, 150, 25);
        c.add(txtFrom);

        
        labelTo = new JLabel("Destination:");
        labelTo.setBounds(250, 50, 100, 25);
        c.add(labelTo);

        txtTo = new JTextField(20);
        txtTo.setBounds(320, 50, 150, 25);
        c.add(txtTo);

        
        labelDepartDate = new JLabel("Departure Date:");
        labelDepartDate.setBounds(50, 90, 120, 20);                         //edited
        c.add(labelDepartDate);

        String[] days = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13",
                "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26",
                "27", "28", "29", "30", "31"};
        
        departDayComboBox = new JComboBox<>(days);
        departDayComboBox.setBounds(150, 90, 40, 20);                  //edit
        c.add(departDayComboBox);

        String[] months = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        
        departMonthComboBox = new JComboBox<>(months);
        departMonthComboBox.setBounds(192, 90, 100, 20);               //edited
        c.add(departMonthComboBox);

        String[] years = {"2024", "2025", "2026", "2027", "2028", "2029", "2030"};
        departYearComboBox = new JComboBox<>(years);
        departYearComboBox.setBounds(294, 90, 70, 20);                //editef               
        c.add(departYearComboBox);

        // Return Date Label and ComboBoxes
        labelReturnDate = new JLabel("Return Date:");
        labelReturnDate.setBounds(50, 120, 120, 20);               //edit
        c.add(labelReturnDate);

        returnDayComboBox = new JComboBox<>(days);
        returnDayComboBox.setBounds(150, 120, 40, 20);              //ed
        c.add(returnDayComboBox);

        returnMonthComboBox = new JComboBox<>(months);
        returnMonthComboBox.setBounds(192, 120, 100, 20);             //edt
        c.add(returnMonthComboBox);

        returnYearComboBox = new JComboBox<>(years);
        returnYearComboBox.setBounds(294, 120, 70, 20);          //ed
        c.add(returnYearComboBox);

        // Travel Type Radio Buttons
        labelTravelType = new JLabel("Travel Type:");
        labelTravelType.setBounds(50, 150, 100, 25);         //50, 200, 100, 30  edit
        c.add(labelTravelType);

        internationalRadioButton = new JRadioButton("International");
        internationalRadioButton.setBounds(150, 150, 110, 25);
        c.add(internationalRadioButton);

        domesticRadioButton = new JRadioButton("Domestic");
        domesticRadioButton.setBounds(270, 150, 100, 25);             //edied
        c.add(domesticRadioButton);

        travelTypeButtonGroup = new ButtonGroup();
        travelTypeButtonGroup.add(internationalRadioButton);
        travelTypeButtonGroup.add(domesticRadioButton);
        
        // Cabin Class ComboBox
        labelCabinClass = new JLabel("Cabin Class:");
        labelCabinClass.setBounds(50, 180, 100, 25);
        c.add(labelCabinClass);

        String[] cabinClasses = {"Economy", "Premium Economy", "Business", "First Class"};
        cabinClassComboBox = new JComboBox<>(cabinClasses);
        cabinClassComboBox.setBounds(150, 180, 120, 22);             //edtt
        c.add(cabinClassComboBox);

        // Seat Preference Radio Buttons
        labelSeatPreference = new JLabel("Seat Preference:");
        labelSeatPreference.setBounds(50, 210, 110, 25);
        c.add(labelSeatPreference);

        windowSeatRadioButton = new JRadioButton("Window Seat");
        windowSeatRadioButton.setBounds(150, 210, 110, 25);
        c.add(windowSeatRadioButton);

        aisleSeatRadioButton = new JRadioButton("Aisle Seat");
        aisleSeatRadioButton.setBounds(270, 210, 100, 25);
        c.add(aisleSeatRadioButton);

        middleSeatRadioButton = new JRadioButton("Middle Seat");
        middleSeatRadioButton.setBounds(370, 210, 100, 25);
        c.add(middleSeatRadioButton);

        seatPreferenceButtonGroup = new ButtonGroup();
        seatPreferenceButtonGroup.add(windowSeatRadioButton);
        seatPreferenceButtonGroup.add(aisleSeatRadioButton);
        seatPreferenceButtonGroup.add(middleSeatRadioButton);
        
        // Age Group ComboBox
        labelAgeGroup = new JLabel("Age Group:");
        labelAgeGroup.setBounds(50, 235, 150, 25);
        c.add(labelAgeGroup);

        String[] ageGroups = {"Adult", "Infant", "Child", "Senior Citizen", "Special Assistance"};
        ageGroupComboBox = new JComboBox<>(ageGroups);
        ageGroupComboBox.setBounds(150, 235, 150, 22);
        c.add(ageGroupComboBox);
        
        // Flight Type Combo BoxlabelFlightType
        labelFlightType = new JLabel("Flight Type:");
        labelFlightType.setBounds(50, 265, 100, 25);
        c.add(labelFlightType);

        String[] flightTypes = {"Return Flight", "One Way Flight", "Direct Flight"};
        flightTypeComboBox = new JComboBox<>(flightTypes);
        flightTypeComboBox.setBounds(150, 265, 200, 22);
        c.add(flightTypeComboBox);
        
        
        // Baggage Allowance ComboBox
        labelBaggageAllowance = new JLabel("Baggage Allowance:");
        labelBaggageAllowance.setBounds(50, 295, 150, 25);
        c.add(labelBaggageAllowance);

        String[] baggageAllowanceOptions = {"Cabin Baggage", "Check-in Baggage", "Both"};
        baggageAllowanceComboBox = new JComboBox<>(baggageAllowanceOptions);
        baggageAllowanceComboBox.setBounds(200, 295, 150, 22);
        c.add(baggageAllowanceComboBox);
        
        // Special Needs or Requests Label and TextArea
        labelSpecialNeeds = new JLabel("Special Needs or Requests, if any:");
        labelSpecialNeeds.setBounds(50, 330, 200, 30);
        c.add(labelSpecialNeeds);

        txtSpecialNeeds = new JTextArea();
        txtSpecialNeeds.setLineWrap(true); // Enable line wrapping
        JScrollPane specialNeedsScrollPane = new JScrollPane(txtSpecialNeeds); // Add scrollbar
        specialNeedsScrollPane.setBounds(50, 355, 450, 100);
        c.add(specialNeedsScrollPane);
        
        openFormButton = new JButton("CLICK ME TO EXPLORE OUR SERVICES! ");
        openFormButton.setBounds(50, 455, 450, 30);
        openFormButton.setBackground(Color.BLACK);
        openFormButton.setForeground(Color.white);
        openFormButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openFormDialog();
            }
        });
        getContentPane().add(openFormButton);
        
        submitButton = new JButton("Confirm Flight");
        submitButton.setBackground(Color.BLACK);
        submitButton.setForeground(Color.white);
        submitButton.setBounds(190, 490, 200, 30);
        c.add(submitButton);

        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
            	payFrame frame = new payFrame();
                frame.setVisible(true);
               
            	
            }
        });}
private void openFormDialog() {
    JDialog formDialog = new JDialog(this, "Our Services", true);
    formDialog.setSize(400, 400);
    formDialog.setLocationRelativeTo(null); // Center the dialog
    formDialog.setLayout(new BorderLayout()); // Use BorderLayout for better layout management
    formDialog.setResizable(false);
    

    JLabel headingLabel = new JLabel("<html><h1> Passenger Assistance and Special Requests </h1></html>");
    formDialog.add(headingLabel, BorderLayout.NORTH);

    JLabel contentLabel = new JLabel("<html>"
        + "<ul>"
        + "<li>Medical Conditions: Inform us of any medical conditions requiring special assistance.</li>"
        + "<li>Wheelchair Assistance: Let us know if you need help boarding or navigating the airport.</li>"
        + "<li>Visual or Hearing Impairments: Request assistance for visual or hearing needs.</li>"
        + "<li>Dietary Restrictions: Specify any dietary preferences or restrictions.</li>"
        + "<li>Language Assistance: Request translation services if needed.</li>"
        + "<li>Traveling with Infants/Children: Ask for amenities or child-friendly seating.</li>"
        + "<li>Pet Accommodation: Arrange for pet travel in advance.</li>"
        + "<li>Assistance with Personal Devices: Notify us of any medical device needs.</li>"
        + "<li>Seating Preferences: Choose preferred seating options.</li>"
        + "<li>Emotional Support Animals: Inform us if you're traveling with an emotional support animal.</li>"
        + "<li>Assistance for Unaccompanied Minors: Arrange for special care for minors traveling alone.</li>"
        + "<li>Assistance for Elderly Passengers: Request support for elderly passengers.</li>"
        + "<li>Oxygen Requirements: Inform us of any oxygen needs during the flight.</li>"
        + "<li>Allergy Considerations: Notify us of any allergy concerns.</li>"
        + "<li>Seat Belt Extenders: Request additional seat belt extenders if needed.</li>"
        + "<li>Support for Anxiety or Mental Health Conditions: Ask for assistance for mental health needs.</li>"
        + "<li>Transportation Assistance: Arrange for airport transportation if required.</li>"
        + "<li>Religious Accommodations: Specify any religious dietary or observance requirements.</li>"
        + "<li>Accessibility in Airport Facilities: Request accessibility accommodations.</li>"
        + "<li>Assistance with Baggage: Ask for help with luggage handling or transportation.</li>"
        + "</ul>"
        + "</html>");

    contentLabel.setPreferredSize(new Dimension(380, contentLabel.getPreferredSize().height));
    JScrollPane scrollPane = new JScrollPane(contentLabel);
    scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
    formDialog.add(scrollPane, BorderLayout.CENTER);

    JButton exitButton = new JButton("Exit");
    exitButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            formDialog.dispose();
        }
    });
        formDialog.add(exitButton, BorderLayout.SOUTH);
        formDialog.setVisible(true);
    }
}

public class Details {
    public static void main(String[] args) {
        detailsFrame frame = new detailsFrame();
        frame.setVisible(true);
    }
}
