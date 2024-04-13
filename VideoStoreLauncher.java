import java.util.*;
import javax.swing.*;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mainWindow extends JFrame implements ActionListener{
	
	public JLabel heading,ins, enter;
//	public JTextField choice;
	public JButton l1,l2,l3,l4,l5,l6;
	
	public mainWindow() {
		mainWindowStructure();
		mainWindowProperties();
		
	}
	
	public void mainWindowProperties() {
		setSize(500,700);
		setTitle("LIBRARY MANAGEMENT");
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void mainWindowStructure() {
		
		////////////heading/////////////
		heading= new JLabel();
		heading.setText("~~~WELCOME TO THE GLOBAL LIBRARY~~~");
		heading.setBounds(80,30,400,70);
		add(heading);
		
		///////////ins///////////////
		ins= new JLabel();
		ins.setText("INSTRUCTIONS :");
		ins.setBounds(30,100,150,40);
		add(ins);
		
        ///////////l1///////////////
		l1= new JButton();
		l1.setText("~Add a video ");
		l1.addActionListener(this);
		l1.setBounds(30,140,400,40);
		add(l1);
		
		
        ///////////l2///////////////
		l2= new JButton();
		l2.setText("~Check out a video ");
		l2.addActionListener(this);
		l2.setBounds(30,180,400,40);
		add(l2);
        
		///////////l3///////////////
		l3= new JButton();
		l3.setText("~Return a video ");
		l3.addActionListener(this);
		l3.setBounds(30,220,400,40);
		add(l3);
		
        ///////////l4///////////////
		l4= new JButton();
		l4.setText("~ Give a rating");
		l4.addActionListener(this);
		l4.setBounds(30,260,400,40);
		add(l4);
		
		l5= new JButton();
		l5.setText("~List Inventory ");
		l5.addActionListener(this);
		l5.setBounds(30,300,400,40);
		add(l5);
		
		l6= new JButton();
		l6.setText("~ Get Average User Rating ");
		l6.addActionListener(this);
		l6.setBounds(30,340,400,40);
		add(l6);
		
		
        
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==l1) {
//			window1 w1= new window1();
			new window1();
            setVisible(false);
		}
		
		if (e.getSource()==l2) {
			new window2();
            setVisible(false);
		}
		if (e.getSource()==l3) {
			new window3();
            setVisible(false);
		}
		if (e.getSource()==l4) {
			new window4();
            setVisible(false);
		}
		if (e.getSource()==l5) {
VideoStore.listInventory();
			
		}
		if (e.getSource()==l6) {
			new window6();
            setVisible(false);
		}
		
	}
	}

	
	


class window1 extends JFrame implements ActionListener{
	public JLabel heading1, label1, title1;
	public JTextField vidName;
	public JButton submit1;
	
	public window1() {
		window1_structure();
		set_window1_Properties();
	}
	
	public void set_window1_Properties() {
	      setSize(500,700);
	      setTitle("BORROW BOOK");
	      setLayout(null);
	      setVisible(true);
	      setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void window1_structure() {
		
		
		heading1= new JLabel();
		heading1.setText("~~~WELCOME TO THE GLOBAL LIBRARY~~~");
		heading1.setBounds(80,30,400,70);
		add(heading1);
		
		heading1= new JLabel();
		heading1.setText("Add A Video");
		heading1.setBounds(80,130,400,70);
		add(heading1);
		
		label1= new JLabel();
		label1.setText("Enter video title: ");
		label1.setBounds(180,240,400,40);
		add(label1);
		
		vidName= new JTextField();
		vidName.setBounds(180,290,100,30);
		add(vidName);
		
		submit1= new JButton();
		submit1.setText("SUBMIT");
		submit1.addActionListener(this);
		submit1.setBounds(180,350,150,40);
		add(submit1);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==submit1) {
		VideoStore.addVideo(vidName.getText());
		new mainWindow();
        setVisible(false);
		}
		
	}
}

class window2 extends JFrame implements ActionListener{
	public JLabel heading1, label1;
	public JTextField vidName;
	public JButton submit1;
	
	public window2() {
		window2_structure();
		set_window2_Properties();
	}
	
	public void set_window2_Properties() {
	      setSize(500,700);
	      setTitle("BORROW BOOK");
	      setLayout(null);
	      setVisible(true);
	      setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void window2_structure() {
		
		
		heading1= new JLabel();
		heading1.setText("~~~WELCOME TO THE GLOBAL LIBRARY~~~");
		heading1.setBounds(80,30,400,70);
		add(heading1);
		
		heading1= new JLabel();
		heading1.setText("Check out a video");
		heading1.setBounds(80,130,400,70);
		add(heading1);
		
		label1= new JLabel();
		label1.setText("Enter video title: ");
		label1.setBounds(180,240,400,40);
		add(label1);
		
		vidName= new JTextField();
		vidName.setBounds(180,290,100,30);
		add(vidName);
		
		submit1= new JButton();
		submit1.setText("SUBMIT");
		submit1.addActionListener(this);
		submit1.setBounds(180,350,150,40);
		add(submit1);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==submit1) {
		VideoStore.checkOut(vidName.getText());
		new mainWindow();
        setVisible(false);
		}
		
	}
}


class window3 extends JFrame implements ActionListener{
	public JLabel heading1, label1, title1;
	public JTextField vidName;
	public JButton submit1;
	
	public window3() {
		window3_structure();
		set_window3_Properties();
	}
	
	public void set_window3_Properties() {
	      setSize(500,700);
	      setTitle("BORROW BOOK");
	      setLayout(null);
	      setVisible(true);
	      setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void window3_structure() {
		
		
		heading1= new JLabel();
		heading1.setText("~~~WELCOME TO THE GLOBAL LIBRARY~~~");
		heading1.setBounds(80,30,400,70);
		add(heading1);
		
		heading1= new JLabel();
		heading1.setText("Return a video");
		heading1.setBounds(80,130,400,70);
		add(heading1);
		
		label1= new JLabel();
		label1.setText("Enter video title: ");
		label1.setBounds(180,240,400,40);
		add(label1);
		
		vidName= new JTextField();
		vidName.setBounds(180,290,100,30);
		add(vidName);
		
		submit1= new JButton();
		submit1.setText("SUBMIT");
		submit1.addActionListener(this);
		submit1.setBounds(180,350,150,40);
		add(submit1);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==submit1) {
		VideoStore.returnVideo(vidName.getText());
		new mainWindow();
        setVisible(false);
		}
		
	}
}

class window4 extends JFrame implements ActionListener{
	public JLabel heading1, label1, label2;
	public JTextField vidName, rating;
	public JButton submit1;
	
	public window4() {
		window4_structure();
		set_window4_Properties();
	}
	
	public void set_window4_Properties() {
	      setSize(500,700);
	      setTitle("BORROW BOOK");
	      setLayout(null);
	      setVisible(true);
	      setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void window4_structure() {
		
		
		heading1= new JLabel();
		heading1.setText("~~~WELCOME TO THE GLOBAL LIBRARY~~~");
		heading1.setBounds(80,30,400,70);
		add(heading1);
		
		heading1= new JLabel();
		heading1.setText("Give a rating");
		heading1.setBounds(80,130,400,70);
		add(heading1);
		
		label1= new JLabel();
		label1.setText("Enter video title: ");
		label1.setBounds(180,240,400,40);
		add(label1);
		
		vidName= new JTextField();
		vidName.setBounds(180,290,100,30);
		add(vidName);
		
		label2= new JLabel();
		label2.setText("Enter ratings out of 5: ");
		label2.setBounds(180,330,400,40);
		add(label2);
		
		rating= new JTextField();
		rating.setBounds(180,380,100,30);
		add(rating);
		
		submit1= new JButton();
		submit1.setText("SUBMIT");
		submit1.addActionListener(this);
		submit1.setBounds(180,450,150,40);
		add(submit1);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==submit1) {
		VideoStore.receiveRating(vidName.getText(),Integer.parseInt(rating.getText()));
		new mainWindow();
        setVisible(false);
		}
		
	}
}

class window6 extends JFrame implements ActionListener{
	public JLabel heading1, label1, title1;
	public JTextField vidName;
	public JButton submit1;
	
	public window6() {
		window6_structure();
		set_window6_Properties();
	}
	
	public void set_window6_Properties() {
	      setSize(500,700);
	      setTitle("BORROW BOOK");
	      setLayout(null);
	      setVisible(true);
	      setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void window6_structure() {
		
		
		heading1= new JLabel();
		heading1.setText("~~~WELCOME TO THE GLOBAL LIBRARY~~~");
		heading1.setBounds(80,30,400,70);
		add(heading1);
		
		heading1= new JLabel();
		heading1.setText("Return a video");
		heading1.setBounds(80,130,400,70);
		add(heading1);
		
		label1= new JLabel();
		label1.setText("Enter video title: ");
		label1.setBounds(180,240,400,40);
		add(label1);
		
		vidName= new JTextField();
		vidName.setBounds(180,290,100,30);
		add(vidName);
		
		submit1= new JButton();
		submit1.setText("SUBMIT");
		submit1.addActionListener(this);
		submit1.setBounds(180,350,150,40);
		add(submit1);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==submit1) {
		VideoStore.getAvgRating(vidName.getText());
		new mainWindow();
        setVisible(false);
		}
		
	}
}



class Video {
	private String title;
	private boolean checkedOut;
	public double userRating;

	public void setTitle(String videoTitle) {
		this.title = videoTitle;
	}

	public String getTitle() {
		return this.title;
	}

	public void setCheckedOutStatus(boolean f) {
		this.checkedOut = f;
	}

	public boolean getCheckedOutStatus() {
		return this.checkedOut;
	}

	public void setUserRating(double userRating) {
		this.userRating = userRating;
	}

	public double getUserRating() {
		return this.userRating;
	}
}

class VideoStore {
	private final static int MAX_LENGTH = 100;
	private static int count = 0;
	static Video[] vid = new Video[MAX_LENGTH];

	public static void addVideo(String videoTitle) {
		if (count < MAX_LENGTH) {
			for (int i = 0; i < count; i++) {
				if (vid[i].getTitle().equals(videoTitle)) {
					System.out.println("\nVideo '" + videoTitle + "' already present in the Inventory");
					return;
				}
			}
			vid[count] = new Video();
			vid[count].setTitle(videoTitle);
			vid[count].setCheckedOutStatus(false);
			count++;
		}
	}

	public static void checkOut(String title) {
		for (int i = 0; i < count; i++) {
			if (vid[i].getTitle().equals(title)) {
				if (!(vid[i].getCheckedOutStatus())) {
					System.out.println("\nVideo '" + title + "' checked out successfully");
					vid[i].setCheckedOutStatus(true);
				} else {
					System.out.println("\nVideo '" + title + "' already checked out.");
				}
				return;
			}
		}
		System.out.println("\nVideo '" + title + "' not present in Inventory!");
	}

	public static void returnVideo(String title) {
		for (int i = 0; i < count; i++) {
			if (vid[i].getTitle().equals(title)) {
				if (vid[i].getCheckedOutStatus()) {
					System.out.println("\nVideo '" + title + "' returned succssfully!");
					vid[i].setCheckedOutStatus(false);
				} else {
					System.out.println("\nVideo '" + title + "' is already present");
				}
				return;
			}
		}
		System.out.println("\nVideo '" + title + "'' not present in Inventory!");
	}

	public static void receiveRating(String title, double userRating) {
		for (int i = 0; i < count; i++) {
			if (vid[i].getTitle().equals(title)) {
				vid[i].setUserRating(userRating);
				return;
			}
		}
		System.out.println("\nVideo '" + title + "'' not present in Inventory!");
	}

	public static void listInventory() {
		System.out.println();
		for (int i = 0; i < count; i++) {
			if (!vid[i].getCheckedOutStatus())
				System.out.println(vid[i].getTitle());
		}
	}

	public static void getAvgRating(String title) {
		for (int i = 0; i < count; i++) {
			if (vid[i].getTitle().equals(title))
				System.out.println("\nVideo Rating: " + vid[i].userRating); 
		}
		
	}
}

public class VideoStoreLauncher {
	public static void main(String[] args) {
		VideoStore videoStore = new VideoStore();
//		Scanner scanner = new Scanner(System.in);
//		int option;
//		System.out.println("\nEnter 1 to add a video");
//		System.out.println("Enter 2 to check out a video");
//		System.out.println("Enter 3 to return a video");
//		System.out.println("Enter 4 to Give a rating");
//		System.out.println("Enter 5 to list Inventory");
//		System.out.println("Enter 6 to get Average User Rating");
//		do {
//			String videoTitle;
//
//			System.out.print("\nEnter your option: ");
//			option = scanner.nextInt();
//			scanner.nextLine();
//			switch (option) {
//			case 1:
//				System.out.print("\nEnter video title: ");
//				videoTitle = scanner.nextLine();
//				videoStore.addVideo(videoTitle);
//				break;
//			case 2:
//				System.out.print("\nEnter video title: ");
//				videoTitle = scanner.nextLine();
//				videoStore.checkOut(videoTitle);
//				break;
//
//			case 3:
//				System.out.print("\nEnter video title: ");
//				videoTitle = scanner.nextLine();
//				videoStore.returnVideo(videoTitle);
//				break;
//
//			case 4:
//				System.out.print("\nEnter video title: ");
//				videoTitle = scanner.nextLine();
//				System.out.print("Enter user rating b/w 0 - 5: ");
//				double rating = scanner.nextDouble();
//				videoStore.receiveRating(videoTitle, rating);
//				break;
//
//			case 5:
//				videoStore.listInventory();
//				break;
//
//			case 6:
//				System.out.print("\nEnter video title: ");
//				videoTitle = scanner.nextLine();
//				double avgRating = videoStore.getAvgRating(videoTitle);
//				if (avgRating != -1.0)
//					System.out.println("\nVideo Rating: " + avgRating);
//				break;
//			case 0:
//				break;
//
//			default:
//				System.out.println("\nInvalid option number!");
//				break;
//			}
//		} while (option != 0);
//		scanner.close();
		
    	mainWindow w= new mainWindow();

	}
}
